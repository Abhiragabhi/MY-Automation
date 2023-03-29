package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FloorPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.LoginPageAppMF;
import pages.app.mf.UnitManagementPages;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;

public class UnitManagementTest extends Settings{
		// TODO Auto-generated constructor stub
	
	
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
	@Test(groups="Unit Management",priority=1)
	public void unit_List_View() {
		try {
			System.out.println("Unit list view test started");
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
            Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
            FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			clickunit.clickLocationTap();
		     building.SelectBuilding("Ganesh");
		     clickunit.verifyUnitListViewDisplayed();

			Log.addMessage("Successfully click the building");
		}catch(Exception e) {
			Log.addMessage("Failed to click the building");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to clickon building");
		}
	}
	
	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=2)
	public void Add_new_unit() {
		try {
			System.out.println("Add unit test started");
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
            Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
            FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			
		
		     Utility.simpleWait(5000);
		     floor.clickSettingsIcon();
          
           
			clickunit.selectfirstfloor();
			clickunit.Editunit("2");
			generic.CLickDonebutton();
			
			   Thread.sleep(5000);
			Utility.Clickbackbutton();
			Log.addMessage("Successfully added new Unit");
		}catch(Exception e) {
			Log.addMessage("Failed to add new  Unit");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to add new  Unit");
		}
	}
	
	
	
	
	
	


	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=3)
	public void unit_Allactivity_view() {
		try {
			System.out.println("UnitAllactivity view test started");
			UnitManagementPages clickonbuilding = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
		
//		
			clickonbuilding.verifyUnitListViewDisplayed();
			clickonbuilding.ClickAllActivity();
			clickonbuilding.ClickonDetailstab();

			Log.addMessage("Successfully click the building");
		}catch(Exception e) {
			Log.addMessage("Failed to click the building");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to clickon building");
		}
	}
//	
	

	

	
	

	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=4)
	public void view_Details_Of_Unit() {
		try {
			System.out.println("Details of unit test started");
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);

			
			
		
//            FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
//			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
//			clickunit.clickLocationTap();
//		     building.SelectBuilding("Ganesh");
//			
//			
//			
//			Thread.sleep((3000));
//			generic.Selectbyname("TE02");
//			clickunit.verifyDetailsofUnit("TE02");
	
			
            FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			clickunit.clickLocationTap();
		     building.SelectBuilding("Ganesh");
			
			
			
			Thread.sleep((3000));
			generic.Selectbyname("TE01");
			clickunit.verifyDetailsofUnit("TE01");
	
		
		
			
			Log.addMessage("Successfully View Details of Unit");
		}catch(Exception e) {
			Log.addMessage("Failed to view Details of Unit");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to view Details of Unit");
		}
	}

	
	
	
	

	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=5)
	public void Edit_unit_name() {
		try {
			System.out.println("Edit Unit name test started");
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			Thread.sleep((3000));
	
			generic.Clickonsettingsbutton();
			Thread.sleep((5000));
			clickunit.Editunitname("03");
			generic.Clickonsavebutton();
			
			
		
			
			Log.addMessage("Successfully Edited Unit name");
		}catch(Exception e) {
			Log.addMessage("Failed to Edit Unit name");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to Edit Unit name");
		}}
	
	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=6)
	public void Add_user_from_unit() {
		try {
			System.out.println("Add user to unit test started ");
			
			String Email ="testautouser@gmail.com";
		      String FIrstname="Test";
		      String Lastname="Man";
		      String Usertype ="User";
		      String Usergroup ="vibe";
		      String Phonenumber ="5553456789";

			
			
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			 Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
    
	
	 	Thread.sleep(5000);
	 	unit.clicktoAddUser();
	 	generic.AddusertotheAccount(Email, FIrstname, Lastname, Usertype, Usergroup, Phonenumber);
		Thread.sleep(5000);
		generic.backnavigation();
		
			
			Log.addMessage("Successfully added user to the Unit");
		}catch(Exception e) {
			Log.addMessage("Failed to to add user to Unit");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to add user to Unit");
		}
	}
	
	

	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=7)
	public void View_user_profile() {
		try {
			System.out.println("View user profile from unit test started");
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			Utility.simpleWait(5000);
			generic.Selectbyname("Test Man");
			unit.verifyuserprofilepage();
			Utility.Clickbackbutton();
			
			Log.addMessage("Successfully View Details of user");
		}catch(Exception e) {
			Log.addMessage("Failed to view Details of user");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to view Details of user");
		}
	}
	
	
	
//	@SuppressWarnings("unchecked") 
//	@Test(groups="Unit Management",priority=8)
//	public void Edit_user_access_and_user_group() {
//		try {
//			System.out.println("Details of unit test started");
//			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
//
////			//Edit user group
//			clickunit.clickUnits();
//			clickunit.verifyDetailsofUnit("Unit TE01");
//			//Utility.Clickbackbutton();
//			
//		
//			
//			Log.addMessage("Successfully View Details of Unit");
//		}catch(Exception e) {
//			Log.addMessage("Failed to view Details of Unit");
//			e.printStackTrace();
//			Assert.assertTrue(false, "Failed to view Details of Unit");
//		}
//	}
//
//	
	


	@SuppressWarnings("unchecked") 
	@Test(groups="Unit Management",priority=9)
	public void delete_unit() {
		try {
			
			
			
			
			
	
			
			 
			UnitManagementPages clickunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);

//			
			Thread.sleep(3000);
			clickunit.Deleteunit();
			Utility.Clickbackbutton();
			
		
			
			Log.addMessage("Successfully Deleted Unit");
		}catch(Exception e) {
			Log.addMessage("Failed to delete Unit");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to delete Unit");
		}
	}

	

	
	

//		@SuppressWarnings("unchecked")
	@Test(groups="Unit Management", priority =10)
	public void Navigate_to_mainpage () {
		try {
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			
			
			unit.BackaccessNavigationbtn();
		   
			//  rf.clickonoreset();
			Log.addMessage("Successfully clcik on reset");

		} catch (Exception e) {
			Log.addMessage("  Clcik on reset in Filter ");
			e.printStackTrace();
			Assert.assertTrue(false, " Clcik on reset in filter Functionality failed");
		}
	}
		
	
	
	
	


	
	ExcelRead excel = new ExcelRead();
	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
    }
	
}
