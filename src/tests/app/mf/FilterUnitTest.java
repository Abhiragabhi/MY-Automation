package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FilterMethods;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import utility.Log;
import utility.Utility;

public class FilterUnitTest  extends Settings {

	
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
	@Test(groups="Filter Unit", priority =1)
	public void Filter_Units_Navigation_isplay() {
		try {
			FilterMethods fa = new FilterMethods((AppiumDriver<MobileElement>) driver);
			 //fa.clicktoallowlocation();	 
			 fa.clickOnbuildingbutton();
			 fa.clickOnbuilding();
			 fa.clickOnfliterbutton();
	//		 fa.clickOnfliterbutton();

			
			Log.addMessage("Successfully get into Filter Units Navigation Display");

		} catch (Exception e) {
			Log.addMessage("Filter Units Navigation Display failed");
			e.printStackTrace();
			Assert.assertTrue(false, "Filter Units Navigation Display functionality failed");
		}
	}

	

	@SuppressWarnings("unchecked")
	@Test(groups="Filter Unit", priority =2)
	public void Filter_b_yFloors_Functionality() {
		try {
			FilterMethods ff = new FilterMethods((AppiumDriver<MobileElement>) driver);
	
			 ff.clickonfloor();
     		 ff.clickonfloorresult();
			
			Log.addMessage("Successfully get into Filter by Floors Functionality");

		} catch (Exception e) {
			Log.addMessage(" Filter by Floors Functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, " Filter by Floors Functionality failed");
		}
	}
	

	@SuppressWarnings("unchecked")
	@Test(groups="Filter Unit", priority =3)
	public void Filter_by_Wing_Functionality () {
		try {
			FilterMethods fw = new FilterMethods((AppiumDriver<MobileElement>) driver);
			 fw.clickonfilter();
			 fw.clickonfilterwings();
			 fw.selectfilterwings();
			 fw.clickonwingsresult();
			Log.addMessage("Successfully get into Filter by wings Functionality");

		} catch (Exception e) {
			Log.addMessage(" Filter by wings Functionality failed");
			e.printStackTrace();
			Assert.assertTrue(false, " Filter by wings Functionality failed");
		}
	}
	
	
	
//
//	@SuppressWarnings("unchecked")
//	@Test(groups="Filter Unit", priority =4)
//	public void FilterbyWingFloorFunctionality () {
//		try {
//			FilterMethods wfb = new  FilterMethods ((AppiumDriver<MobileElement>) driver);
//			 wfb.clickonfilter();
//			 wfb.clickonoubacktofilter();
//			 wfb.selectfloor();
//			 wfb.clickonfloorback();
//			 wfb.clickonwingfloorresults();
//			Log.addMessage("Successfully get into Filter by WingFloor Functionality");
//
//		} catch (Exception e) {
//			Log.addMessage(" Filter by WingFloor Functionality failed");
//			e.printStackTrace();
//			Assert.assertTrue(false, " Filter by WingFloor Functionality failed");
//		}
//	}
//	
	

	@SuppressWarnings("unchecked")
	@Test(groups="Filter Unit", priority =5)
	public void Reset_Filter_Functionality () {
		try {
			FilterMethods wfb = new  FilterMethods ((AppiumDriver<MobileElement>) driver);
			FilterMethods rf = new  FilterMethods ((AppiumDriver<MobileElement>) driver);
			  rf.clickonofilter();
			  rf.clickonouresettofilter();
			 wfb.clickonwingfloorresults();
			//  rf.clickonoreset();
			Log.addMessage("Successfully clcik on reset");

		} catch (Exception e) {
			Log.addMessage("  Clcik on reset in Filter ");
			e.printStackTrace();
			Assert.assertTrue(false, " Clcik on reset in filter Functionality failed");
		}
	}

	
	

	
	
@SuppressWarnings("unchecked")
@Test(groups="Filter Unit", priority =6)
public void Navigate_to_mainpage () {
	try {

		Utility.Clickbackbutton();
		

	} catch (Exception e) {
		Log.addMessage("  Clcik on reset in Filter ");
		e.printStackTrace();
		Assert.assertTrue(false, " Clcik on reset in filter Functionality failed");
	}
}



}

	
	
	
	
	
	
	      
	
	
	
	
	
	
	
	
	

	
	
	
	
	

