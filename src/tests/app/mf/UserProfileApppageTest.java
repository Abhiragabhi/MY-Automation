package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.LockDashboardAppMF;

import pages.app.mf.UserprofileApppage;
import utility.Log;
import utility.Utility;
import utility.Utility.Direction;

public class UserProfileApppageTest extends Settings {

	

	
	
	
	@SuppressWarnings("unchecked") 
	@Test(priority=1,groups="User Profile Test")
	public void view_User_Profile_page() {
	  try {
		  LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
		  HomeUsersPageAppMF userprofile = new HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
		  
		  Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
		  
		  userprofile.clickOnpeoplebutton();
		
		  userprofile.clickOnUserProfile();
		 // userprofile.verifyPageTitle();
		  Log.addMessage("Succcesfully navigated to User Profile page");
	  }catch(Exception e) {
		  Log.addMessage("Failed to navigate to  on User profile page");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed to navigate to  on User profile page");
	  }
	}

	

	
	
	//Utility.Clickbackbutton();
	@SuppressWarnings("unchecked")
	@Test(groups="User Profile Test", priority =2)
	public void Profile_ViewAccess_verification() {
		try {
			UserprofileApppage search = new   UserprofileApppage((AppiumDriver<MobileElement>) driver);
			// search.clickonmenu();
			 //search.clckonprofile();
			 search.verifyaccess();
			// search.clickonmenu();
			Utility.Clickbackbutton();
			
			Log.addMessage("Successfully verify access");

		} catch (Exception e) {
			Log.addMessage("verify access failed");
			e.printStackTrace();
			Assert.assertTrue(false, "verify access functionality failed");
		}
	}

	
	
	
	
	
	
//	@SuppressWarnings("unchecked")
//	@Test(groups="User Profile", priority =1)
//	public void mobilecredentials () {
//		try {
//			UserprofileApppage enable = new   UserprofileApppage((AppiumDriver<MobileElement>) driver);
//			enable.clickonmenu();
//			enable.clckonprofile();
//			Utility.swipeScreen(Direction.UP);
//			enable.mobilecredentialtoggle();
//		    enable.mobilecredentialtoggledisable();
//			 
//			
//			Log.addMessage("Toggle enable in mobile credential");
//
//		} catch (Exception e) {
//			Log.addMessage("Toggle enable in mobile credential failed");
//			e.printStackTrace();
//			Assert.assertTrue(false, "Toggle enable in mobile credential  functionality failed");
//		}
//	}
//	
//	
	
	
	
	
	
	
	
	

}
