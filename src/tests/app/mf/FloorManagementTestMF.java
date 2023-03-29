package tests.app.mf;

import java.util.Random;



import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FloorPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;

import pages.app.mf.LoginPageAppMF;
import pages.app.mf.SiteManagementPage;
import pages.app.mf.UnitManagementPages;
import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;
import utility.Utility.Direction;

public class FloorManagementTestMF extends Settings{
	
	
	
ExcelRead excel = new ExcelRead();
//		





	
	@SuppressWarnings("unchecked") 
	@Test(groups="Floor Management",priority=1)
	public void floorsettings_navigation_display() {
		try {
			
			
			
			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
			
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			 SiteManagementPage viewlistsite= new SiteManagementPage((AppiumDriver<MobileElement>) driver);
				
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			UnitManagementPages clickonbuilding = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			  clickonbuilding.clickLocationTap();
		    	viewlistsite.clickSiteDropdpwn();
				viewlistsite.verifyViewListofsite();
				viewlistsite.Toggle_between_sites("Auto Site B");

		     building.SelectBuilding("Auto Test");
		     Utility.simpleWait(5000);
		     floor.clickSettingsIcon();
		    // generic.Clickonsettingsbutton();
		    
	
			  System.out.println("Building settings displayed");
			Log.addMessage("get in to floor settings");
		}catch(Exception e) {
			Log.addMessage("Failed to get in to floor settings");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to get in to floor settings");
		}
	}



	
//	
	@SuppressWarnings("unchecked") 
	@Test(priority=2,groups="Floor Management")
	public void add_single_floor() {
	  try {
		  FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			
			
		  Thread.sleep(5000);
		  floor.new_floor_details("First Floor","North","1","1");
		
		  
		  Log.addMessage("Succcesfully new floors were added");
	  }catch(Exception e) {
		  Log.addMessage("Failed to add new floors");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed to add new floors");
	  }
	}
	
	@SuppressWarnings("unchecked") 
	@Test(priority=3,groups="Floor Management")
	public void Edit_floor_details() {
	  try {
		  FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
		Thread.sleep(5000);
		Utility.simpleWait(5000);
		  floor.Selectfirstfloor();
		  Utility.simpleWait(5000);
		  floor.EditfloorDetails("Second Floor","South","2","2");
		  
		  Log.addMessage("Succcesfully verified the floor list");
	  }catch(Exception e) {
		  Log.addMessage("Failed to verify the floor list");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed toverify the floor list");
	  }
	}

	



	
	@SuppressWarnings("unchecked") 
	@Test(priority=4,groups="Floor Management")
	public void add_multiple_floors() {
	  try {
		  FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
		  
		  
		  floor.new_floor_details("third Floor","North","1","1");
		  Thread.sleep(5000);
		 // floor1.new_floor_details("fourth Floor","North","1","1");
			Utility.Clickbackbutton();
		  
		  Log.addMessage("Succcesfully new floors were added");
	  }catch(Exception e) {
		  Log.addMessage("Failed to add new floors");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed to add new floors");
	  }
	}
	

//
	
	@SuppressWarnings("unchecked") 
	@Test(priority=5,groups="Floor Management")
	public void floorlistview() {
	  try {
		  FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
		  Utility.simpleWait(5000);
		  floor.Verifythefloorlistdisplayed();
		  
		  Log.addMessage("Succcesfully verified the floor list");
	  }catch(Exception e) {
		  Log.addMessage("Failed to verify the floor list");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed toverify the floor list");
	  }
	}


	
	
	@SuppressWarnings("unchecked") 
	@Test(priority=6,groups="Floor Management")
	public void Deletefloor() {
	  try {
		  
		 
			
		  FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
		  Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);;
		  UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
		  

		     Utility.simpleWait(5000);
		  
//		  generic.Searchanitem("FL");
//		  unit.Clickfirstunit();
//		  
//		  ///delete  first unit unit
//		Thread.sleep(3000);
//		unit.Deleteunit();
//			
//			
//			///delete second unit
//		
//		 Genericmethods secondunitsearch = new Genericmethods((AppiumDriver<MobileElement>) driver);;
//		  UnitManagementPages secondunitdelete = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
//		  
//		  secondunitsearch.Searchanitem("FL");
//		  secondunitdelete.Clickfirstunit();
//		Thread.sleep(3000);
//		secondunitdelete.Deleteunit();
//		
//		
//		//////Delete third unit
//		
//	      
//	  	Genericmethods thirdunitgeneric = new Genericmethods((AppiumDriver<MobileElement>) driver);;
//		  UnitManagementPages thirdunit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
//		  
//		  thirdunitgeneric.Searchanitem("Access Point");
//		  thirdunit.Clickfirstunit();
//		Thread.sleep(3000);
//		thirdunit.Deleteunit();
//	
/////delete first AP
//		Genericmethods firstApsearch = new Genericmethods((AppiumDriver<MobileElement>) driver);;
//		  UnitManagementPages firstapselect = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
//		  
//		  firstApsearch.Searchanitem("FL");
//		  firstapselect.Clickfirstunit();
//	     Thread.sleep(3000);
//	     firstapselect.Deleteunit();
//				  
//					///delete AP second
//	      
//	  	Genericmethods secondap = new Genericmethods((AppiumDriver<MobileElement>) driver);;
//		  UnitManagementPages seacondapselect = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
//		  
//		  secondap.Searchanitem("Access Point");
//		  seacondapselect.Clickfirstunit();
//		Thread.sleep(3000);
//		seacondapselect.Deleteunit();
//		
//		///Delete third AP
//		
//	      
//	  	Genericmethods third = new Genericmethods((AppiumDriver<MobileElement>) driver);;
//		  UnitManagementPages thirdap = new UnitManagementPages((AppiumDriver<MobileElement>) driver);;
//		  
//		  third.Searchanitem("Access Point");
//		  thirdap.Clickfirstunit();
//		Thread.sleep(3000);
//		thirdap.Deleteunit();
//		
//		///Remove floor
//		///Remove first floor
//		     Utility.simpleWait(5000);
//		     floor.clickSettingsIcon(); 
//		     Utility.Selectbyname("Second Floor");
//		     Thread.sleep(5000);
//		     floor.Removefloor();
		     // remove second floor
		      Utility.simpleWait(3000);
		      Utility.Selectbyname("third Floor");
		      Utility.simpleWait(5000);
		     floor.Removefloor();
		     Utility.simpleWait(3000);
		     Utility.Clickbackbutton();
		  
		  Log.addMessage("Succcesfully verified the floor list");
	  }catch(Exception e) {
		  Log.addMessage("Failed to verify the floor list");
		  e.printStackTrace();
		  Assert.assertTrue(false, "Failed toverify the floor list");
	  }
	}

	
	
	
	
	
	
	
	
	
	
	

	
	
	
		

	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
	}
	
	@DataProvider(name = "emailverification")
	public Object[][] getData2() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "EmailVerification");
	}
	
	
	
	
	
}
