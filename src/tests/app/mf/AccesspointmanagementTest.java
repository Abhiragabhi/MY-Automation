package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.AccesspointManagment_methods;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FloorPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.UnitManagementPages;
import pages.app.mf.Usergroup_Apppage_MF;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;
import utility.Utility.Direction;

public class AccesspointmanagementTest extends Settings{

	
	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="", priority =0)
	public void Relauch_application() {
		try {

			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
		 	Thread.sleep((5000));
			
		

		} catch (Exception e) {
			
			e.printStackTrace();
			Assert.assertTrue(false, "Relaunch apllication failed");
		}
	}

	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(dataProvider="AddFloor_details",groups="Access Point Management", priority =1)
	public void Add_Access_Point(String Floornumber, String Wingname, String APcount, String Unitcount) {
		try {
			AccesspointManagment_methods AP = new AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			System.out.print("Add Access point  test started");
		 	Thread.sleep((3000));
			home.buildingsNavigation();
		 	Thread.sleep((5000));
			building.SelectBuilding("Ganesh");
			Utility.simpleWait(5000);
	
		     floor.clickSettingsIcon();
         
          
			clickunit.selectfirstfloor();
			AP.AddAccesspoint("2");
			generic.CLickDonebutton();
			
			   Thread.sleep(5000);
			Utility.Clickbackbutton();
	
			
			Log.addMessage("Successfully added  AP");
		} catch (Exception e) {
			Log.addMessage("Add AP functionality failed");
			//e.printStackTrace();
			Assert.assertTrue(false, "Add unit & AP functionality failed");
		} 
	}	
	
	

	
	
	
	
	

	@SuppressWarnings("unchecked")
	@Test(groups="Access Point Management", priority =2)
	public void Add_user_to_Access_point() {
		try {
			
			System.out.print("Add user from  Access point test started");
			
			AccesspointManagment_methods AP = new AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			System.out.print("Add Access point  test started");
		 	Thread.sleep((3000));
			home.buildingsNavigation();
		 	Thread.sleep((5000));
			building.SelectBuilding("Ganesh");
			Utility.simpleWait(5000);
			
			
			
			
			
			
			
			
			
			
			String Email ="accesspointuser@gmail.com";
		      String FIrstname="Access point";
		      String Lastname="User";
		      String Usertype ="User";
		      String Usergroup ="vibe";
		      String Phonenumber ="5553456787";

			
			
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			 Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
		
    	Thread.sleep((3000));
    	generic.Searchanitem("Access Point");
	 	unit.ClickfirstAccesspoint();
	 	Thread.sleep(3000);
	 	unit.clicktoAddUser();
	 	generic.AddusertotheAccount(Email, FIrstname, Lastname, Usertype, Usergroup, Phonenumber);
		Thread.sleep(5000);
		generic.backnavigation();
		
			
			Log.addMessage("Successfully added user to the AP");
		

		} catch (Exception e) {
			Log.addMessage("Failed to add the user");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to add the user");
		}
	}
	
	
		
	
	
	


	
	@SuppressWarnings("unchecked")
	@Test(groups="Access Point Management", priority =3)
	public void view_userprofie_AP() {
		try {
			
			System.out.print("view user profile from  Access point test started");
			AccesspointManagment_methods  upa = new  AccesspointManagment_methods  ((AppiumDriver<MobileElement>) driver);
	        
		UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			Utility.simpleWait(3000);
			upa.clicktoViewAllUser();
			
			generic.Selectbyname("Access point User");
			unit.verifyuserprofilepage();
			
			Log.addMessage("Successfully veiw access user profile");

		} catch (Exception e) {
			Log.addMessage("Failed to veiw access user profile");
			e.printStackTrace();
			Assert.assertTrue(false, "veiw access user profile failed");
		}
	}
	
	
		

	
	

	@SuppressWarnings("unchecked")
	@Test(groups="Access Point Management", priority =4)
	public void Delete_user_from_Access_point() {
		try {
			AccesspointManagment_methods  upa = new  AccesspointManagment_methods  ((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			AccesspointManagment_methods du = new  AccesspointManagment_methods ((AppiumDriver<MobileElement>) driver);
			System.out.print("Delete user from  Access point test started");
             Thread.sleep(5000);
            Utility.swipeScreen(Direction.UP);
			du.clicktoRemoveuser();		
			du.clicktoRemoveuseryes();
			Thread.sleep(5000);
		    generic.backnavigation();
			Log.addMessage("Successfully Removed the user");
			
			
			///Delete the added user from app
			Thread.sleep(5000);
			HomeUsersPageAppMF search = new   HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);
			 search.clickOnpeoplebutton();
			 search.Searchanuser("Access point User");
		     Thread.sleep(5000); 
		     Utility.Selectbyname("Access point User");
		     Utility.simpleWait(5000);
		     Utility.swipeScreen(Direction.UP);
			  upa.deleteuser();
			
			
			
			

		} catch (Exception e) {
			Log.addMessage("Failed to Remove user");
			e.printStackTrace();
			Assert.assertTrue(false, "Remove user functionality failed");
		}
	}
	
	
	
	@Test(groups="Access Point Management", priority =5)
	public void delete_Accesspoint() {
		try {
			
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			System.out.print("Delete Access point test started");
//			
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);

			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			Thread.sleep(3000);
			home.buildingsNavigation();
			Thread.sleep(3000);
			clickunit.Deleteunit();
			Log.addMessage("Successfully removed AP");
		} catch (Exception e) {
			Log.addMessage("Remove  AP functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Remove AP functionality failed");
		} 
	}
//		
	
	
	@Test(groups="Access Point Management", priority =6)
	public void View_Accesspoint_settings() {
		try {
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			AccesspointManagment_methods AP = new AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			System.out.print("view Access point settings  test started");
			Utility.simpleWait(5000);
			
	    floor.Searchrecord("Access point");
	unit.ClickfirstAccesspoint();
		Utility.simpleWait(5000);
		
			floor.clickSettingsIcon();
			AP.Verifyaccesspointsettings();
			
			
		
			
			
			
			Log.addMessage("Successfully displayed Access point settings");
		} catch (Exception e) {
			Log.addMessage("Failed to view  AP settings");
			e.printStackTrace();
			Assert.assertTrue(false, "Remove unit & AP functionality failed");
		} 
	}
		
	

	@Test(groups="Access Point Management", priority =7)
	public void View_Accesspointsettings_editgroup() {
		try {
			
			AccesspointManagment_methods AP = new AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			System.out.print("view Access point settings  test started");
			Utility.simpleWait(300);
			AP.Click_add_group();

			Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
			
				usergroup.SearchGroup("vibe");
				usergroup.Selectusergroup("vibe");
				Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
				generic.Clickonsavebutton();
				generic.backnavigation();
	
			
		
			
			
			
			Log.addMessage("Successfully displayed Access point settings");
		} catch (Exception e) {
			Log.addMessage("Failed to view  AP settings");
			e.printStackTrace();
			Assert.assertTrue(false, "Remove unit & AP functionality failed");
		} 
	}
		
	
	
	
	@Test(dataProvider= "EditFloor_details", groups="Access Point Management", priority =8)
	public void edit_accesspoint_name(String Floornumber, String Wingname, String APcount, String Unitcount) {
		try {
			AccesspointManagment_methods AP = new AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
			System.out.print("Edit Access point  test started");

			AP.Edit_Accesspoint_name("AP 1");
			AP.VerifyupdatedAPname("AP 1");
			
			Log.addMessage("Successfully editted  AP");
		} catch (Exception e) {
			Log.addMessage("Edit  AP functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Edit  AP functionality failed");
		} 
	}
	
	
	


//
	
	
	
	
	
	
	

	
	
	ExcelRead excel = new ExcelRead();

	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
	}
	@DataProvider(name = "AddFloor_details")
	public Object[][] getData2() throws Exception {
		return excel.getTableArray(InputData, "TestData", "AddFloor_details");
	}
	@DataProvider(name = "EditFloor_details")
	public Object[][] getData3() throws Exception {
		return excel.getTableArray(InputData, "TestData", "EditFloor_details");
	}
}
