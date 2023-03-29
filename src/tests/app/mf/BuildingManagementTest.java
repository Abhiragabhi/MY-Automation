package tests.app.mf;

import org.testng.annotations.Test;



import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.LoginPageAppMF;

import utility.ExcelRead;
import utility.Log;

public class BuildingManagementTest extends Settings{

	
	
	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="", priority =0)
	public void Relauch_application() {
		try {

			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();

			
			Log.addMessage("Relauched App successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to Re launch the App");
			e.printStackTrace();
			Assert.assertTrue(false, "Failed to Re launch the App");
		}
	}

	
	
	

	@Test(groups="Building Management", priority =3)
	public void building_list_View() {
		try {
			
			
			
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.clickLocationTap();
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//home.siteSelection();
			home.buildingsNavigation();


			building.verifyBuildingList();
			Log.addMessage("Successfully verified building list");

		} catch (Exception e) {
			Log.addMessage("Building List view functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Building List view functionality failed");
		}
	}

	
	
	
	@Test(dataProvider="AddBuilding_details", groups="Building Management", priority =4)
	public void addBuilding_navigation_and_display(String BuildingName, String BuildingAddress) {
		try {
			//HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//home.siteSelection();
			//	home.buildingsNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.clickSiteSettings();
			building.clickAddBuildingButton();
			building.verifyaddbuilding();
		    building.backNavigation();
		    building.clickonback();

			Log.addMessage("Successfully added a building");
		} catch (Exception e) {
			Log.addMessage("Add Building functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Add Building functionality failed");
		}
	}
	
	
	
	
	@Test(dataProvider="AddBuilding_details", groups="Building Management", priority =5)
	public void add_Building(String BuildingName, String BuildingAddress) {
		try {
			//HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//home.siteSelection();
			//	home.buildingsNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.clickSiteSettings();
			building.clickAddBuildingButton();
			building.enterBuildingDetails(BuildingName, BuildingAddress);
			building.backNavigation();

			Log.addMessage("Successfully added a building");
		} catch (Exception e) {
			Log.addMessage("Add Building functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Add Building functionality failed");
		}
	}

	@Test(groups="Building Management", priority = 6)
	public void search_For_Building() {
		try {
			//			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//			home.siteSelection();
			//			home.buildingsNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.searchForBuilding("AutoBuild");
			building.Clearsearchbox();
			Log.addMessage("Search for building working");
		} catch (Exception e) {
			Log.addMessage("Searched building is not visible");
			e.printStackTrace();
			Assert.assertTrue(false, "Searched building is not visible");
		}
	}

	@Test(groups="Building Management", priority = 7)
	public void select_Building() {
		try {
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//			home.siteSelection();
			//			home.buildingsNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.autoBuildSelect();
			building.verifyAddedBuilding();
			building.backNavigation();
			Log.addMessage("Select building functionality working");
		} catch (Exception e) {
			Log.addMessage("Selected building is not visible");
			e.printStackTrace();
			Assert.assertTrue(false, "Selected building is not visible");
		}
	}
	//
	@Test(dataProvider="EditBuilding_details", groups="Building Management", priority = 8)
	public void edit_Building(String NewBuildingName, String newBuildingAddress) {
		try {
			//			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//			home.siteSelection();
			//			home.buildingsNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.autoBuildSelect();
			building.editBuilding();
			building.editBuildingDetails(NewBuildingName, newBuildingAddress);
			Thread.sleep(3000);
			building.backNavigation();
			//building.verifyEdittedBuilding("Building Auto Test");
			Log.addMessage("Successfully edited building");
		} catch (Exception e) {
			Log.addMessage("Edit Building functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Edit Building functionality failed");
		}
	}

	@Test(groups="Building Management", priority = 9)
	public void delete_Building() {
		try {
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//home.siteSelection();
			//home.backNavigation();
			BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
			building.backNavigation();

			building.SelectBuilding("Building Auto Test");
			building.clickSiteSettings();
			building.clickRemoveBuilding();
			building.clickYesToRemove();
			Log.addMessage("Successfully deleted building");
		} catch (Exception e) {
			Log.addMessage("Delete Building functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Delete Building functionality failed");
		}
	}

	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Building Management", priority =10)
	public void Navigate_to_mainpage () {
		try {
		
			
		
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
	@DataProvider(name = "AddBuilding_details")
	public Object[][] getData2() throws Exception {
		return excel.getTableArray(InputData, "TestData", "AddBuilding_details");
	}
	@DataProvider(name = "EditBuilding_details")
	public Object[][] getData3() throws Exception {
		return excel.getTableArray(InputData, "TestData", "EditBuilding_details");
	}

}
