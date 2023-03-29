package pages.app.mf;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.Log;
import utility.Utility;

public class FilterMethods extends Settings{
	
	

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),
	
		
	})
	@CacheLookup
	private MobileElement clickbuilding;
	

	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/imageFilter"),
	
		
	})
	@CacheLookup
	private MobileElement clickonfloorbuilding;
	
	
	
//@AndroidBy(id = "com.kwikset.multifamily.dev:id/tvWing"),
		@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/imageFilter"),

		
		
	})
	@CacheLookup
	private MobileElement clickonfilter;
	

	

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox"),
	
		
	})
	@CacheLookup
	private MobileElement clickonnorth;
	
	

	
	
	
	

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"),
	

		
		
	})
	@CacheLookup
	private MobileElement clickonsouth;
	
	
	
	

	

	@AndroidFindAll({
		@AndroidBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"),
	

		
		
	})
	@CacheLookup
	
	private MobileElement clickonnorthsouth;
	
	
	

	

	@AndroidFindAll({
		@AndroidBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.TextView"),
	

		
		
	})
	@CacheLookup
	
	private MobileElement clickonfloor;
	
	
	
	
	
	

	
	
	

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),
	

		
		
	})
	@CacheLookup
	private MobileElement clickonfloor1;
	
	


	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btn_see_results"),
	
		
	})
	@CacheLookup
	private MobileElement clickonseeresult;
	
	
	

	


	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/tv_reset")
	})
	@CacheLookup
	private MobileElement clickonfiltertorest;
	
	
//	
	
	
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btn_see_results"),
	

		
		
	})
	@CacheLookup
	private MobileElement clickonresult;
	
	///filter by floor
	
	@AndroidFindAll({
	    @AndroidBy(xpath="//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView[2]")
	})
	@CacheLookup
	private MobileElement clickfloor;
	





	@AndroidFindAll({
	    @AndroidBy(xpath="//android.widget.LinearLayout[@content-desc=\"Activity\"]/android.widget.TextView")
	})
	@CacheLookup
	private MobileElement floorverifypage;

	
	
	//filter navigation
	



	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]"),
		})
		@CacheLookup
		private MobileElement locationpermission;


	

	
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.multifamily.dev:id/users_nav_graph"),
		@AndroidBy(id ="com.kwikset.multifamily.dev:id/bottomNavigationView"),
		
	})
	@CacheLookup
	private MobileElement clickbuildingbutton;
	
	
	
	@AndroidFindAll({
	

		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
		
		})
		@CacheLookup
		private MobileElement clickonbuilding;
		

	


	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/tv_reset")
	})
	@CacheLookup
	private MobileElement verifypage;
	

	
	//filter by wings
	

	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/touch_outside")
	})
	@CacheLookup
	private MobileElement clickonoutside;
    
	

	

	
	@AndroidFindAll({
	    @AndroidBy(xpath="//android.widget.TextView[@text=\"Wing\"]")
	})
	@CacheLookup
	private MobileElement clickonwings;
	
//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox
	
	
	@AndroidFindAll({
	    @AndroidBy(xpath="//android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox")
	})
	@CacheLookup
	private MobileElement selectwings;
	



	
	
	@AndroidFindAll({
	    @AndroidBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView[2]")
	})
	@CacheLookup
	private MobileElement clickonbackfilter;




	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/img_back")
	})
	@CacheLookup
	private MobileElement clickonfloorbackbtn;
	
	              
	
	
	

	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/btn_see_results")
	})
	@CacheLookup
	private MobileElement clickonwingfloorresult;
	


	

	





	
	
	
	



	

	
	
	

	

	@SuppressWarnings("static-access")
	public FilterMethods(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	
	
	//reset
	
	
	public void clickonofilter() {
		try {
			Thread.sleep(6000);
			Utility.waitForElementToBeVisible(clickonfilter);
			clickonfilter.click();
			Log.addMessage("Clicked on a reset");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on reset");
			Assert.assertTrue(false, "Failed to click on reset");
		}
	}
	

	public void clickonouresettofilter() {
		try {
			Thread.sleep(6000);
			Utility.waitForElementToBeVisible( clickonfiltertorest);
		    clickonfiltertorest.click();
			Log.addMessage("Clicked on a resettofilter");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on resettofilter");
			Assert.assertTrue(false, "Failed to click on resettofilter");
		}
	}
	
	
	
	
	
	
	
	
	public void clickonfilter() {
		try {
			Thread.sleep(6000);
			Utility.waitForElementToBeVisible(clickonfilter);
			clickonfilter.click();
			Log.addMessage("Clicked on a filter");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on filter");
			Assert.assertTrue(false, "Failed to click on filter");
		}
	}
	
	

	public void clickonoubacktofilter() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonbackfilter);
			clickonbackfilter.click();
			Log.addMessage("Clicked on a backtofilter");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on backtofilter");
			Assert.assertTrue(false, "Failed to click on backtofilter");
		}
	}
	
	

	public void selectfloor() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonfloor);
			clickonfloor.click();
			Log.addMessage("Clicked on a floor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on floor");
			Assert.assertTrue(false, "Failed to click on floor");
		}
	}
	
	
	

	public void clickonfloorback() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonfloorbackbtn);
			clickonfloorbackbtn.click();
			Log.addMessage("Clicked on back to floor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on back to floor");
			Assert.assertTrue(false, "Failed to click back to on floor");
		}
	}
	
	
	


	public void clickonwingfloorresults() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonwingfloorresult);
			clickonwingfloorresult.click();
			Log.addMessage("Clicked on a floor result");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on floor result");
			Assert.assertTrue(false, "Failed to click on floor result");
		}
	}
	
	
	
	
	
	///filter by wings
	
	public void clickonoutsidepg() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonoutside);
			clickonoutside.click();
			Log.addMessage("Clicked on outside page");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on outside page");
			Assert.assertTrue(false, "Failed to outside page");
		}
	}
	
	

	

	public void clickonfilterwings() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonwings);
			clickonwings.click();
			Log.addMessage("Clicked on a filterwings");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on filterwings");
			Assert.assertTrue(false, "Failed to filterwings");
		}
	}
	


	public void selectfilterwings() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(selectwings);
			selectwings.click();
			Log.addMessage("Select on a filterwings");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Select on filterwings");
			Assert.assertTrue(false, "Failed to filterwings");
		}
	}
	
	
	
	
	

	public void clickonwingsresult() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonseeresult);
			clickonseeresult.click();
			Log.addMessage("Clicked on a Floorresult");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Floorresult");
			Assert.assertTrue(false, "Failed to click on Floorresult");
		}
	}
	
	
	
	
	
	
	
	/// filter navigation
	
	
	public void clicktoallowlocation() {
		try {
			Thread.sleep(8000);
			Utility.waitForElementToBeVisible(locationpermission);
			locationpermission.click();
			Log.addMessage("Clicked on a location");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on location");
			Assert.assertTrue(false, "Failed to click on location");
		}
	}
	
	
	
	public void clickOnbuildingbutton() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible( clickbuildingbutton);
			 clickbuildingbutton.click();
			Log.addMessage("Clicked on a Buildingbutton");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Buildingbutton");
			Assert.assertTrue(false, "Failed to click on Buildingbutton");
		}
	}
	
	

	public void clickOnbuilding() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonbuilding);
			clickonbuilding.click();
			Log.addMessage("Clicked on a Building");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Building");
			Assert.assertTrue(false, "Failed to click on Building");
		}
	}
	
	
	
	
	
	
	
	

	public void clickOnfliterbutton() {
		try {
			Utility.waitForElementToBeVisible(clickonfilter);
			clickonfilter.click();
			Log.addMessage("Clicked on a fliterbutton");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to fliterbutton");
			Assert.assertTrue(false, "Failed to click on fliterbutton");
		}
	}
	
	

	public void verifypage() {
        try {
            Utility.waitForElementVisible(verifypage, driver);
            String access = verifypage.getText();
            Assert.assertEquals("Reset", access);    
            Log.addMessage("Verify the filter navigation successfully");
        }catch(Exception e) {
            Log.addMessage("Failed to Verify filter navigation ");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Failed to Verify filter navigation ");
        }
    }
	

	public void clickonbuilding() {
		try {
			Utility.waitForElementToBeVisible(clickbuilding);
			clickbuilding.click();
			Log.addMessage("Clicked on a clickonbuilding");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonbuilding");
			Assert.assertTrue(false, "Failed to click on clickonbuilding");
		}
	}
	
	

	public void selectonbuilding() {
		try {
			Utility.waitForElementToBeVisible (clickonfloorbuilding);
			clickonfloorbuilding.click();
			Log.addMessage("Clicked on a clickongroup");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickongroup");
			Assert.assertTrue(false, "Failed to click on clickongroup");
		}
	}
	


	public void selectonfilter() {
		try {
			Utility.waitForElementToBeVisible (clickonfilter);
			clickonfilter.click();
			Log.addMessage("Clicked on a clickonfilter");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonfilter");
			Assert.assertTrue(false, "Failed to click on clickonfilter");
		}
	}
	
	
	


	public void selectonfloor() {
		try {
			Utility.waitForElementToBeVisible (clickonfilter);
			clickonfilter.click();
			Log.addMessage("Clicked on a clickonfloor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  clickonfloor");
			Assert.assertTrue(false, "Failed to click on  clickonfloor");
		}
	}
	
	



	
	

	
	
	public void selectonnorth() {
		try {
			Utility.waitForElementToBeVisible (clickonnorth);
			clickonnorth.click();
			Log.addMessage("Clicked on a clickonnorth");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonnorth");
			Assert.assertTrue(false, "Failed to click on clickonnorth");
		}
	}
	
	

	
	

	public void selectonsouthbutton() {
		try {
			Utility.waitForElementToBeVisible ( clickonsouth);
			 clickonsouth.click();
			Log.addMessage("Clicked on a clickonsouth");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonsouth");
			Assert.assertTrue(false, "Failed to click on clickonsouth");
		}
	}
	
	
	
	

	


	
	
	
	

	


	


	
	

	
	
	
	


	
	

	

	public void selectbyfloor() {
		try {
			Utility.waitForElementToBeVisible (clickonfloor);
			clickonfloor.click();
			Log.addMessage("Clicked on a filterbyfloor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to filterbyfloor");
			Assert.assertTrue(false, "Failed to click on filterbyfloor");
		}
	}
	
	
	
	
	
	

	

	public void clickonresult() {
		try {
			Utility.waitForElementToBeVisible (clickonresult);
			clickonresult.click();
			Log.addMessage("Clicked on a clickonresult");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonresult");
			Assert.assertTrue(false, "Failed to click on clickonresult");
		}
	}
	
	
	//filter by floor
	
	public void clickonfloor() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickfloor);
			clickfloor.click();
			Log.addMessage("Clicked on a Floor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Floor");
			Assert.assertTrue(false, "Failed to click on Floor");
		}
	}	public void selectonnorthsouthbutton() {
		try {
			Utility.waitForElementToBeVisible ( clickonnorthsouth);
			clickonnorthsouth.click();
			Log.addMessage("Clicked on a clickonnorthsouth");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clickonnorthsouth");
			Assert.assertTrue(false, "Failed to click on clickonnorthsouth");
		}
	}
	
	
	
	

	public void clickonfloorresult() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonseeresult);
			clickonseeresult.click();
			Log.addMessage("Clicked on a Floorresult");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Floorresult");
			Assert.assertTrue(false, "Failed to click on Floorresult");
		}
	}
	
	

	public void verifypagefloorresult() {
        try {
            Utility.waitForElementVisible(floorverifypage, driver);
            String access = floorverifypage.getText();
            Assert.assertEquals("Reset", access);    
            Log.addMessage("Verify the filter navigation successfully");
        }catch(Exception e) {
            Log.addMessage("Failed to Verify filter navigation ");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Failed to Verify filter navigation ");
        }
    }
	
	
	
	
	
	
	
	
	
	
	

}
