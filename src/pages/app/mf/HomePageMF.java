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
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.Log;
import utility.Utility;

public class HomePageMF extends Settings {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement homePageSideMenu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[2]"),
	})
	@CacheLookup
	private MobileElement accountSettingsOption;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout"),
	})
	@CacheLookup
	private MobileElement accountSettingsPage;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
	})
	@CacheLookup
	private MobileElement buildingsNavigation;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backtobuildingpage;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/layout_drop_down"),
	})
	@CacheLookup
	private MobileElement siteSelectDropdown;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),
	})
	@CacheLookup
	private MobileElement autoSiteASelect;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button"),
	})
	@CacheLookup
	private MobileElement locationAccessPopup;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.android.permissioncontroller:id/permission_message"),
	})
	@CacheLookup
	private MobileElement connect_popup;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_button"),
	})
	@CacheLookup
	private MobileElement connect_popup_handle;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement settingsicon;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textBuildingName\"]"),
		})


	@CacheLookup
	private MobileElement buildingrecord;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/textBuildings"),
		})


	@CacheLookup
	private MobileElement heading_buildings;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
	
	
	})
	@CacheLookup
	private MobileElement searchbox;
	
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Account Settings']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/search_plate"),
	})
	@CacheLookup
	private MobileElement searchtab;
	
	
	
	
	
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/titleText\"]"),
	})
	@CacheLookup
	private MobileElement page_title;
	
	


	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"),
		})
		@CacheLookup
		private MobileElement verifydashboard;
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup[2]"),
		})
		@CacheLookup
		private MobileElement clickonmaintenance;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
		})
		@CacheLookup
		private MobileElement clickonassignuser;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]"),
		})
		@CacheLookup
		private MobileElement clickonuser;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/scheduledShowingsView"),
		})
		@CacheLookup
		private MobileElement clickonshowings;
	
	
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
		})
		@CacheLookup
		private MobileElement clickondonebtn;
	
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
		})
		@CacheLookup
		private MobileElement verigyprivatepage;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/scheduledPrivateEventsView"),
		})
		@CacheLookup
		private MobileElement clickonprivate;
	

	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]"),
		})
		@CacheLookup
		private MobileElement selectuser;
	
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
		})
		@CacheLookup
		private MobileElement clickondone;
	
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/overallSharedAccessView"),
		})
		@CacheLookup
		private MobileElement clickonsharedacccess;
	
	
	
	
	
	@SuppressWarnings("static-access")
	public HomePageMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	
	
	public void clicktomaintenance() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonmaintenance);
			clickonmaintenance.click();
			Log.addMessage("Clicked on a maintenance");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on a maintenance");
			Assert.assertTrue(false, "Failed to Clicked on a maintenance");
		}
	
	
	}
	
	
	
	public void clickonassignuser() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonassignuser);
			clickonassignuser.click();
			Log.addMessage("Clicked on a assign user");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on a assign user");
			Assert.assertTrue(false, "Failed to Clicked on a assign user");
		}

	}
	
	
	
	
	
	
	public void clickonuser() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonuser);
			clickonuser.click();
			Log.addMessage("Clicked on a user");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on a user");
			Assert.assertTrue(false, "Failed to Clicked on a user");
		}

	}
	
	
	
	
	
	
	
	public void clickondonebtn() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickondonebtn);
			clickondonebtn.click();
			Log.addMessage("Clicked on done button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on done button");
			Assert.assertTrue(false, "Failed to Clicked on done button");
		}

	}
	
	
	
	
	
	
	
	public void verifydashboardoverview() {
		try {
			Utility.waitForElementVisible(verifydashboard, driver);
			String dashboard = verifydashboard.getText();
			Assert.assertEquals("Today’s Overview", dashboard);
			Log.addMessage("Overview page displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Overview page display");
			Assert.assertTrue(false, "Failed to Overview page display");
		}
	}
	
	
	
	public void sideBarNavigation() {
		try {
			Utility.waitForElementClickable(homePageSideMenu, driver);
			Thread.sleep(3000);
			homePageSideMenu.click();
			
			Log.addMessage("Side Bar mHomeUsersPageAppMFenu navigated");
		}catch(Exception e) {
			Log.addMessage("SideBar menu is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Side Bar menu is not visible");
		}
	}
	
	public void locationAccessPopupAllow() {
		try {
			Utility.waitForElementClickable(locationAccessPopup, driver);
			locationAccessPopup.click();
			
		}catch(Exception e) {
			Log.addMessage("Location access popup is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Location access popup is not visible");
		}
	}
	
	public void Multifamil_connect_popup_handle() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementVisible(connect_popup, driver);
			Utility.waitForElementVisible(connect_popup_handle, driver);
			connect_popup_handle.click();
			
			
		}catch(Exception e) {
			Log.addMessage("Location access popup is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Location access popup is not visible");
		}
	}
	
	
	
	
	
	public void accountSettingsNavigation() {
		try {
			Utility.waitForElementClickable(accountSettingsOption, driver);
			Thread.sleep(3000);
			accountSettingsOption.click();
			
			Log.addMessage("Account Settings navigated");
		}catch(Exception e) {
			Log.addMessage("Account Settings is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Account Settings is not visible");
		}
	}
	public void accountSettingsPageDisplay() {
		try {
			Utility.waitForElementVisible(accountSettingsPage, driver);
			Thread.sleep(3000);
			Assert.assertTrue(accountSettingsPage.isDisplayed(), "Account Settings page is not visible");
			
			Log.addMessage("Account Settings navigated");
		}catch(Exception e) {
			Log.addMessage("Account Settings Page is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Account Settings Page is not visible");
		}
	}
	
	public void buildingsNavigation() {
		try {
			Utility.waitForElementClickable(buildingsNavigation, driver);
			Thread.sleep(3000);
			buildingsNavigation.click();
			
			Log.addMessage("Building page navigated");
		}catch(Exception e) {
			Log.addMessage("Buildings button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Buildings button is not visible");
		}
	}
	
	public void siteSelection() {
		try {
			Utility.waitForElementVisible(siteSelectDropdown, driver);
			Thread.sleep(3000);
			siteSelectDropdown.click();
			Utility.waitForElementVisible(autoSiteASelect, driver);
			Thread.sleep(3000);
			autoSiteASelect.click();
			Thread.sleep(3000);		
			Log.addMessage("Auto site A selected");
		}catch(Exception e) {
			Log.addMessage("Site dropdown is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Site dropdown is not visible");
		}
	}
	
	
	
	
	public void Verify_buildingsheading() {
		try {
			Utility.waitForElementVisible(heading_buildings, driver);
			Thread.sleep(3000);
			heading_buildings.click();
				
			Log.addMessage("Builds heading verified");
		}catch(Exception e) {
			Log.addMessage("Site dropdown is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Site dropdown is not visible");
		}
	}
	
	
	public void backToBuildings() {
		try {
			Utility.waitForElementVisible(backtobuildingpage, driver);
			Thread.sleep(3000);
			backtobuildingpage.click();
			
			Log.addMessage("Auto site A selected");
		}catch(Exception e) {
			Log.addMessage("Site dropdown is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Site dropdown is not visible");
		}
	}
	

	
	public void Verifysettingicon( ) {
		try {
			Utility.waitForElementClickable(settingsicon, driver);
			settingsicon.click();
			Log.addMessage("Text entered successfully on the searchbox");
			
		}catch(Exception e) {
			Log.addMessage("Location access popup is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Location access popup is not visible");
		}
	}
	
	
	
	public void searchrecord(String Gname) {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(searchbox);
			searchbox.click();
			searchbox.clear();
			searchbox.sendKeys(Gname);
			
			
			
			
			Log.addMessage("searched  the record  successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to search a the record ");
			Assert.assertTrue(false, "Failed to search a group ");
		}
	}
	
	public void verifyprivate() {
		try {
			Utility.waitForElementVisible(verigyprivatepage, driver);
			String event =verigyprivatepage.getText();
			Assert.assertEquals("Private Events", event);
			Log.addMessage("verify private page successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify private page");
			Assert.assertTrue(false, "Failed to verify private page");
		}
	}
		
	
	
	
	
	public void Verifybuildinglistdisplayed() {
		try {
			
			
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(buildingrecord);
			
			Log.addMessage("searched  building   result verified successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify search building  result ");
			Assert.assertTrue(false, "Failed to verify search a group result");
		}
	}
	
	
	
	public void Verifythesearchresultinbuilding(String Gname) {
		try {
			
			
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(buildingrecord);
			String s = buildingrecord.getText();
			Assert.assertEquals(s,Gname);
			
			Log.addMessage("searched  building   result verified successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify search building  result ");
			Assert.assertTrue(false, "Failed to verify search a group result");
		}
	}
	
	public void VerifyFrenchllanguageinDashbord()  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(page_title, driver);
			String language = page_title.getText();
			Assert.assertEquals("Aperçu du jour", language);
   
			Log.addMessage("Successfully verfied the updated language uploaded a photo");

		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}
	
	

	public void clicktoprivate() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonprivate);
			clickonprivate.click();
			Log.addMessage("Clicked on private");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on private");
			Assert.assertTrue(false, "Failed to Clicked on a private");
		}
	
	
	}
	
	
	
	
	public void clicktoshowings() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonshowings);
			clickonshowings.click();
			Log.addMessage("Clicked on showings");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on showings");
			Assert.assertTrue(false, "Failed to Clicked on a showings");
		}
	
	
	
	}	
	
	
	
	public void clicktoassignuser() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonassignuser);
			clickonassignuser.click();
			Log.addMessage("Clicked on showings to add user");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on showings to add user");
			Assert.assertTrue(false, "Failed to Clicked on a showings to add user");
		}
	
	
	}	
	
	
	
	public void selectauser() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(selectuser);
			selectuser.click();
			Log.addMessage("sucessfully add user to showings");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to add user to showings");
			Assert.assertTrue(false, "Failed to add user to showings");
		}
	
	}	
	
	
	
	
	public void clickondone() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickondone);
			clickondone.click();
			Log.addMessage("Click on done button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Click on done button");
			Assert.assertTrue(false, "Failed to Click on done button");
		}
	
	}	
	
	
	
	public void clicktoshareaccess() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonsharedacccess);
			clickonsharedacccess.click();
			Log.addMessage("Clicked on shared acccess");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on shared acccess");
			Assert.assertTrue(false, "Failed to Clicked on shared acccess");
		}
	
	
	}	
	
	
	
	
	
		
	
}
	
	
	
	
	

