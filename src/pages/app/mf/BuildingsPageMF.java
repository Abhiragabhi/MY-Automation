package pages.app.mf;

import org.openqa.selenium.By;
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

public class BuildingsPageMF extends Settings {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/recyclerBuilding"),
	})
	@CacheLookup
	private MobileElement buildingsListView;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]"),
	})
	@CacheLookup
	private MobileElement buildingsSelect;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement siteSettings;
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
	})
	@CacheLookup
	private MobileElement locationclick;

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonAddBuilding"),
	})
	@CacheLookup
	private MobileElement addBuildingButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/textTitle"),
	})
	@CacheLookup
	private MobileElement addDetailsTitle;
	
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement buildingName;
	
	
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement buildingAddress;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement buildingPhoto;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/lytGalleryPick"),
	})
	@CacheLookup
	private MobileElement clickGallerySelect;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.FrameLayout[1]/android.widget.ImageView"),
	})
	@CacheLookup
	private MobileElement imageSelect;	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/menu_crop"),
	})
	@CacheLookup
	private MobileElement submitIcon;	
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement doneButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath= "//android.widget.TextView[@text='Building AutoBuild']"),
	})
	@CacheLookup
	private MobileElement AutoBuild_Building;
	 
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath= "//android.widget.TextView[@text='Building Building Auto']"),
	})
	@CacheLookup
	private MobileElement BuildingAuto_Building;
	 
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement editSettingsButton;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/textViewTitle"),
	})
	@CacheLookup
	private MobileElement buildingTitle;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (xpath= "//android.widget.TextView[@text='Building Building Auto']"),
	})
	@CacheLookup
	private MobileElement buildingTitle1;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/search_src_text"),
	})
	@CacheLookup
	private MobileElement searchBox_Building;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/viewRemoveBuilding"),
	})
	@CacheLookup
	private MobileElement removeBuildingButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/positiveButton"),
	})
	@CacheLookup
	private MobileElement yesButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/positiveButton"),
	})
	@CacheLookup
	private MobileElement addFloorButton;
	
	// media pop up handle


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_one_time_button"),
	})
	@CacheLookup
	private MobileElement mediapopuphandle;
	
////site dropdown validation
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/text_drop_down"),
	})
	@CacheLookup
	private MobileElement verifysitedropdown;
	
	

	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		
		@AndroidBy(xpath = "//android.widget.TextView[@text='Building Susmitha 14']"),
	})
	@CacheLookup
	private MobileElement building_id;
	
	
	
	//verify search box
	@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_plate"),
			})
		@CacheLookup
		private MobileElement Verifysearchbox;
		//verify search box
		@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
		})
		@CacheLookup
		private MobileElement Verifysearchbox_keywords;
	
	
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
			})
			@CacheLookup
			private MobileElement verifybuildingsetting;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
			})
			@CacheLookup
			private MobileElement backbutton;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textTitle"),
		})
		@CacheLookup
		private MobileElement verifyaddbuildingpage;
		
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textBuildingName"),
		})
		@CacheLookup
		private MobileElement Buildinglist;
		

		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buildings_nav_graph"),
			})
			@CacheLookup
			private MobileElement clickonviewbuilding;
		
		
		
		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"),
			})
			@CacheLookup
			private MobileElement clickonbuilding;
		
		
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Détails\"]/android.widget.TextView"),
			})
			@CacheLookup
			private MobileElement verifybuildingverify;

		

		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textBuildings"),
			})
			@CacheLookup
			private MobileElement buildinglanguage;
		
		
	
		

		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
			})
			@CacheLookup
			private MobileElement clickonsetting;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
			})
			@CacheLookup
			private MobileElement editbuildingname;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
			})
			@CacheLookup
			private MobileElement clickbackbtn;
		
		
	
	@SuppressWarnings("static-access")
	public BuildingsPageMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	public void clicktobuilding() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonviewbuilding);
			clickonviewbuilding.click();
			Log.addMessage("Clicked on building");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on building");
			Assert.assertTrue(false, "Failed to Clicked on building");
		}
	
	}	
	

	
	
	
	
	
	

	public void verifybuildingDetails() {
		try {
			Thread.sleep(5000);
			Utility.waitForElementVisible(verifybuildingverify , driver);
			String Detail = verifybuildingverify .getText();
			Assert.assertEquals("Détails",Detail);
			Log.addMessage("Detail of building display successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to display Detail of building");
			Assert.assertTrue(false, "Failed to display Detail of building");
		}
	}
	
	
	
	
	public void verifybuildinglanguage() {
		try {
			Utility.waitForElementVisible(buildinglanguage, driver);
			String building = buildinglanguage.getText();
			Assert.assertEquals("Bâtiments", building);
			Log.addMessage("building language verify successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to building language verify successfully");
			Assert.assertTrue(false, "Failed to building language verify");
		}
	}
		
	
	
	public void clicktoviewbuilding() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonviewbuilding);
			clickonviewbuilding.click();
			Log.addMessage("Clicked on a viewbuilding");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on viewbuilding");
			Assert.assertTrue(false, "Failed to click on viewbuilding");
		}
	}
	
	
	
	public void clickbuilding() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonbuilding);
			clickonbuilding.click();
			Log.addMessage("Clicked on building");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on building");
			Assert.assertTrue(false, "Failed to click on building");
		}
	}
	
	
	
	
	public void clicksetting() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonsetting);
			clickonsetting.click();
			Log.addMessage("Clicked on building setting");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on building setting");
			Assert.assertTrue(false, "Failed to click on building setting");
		}
	}
	
	
	public void verifyeditbuildinglanguage() {
		try {
			Utility.waitForElementVisible(editbuildingname, driver);
			String building =editbuildingname.getText();
			Assert.assertEquals("MISSION ACCOMPLIE", building);
			Log.addMessage("edit building name language verify successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to edit building name language verify successfully");
			Assert.assertTrue(false, "Failed to edit buildingname language verify");
		}
	}
	
	
	
	
	
	
	public void clickbackbtn() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickbackbtn);
			clickbackbtn.click();
			Log.addMessage("Clicked on back button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Clicked on back button");
			Assert.assertTrue(false, "Failed to Clicked on back button");
		}
	}
	
	

	
	
	public void verifyBuildingList() {
		try {
			Utility.waitForElementVisible(buildingsListView, driver);
			Thread.sleep(3000);
			Assert.assertTrue(buildingsListView.isDisplayed(), "Buildings are listed");
			
			Log.addMessage("List of buildings are displayed");
		}catch(Exception e) {
			Log.addMessage("List of buildings are not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "List of buildings are not visible");
		}
	}
	public void clickSiteSettings() {
		try {
			Utility.waitForElementVisible(siteSettings, driver);
			Thread.sleep(3000);
			siteSettings.click();
			
			Log.addMessage("Site settings is clicked");
		}catch(Exception e) {
			Log.addMessage("Site settings is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Site settings is not visible");
		}
	}
	
	public void clickAddBuildingButton() {
		try {
			Utility.waitForElementVisible(addBuildingButton, driver);
			Thread.sleep(3000);
			addBuildingButton.click();
			
			Log.addMessage("Add building button is clicked");
		}catch(Exception e) {
			Log.addMessage("Add building button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Add building button is not visible");
		}
	}
	
	public void enterBuildingDetails(String BuildingName, String BuildingAddress) {
		try {
			Utility.waitForElementVisible(addDetailsTitle, driver);
			Thread.sleep(3000);
			//buildingName.click();
			buildingName.clear();
			Thread.sleep(2000);
			buildingName.sendKeys(BuildingName);
			
			buildingAddress.click();
			buildingAddress.clear();
			buildingAddress.sendKeys(BuildingAddress);
			
			buildingPhoto.click();
		//buildingPhoto.clear();
//		buildingPhoto.sendKeys(BuildingPhoto);
			
			
			//Media pop up handle
			Thread.sleep(5000);
			Utility.waitForElementToBeVisible(mediapopuphandle);
			Utility.waitForElementToBeClickable(mediapopuphandle);
			mediapopuphandle.click();
			
			Thread.sleep(2000);
			clickGallerySelect.click();
			imageSelect.click();
			submitIcon.click();
			
			Thread.sleep(2000);
			doneButton.click();
		
			Log.addMessage("Building details are entered");
			
		}catch(Exception e) {
			Log.addMessage("Building details are not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Building details are not visible");
		}
	}
	
	public void autoBuildSelect() {
		try {
			Utility.waitForElementVisible(AutoBuild_Building, driver);
			Thread.sleep(3000);
			AutoBuild_Building.click();
			
			Log.addMessage("AutoBuild building is displayed");
		}catch(Exception e) {
			Log.addMessage("AutoBuild building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AutoBuild building is not visible");
		}
		
	}
	
	public void buildingAutoSelect() {
		try {
			Utility.waitForElementVisible(BuildingAuto_Building, driver);
			Thread.sleep(3000);
			BuildingAuto_Building.click();
			
			Log.addMessage("Building Auto building is displayed");
		}catch(Exception e) {
			Log.addMessage("Building Auto building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Building Auto building is not visible");
		}
		
	}
	
	public void editBuilding() {
		try {
			Utility.waitForElementVisible(editSettingsButton, driver);
			Thread.sleep(3000);
			editSettingsButton.click();
			
			Log.addMessage("AutoBuild building is displayed");
		}catch(Exception e) {
			Log.addMessage("AutoBuild building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AutoBuild building is not visible");
		}
	}
	
	public void editBuildingDetails(String BuildingName, String BuildingAddress) {
		try {		
			buildingName.clear();
			Thread.sleep(2000);
			buildingName.sendKeys(BuildingName);
			
			buildingAddress.click();
			buildingAddress.clear();
			buildingAddress.sendKeys(BuildingAddress);
			
			buildingPhoto.click();
			
			Thread.sleep(2000);
			clickGallerySelect.click();
			imageSelect.click();
			submitIcon.click();
			
			Thread.sleep(2000);
			doneButton.click();
			
			Log.addMessage("AutoBuild building is edited to Building Auto");
		}catch(Exception e) {
			Log.addMessage("AutoBuild building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AutoBuild building is not visible");
		}
	}
	
	public void backNavigation() {
		try {
			Utility.waitForElementVisible(backButton, driver);
			backButton.click();
			
			Log.addMessage("Back button is clicked");
		}catch(Exception e) {
			Log.addMessage("Back button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Back button is not visible");
		}
	}
	
	public void verifyAddedBuilding() {
		try {
			Thread.sleep(3000);
			System.out.println(buildingTitle.getText());
			Utility.waitForElementVisible(buildingTitle, driver);
			Thread.sleep(3000);
			Assert.assertEquals(buildingTitle.getText(), "Building AutoBuild");
			
		}catch(Exception e) {
			Log.addMessage("AutoBuild building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AutoBuild building is not visible");
		}
	}
	
	public void verifyEdittedBuilding(String building_name) {
		try {
			Thread.sleep(3000);
			System.out.println(buildingTitle.getText());
			Utility.waitForElementVisible(buildingTitle, driver);
			Thread.sleep(3000);
			Assert.assertEquals(buildingTitle.getText(),building_name);
			
		}catch(Exception e) {
			Log.addMessage("AutoBuild building is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AutoBuild building is not visible");
		}
	}
	
	public void searchForBuilding(String BUilding_name) {
		try {
			
			Thread.sleep(3000);
			searchBox_Building.click();
			searchBox_Building.clear();
			searchBox_Building.sendKeys(BUilding_name);
//			String b_name= "Building"+ BUilding_name ;
//			Thread.sleep(2000);
//			Assert.assertEquals(Buildinglist.getText(), b_name);
//			searchBox_Building.clear();
			Log.addMessage("Search for building functionality working");
			
		}catch(Exception e) {
			Log.addMessage("Search box is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Search box is not visible");
		}
	}
	
	
	public void Clearsearchbox( ) {
		try {
			
		
			Utility.waitForElementVisible(searchBox_Building, driver);
			searchBox_Building.click();
			searchBox_Building.clear();
			Log.addMessage("Search box  cleared");
			
		}catch(Exception e) {
			Log.addMessage("Search box is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Search box is not visible");
		}
	}

	public void clickRemoveBuilding() {
		try {
			Utility.waitForElementVisible(removeBuildingButton, driver);
			Thread.sleep(3000);
			removeBuildingButton.click();
			
			Log.addMessage("Remove Building Button is displayed");
		}catch(Exception e) {
			Log.addMessage("Remove Building Button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Remove Building Button is not visible");
		}
	}
	
	public void clickYesToRemove() {
		try {
			Utility.waitForElementVisible(yesButton, driver);
			Thread.sleep(3000);
			yesButton.click();
		}catch(Exception e) {
			Log.addMessage("Yes button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Yes button is not visible");
		}
	}
	
	

	public void clickLocationTap() {
		try {
			Utility.waitForElementToBeVisible(locationclick);
			Utility.waitForElementToBeClickable(locationclick);
			locationclick.click();
			Log.addMessage("Clicked Location tab successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click location tab Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	public void VerifyLocation_tab_details() {
		try {
			Utility.waitForElementToBeVisible(locationclick);
			Utility.waitForElementToBeClickable(locationclick);
			locationclick.click();
			Log.addMessage("Clicked Location tab successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click location tab Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	
	public void verifylocationtab_screen() {
		try {
			
			
			
			///site name validation
			
			Utility.waitForElementVisible(verifysitedropdown, driver);
			
			Log.addMessage(" Site name validated clicked");
	
			 ///search box verification
            Utility.waitForElementVisible(Verifysearchbox, driver);
            Log.addMessage("Verify the search box  users successfully");
     
               ///search box keywords
               
               Utility.waitForElementVisible(Verifysearchbox_keywords, driver);
           String keywords = Verifysearchbox_keywords.getText();
              	Assert.assertEquals(keywords,"Search for keywords");
                  Log.addMessage("Verify the search  box   keywords text  successfully");
			
			///verify settings icon on building page
                  Utility.waitForElementVisible(siteSettings, driver);
                  siteSettings.click();
			Thread.sleep(3000);
			   Utility.waitForElementVisible(addBuildingButton, driver);
			
				Thread.sleep(3000);
	        	driver.findElement(By.id("com.kwikset.multifamily.dev:id/view_left")).click();
	            Log.addMessage("Verify the settings  icon successfully");
	            
				
			
			
		}catch(Exception e) {
			Log.addMessage("Location tab validation failed");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Location tab validation failed");
		}
	}
	
	
	public void clickOnBuildingId() {
		try {
			Utility.waitForElementToBeVisible(building_id);
			building_id.click();
			Log.addMessage("Clicked on a particular Building option from the list of buildings on Building page");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on a particular Building option from the list of buildings on Building page");
			Assert.assertTrue(false, "Failed to click on a particular Building option from the list of buildings on Building page");
		}
	}
	
	public void SelectBuilding(String Building) {
		try {
		
			
			
			
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+Building+"\"]"));
	           System.out.println(element);
	       	Utility.waitForElementVisible(element, driver);
			Thread.sleep(3000);
		element.click();
				  
			
			
			Log.addMessage("Building selected");
		}catch(Exception e) {
			Log.addMessage("Failed to select");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Building Auto building is not visible");
		}
		
	}
	
	
	
	
	public void verifybuildingsetting() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementVisible(verifybuildingsetting, driver);
			String Buildingsetting = verifybuildingsetting.getText();
			Assert.assertEquals("Building makeit", Buildingsetting);
			Log.addMessage("Building setting page displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Add Building setting page displayed");
			Assert.assertTrue(false, "Failed to Add Building setting page displayed Functionality");
		}
	}
	
	
	
	public void clickonback() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(backbutton);
			backbutton.click();
			Log.addMessage("Clicked on to back building");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on to back building");
			Assert.assertTrue(false, "Failed to click on back building");
		}
	}
	
	
	

	public void verifyaddbuilding() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementVisible(verifyaddbuildingpage, driver);
			String AddBuilding = verifyaddbuildingpage.getText();
			Assert.assertEquals("Add Details", AddBuilding);
			Log.addMessage("Add Building page displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Add Building page displayed");
			Assert.assertTrue(false, "Failed to Add Building page displayed Functionality");
		}
	}
	
	
	
	
	
}
