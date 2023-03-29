package tests.app.mf;

import static org.testng.Assert.assertTrue;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.app.mf.AccountSettingsPageAppMF;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.LockDashboardAppMF;
import pages.app.mf.LoginPageAppMF;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;

public class Lockmanagement_Test extends Settings  {
	
	
	
	
	

	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =1, groups ="Lock management")
	public void Add_lock_with_out_activation() throws InterruptedException {
		try {	
			
                
	
			System.out.print("Add lock with out activation  test started");
			LockDashboardAppMF lock = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
		
			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
			
			//Navigate to location tab
			lock.clickLocationTap();
			// select buidling
			building.SelectBuilding("Susmitha 14");
		     Utility.simpleWait(4000); 
		     
		     //Select unit
		     Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
				Thread.sleep((3000));
				generic.Selectbyname("SU01");
				
			
		     //Select unit
		     
				Thread.sleep((3000));
			
				lock.Addbutton();
				System.out.print("Add lock   button clicked");
				generic.Clickoncontinuebutton();
				System.out.print("Add lock  guide continue button clicked");
		
				generic.Clickoncontinuebutton();
				System.out.print("Add lock lock installed continue button clicked");
			
				generic.Clickoncontinuebutton();
				System.out.print("Add lock Before you start page continue button clicked");
			
				lock.Scanmediapopuphandle();
				System.out.print("Add lock media pop up hanle clicked");
				
				lock.Enterlockserialnumber("Lockname12345678");
				System.out.print("Add lock lock serial number entered");
				
				generic.Clickoncontinuebutton();
				System.out.print("Add lock continue button after entering lock serial number");
			
				
				lock.Enterlockname("Front dooor lock");
				System.out.print("Add lock lock  name entered");
				

				generic.Clickoncontinuebutton();
				System.out.print("Add lock continue button after entering lock name");
				
				lock.Addlocksuccess_validation();
				lock.Skiplockactivation();
				
				generic.verifyrecorddisplayed("Front dooor lock");
			
			
		Log.addMessage("Sucessfully added a lock with out activating");
		
		
		

		} catch (Exception e) {
			Log.addMessage("Failed to Add lock" +e);
			Assert.assertTrue(false, "Failed to Add lock");
		}
	}
	


	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =2, groups ="Lock management")
	public void Edit_lockname() throws InterruptedException {
		try {	
			
                
	
			System.out.print("Edit lock name test started");
			LockDashboardAppMF lock = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
				Thread.sleep((3000));
				Utility.Selectbyname("Front dooor lock");
				Thread.sleep((3000));
				lock.Edit_and_verifylockname("Second Lock");
				Utility.Clickbackbutton();
		Log.addMessage("Sucessfully updated the lock name");
		
		
		

		} catch (Exception e) {
			Log.addMessage("Failed to update the lock name " +e);
			Assert.assertTrue(false, "Failed to update the lock name");
		}
	}
	
	

	
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =3, groups ="Lock management")
	public void Delete_lock() throws InterruptedException {
		try {	
			
                
	
			System.out.print("Delete lock  test started");
			LockDashboardAppMF lock = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
		        Utility.Selectbyname("Second Lock");
				Thread.sleep((3000));
				lock.Deletelock();
				
		Log.addMessage("Sucessfully Deleted the lock");
		
		
		

		} catch (Exception e) {
			Log.addMessage("Failed to delete the lock" +e);
			Assert.assertTrue(false, "Failed to delete the lock");
		}
	}
	

	
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =4, groups ="Lock management")
	public void Verify_Skip_installation_guide_button() throws InterruptedException {
		try {	
			
                
	
			System.out.print("Skip lock installation guide UI validation test started");
			LockDashboardAppMF lock = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			
			//Navigate to location tab
			
				//Click on add lock button
				lock.Addbutton();
				//Verify skip installation funtionality
				lock.Click_Skip_installation_lockpage();
				lock.Verify_miletonepage_display();
			 
  
		
		Log.addMessage("Sucessfully verified  skip installation guide funtionality");

		} catch (Exception e) {
			Log.addMessage("Failed to verify skip installation guide funtionality" +e);
			Assert.assertTrue(false, "Failed to verify skip installation guide funtionality");
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =5, groups ="Lock management")
	public void View_lock_details_funtionality() throws InterruptedException {
		try {	
			
                
	
			System.out.print("View lock details  test started");
			LockDashboardAppMF lock = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			  Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			  
				generic.Clickoncontinuebutton();
				System.out.print("Add lock continue button Lock istalled page");
			  
			generic.Clickoncontinuebutton();
			System.out.print("Add lock Before you start page continue button clicked");
		
//			lock.Scanmediapopuphandle();
//			System.out.print("Add lock media pop up hanle clicked");
//			
//			
			
			lock.Verify_View_lock_details_funtionality();
			
			generic.backnavigation();
			generic.backnavigation();
			generic.backnavigation();
			generic.backnavigation();
		Log.addMessage("Sucessfully verified  lock details funtionality");

		} catch (Exception e) {
			Log.addMessage("Failed to verify view lock details funtionality " +e);
			Assert.assertTrue(false, "Failed to verify view lock details funtionality");
		}
	}
	

	
	
	
	
	

	
	
	
		
    ExcelRead excel = new ExcelRead();
	
	@DataProvider(name = "userName")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "App2.0", "Menu");
	}	

}
