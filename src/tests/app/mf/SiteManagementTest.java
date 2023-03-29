package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.SiteManagementPage;

import utility.ExcelRead;
import utility.Log;

public class SiteManagementTest extends Settings{
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
	@Test(groups="Site Management",priority=2)
	public void view_ListofAll_Sites() {
		try {
			System.out.println("View List of sites test started");
			SiteManagementPage viewlistsite= new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.clickLocationTap();
			viewlistsite.clickSiteDropdpwn();
			viewlistsite.verifyViewListofsite();
			viewlistsite.Toggle_between_sites("Auto Site A");

			Log.addMessage("Successfully click the while using the app btn");
		}catch(Exception e) {
			Log.addMessage("Failed to click the while using the app btn");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to click the while using the app btn");
		}
	}
//	
//
	@SuppressWarnings("unchecked") 
	@Test(groups="Site Management",priority=3)
	public void toggle_Between_Sites() {
		try {
			System.out.println("B");
			SiteManagementPage selectsitea= new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			System.out.println("A");
//			selectsitea.whileUsingtheapp();
			selectsitea.clickSiteDropdpwn();
			selectsitea.Toggle_between_sites("Auto Site A");

			//selectsitea.verifyViewListofsite();
			// selectsitea.toggleSites();
			Log.addMessage("Successfully toggle to site A");
		}catch(Exception e) {
			Log.addMessage("Failed toggle to site A");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed toggle to site A");
		}
	}
	
	
	
	
	@SuppressWarnings("unchecked") 
	@Test(groups="Site Management",priority=4)
	public void Sitesettings_display() {
		try {
		
		
			System.out.println("B");
			SiteManagementPage site = new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			System.out.println("A");
//		
	
			site.clickLocationTap();
			site.clickSettingButton();
			site.verifysitepage();
			
			Log.addMessage("get in to site settings and Display");
		}catch(Exception e) {
			Log.addMessage("Failed to get in to site settings and Display");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to get in to site settings and Display");
		}
	}
	

	@SuppressWarnings("unchecked") 
	@Test(groups="Site Management",priority=6)
	public void editsite_name_site_address() {
		try {
			System.out.println("B");
			SiteManagementPage editsite = new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			System.out.println("A");

			editsite.editTheSiteName("Auto Site C ");
			editsite.editsiteaddress("21,LONDON");
			editsite.clickDoneButton();
			
			//Verify the changed name
			
			
		
			Log.addMessage("Edit the site name and address changed successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to edit the site name and address");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to edit the site address");
		}
	}
	
	///Set timezone requirement removed
//	
//	@SuppressWarnings("unchecked") 
//	@Test(groups="Site Management",priority=7)
//	public void settimezone() {
//		try {
//			System.out.println("B");
//			SiteManagementPage editsite = new SiteManagementPage((AppiumDriver<MobileElement>) driver);
//			System.out.println("A");
//		
//			editsite.clickLocationTap();
//			editsite.clickSettingButton();
//			editsite.set_site_timezone("UTC -05:00 Florida");
//			editsite.clickDoneButton();
//
//			Log.addMessage("Edit the site address successfully");
//		}catch(Exception e) {
//			Log.addMessage("Failed to edit the site address");
//			e.printStackTrace();
//			Assert.assertTrue(false, "Failed to edit the site address");
//		}
//	}
//	
	

	@SuppressWarnings("unchecked") 
	@Test(groups="Site Management",priority=7)
	public void Revert_site_details() {
		try {
			System.out.println("B");
			SiteManagementPage editsite = new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			System.out.println("A");
		
			///site name
			
			editsite.clickSettingButton();
			editsite.editTheSiteName("Auto Site A");
		
			
		
			
			editsite.editsiteaddress("21,USA");

	
			editsite.clickDoneButton();

			Log.addMessage("Edit the site address successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to edit the site address");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to edit the site address");
		}
	}
	
	
	
	@SuppressWarnings("unchecked") 
	@Test(groups="Site Management",priority=8)
	public void Enter_site_pictiure() {
		try {
			System.out.println("B");
			SiteManagementPage editsite = new SiteManagementPage((AppiumDriver<MobileElement>) driver);
			System.out.println("A");
//		
			editsite.clickLocationTap();
			Thread.sleep(5000);
			editsite.clickSettingButton();
			editsite.Uploadsitepicture();
			editsite.clickDoneButton();

			Log.addMessage("Edit the site address successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to edit the site address");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to edit the site address");
		}}
		

		

	
	
	
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