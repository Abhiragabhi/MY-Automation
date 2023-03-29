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
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.LockDashboardAppMF;
import pages.app.mf.LogOutAppPageMF;

import pages.app.mf.LoginPageAppMF;

import pages.app.mf.Usergroup_Apppage_MF;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;

public class UsergroupmanagementTestMF extends Settings{
	


	
 @SuppressWarnings("unchecked") 

	@Test(dataProvider="login",groups="User Group  Management",priority =1)
	public void View_user_group_list(String email, String password) {
 try {	 
	 System.out.println("started user group view test");
         LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
		  HomeUsersPageAppMF userprofile = new HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
		
		  
		  Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
			 
			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
	         Utility.simpleWait(3000);
			
		
		  
		  
		  usergroup.clickOnpeoplebutton();
		  usergroup.click_on_user_tab_settings_icon();
		 userprofile.VerifyUsergroupIsDisplayedInUsersGroupList();
	 }catch(Exception e) {
		 Log.addMessage("Failed to  verify user group");
	 e.printStackTrace();
	 Assert.assertTrue(false, "Failed to  verify user group");
 }
}
	
	
	@Test(groups="User Group  Management", priority =2)
	public void Addnew_user_group() {
		 try {
			 
			 System.out.println("Test add new user group test started");
  Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
 
				  String Gname = "Automation Group";
				  String Description = "Created for Automation";
				  usergroup.AddnewGroup(Gname, Description);
		 }catch(Exception e) {
			 Log.addMessage("Failed to  add new user group");
			 e.printStackTrace();
			 Assert.assertTrue(false, "Failed to  add new user group");
		 }
	}
	
	
	
	
	
	@Test(groups="User Group  Management", priority =3)
	public void Edit_user_group() {
		 try {
			 
			 System.out.println("B");
		 Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
				String Gname = "Test Group";
				  String Description = "Update Group Details";
				  usergroup.Selectnewlyaddedusergroup();		
				  usergroup.Edisupergroup(Gname, Description);
				 // usergroup.Verifyeditedgroupname();
		 }catch(Exception e) {
			 Log.addMessage("Failed to user group ");
			 e.printStackTrace();
			 Assert.assertTrue(false, "Failed to edit user group");
		 }
	}
	
	@Test(groups="User Group  Management", priority =4)
	public void search_user_Group() {
		 try {
			 
			 System.out.println("Test add new user group test started");
  Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
			
				usergroup.SearchGroup("Test Group");
				;
		 }catch(Exception e) {
			 Log.addMessage("Failed to  add new user group");
			 e.printStackTrace();
			 Assert.assertTrue(false, "Failed to  add new user group");
		 }
	}
	
//
	@SuppressWarnings("unchecked")
@Test (groups="User Group  Management",priority =5)
public void Delete_user_group() {
try {
	
	
	Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
	
	 usergroup.SelectAutomationGroup();;
	usergroup.deleteusergroup();

	
	

	
		Log.addMessage("Successfully add deleted the  user  group ");

} catch (Exception e) {
		Log.addMessage(" Failed to add delete user group");
		e.printStackTrace();
		Assert.assertTrue(false, " Failed to add delete user group ");
	}
}

	@SuppressWarnings("unchecked")
	@Test (groups="User Group  Management",priority =6)
	public void Verify_pre_defined_usergroups_not_editable() {
	try {
		
		
		Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
		
		
			
			usergroup.SearchGroup("Maintenance");
			usergroup.Selectusergroup("Maintenance");
			usergroup.VerifyPredifinedusergroupsnoteditable();
			usergroup.clickonBackNavigationbtn();
			//Utility.Clickbackbutton();
		
			Log.addMessage("Successfully verified that user group is not editable ");

	} catch (Exception e) {
			Log.addMessage(" Failed to verify that user group is not editable");
			e.printStackTrace();
			Assert.assertTrue(false, " Failed to add delete user group ");
		}
	}

	
	
	
////	
////	
////
//	@SuppressWarnings("unchecked")
//	@Test(groups="Filter Unit", priority =6)
//	public void Navigatetomainpage () {
//		try {
//			UpdatedUnitManagement uu = new UpdatedUnitManagement((AppiumDriver<MobileElement>) driver);
//			 uu.navigatebacktobuildingpage();
//		
//
//			 uu.clickonbackbutn();
//			
//		//  rf.clickonoreset();
//		Log.addMessage("Successfully clcik on reset");
//		} catch (Exception e) {
//			Log.addMessage("  Clcik on reset in Filter ");
//			e.printStackTrace();
//		Assert.assertTrue(false, " Clcik on reset in filter Functionality failed");
//		}
//	}

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
