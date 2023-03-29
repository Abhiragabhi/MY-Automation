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

public class Usergroup_Apppage_MF  extends Settings {

	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/view_right"),
		})


	@CacheLookup
	private MobileElement clickonaddgroup;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.Button[@text=\"CONTINUE\"]"),
		})


	@CacheLookup
	private MobileElement Continuebutton;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textGroupName\"]"),
		})


	@CacheLookup
	private MobileElement usergroup;
	
	
	
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/viewRemoveGroup"),
		})


	@CacheLookup
	private MobileElement removeusergroup;
	
	
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/positiveButton"),
		})


	@CacheLookup
	private MobileElement yesremoveusergroup;
	
	

	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
//		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonCreateUser"),
//		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
//		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ImageView")
	})
	@CacheLookup
	private MobileElement user_management;
	
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/image_drop_down"),
		})

	@CacheLookup
	private MobileElement clickonunits;

	



	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),
			})
	@CacheLookup
    private MobileElement clickonviewuser;
			

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	
	
	})
	@CacheLookup
	private MobileElement clickonaddgroupName;
	
	
	

	

	
	@AndroidFindAll({
		@AndroidBy (xpath= "(//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textBuildingName\"])[1]"),
		})
		@CacheLookup
		private MobileElement Selectbuiding;
	
	
	
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.multifamily.dev:id/users_nav_graph"),
		@AndroidBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout"),
		
	})
	@CacheLookup
	private MobileElement clickpeoplebutton;
	
	


	
	
	@AndroidFindAll({
		@AndroidBy (xpath= "(//android.widget.TextView[@text='Access Point 1'])[1]"),
	})
	@CacheLookup
	private MobileElement selectfloor;
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),
	
	})
	@CacheLookup
	private MobileElement selectfloorcontinue;
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),
	
	
	})
	@CacheLookup
	private MobileElement Buildingcontinue;
	
	
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),
	
	
	})
	@CacheLookup
	private MobileElement BackNavigation;
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),
	
	
	})
	@CacheLookup
	private MobileElement clickonaddgroupcontiue;
	
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.TextView[@text=\"Automation Group\"]"),
	
	
	})
	@CacheLookup
	private MobileElement SelectAutomation_group;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.TextView[@text=\"Test Group\"]"),
	
	
	})
	@CacheLookup
	private MobileElement Updategroup;
	
	
	
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
	
	
	})
	@CacheLookup
	private MobileElement Group_searchbox;
	
	

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement navigate_to_user_group;
	


	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	
	
	})
	@CacheLookup
	private MobileElement clickonaddgroupdescription;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/cardViewBackground"),
	
	
	})
	@CacheLookup
	private MobileElement predefinedusergroup;
	
	
	

	
	@SuppressWarnings("static-access")
	public  Usergroup_Apppage_MF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	
	///Navigation to user tab
	public void clickOnUserManagement() {
		try {
			Utility.waitForElementToBeVisible(user_management);
			user_management.click();
			Log.addMessage("Clicked on User Management icon on HomePage");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on User Management icon on HomePage");
			Assert.assertTrue(false, "Failed to click on User Management icon on HomePage");
		}
	}
	
	
	
	
	
	public void clickOnpeoplebutton() {
		try {
			Utility.waitForElementToBeVisible(clickpeoplebutton);
			clickpeoplebutton.click();
			Log.addMessage("Clicked on a peoplebutton");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to peoplebutton");
			Assert.assertTrue(false, "Failed to click on peoplebutton");
		}
	}
	
	//Click on settings icon on user tab to navigate to UserGroup page
	
	
	public void NavigatetoUserGrouppage() {
		try {
			Utility.waitForElementToBeVisible(navigate_to_user_group);
			navigate_to_user_group.click();
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on user group navigation settings button");
			Assert.assertTrue(false, "Failed to click on usergroup page navigation settings button");
		}
	}
	
	
	public void click_on_user_tab_settings_icon() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(navigate_to_user_group);
			navigate_to_user_group.click();
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on user group navigation settings button");
			Assert.assertTrue(false, "Failed to click on usergroup page navigation settings button");
		}
	}
	
	
	
	
	//CLick on Add Group icon on  Uer Group page

	public void clickonaddgroup() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonaddgroup);
			clickonaddgroup.click();
			Log.addMessage("Clicked on a Add group button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Clicked on a Add group button successfully");
			Assert.assertTrue(false, "Clicked on a Add group button successfully");
		}
	}

	
	
	
	
	public void SearchGroup(String Gname) {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(Group_searchbox);
			Group_searchbox.click();
			Group_searchbox.clear();
			Group_searchbox.sendKeys(Gname);
			
			
			
			
			Log.addMessage("searched  a group  successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to search a group ");
			Assert.assertTrue(false, "Failed to search a group ");
		}
	}
	
	
	public void VerifythesearchresultinGroup(String Gname) {
		try {
			
			
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(usergroup);
			String s = usergroup.getText();
			Assert.assertEquals(s,Gname);
			
			Log.addMessage("searched  a group  result verified successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify search a group result ");
			Assert.assertTrue(false, "Failed to verify search a group result");
		}
	}
	
	
	public void deleteusergroup() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(removeusergroup);
			removeusergroup.click();
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(yesremoveusergroup);
			yesremoveusergroup.click();
			Log.addMessage("Clicked on a remove group button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Clicked on a remove group button successfully");
			Assert.assertTrue(false, "Clicked on a Add group button successfully");
		}
	}
	
	
	public void AddnewGroup(String Gname, String Gdection) {
		try {
			
			
			clickonaddgroup();
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(clickonaddgroupName);
			
			clickonaddgroupName.click();
			clickonaddgroupName.sendKeys(Gname);
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonaddgroupdescription);
			
			clickonaddgroupdescription.click();
			clickonaddgroupdescription.sendKeys(Gdection);
			
			
			Log.addMessage("added group name");
			Log.addMessage("added group description");
			
			
			
			clickonaddgroupcontiue();
			//SelectBuildingtogroup();
			
			//clickonSelectfloor();
			//clickonfloorcontinue();
			
			clickonBuildingcontinue();
			Thread.sleep(3000);
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  add group details");
			Assert.assertTrue(false, "add group details");
		}
	}
	
	
	public void Edisupergroup(String Gname, String Gdection) {
		try {
			
		
			
		
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(clickonaddgroupName);
			
			clickonaddgroupName.click();
			clickonaddgroupName.clear();
			clickonaddgroupName.sendKeys(Gname);
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonaddgroupdescription);
			
			clickonaddgroupdescription.click();
			clickonaddgroupdescription.clear();
			clickonaddgroupdescription.sendKeys(Gdection);
			
			
			Log.addMessage("added group name");
			Log.addMessage("added group description");
			
			
			
			clickonaddgroupcontiue();
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(Continuebutton);
			Continuebutton.click();

			//clickonfloorcontinue();
//			SelectBuildingtogroup();
//			
//			clickonSelectfloor();
//			
//			
		
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  add group details");
			Assert.assertTrue(false, "add group details");
		}
	}
	
	
	
	
	public void SelectAutomationGroup() {
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(Updategroup);
			Updategroup.click();
			Log.addMessage("Selected user group  group successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Selected user group  group successfully");
			Assert.assertTrue(false, "Selected user group  group successfully");
		}
	}
	
	public void Selectnewlyaddedusergroup() {
         try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(SelectAutomation_group);
			SelectAutomation_group.click();
			Log.addMessage("Selected user group  group successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Selected user group  group successfully");
			Assert.assertTrue(false, "Selected user group  group successfully");
		}
	}
	
	
	
	
	public void Addgroupdescription() {
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on add group description");
			Assert.assertTrue(false, "Failed to click on  add group description");
		}
	}
	
	public void clickonaddgroupcontiue () {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(clickonaddgroupcontiue);
			
			clickonaddgroupcontiue.click();
			
			
			Log.addMessage("Clicked on add group contiue ");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on add group contiue");
			Assert.assertTrue(false, "Failed to click on  add group contiue");
		}
	}
	
	
	
	
	
	public void SelectBuildingtogroup() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(Selectbuiding);
			
			Selectbuiding.click();
			
			
			Log.addMessage("Click to Select Building to group");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on  Select Building to group");
			Assert.assertTrue(false, "Failed to click on   Select Building to group");
		}
	}
	
	
	
	
	public void clickonSelectfloor() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(selectfloor);
			
			selectfloor.click();
			
			
			Log.addMessage("Clicked on add group Select floor");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on add group Select floor");
			Assert.assertTrue(false, "Failed to click on  add group Select floor");
		}
	}
	
	
	
	
	
	
	
	public void clickonfloorcontinue() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(selectfloorcontinue);
			
			selectfloorcontinue.click();
			
			
			Log.addMessage("Clicked on add Select floor continue");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Select floor continue");
			Assert.assertTrue(false, "Failed to click on Select floor continue");
		}
	}
	
	

	

	public void clickonBuildingcontinue() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(Buildingcontinue);
			
			Buildingcontinue.click();
			
			
			Log.addMessage("Clicked on add Select Building continue");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Select Building continue");
			Assert.assertTrue(false, "Failed to click on Select Building continue");
		}
	}
	
	
	
	public void clickonBackNavigationbtn() {
		try {
			Thread.sleep(2000);
			Utility.Clickbackbutton();
			
			
			Log.addMessage("Clicked on Back button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Select Building continue");
			Assert.assertTrue(false, "Failed to click on Select Building continue");
		}
	}
	
	
	
	
	
	
	////Verification methods
	
	
	
	public void VerifynewlyaddedGroup() {
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(SelectAutomation_group);
			String s = SelectAutomation_group.getText();
			Assert.assertEquals(s, "Test Group");
			Log.addMessage("Selected user group  group successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Selected user group  group successfully");
			Assert.assertTrue(false, "Selected user group  group successfully");
		}
	}
	
	
	public void Verifyeditedgroupname( ) {
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(Updategroup);
			String s = Updategroup.getText();
			//Assert.assertEquals(s, "Test Group");
			Log.addMessage(" user group name edite successfully ");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Selected user group  group successfully");
			Assert.assertTrue(false, "Selected user group  group successfully");
		}
	}
	
	

	
	public void VerifyPredifinedusergroupsnoteditable( ) {
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(predefinedusergroup);
			
		
			Log.addMessage(" user group is not editable");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Selected user group  group successfully");
			Assert.assertTrue(false, "Selected user group  group successfully");
		}
	}
	
	
	
	public void Selectusergroup(String Groupname)  {	
		try {
		
            
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+Groupname+"\"]"));
			Utility.waitForElementToBeVisible(element);
			Utility.waitForElementClickable(element, driver);
			Utility.simpleWait(2000); 
			element.click();
			  
			Log.addMessage("user  group  selected");
			
		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("user  group  selected");
			Assert.assertTrue(false, "Failed to uploaded a photo");
		}
	}
	
	
	
	public void VerifyGroupDeleted() {
		try {
			
			
			
			Thread.sleep(3000);
			
			if(usergroup.isDisplayed())
			{
				Assert.fail();
				Log.addMessage("searched  a group  is not  deleted");
			}
			else
			{
				Log.addMessage(" group  is deleted");
			}
			
			

		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to delete   a group  ");
			Assert.assertTrue(false, "Failed to delete a group ");
		}
	}
	

}
