package tests.app.mf;

import org.openqa.selenium.NoSuchElementException;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.LogOutAppPageMF;

import pages.app.mf.LoginPageAppMF;

import utility.ExcelRead;
import utility.Log;

public class HomepageTestMF extends Settings{
	
	
	

	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="", priority =0)
	public void Relauch_application() {
		try {

			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
	

		} catch (Exception e) {
		
			e.printStackTrace();
			Assert.assertTrue(false, "search exisitinguser functionality failed");
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="Home page Test",priority =3)
	public void Display_Locations_Tab(String email, String password) {
	 try {
		
		 BuildingsPageMF location = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
//			
		 System.out.println("Location  tab verification test started");
		 location.clickLocationTap();
		 location.verifyBuildingList();
		 	
		 location.verifylocationtab_screen();
		
     Log.addMessage("Successfully verified the location  tab");
		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to verify location tab details");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed to verify location tab details");
	 }
	}

	@SuppressWarnings("unchecked")	
	//@Test(dataProvider="emailverification",dependsOnGroups="set2",groups="set3")
	@Test(dataProvider="emailverification",groups="Home page Test", priority =4)
	public void Display_User_Tab(String email, String password) {
	 try {
		 
		 
		 HomeUsersPageAppMF user = new HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
//			
		 System.out.println("user tab verification test started");
		user.clickOnpeoplebutton();
		 user.Verifyusertab_details();
		 	 //verify add user icon
		  user.VerifyAddusericon();
		  //verify settings icon
		user.VerifySettingsicon_NavigatetoUserGrouppage();
        Log.addMessage("Successfully verified the user tab");
		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to  login out from the application");
		 e.printStackTrace();
		 Assert.assertTrue(false, " login out from  the application");
	 }
	}
		
	 
	

	
	ExcelRead excel = new ExcelRead();
	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
	}
	
	@DataProvider(name = "emailverification")
	public Object[][] getData2() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "EmailVerification");
	}
}




