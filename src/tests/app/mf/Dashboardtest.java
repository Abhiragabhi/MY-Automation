package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.LogOutAppPageMF;
import utility.Log;

public class Dashboardtest extends Settings{

	
	@BeforeClass
	@SuppressWarnings("unchecked")
	@Test(groups="", priority =0)
	public void Relauch_application() {
		try {
		Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
		g.Relauchtheapp();			


		} catch (Exception e) {
		
			e.printStackTrace();
			Assert.assertTrue(false, "search exisitinguser functionality failed");
		}
	}

	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Dash board", priority =1)
	public void Dashboard_overviewpage() {
		try {
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
			
			 LogOutAppPageMF logout = new LogOutAppPageMF((AppiumDriver<MobileElement>) driver);
			HomePageMF over = new HomePageMF((AppiumDriver<MobileElement>) driver);
			//logout.NavigatetoHomescreen();
			over.verifydashboardoverview(); 
			generic.backnavigation();
			
			Log.addMessage("Successfully get into over view page");

		} catch (Exception e) {
			Log.addMessage("Successfully get into over view page failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Get into over view page Functionality failed");
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Dash board", priority =2)
	public void Dashboard_maintenance() {
		try {
			HomePageMF main = new HomePageMF((AppiumDriver<MobileElement>) driver);
			Genericmethods search = new Genericmethods((AppiumDriver<MobileElement>) driver);
			Thread.sleep(5000);
			main.clicktomaintenance(); 
			
//			main.clickonassignuser();
//			search.Searchanitem("MF Mobile Test User");
//			main.clickonuser();
//			
//			main.clickondonebtn();
			main.backToBuildings();
			Log.addMessage("Successfully get into Filter by Floors Functionality");

		} catch (Exception e) {
			Log.addMessage(" Filter by Floors Functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, " Filter by Floors Functionality failed");
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Dash board", priority =3)
	public void Dashboard_private() {
		try {
			HomePageMF over = new HomePageMF((AppiumDriver<MobileElement>) driver);
	
			over.clicktoprivate(); 
			
//			over.verifyprivate();
			over.backToBuildings();
			Log.addMessage("Successfully get into private page");

		} catch (Exception e) {
			Log.addMessage("Get into private page failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Get into over view page Functionality failed");
		}
	}
	
	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Dash board", priority =4)
	public void Dashboard_Viewshowings() {
		try {
			HomePageMF show = new HomePageMF((AppiumDriver<MobileElement>) driver);
	
			show.clicktoshowings(); 
			
//			show.clicktoassignuser();
//			Genericmethods search = new Genericmethods((AppiumDriver<MobileElement>) driver);
//			search.Searchanitem("MF Mobile Test User");
//			show.selectauser();
//			
//			
//			show.clickondone();
			show.backToBuildings();
			Log.addMessage("Successfully get into View showings page");

		} catch (Exception e) {
			Log.addMessage("get into View showings page failed");
			e.printStackTrace();
			Assert.assertTrue(false, "get into View showings page Functionality failed");
		}
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Dash board", priority =5)
	public void shareaccess_widget_dashord() {
		try {
			HomePageMF access = new HomePageMF((AppiumDriver<MobileElement>) driver);
	
			access.clicktoshareaccess(); 
		
			access.backToBuildings();
			Log.addMessage("Successfully get into private page");

		} catch (Exception e) {
			Log.addMessage("Get into private page failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Get into over view page Functionality failed");
		}
	}
	

//	
//	@SuppressWarnings("unchecked")
//	@Test(groups="Dash board", priority =5)
//	public void searchunits() {
//		try {
//			HomePageMF unit = new HomePageMF((AppiumDriver<MobileElement>) driver);
//			Genericmethods search = new Genericmethods((AppiumDriver<MobileElement>) driver);
//			Thread.sleep(5000);
//			unit.Clickunitfromhome(); 
//			search.Searchanitem("01");
//			unit.verify_searched_result_in_unit_page("Unit 01");
//			unit.backToBuildings();
//			Log.addMessage("Successfully get into private page");
//
//		} catch (Exception e) {
//			Log.addMessage("Get into private page failed");
//			e.printStackTrace();
//			Assert.assertTrue(false, "Get into over view page Functionality failed");
//		}
//	}
//	


		
	
	
	

}
