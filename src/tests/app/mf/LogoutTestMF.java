package tests.app.mf;

import org.openqa.selenium.NoSuchElementException;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.LogOutAppPageMF;

import pages.app.mf.LoginPageAppMF;

import utility.ExcelRead;
import utility.Log;

public class LogoutTestMF extends Settings{
	

	
	
	
	
	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="LoginFunctionality",priority =1)
	public void Logout_the_application(String email, String password) {
	 try {
		 //Login to the application
		 
		 	Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
				g.Relauchtheapp();
		         Thread.sleep(5000);
		 
		 
		 System.out.println("B");
		
			
		 
		
		 LogOutAppPageMF logout = new LogOutAppPageMF((AppiumDriver<MobileElement>) driver);
		 logout.NavigatetoHomescreen();
		 logout.Logoutapplication();
		 Log.addMessage("Successfully logged out  of  the  application");
		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to  login out from the application");
		 e.printStackTrace();
		 Assert.assertTrue(false, " login out from  the application");
	 }
	}

//	
	
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
