package pages.app.mf;
import org.openqa.selenium.support.CacheLookup;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class LogOutAppPageMF extends Settings{
	
	
	

	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement Hambergurmenubutton;
	
	
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/logoutButton"),
	})
	@CacheLookup
	private MobileElement Logoutbutton;
	
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.TextView[@text='Are you sure you want to log out of your account?']"),
		})
		@CacheLookup
		private MobileElement Logoutpopup;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/yesButton"),
		})
		@CacheLookup
		private MobileElement confirmlogout;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/noButton"),
		})
		@CacheLookup
		private MobileElement ClickNo;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[1]"),
	})
	@CacheLookup
	private MobileElement Homepagebutton;

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleText"),
	})
	@CacheLookup
	private MobileElement pageTitle;
	
		

//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[@name='Select All']")
//	@CacheLookup
//	private MobileElement selectAllMenu;
//	
//	By loginBtn =By.xpath("//XCUIElementTypeButton[@name='Log In']");
//	By loginBtnAn =By.xpath("//android.widget.Button[@text='Log In']");
//	By loginSelAll = By.xpath("//XCUIElementTypeMenuItem[@name='Select All']");
	
	//Constructor
	@SuppressWarnings("static-access")
	public LogOutAppPageMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	
	public void Navigatetologoutmenu() {
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(Hambergurmenubutton);
			Hambergurmenubutton.click();
			
			Log.addMessage("Hamburger Menu is displayed  successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to display Hamburger Menu ");
			Assert.assertTrue(false, "Failed to display Hamburger Menu");
		}
	}
	
	public void LogoutoftheAccount() {
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(Logoutbutton);
			Logoutbutton.click();
			
			Log.addMessage("clicked on logout button");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on  Log out  option");
			Assert.assertTrue(false, "Failed to click on  Logout  option");
		}
	}
	
	
	
	public void Logoutapplication() {
		try {
			Thread.sleep(2000);
			Navigatetologoutmenu();
			verifylogoutdisplayed();
			LogoutoftheAccount();
			verifylogoutconfirmation();
			Logoutpopuphandle();
			verifyPageTitle();
			Log.addMessage("Logged out of the Account successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify Log In page title");
			Assert.assertTrue(false, "Failed to Verify Log In page title");
		}
	}
	
	
	public void NavigatetoHomescreen() {
		
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(Homepagebutton);
			Homepagebutton.click();
		
			Log.addMessage("Navigate to Homescreen");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Navigate to Homescreen");
			Assert.assertTrue(false, "Navigate to Homescreen");
		}
			
			
			
		
	}
	
	
	public void verifyPageTitle() {
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(pageTitle);
			String login = pageTitle.getText();
			Assert.assertEquals(login,"Login");
			Log.addMessage("Log In Page is verified successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify Log In page title");
			Assert.assertTrue(false, "Failed to Verify Log In page title");
		}
	}
	
	
	public void Denylogoutfromapplication() {
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(ClickNo);
			Log.addMessage("Log In Page is verified successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify Log In page title");
			Assert.assertTrue(false, "Failed to Verify Log In page title");
		}
	}

	public void Logoutpopuphandle() {
		try {
			//Thread.sleep(8000);
			Utility.waitForElementToBeVisible(confirmlogout);
			confirmlogout.click();
			Log.addMessage("Log out of the application scessfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to log out of the application ");
			Assert.assertTrue(false, "Failed to Log out of the application ");
		}
	}

	
	
	
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
	
	public void verifylogoutconfirmation() {
		try {
			Utility.waitForElementVisible(Logoutpopup, driver);
			String error = Logoutpopup.getText();
			//Assert.assertEquals("Please check email or password.", error);	
			Log.addMessage("logout  button displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("logout  button displayed successfully");
			Assert.assertTrue(false, "Failed to delete account");
		}
	}
	
	public void verifylogoutdisplayed() {
		try {
			Utility.waitForElementVisible(Logoutbutton, driver);
			String error = Logoutbutton.getText();
			//Assert.assertEquals("Please check email or password.", error);	
			Log.addMessage("Account deletion is successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to locate logout  button");
			Assert.assertTrue(false, "Failed to locate logout  button");
		}
	}

}
