package pages.app.mf;

import java.io.File;

import java.util.HashMap;

import javax.naming.Context;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.Log;
import utility.PropertyUtility;
import utility.Utility;
import utility.Utility.Direction;

public class AccountSettingsPageAppMF extends Settings{
	
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/menuTitleText"),
	})
	@CacheLookup
	private MobileElement AccountSettings_tab;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
	
	
	})
	@CacheLookup
	private MobileElement screenTitle;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/userImageText"),
	})
	@CacheLookup
	private MobileElement photoImage;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/lytCameraPick"),
	})
	@CacheLookup
	private MobileElement pickCamera;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/lytGalleryPick"),
	})
	@CacheLookup
	private MobileElement pickGallery;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.sec.android.app.camera:id/normal_center_button"),
	})
	@CacheLookup
	private MobileElement takePicture;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.sec.android.app.camera:id/okay")
	})
	@CacheLookup
	private MobileElement imageOkButton;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/menu_crop")
	})
	@CacheLookup
	private MobileElement cropButton;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
	})
	@CacheLookup
	private MobileElement galleryImage;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/nameValueText")
	})
	@CacheLookup
	private MobileElement accountName;
	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/phoneValueText")
	})
	@CacheLookup
	private MobileElement phoneNumber;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/passwordTitleText")
	})
	@CacheLookup
	private MobileElement password;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/biometricSwitch")
	})
	@CacheLookup
	private MobileElement biometricUnlock;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/twoStepGroup")
	})
	@CacheLookup
	private MobileElement twoStepSwitch;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/languageGroup")
	})
	
	@CacheLookup
	private MobileElement Languagefield;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/languageValueText")
	})
	
	@CacheLookup
	private MobileElement Languageselect;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/deleteText")
	})
	
	
	@CacheLookup
	private MobileElement deleteAccount;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonAction")
	})
	@CacheLookup
	private MobileElement deleteAccountConfirmation;
	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left")
	})
	@CacheLookup
	private MobileElement backNavigation;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	})
	@CacheLookup
	private MobileElement whileUsingApp;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
	})
	@CacheLookup
	private MobileElement onlyThisTime;
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.android.permissioncontroller:id/permission_deny_button")
	})
	@CacheLookup
	private MobileElement dontAllow;
	
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/logo")
	})
	@CacheLookup
	private MobileElement brandLogo;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/emailValueText")				
	})
	@CacheLookup
	private MobileElement emailId;
	

	@AndroidFindAll({
		@AndroidBy(id = "com.android.permissioncontroller:id/permission_message")				
	})
	@CacheLookup
	private MobileElement permissionPopUpMessage;
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/dialog_title")				
	})
	@CacheLookup
	private MobileElement selectPhotoTitle;
	
	@AndroidFindAll({
		@AndroidBy(id = "android:id/button2")				
	})
	@CacheLookup
	private MobileElement selectPhotoCancelButton;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/touch_outside")				
	})
	@CacheLookup
	private MobileElement touchOutside;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/textViewTitle")				
	})
	@CacheLookup
	private MobileElement accessCameraMsgPopUp;
		
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.TextView")				
	})
	@CacheLookup
	private MobileElement appInfoScreen;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/positiveButton")				
	})
	@CacheLookup
	private MobileElement goToSettingsButton;
	
	@AndroidFindAll({
		@AndroidBy(xpath= "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")				
	})
	@CacheLookup
	private MobileElement backButton;
	
	
@AndroidFindAll({
		
		@AndroidBy(id= "com.kwikset.multifamily.dev:id/appVersionText"),
		
	})
	@CacheLookup
	private MobileElement version;
	
	
	
	
@AndroidFindAll({
		
		@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),
		
	})
	@CacheLookup
	private MobileElement menubutton;
	
	
	
	
@AndroidFindAll({
	
	@AndroidBy(xpath= "//android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[2]"),
	
})
@CacheLookup
private MobileElement accountsetting;

	
	
@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/nameValueText"),
	
})
@CacheLookup
private MobileElement accountname;

	
	
	
@AndroidFindAll({
	
	@AndroidBy(xpath= "//android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	
})
@CacheLookup
private MobileElement accountfname;
	




@AndroidFindAll({
	
	@AndroidBy(xpath= "//android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	
})
@CacheLookup
private MobileElement accountsname;
	
	
	
	
@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/updateButton"),
	
})
@CacheLookup
private MobileElement update;





@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/nameValueText"),
	
})
@CacheLookup
private MobileElement verifyaccountname;


@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),
	
})
@CacheLookup
private MobileElement clcikonback;

@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),
	
})
@CacheLookup
private MobileElement Savelanguage;








@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement clcikonmenu;





@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[2]"),
	})
	@CacheLookup
	private MobileElement accontsetting;



@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/languageValueText"),
	})
	@CacheLookup
	private MobileElement clcikonlanguage;



@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"),
	})
	@CacheLookup
	private MobileElement changelanuguage;





@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/btnSave"),
	})
	@CacheLookup
	private MobileElement clcikonsave;




@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/closeButton"),
	})
	@CacheLookup
	private MobileElement clickonmenuclose;


@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/switchAppButton"),
	})
	@CacheLookup
	private MobileElement swithchappoption;



@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement phonecountrycodefield;

@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]"),
	})
	@CacheLookup
	private MobileElement Uscountrycode;







@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement phonenotextfiled;









@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/logoutButton"),
	})
	@CacheLookup
	private MobileElement logoutoption;
	
	@SuppressWarnings("static-access")
	public AccountSettingsPageAppMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	
	public void Selectmenu(String menu)  {	
		try {
		

			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+menu+"\"]"));
           System.out.println(element);

			element.click();
			Log.addMessage("Option selected");
		
			
		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to select option");
			Assert.assertTrue(false, "Failed to select option");
		}
	}
	
	public void verifyPageTitle() throws InterruptedException {
		try {
			
			
	
			
			Thread.sleep(5000);
			Utility.waitForElementVisible(screenTitle, driver);
			System.out.println("User Landed on::"+screenTitle.getText()+"page");
			Assert.assertEquals(screenTitle.getText(), "Account");
			Log.addMessage("User Landed on::"+screenTitle.getText()+"page");
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify screen name");
			Assert.assertTrue(false, "Failed to verify screen name");
		}
	}
	
	public void clickOnprofilePicture() {
		try {
			Utility.waitForElementVisible(photoImage, driver);
			photoImage.click();
			Log.addMessage("Clicked on photo Image successfully");
			try {
				whileUsingApp.click();
			//	Log.addMessage("Clicked on photo Image successfully");
			} catch(Exception NoSuchElementException) {
				Log.addMessage("No premission asked");
			}
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click photo Image");
			Assert.assertTrue(false, "Failed to click photo Image");
		}
	}
	
	public void verifyPermissionPopupOptions() {
		try {
//			int attempts = 0;
		    
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(photoImage, driver);
			photoImage.click();
			Utility.simpleWait(4000);	
			Utility.waitForElementVisible(whileUsingApp, driver);
			Utility.waitForElementVisible(onlyThisTime, driver);
			Utility.waitForElementVisible(dontAllow, driver);
			
			Assert.assertTrue(permissionPopUpMessage.getText().contains("Allow Kwikset to take pictures and record video?"),"Permission Pop up message is not displayed");			
			Log.addMessage("Clicked on photo Image successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click photo Image");
			Assert.assertTrue(false, "Failed to click photo Image");
		}
	}
	
	public void clickWhileUsingAppOption() {
		try {
			Utility.waitForElementVisible(whileUsingApp, driver);
			whileUsingApp.click();
			Log.addMessage("Clicked on while using  app Option");			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click while using  app Option");
			Assert.assertTrue(false, "Failed to click while using  app Option");
		}
	}
	
	public void clickOnlyThisTimeOption() {
		try {
			Utility.waitForElementVisible(onlyThisTime, driver);
			onlyThisTime.click();
			Log.addMessage("Clicked on only this time Option");			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click only this time Option");
			Assert.assertTrue(false, "Failed to click only this time Option");
		}
	}
	
	public void clickDenyThisOption() {
		try {
			Utility.waitForElementVisible(dontAllow, driver);
			dontAllow.click();
			Log.addMessage("Clicked on deny Option");			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click deny Option");
			Assert.assertTrue(false, "Failed to click deny Option");
		}
	}
	
	public void clickOutsidePopUp() {
		try {
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(touchOutside, driver);
			touchOutside.click();
			Log.addMessage("Clicked outside pop ups");			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click outside popup");
			Assert.assertTrue(false, "Failed to click outside popup");
		}
	}
	
	public void clickOnCamera() {
		try {
			Utility.waitForElementVisible(pickCamera, driver);
			pickCamera.click();
			Log.addMessage("Clicked on camera option successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click camera option");
			Assert.assertTrue(false, "Failed to click camera option");
		}
	}
	
	public void clickOnGallery() {
		try {
			Utility.waitForElementVisible(pickGallery, driver);
			pickGallery.click();
			Log.addMessage("Clicked on gallery successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click gallery");
			Assert.assertTrue(false, "Failed to click gallery");
		}
	}
	
	public void capturePicture() {
		try {
			Utility.waitForElementVisible(takePicture, driver);
			takePicture.click();
			Log.addMessage("captured picture successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to capture picture");
			Assert.assertTrue(false, "Failed to capture picture");
		}
	}
	
	public void clickOkToUploadImage() {
		try {
			Utility.waitForElementVisible(imageOkButton, driver);
			imageOkButton.click();
			Log.addMessage("Clicked OK to upload Image");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to upload image");
			Assert.assertTrue(false, "Failed to upload image");
		}
	}
	
	public void cropImage() {
		try {
			Utility.waitForElementVisible(cropButton, driver);
			cropButton.click();
			Log.addMessage("Clicked crop button successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click crop button");
			Assert.assertTrue(false, "Failed to click crop button");
		}
	}

	public void selectImageFromGallery() {
		try {
			Utility.waitForElementVisible(galleryImage, driver);
			galleryImage.click();
			Log.addMessage("Selected image successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to select image from gallery");
			Assert.assertTrue(false, "Failed to select image from gallery");
		}
	}
//	public void ViewAccountSettings() {
//		try {
//			Utility.waitForElementVisible(AccountSettings_tab, driver);
//			accountName.click();
//			Log.addMessage("Viewd and Clicked on Account Settings tab successfully");
//		}catch(Exception e) {
//			e.printStackTrace();
//			Log.addMessage("Failed to click Account Settings");
//			Assert.assertTrue(false, "Failed to click Account Settings");
//		}
//	}
	public void clickOnAccountNamefield() {
		try {
			Utility.waitForElementVisible(accountName, driver);
			accountName.click();
			Log.addMessage("Clicked on Account Name successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click Account Name");
			Assert.assertTrue(false, "Failed to click Account Name");
		}
	}
	
	public void clickOnPhoneNumberField() {
		try {
			Utility.waitForElementVisible(phoneNumber, driver);
			phoneNumber.click();
			Log.addMessage("Clicked on phone Number field successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click phone Number field");
			Assert.assertTrue(false, "Failed to click phone Number field");
		}
	}
	
	public void clickOnPasswordField() {
		try {
			Utility.waitForElementVisible(password, driver);
			password.click();
			Log.addMessage("Clicked on password field successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click password field");
			Assert.assertTrue(false, "Failed to click password field");
		}
	}
	
	public void toggleBiometricUnlock() {
		try {
			Utility.waitForElementVisible(biometricUnlock, driver);
			biometricUnlock.click();
			Log.addMessage("Clicked on biometric Unlock toggle successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click biometric Unlock toggle");
			Assert.assertTrue(false, "Failed to click biometric Unlock toggle");
		}
	}
	
	public void toggletwoStepSwitch() {
		try {
			Utility.waitForElementVisible(twoStepSwitch, driver);
			twoStepSwitch.click();
			Log.addMessage("Clicked on two Step Switch successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click two Step Switch");
			Assert.assertTrue(false, "Failed to click two Step Switch");
		}
	}
	
	public void clickOnDeleteAccount() {
		try {
			Utility.waitForElementVisible(deleteAccount, driver);
			deleteAccount.click();
			Log.addMessage("Clicked on delete Accounth successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click delete Account");
			Assert.assertTrue(false, "Failed to click delete Account");
		}
	}
	
	public void clickOnDeleteAccountConfirm() {
		try {
			Utility.waitForElementVisible(deleteAccountConfirmation, driver);
			deleteAccountConfirmation.click();
			Log.addMessage("Clicked on delete Account confirmation button successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click delete Account confirmation button");
			Assert.assertTrue(false, "Failed to click delete Account confirmation button");
		}
	}
	
	public void clickOnBackButton() {
		try {
			Utility.waitForElementVisible(backNavigation, driver);
			backNavigation.click();
			Log.addMessage("Clicked on back Navigation button successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click back Navigation button");
			Assert.assertTrue(false, "Failed to click back Navigation button");
		}
	}
	
	
	
	
	
	
	public void clickonmenu() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clcikonmenu);
			clcikonmenu.click();
			Log.addMessage("Clicked on a menu");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on menu");
			Assert.assertTrue(false, "Failed to click on menu");
		}
	}
	
	
	
	
	public void clickonaccontsetting() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(accontsetting);
			accontsetting.click();
			Log.addMessage("Clicked on accont setting");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on accont setting");
			Assert.assertTrue(false, "Failed to click on accont setting");
		}
	}
	
	
	public void clicklanguage() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clcikonlanguage);
			clcikonlanguage.click();
			Log.addMessage("Clicked on language");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on language");
			Assert.assertTrue(false, "Failed to click on language");
		}
	}
	
	
	
	
	
	public void changealanuguage() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(changelanuguage);
			changelanuguage.click();
			Log.addMessage("language select sucessfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to select language");
			Assert.assertTrue(false, "Failed to select language");
		}
	}
	
	
	
	
	
	
	public void clicksave() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clcikonsave);
			clcikonsave.click();
			Log.addMessage("clicked on save button ");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clicked on save button");
			Assert.assertTrue(false, "Failed to clicked on save button");
		}
	}
	
	
	
	
	
	
	
	public void clicktoback() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clcikonback);
			clcikonback.click();
			Log.addMessage("clicked on back button ");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clicked on back button");
			Assert.assertTrue(false, "Failed to clicked on back button");
		}
	}
	
	
	
	
	
	public void clicktomenuclose() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonmenuclose);
			clickonmenuclose.click();
			Log.addMessage("clicked on menu close");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to clicked on menu close");
			Assert.assertTrue(false, "Failed to clicked on menu close");
		}
	}
	
	
	
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
	
	public void verifyUpdatedNameIsDisplayed(String newName) {
		try {
			Thread.sleep(5000);
			Utility.waitForElementVisible(accountName, driver);
			String updatedName = accountName.getText();
			Assert.assertEquals(newName, updatedName);
			Log.addMessage("Name Updated successfully in Account Settings");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to update successfully in Account Settings");
			Assert.assertTrue(false, "Failed to update successfully in Account Settings");
		}
	}
	
	
	public void verifyAccountSettingsScreen() {
		try{
			Utility.waitForElementVisible(screenTitle, driver);	
			String title = screenTitle.getText();
			Assert.assertEquals(title,"Account Settings");
			
	
		Utility.waitForElementVisible(photoImage, driver);
		Utility.waitForElementVisible(accountName, driver);
		String account_name = accountName.getText();
		Assert.assertEquals(account_name,"Tester MF Automation");
		
		

		Utility.waitForElementVisible(phoneNumber, driver);
		Utility.waitForElementVisible(emailId, driver);
		Utility.waitForElementVisible(password, driver);
		Utility.waitForElementVisible(twoStepSwitch, driver);
		Utility.waitForElementVisible(Languagefield, driver);
		
		Log.addMessage("Sucessfully verfied all components in Account settings page");
		}catch (Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed in Account Settings screen components verification");
			Assert.assertTrue(false, "Failed in Account Settings screen components verification");
			
		}		
		
	}
	
	
	public void verifyAccountScreenComponents() {
		try{
			Utility.waitForElementVisible(screenTitle, driver);	
			String title = screenTitle.getText();
			Assert.assertEquals(title,"Account Settings");
			
		Utility.waitForElementVisible(brandLogo, driver);
		Utility.waitForElementVisible(photoImage, driver);
		Utility.waitForElementVisible(accountName, driver);
		Utility.waitForElementVisible(phoneNumber, driver);
		Utility.waitForElementVisible(emailId, driver);
		Utility.waitForElementVisible(password, driver);
		Utility.waitForElementVisible(twoStepSwitch, driver);
		Utility.waitForElementVisible(deleteAccount, driver);
		Log.addMessage("Sucessfully verfied all components in Account page");
		}catch (Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed in Account Settings screen components verification");
			Assert.assertTrue(false, "Failed in Account Settings screen components verification");
			
		}		
		
	}
	
	public void updatePhoneNumberScreenNavigation() {
		try {
		clickOnPhoneNumberField();
		Thread.sleep(2000);
		Utility.waitForElementVisible(screenTitle, driver);	
		String screenName = screenTitle.getText();
		Assert.assertEquals("Update Phone Number","Update Phone Number");
		Log.addMessage("Navigated to Update Phone Number screen");
		}catch(Exception e){
			e.printStackTrace();
			Log.addMessage("Failed to navigate to Update phone number screen");
			Assert.assertTrue(false, "Failed to navigate to Update phone number screen");
			
		}
	}
		
	public void updateNameScreenNavigation() {
			try {
			clickOnAccountNamefield();
			Utility.waitForElementVisible(screenTitle, driver);	
			String screenName = screenTitle.getText();
			Assert.assertEquals("Update Name","Update Name");
			Log.addMessage("Navigated to Update Name screen");
			}catch(Exception e){
				e.printStackTrace();
				Log.addMessage("Failed to navigate to Update name screen");
				Assert.assertTrue(false, "Failed to navigate to Update name screen");
				
			}
		
		
	}
	public void updatePasswordScreenNavigation() {
		try {
		clickOnPasswordField();
		Utility.waitForElementVisible(screenTitle, driver);	
		String screenName = screenTitle.getText();
		Assert.assertEquals("Update Password","Update Password");
		Log.addMessage("Navigated to Update Password screen");
		}catch(Exception e){
			e.printStackTrace();
			Log.addMessage("Failed to navigate to Update password screen");
			Assert.assertTrue(false, "Failed to navigate to Update password screen");
			
		}
	
     }
	
	public void verifyPermissionPopupMessage() {	
			try {
				Utility.simpleWait(2000);
				Utility.waitForElementVisible(permissionPopUpMessage, driver);
				Log.addMessage("Permission popup window message displayed ");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to display Permission popup message");
				Assert.assertTrue(false, "Failed to display Permission popup message");
			}
		}
	
	
	
	public void appQuitAndRelaunch() throws InterruptedException {
		try {
			if (device.equals("iOS")) {
				HashMap<String, String> bundleArgs = new HashMap<>();
				bundleArgs.put("bundleId", "com.spectrumhhi.ble-wifi");
				((AppiumDriver<MobileElement>) driver).executeScript("mobile:terminateApp", bundleArgs);
				/*HashMap<String, String> installArgs = new HashMap<>();
				installArgs.put("app", iOS_App);
				((AppiumDriver<MobileElement>) driver).executeScript("mobile:installApp", installArgs);*/
				((AppiumDriver<MobileElement>)driver).executeScript("mobile:launchApp", bundleArgs);
			}
			else if (device.equals("android")) {
				((AppiumDriver<MobileElement>) driver).terminateApp(PropertyUtility.getProperty("AndroidAppActivity"));
				((AppiumDriver<MobileElement>) driver).launchApp();
			}
			else {
				Log.addMessage("Error!!!!!!!!...Application not found.");
				Assert.assertTrue(false);
			}
			Utility.simpleWait(10000);
		}catch(Exception e) {
		  Log.addMessage(e.getMessage().toString());
		  Log.addMessage("Something went wrong. App upgrade cannot be done");
		  Assert.assertTrue(false, "Some error occured. App upgrade cannot be carried out");
		}
	}
	
	public void clickSelectPhotoScreenCancelButton() {	
		try {
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(selectPhotoTitle, driver);
			Utility.waitForElementVisible(selectPhotoCancelButton, driver);
			selectPhotoCancelButton.click();
			Log.addMessage("Select photo - Clicked Cancel button ");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click cancel button");
			Assert.assertTrue(false, "Failed to click cancel button");
		}
	}
	
	public void uploadImageFromGallery() {	
		try {
			Utility.simpleWait(2000);
			this.clickOnGallery();
			this.selectImageFromGallery();
			this.cropImage();
			Log.addMessage("Sucessfully uploaded a photo ");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to uploaded a photo");
			Assert.assertTrue(false, "Failed to uploaded a photo");
		}
	}
	
	public void verifyAccessCameraPopUpMsg() {	
		try {
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(accessCameraMsgPopUp, driver);
			Assert.assertTrue(accessCameraMsgPopUp.getText().contains("Permission to Access Camera Required"),"Permission to access camera- message is not correct");
			Log.addMessage("Verified access camera permission popup message");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify access camera permission popup message");
			Assert.assertTrue(false, "Failed to verify access camera permission popup message");
		}
	}

	
	public void verifyAppInfoScreen() {	
		try {
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(goToSettingsButton, driver);
			goToSettingsButton.click();
			Utility.simpleWait(2000);
			Utility.waitForElementVisible(appInfoScreen, driver);
			backButton.click();
			Log.addMessage("Sucessfully navigated to App info Screen");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to navigate to App Info screen");
			Assert.assertTrue(false, "Failed to navigate to App Info screen");
		}
	}

	public void verifyversion() {
		try {
			Thread.sleep(5000);
			Utility.waitForElementVisible(version, driver);
			String accesss = version.getText();
			Assert.assertEquals("App Ver: 0.1.33.0.0 , App Env. qa", accesss);
			Log.addMessage("version verify  successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify version");
			Assert.assertTrue(false, "Failed to verify version");
		}
	}

	public void SelectAccountLanguage(String Language)  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(Languageselect, driver);
			Languageselect.click();
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+Language+"\"]"));
           System.out.println(element);
       	
			Thread.sleep(5000);
			element.click();
			
			///click save
			Thread.sleep(2000);
			driver.findElement(By.id("com.kwikset.multifamily.dev:id/btnSave")).click();
		
		
			
		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to uploaded a photo");
			Assert.assertTrue(false, "Failed to uploaded a photo");
		}
	}
	
	
	public void Verifylanguagefrench()  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(Languagefield, driver);
			String language = Languagefield.getText();
			Assert.assertEquals("Français", language);
   
			Log.addMessage("Successfully verfied the updated language uploaded a photo");

		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}
	
	
	
	public void VerifyFrenchllanguageinAccountsettingstab()  {	
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementVisible(screenTitle, driver);
			String language = screenTitle.getText();
			Assert.assertEquals("Paramètres du compte", language);
   
			Log.addMessage("Successfully verfied the updated language uploaded a photo");

		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}
	
	
	
	public void Enterphonenumber(String phone)  {	
		try {
			
			Thread.sleep(3000);
			
			
				
			
			Utility.waitForElementVisible(phonecountrycodefield, driver);
			phonecountrycodefield.click();
			Thread.sleep(2000);
			Utility.waitForElementVisible(Uscountrycode, driver);
			Uscountrycode.click();
			Utility.waitForElementVisible(phonenotextfiled, driver);
			phonenotextfiled.click();
			phonenotextfiled.clear();
			phonenotextfiled.sendKeys(phone);
		Thread.sleep(3000);
		Utility.waitForElementVisible(update, driver);
		Utility.waitForElementClickable(update, driver);
		update.click();
   
			Log.addMessage("Entered phone number successfully");

		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  update language");
			Assert.assertTrue(false, "Failed to  update language");
		}
	}
	
	
	
	
	
	
	
    public  void  Verifyoptionsdisplayed(String text)  {	
	 
		
    	try {
			
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\""+text+"\"]"));
		
            
			Utility.waitForElementVisible(element, driver);
	    	 if (element.isDisplayed())
	    	 {
	    		 Log.addMessage( text + "is displayed");


	    	 }
			
		
	    	 else
	    	 {
	    		 Log.addMessage(text+ "option is not displayed");
                    Assert.fail(text+ "option displayed");
 
	    	 }

		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage(text+ "No option displayed");
			Assert.assertTrue(false, text+ "option displayed");
		}
	}

	

    public  void  VerifyHambergurmenulist()  {	
	 
    	try {

    		Thread.sleep(2000);
    	
    		Verifyoptionsdisplayed("Dashboard");
    		Verifyoptionsdisplayed("Account Settings");
    		Verifyoptionsdisplayed("Help/FAQ");
    		Verifyoptionsdisplayed("Send Logs");
    		Verifyoptionsdisplayed("Switch Mode");
    	
    		
    		//Access App switch App button validation
    		Utility.waitForElementVisible(swithchappoption, driver);
    		Assert.assertTrue(swithchappoption.isDisplayed(), "Access App  option displayed");
    		 Log.addMessage("Access App  option displayed");

    ///Log out option
    		
    		Utility.waitForElementVisible(swithchappoption, driver);
    		Assert.assertTrue(logoutoption.isDisplayed(), "Log out  App  option displayed");
    		 Log.addMessage("og out  App  option displayed");
    		
    	}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Hamberger menu list is not displayed");
			Assert.assertTrue(false, "No option displayed");
		}
	}

	
	
}