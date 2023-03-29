package pages.app.mf;

import org.openqa.selenium.interactions.touch.TouchActions;
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

public class FloorPageMF extends Settings {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/btn_add_floor"),
	})
	@CacheLookup
	private MobileElement addFloorButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement floorNumber;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement wingName;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement accessPointCount;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement unitCount;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement doneButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backButton;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement settingsIcon;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]"),
	})
	@CacheLookup
	private MobileElement unit1Select;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"),
	})
	@CacheLookup
	private MobileElement AP1Select;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"),
	})
	@CacheLookup
	private MobileElement unit2Select;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]"),
	})
	@CacheLookup
	private MobileElement AP2Select;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"),
	})
	@CacheLookup
	private MobileElement floorSelect;
	
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Building Management']")
	@AndroidFindAll({
	@AndroidBy (id= "com.kwikset.multifamily.dev:id/search_src_text"),
	})
	@CacheLookup
	private MobileElement searchBox_Building;
	
	
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
	
	
	})
	@CacheLookup
	private MobileElement screenTitle;
	
	
	
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/button_add_floor"),
	
	
	})
	@CacheLookup
	private MobileElement addfloorbutton;
	
	
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.TextView[@text=\"Retirer le bâtiment\"]"),
	
	
	})
	@CacheLookup
	private MobileElement deletefloorfrenchmessage;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "(//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textFloor\"])[1]"),
	
		
	})

	private MobileElement Clickfirstfloor;
	
	
	 			
	
	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.TextView[@text='FL01']"),
		})
		@CacheLookup
		private MobileElement floor_name1;
		
	

		//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
			@AndroidFindAll({
				@AndroidBy (xpath = "//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textFloorName\"]"),
			})
			@CacheLookup
			private MobileElement floor_list;
			
		
		
		

	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.Button[@resource-id='com.kwikset.multifamily.dev:id/button_add_floor']"),
	})
	@CacheLookup
	private MobileElement addfloor_button;
	

	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.EditText[@text='Floor Number Or Letter*']"),
		})
		@CacheLookup
		private MobileElement floor_name;
	
		//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
				@AndroidFindAll({
					@AndroidBy (xpath = "//android.widget.EditText[@text='Wing Name (Optional)']"),
				})
				@CacheLookup
				private MobileElement wing_name;
				
				//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
				@AndroidFindAll({
					@AndroidBy (xpath = "//android.widget.EditText[@text='# Of Access Points Per Floor*']"),
				})
				@CacheLookup
				private MobileElement access_points_count;
				
				//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
				@AndroidFindAll({
					@AndroidBy (xpath = "//android.widget.LinearLayout[4]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
				})
				@CacheLookup
	private MobileElement units_count;
				
				//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
				@AndroidFindAll({
					@AndroidBy (xpath = "//android.widget.Button[@text='DONE']"),
				})
				@CacheLookup
	private MobileElement add_floor_done_button;

				@AndroidFindAll({
					@AndroidBy (xpath = "//android.widget.TextView[@text='Floor FL02']"),
				})
				@CacheLookup
				private MobileElement floor_name2;
				
	
				
				
				
				@AndroidFindAll({
					@AndroidBy (id = "com.kwikset.multifamily.dev:id/viewRemoveFloor"),
				})
			
				private MobileElement Reomvefloor;
				
	
				@AndroidFindAll({
					@AndroidBy (id = "com.kwikset.multifamily.dev:id/positiveButton"),
				})
			
				private MobileElement Confirmremove;
				
	
				@AndroidFindAll({
					@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
					})
					@CacheLookup
					private MobileElement editfloorlanguage;
						
				
				
		
	@SuppressWarnings("static-access")
	public FloorPageMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	public void clickAddFloorButton() {
		try {
			Utility.waitForElementVisible(addFloorButton, driver);
			Thread.sleep(3000);
			addFloorButton.click();
			
			Log.addMessage("Add floor button is displayed");
		}catch(Exception e) {
			Log.addMessage("Add floor button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Add floor button is not visible");
		}
	}
	
	public void enterFloorDetails(String Floornumber, String Wingname, String APcount, String Unitcount) {
		try {	
			floorNumber.click();
			floorNumber.clear();
			floorNumber.sendKeys(Floornumber);
			
			wingName.click();
			wingName.clear();
			wingName.sendKeys(Wingname);
			
			accessPointCount.click();
			accessPointCount.clear();
			accessPointCount.sendKeys(APcount);

			unitCount.click();
			unitCount.clear();
			unitCount.sendKeys(Unitcount);
			
		
			Thread.sleep(2000);
			doneButton.click();
			
			Log.addMessage("Floor details are entered and added floor successfully");
		}catch(Exception e) {
			Log.addMessage("Floor settings is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Floor settings is not visible");
		}
	}
	
	
	public void EditfloorDetails(String Floornumber, String Wingname, String APcount, String Unitcount) {
		try {	
			floorNumber.click();
			floorNumber.clear();
			floorNumber.sendKeys(Floornumber);
			
			wingName.click();
			wingName.clear();
			wingName.sendKeys(Wingname);
			
			accessPointCount.click();
			accessPointCount.clear();
			accessPointCount.sendKeys(APcount);

			unitCount.click();
			unitCount.clear();
			unitCount.sendKeys(Unitcount);
			
		
			Thread.sleep(2000);
			doneButton.click();
			
			Log.addMessage("Floor details are entered and added floor successfully");
		}catch(Exception e) {
			Log.addMessage("Floor settings is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Floor settings is not visible");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void backNavigation() {
		try {
			Thread.sleep(200);
			Utility.waitForElementVisible(backButton, driver);
			backButton.click();
			
			Log.addMessage("Back button is clicked");
		}catch(Exception e) {
			Log.addMessage("Back button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Back button is not visible");
		}
	}
	
	
	
	
	public void clickbackbutton() {
		try {
			Thread.sleep(200);
			
			Utility.Clickbackbutton();
		
			
			Log.addMessage("Back button is clicked");
		}catch(Exception e) {
			Log.addMessage("Back button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Back button is not visible");
		}
	}
	public void clickSettingsIcon() {
		try {
			Thread.sleep(200);
			Utility.waitForElementVisible(settingsIcon, driver);
			settingsIcon.click();
			
			Log.addMessage("Settings icon is clicked");
		}catch(Exception e) {
			Log.addMessage("Settings icon is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Settings icon is not visible");
		}
	}
	
	public void verifyUnit() {
		try {
			Utility.waitForElementVisible(unit1Select, driver);
			Assert.assertTrue(unit1Select.isDisplayed(),"Added Unit is not displaying");	
			Log.addMessage("Unit is added successfully");
		}catch(Exception e) {
			Log.addMessage("Added unit is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Added unit is not visible");
		}
	}
	public void verifyAP() {
		try {
			Utility.waitForElementVisible(AP1Select, driver);
			Assert.assertTrue(AP1Select.isDisplayed(),"Added AP is not displaying");	
			Log.addMessage("AP is added successfully");
		}catch(Exception e) {
			Log.addMessage("Added AP is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Added AP is not visible");
		}
	}
	
	public void verifyUnitAfterEdit() {
		try {
			Utility.waitForElementVisible(unit2Select, driver);
			Assert.assertTrue(unit2Select.isDisplayed(),"Added Unit is not displaying");	
			Log.addMessage("Unit is added successfully");
		}catch(Exception e) {
			Log.addMessage("Added unit is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Added unit is not visible");
		}
	}
	public void verifyAPAfterEdit() {
		try {
			Utility.waitForElementVisible(AP2Select, driver);
			Assert.assertTrue(AP2Select.isDisplayed(),"Added AP is not displaying");	
			Log.addMessage("AP is added successfully");
		}catch(Exception e) {
			Log.addMessage("Added AP is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Added AP is not visible");
		}
	}
	
	public void clickaddedFloor() {
		try {
			Utility.waitForElementVisible(floorSelect, driver);
			floorSelect.click();
			
			Log.addMessage("Added floor is displayed");
		}catch(Exception e) {
			Log.addMessage("Added floor is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Added floor is not visible");
		}
	}
	
	
	
	
	
	public void clickUnit1() {
		try {
			Thread.sleep(5000);
			Utility.waitForElementVisible(unit1Select, driver);
			unit1Select.click();
			
			Log.addMessage("Unit 1 is displayed");
		}catch(Exception e) {
			Log.addMessage("Unit 1  is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Unit 1 is not visible");
		}
	}
	
	public void clickUnit2() {
		try {
			Utility.waitForElementVisible(unit2Select, driver);
			unit2Select.click();
			
			Log.addMessage("Unit 2 is displayed");
		}catch(Exception e) {
			Log.addMessage("Unit 2 is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Unit 2 is not visible");
		}
	}
	
	public void clickAP1() {
		try {
			Utility.waitForElementVisible(AP1Select, driver);
			AP1Select.click();
			
			Log.addMessage("AP1 is displayed");
		}catch(Exception e) {
			Log.addMessage("AP1 is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AP1 is not visible");
		}
	}
	
	public void clickAP2() {
		try {
			Utility.waitForElementVisible(AP2Select, driver);
			AP2Select.click();
			
			Log.addMessage("AP2 is displayed");
		}catch(Exception e) {
			Log.addMessage("AP2 is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "AP2 is not visible");
		}
	}
	
	
	public void Searchrecord(String record) {
		try {
			
			Thread.sleep(3000);
			searchBox_Building.click();
			searchBox_Building.clear();
			searchBox_Building.sendKeys(record);
		
		
			Log.addMessage("Search record successfully");
			
		}catch(Exception e) {
			Log.addMessage("Search box is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Search box is not visible");
		}
	}
	
	
	public void selectunit_AP(String record) {
		try {
			
			Thread.sleep(3000);
			Utility.Selectbyname(record);
		
			Log.addMessage("Search record successfully");
			
		}catch(Exception e) {
			Log.addMessage("Search box is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Search box is not visible");
		}
	}
	
	public void VerifyFrenchllanguageunitscreen()  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(screenTitle, driver);
			String language = screenTitle.getText();
			
			if (language.contains("Unité"))
			{
				Log.addMessage("Successfully verfied the updated language in unit screen");

			}
	
			else
			{
				Log.addMessage("Failed to verfy the updated language ");
				Assert.assertTrue(false, "Failed to verfy the updated language");
			}
		

		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}
	
	public void VerifyFrenchllanguagein_add_edit_delete_screen()  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(addfloorbutton, driver);
			//verify french text in floor page
			String addfloor = addfloorbutton.getText();
			String deletefloor = deletefloorfrenchmessage.getText();
			Assert.assertEquals("AJOUTER UN ÉTAGE +", addfloor);
			Assert.assertEquals("Retirer le bâtiment", deletefloor);
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}


	public void new_floor_details(String FL_name,String wing_name_val,String access_pt_count,String units_count_value) {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(addfloor_button);
			Thread.sleep(3000);
			addfloor_button.click();
			
			Utility.waitForElementToBeVisible(floor_name);
			floor_name.sendKeys(FL_name);
			
			Utility.waitForElementToBeVisible(wing_name);
			wing_name.sendKeys(wing_name_val);
			
			Utility.waitForElementToBeVisible(access_points_count);
			access_points_count.sendKeys(access_pt_count);
			
			Utility.waitForElementToBeVisible(units_count);
			units_count.sendKeys(units_count_value);
			
			Utility.waitForElementToBeVisible(add_floor_done_button);
			add_floor_done_button.click();
			
			
			
			
			Log.addMessage("Successfully new floor details were populated for floor id , " + FL_name);
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to add new floor details to page");
			Assert.assertTrue(false, "Failed to add new floor details to page");
		}
	}
		
	public void retreiveFloorNameValues() {
		try {
			Utility.waitForElementToBeVisible(floor_name1);
			String actual_floorname_value1=floor_name1.getText();
			
			Utility.waitForElementToBeVisible(floor_name2);
			String actual_floorname_value2=floor_name1.getText();
			Log.addMessage("Actual floor name value for Floor 1 is "+ actual_floorname_value1);
			Log.addMessage("Actual floor name value for Floor 2 is "+ actual_floorname_value2);
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to retrieve floor name values");
			Assert.assertTrue(false, "Failed to retrieve floor name values");
		}
	}
	
	
	public void Verifythefloorlistdisplayed() {
		try {
			Utility.waitForElementToBeVisible(floor_list);
			Thread.sleep(3000);
			Assert.assertTrue(floor_list.isDisplayed(), "Floors are listed");
			Log.addMessage("Successfully  verified  floor list view");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify  floor");
			Assert.assertTrue(false, "Failed to  verify floors values");
		}
	}
	
	public void Selectfirstfloor() {
		try {
			
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Clickfirstfloor);
			Clickfirstfloor.click();
			Thread.sleep(2000);
			Log.addMessage("  opened the first floor");
			
			
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	

	public void Edit_floor_details(String FL_name,String wing_name_val,String access_pt_count,String units_count_value) {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(addfloor_button);
			Thread.sleep(3000);
			addfloor_button.click();
			
			Utility.waitForElementToBeVisible(floor_name);
			floor_name.sendKeys(FL_name);
			
			Utility.waitForElementToBeVisible(wing_name);
			wing_name.sendKeys(wing_name_val);
			
			Utility.waitForElementToBeVisible(access_points_count);
			access_points_count.sendKeys(access_pt_count);
			
			Utility.waitForElementToBeVisible(units_count);
			units_count.sendKeys(units_count_value);
			
			Utility.waitForElementToBeVisible(add_floor_done_button);
			add_floor_done_button.click();
			
			
			
			
			Log.addMessage("Successfully new floor details were populated for floor id , " + FL_name);
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to add new floor details to page");
			Assert.assertTrue(false, "Failed to add new floor details to page");
		}
	}
		
	
	
	
	
	
	public void Removefloor() {
		try {
			
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Reomvefloor);
			Reomvefloor.click();
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Confirmremove);
			Confirmremove.click();
			Thread.sleep(2000);
			Log.addMessage("  opened the first floor");
			
			
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	
	public void Edit_floor_details() {
		try {
			
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Reomvefloor);
			Reomvefloor.click();
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Confirmremove);
			Confirmremove.click();
			Thread.sleep(2000);
			Log.addMessage("  opened the first floor");
			
			
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	public void verifyeditfloordetailspage_frenchlanguage() {
		try {
			Utility.waitForElementVisible(editfloorlanguage, driver);
			String building =editfloorlanguage.getText();
			Assert.assertEquals("MISSION ACCOMPLIE", building);
			Log.addMessage("edit building name language verify successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to edit building name language verify successfully");
			Assert.assertTrue(false, "Failed to edit buildingname language verify");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
