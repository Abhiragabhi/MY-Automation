package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.AccesspointManagment_methods;
import pages.app.mf.AccountSettingsPageAppMF;

import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FloorPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;

import pages.app.mf.LockDashboardAppMF;
import pages.app.mf.UnitManagementPages;
import utility.Log;
import utility.Utility;

public class Multilanguagetest extends Settings {

	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="", priority =0)
	public void Relauch_application() {
		try {

			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
			Log.addMessage("Successfully search exisitinguser");

		} catch (Exception e) {
			Log.addMessage("search exisitinguser failed");
			e.printStackTrace();
			Assert.assertTrue(false, "search exisitinguser functionality failed");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =1)
	public void change_language() {
		try {
			AccountSettingsPageAppMF language = new  AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			
			language.clickonmenu();
			
			language.clickonaccontsetting();
			
			language.clicklanguage();
			
			language.changealanuguage();
			
			language.clicksave();
			
			Log.addMessage("change language successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to change language");
			e.printStackTrace();
			Assert.assertTrue(false, "change language functionality failed");
		}
	}
	

	

	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =2)
	public void Multilanguage_Accountsettings() {
		try {	
			
                
	

			
			
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("MUlti language Account settings test started");
			Utility.simpleWait(4000); 
			
		
			
			settings.VerifyFrenchllanguageinAccountsettingstab();
		Log.addMessage("Successfully verified the changed language in Account settings screen");

		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Account screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Account screen");
		}
	}
	

	
	

	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =3)
	public void Multilanguage_Dashboard() {
		try {	
			
                
	

			HomePageMF HomeDashboard = new HomePageMF((AppiumDriver<MobileElement>) driver);
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			AccountSettingsPageAppMF language = new  AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("MUlti language Dashboard  test started");

			language.clicktoback();
			LockDashboardAppMF close = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			close.clickMenuCloseIcon();
			
			HomeDashboard.VerifyFrenchllanguageinDashbord();
		Log.addMessage("Successfully verified the changed language in Account settings screen");

		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Account screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Account screen");
		}
	}
	
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =4)
	public void Multi_language_buildinglist_screen() {
		try {
			BuildingsPageMF device = new   BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			
			device.clicktobuilding();
			
			device.verifybuildinglanguage();
			
			Log.addMessage("verify Building list successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to verify Building list ");
			e.printStackTrace();
			Assert.assertTrue(false, "verify Building list functionality failed");
		}
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =5)
	public void multi_language_editbuildingscreen() {
		try {
			BuildingsPageMF edit = new   BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			
			edit.clicktoviewbuilding();

			//edit.clickbuilding();
			Utility.simpleWait(5000);
			edit.clicksetting();
			
			edit.verifyeditbuildinglanguage();
			
			edit.clickbackbtn();
			
//			edit.clickbackbtn();
//			
			Log.addMessage("edit building name language verify successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to edit building name language verify");
			e.printStackTrace();
			Assert.assertTrue(false, "edit building name language verify functionality failed");
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =6)
	public void Multilanguage_Buildingdetailscreenlanguage() {
		try {
			BuildingsPageMF  edit = new    BuildingsPageMF ((AppiumDriver<MobileElement>) driver);
			
			edit.clicktoviewbuilding();

			edit.clickbuilding();
			
			
//			
			edit.verifybuildingDetails();
			
		
			
			Log.addMessage("edit building name language verify successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to edit building name language verify");
			e.printStackTrace();
			Assert.assertTrue(false, "edit building name language verify functionality failed");
		}
	}
	
	
	
	
	
	
	
	
	
	
		

	
		
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =7)
	public void Multilanguage_Floorpage_edit_screen(){
		try {	
			
                
	

			HomePageMF HomeDashboard = new HomePageMF((AppiumDriver<MobileElement>) driver);
			FloorPageMF floor = new FloorPageMF((AppiumDriver<MobileElement>) driver);
			
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("MUlti language Dashboard  test started");
		
			Utility.simpleWait(5000);
		     floor.clickSettingsIcon();
		     floor.verifyeditfloordetailspage_frenchlanguage();
		     Utility.Clickbackbutton();
		Log.addMessage("Successfully verified the changed language in Account settings screen");

		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Account screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Account screen");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =8)
	public void accesspoint_screen() {
		try {
			AccesspointManagment_methods access = new   AccesspointManagment_methods((AppiumDriver<MobileElement>) driver);
		;
			
			access.clickaccesspoint();
			
			access.verifyaccessspoint();
			
			access.BackNavigation();
			Log.addMessage("verify accesss point page successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to verify accesss point page ");
			e.printStackTrace();
			Assert.assertTrue(false, "verify accesss point page functionality failed");
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="multi language", priority =9)
	public void Unit_screen() {
		try {
			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			unit.Clickfirstunit();
			unit.Verifythefrenchlanguageinunit();
			unit.BackNavigationbtn();
			unit.BackbuildNavigationbtn();
			Log.addMessage("verify access point page successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to verify accesss point page ");
			e.printStackTrace();
			Assert.assertTrue(false, "verify accesss point page functionality failed");
		}
	}
	
	

	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =10)
	public void Revert_language() {
		try {	
			

	
	AccountSettingsPageAppMF language = new  AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			
			language.clickonmenu();
			
			language.clickonaccontsetting();
			
			
			
			language.SelectAccountLanguage("English");
		
			Thread.sleep(3000);
			language.clicktoback();
			Thread.sleep(3000);
			language.clicktomenuclose();
			
			
		Log.addMessage("Sucessfully changes language ");

		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Account screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Account screen");
		}
	}
	
	
	
	
	
	
	

}
