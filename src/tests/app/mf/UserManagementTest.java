package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomeUsersPageAppMF;



import utility.Log;
import utility.Utility;

public class UserManagementTest extends Settings {

	
	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="user management", priority =0)
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

	
	
	
	
	
	
	
	
	
	
//	
	@SuppressWarnings("unchecked")
	@Test(groups="user management", priority =2)
	public void search_for_exisiting_user() {
		try {
			HomeUsersPageAppMF search = new   HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
			 search.clickOnpeoplebutton();
			 search.Searchanuser("Tester MF Automation");
		      search.CLearsearchbox();
			 
			
			Log.addMessage("Successfully search exisitinguser");

		} catch (Exception e) {
			Log.addMessage("search exisitinguser failed");
			e.printStackTrace();
			Assert.assertTrue(false, "search exisitinguser functionality failed");
		}
	}

	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="user management", priority =3)
	public void click_on_filter_button() {
		try {
			HomeUsersPageAppMF search = new   HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
			 search.clickOnpeoplebutton();
			 search. Verifyfilterbutton();
	
		
			 
			
			Log.addMessage("Successfully click on filter Button");

		} catch (Exception e) {
			Log.addMessage("click on filter Button failed");
			e.printStackTrace();
			Assert.assertTrue(false, "click on filter Button functionality failed");
		}
	}

	
	
//	public void Verifyuserprofiledetails() {
//		try {
//			
//			
//			//Thread.sleep(8000);
//			Utility.waitForElementToBeVisible(pageTitle);
//			String login = pageTitle.getText();
//			Assert.assertEquals(login,"Login");
//			Log.addMessage("Log In Page is verified successfully");
//		}catch(Exception e) {
//			e.printStackTrace();
//			Log.addMessage("Failed to Verify Log In page title");
//			Assert.assertTrue(false, "Failed to Verify Log In page title");
//		}
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
