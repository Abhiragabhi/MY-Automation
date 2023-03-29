package pages.app.mf;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
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

public class SiteManagementPage extends Settings{

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleText"),
	})
	@CacheLookup
	private MobileElement pageTitle;


	@CacheLookup
	private MobileElement emailTextField;


	@AndroidFindAll({

		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	})
	@CacheLookup
	private MobileElement passwordTextField;

	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/signInButton"),
	})
	@CacheLookup
	private MobileElement logInButton;

	@AndroidFindAll({

		@AndroidBy (id = "com.kwikset.multifamily.dev:id/passwordVisibilityButton"),
	})
	@CacheLookup
	private MobileElement showPasswordbutton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		//@AndroidBy (id = "com.kwikset.blewifi.dev:id/rememberSwitch"),
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/signInButton"),
	})
	@CacheLookup
	private MobileElement rememberMe;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.blewifi.dev:id/forgotPasswordText"),
	})
	@CacheLookup
	private MobileElement forgotPassword;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.blewifi.dev:id/signInWithGoogleButton"),
	})
	@CacheLookup
	private MobileElement googleLogIN;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.blewifi.dev:id/signUpButton"),
	})
	@CacheLookup
	private MobileElement createAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"),
	})
	@CacheLookup
	private MobileElement logInError;


	
	@AndroidFindAll({
        @AndroidBy (id = "com.kwikset.multifamily.dev:id/sign_in_button"),
    })
    @CacheLookup
    private MobileElement signInButton;
	
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button"),
	})
	@CacheLookup
	private MobileElement whileusingtheApp;
	
	
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/text_drop_down"),
	})
	@CacheLookup
	private MobileElement clicksite;
	
	


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//*[@text='Auto Site A']"),
	})
	@CacheLookup
	private MobileElement verifysitename;



	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//*[@text='Auto Site A']"),
	})
	@CacheLookup
	private MobileElement togglesites;
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//*[@text='Auto Site B']"),
	})
	@CacheLookup
	private MobileElement togglesites1;




	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
	})

	private MobileElement locationclick;

	//Click the setting Button


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement clicksettingbtn;


//
	// Edit the site name



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement editsite;
	
	
	//
	// Edit the site timezone



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/imgTimeZoneIcon"),
	})
	@CacheLookup
	private MobileElement sitetimezone;
	
	//
	// Edit the site address



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "(//android.widget.EditText[@resource-id='com.kwikset.multifamily.dev:id/editText'])[2]"),
	})
	@CacheLookup
	private MobileElement editsiteadress;
	
	
	// Edit the site address



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.TextView[@text='UTC -05:00 Maine']"),
		})
		@CacheLookup
		private MobileElement selectsitetimezone;

		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.TextView[@text='UTC -05:00 Georgia']"),
		})
		@CacheLookup
		private MobileElement selectsitetimezone2;
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement clickDone;

	
	// add  the site picture button



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/imgAddPhoto"),
		})
		@CacheLookup
		private MobileElement addpicture;
		
		
		// add  the site picture gallery button



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.TextView[@text=\"Gallery\"]"),
		})
		@CacheLookup
		private MobileElement clickgallery;
		


		// select picture



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.LinearLayout[@content-desc=\"photo-1486175060817-56buil63aacc6655.jpeg, 192 kB, Jan 20\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[2]"),
		})
		@CacheLookup
		private MobileElement siteimage;
		
		
		// media pop up handle



				@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
				@AndroidFindAll({
					@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_one_time_button"),
				})
				@CacheLookup
				private MobileElement mediapopuphandle;

				@AndroidFindAll({
					@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
				})
				@CacheLookup
				private MobileElement verifysitepage;
				
				
				// click on tick optione



						@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
						@AndroidFindAll({
							@AndroidBy (id = "com.kwikset.multifamily.dev:id/menu_crop"),
						})
						@CacheLookup
						private MobileElement croptick;

	//Constructor
	@SuppressWarnings("static-access")
	public SiteManagementPage(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
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
	/** 
	 * Method Name: enterEmailText(), 
	 * This function is used to enter email address in Email Text field in Login Page
	 */
	
	
	public void verifysitepage() {
		try {
			Utility.waitForElementVisible(verifysitepage, driver);
			String sitesettings = verifysitepage.getText();
			Assert.assertEquals("Auto Site A", sitesettings);
			Log.addMessage("site setting page displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to displayed site setting page");
			Assert.assertTrue(false, "Failed to displayed site setting page");
		}
	}

	
	
	

	@SuppressWarnings("rawtypes")
	public void enterEmail(String email) {
		try {
			Utility.waitForElementClickable(emailTextField, driver);
			Thread.sleep(3000);
			emailTextField.click();
			emailTextField.clear();
			emailTextField.sendKeys(email);
			Log.addMessage("Email Address entered");
		}catch(Exception e) {
			Log.addMessage("Email Text field is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Email Text field is not visible");
		}
	}

	/** 
	 * Method Name: enterPassword(), 
	 * This function is used to enter password in Password Text field in Login Page
	 */

	public void enterPassword(String password) {
		try {
			Utility.waitForElementClickable(passwordTextField, driver);
			passwordTextField.click();
			//			if(device.equals("iOS")) {
			//				if(!(passwordTextField.getText()).equals("Password")) {
			//					passwordTextField.click();
			//					//Thread.sleep(1000);
			//					Utility.waitForElementClickable(loginSelAll, driver);
			//					selectAllMenu.click();
			//				}
			//			}
			passwordTextField.clear();
			passwordTextField.sendKeys(password);
			Log.addMessage("Password entered");
		}catch(Exception e) {
			Log.addMessage("Password Text field is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Password Text field is not visible");
		}
	}

	/** 
	 * Method Name: clickLoginButton(), 
	 * This function is used to click Login button
	 */

	public void clickLoginButton() {
		try {
			Utility.waitForElementToBeVisible(logInButton);
			Utility.waitForElementToBeClickable(logInButton);
			logInButton.click();
			Log.addMessage("Clicked Login button");
		}catch(Exception e) {
			Log.addMessage("Login button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Login button is not visible");
		}
	}
	public void clickshowPassword() {
		try {
			Utility.waitForElementToBeVisible(showPasswordbutton);
			Utility.waitForElementToBeClickable(showPasswordbutton);
			showPasswordbutton.click();
			Log.addMessage("Clicked showPassword button");
		}catch(Exception e) {
			Log.addMessage("showPassword button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "showPassword button is not visible");
		}
	}

	public void toggleRememberMe() {
		try {
			Utility.waitForElementToBeVisible(rememberMe);
			Utility.waitForElementToBeClickable(rememberMe);
			rememberMe.click();
			Log.addMessage("Clicked remember me toggle successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click remember me toggle");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click remember me toggle");
		}
	}

	public void clickForgotPassword() {
		try {
			//			Utility.waitForElementToBeVisible(forgotPassword);
			Utility.waitForElementToBeClickable(forgotPassword);
			forgotPassword.click();
			Log.addMessage("Clicked forgot Password link successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click forgot Password link");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click forgot Password link");
		}
	}

	public void clickLogInWithGoogleBtn() {
		try {
			Utility.waitForElementToBeVisible(googleLogIN);
			Utility.waitForElementToBeClickable(googleLogIN);
			googleLogIN.click();
			Log.addMessage("Clicked Log In With Google Btn successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click Log In With Google Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click Log In With Google Btn");
		}
	}

	public void clickCreateAnAccountBtn() {
		try {
			Utility.waitForElementToBeVisible(createAccount);
			Utility.waitForElementToBeClickable(createAccount);
			createAccount.click();
			Log.addMessage("Clicked Create An Account Btn successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click Create An Account Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click Create An Account Btn");
		}
	}

	public void getEmailid() {
		try {
			Utility.waitForElementToBeVisible(emailTextField);
			Utility.waitForElementToBeClickable(emailTextField);
			String email = emailTextField.getText();
			if(!email.isEmpty()) {
				Log.addMessage("Email id retained::"+email);
			}
		}catch(Exception e) {
			Log.addMessage("Failed to click Create An Account Btn");
			System.out.println(e.getMessage().toString());
			//			Assert.assertTrue(false, "Failed to click Create An Account Btn");
		}
	}
	public void clickSignInButton() {
        try {
            Utility.waitForElementToBeVisible(signInButton);
            Utility.waitForElementToBeClickable(signInButton);
            signInButton.click();
            Log.addMessage("Clicked Sign In button");
        }catch(Exception e) {
            Log.addMessage("Sign In button is not visible");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Sign In button is not visible");
        }
    }
	
	
	

	
	//Click while using the App
	
	
	public void whileUsingtheapp() {
		try {
			Utility.waitForElementToBeVisible(whileusingtheApp);
			Utility.waitForElementToBeClickable(whileusingtheApp);
			whileusingtheApp.click();
			Log.addMessage("Clicked while using the app Btn successfully");

		}catch(Exception e) {
			Log.addMessage("Failed to click while using the app Btn");
			System.out.println(e.getMessage().toString());
		    Assert.assertTrue(false, "Failed to click while using the app Btn");
		}
	}
	
	

	public void clickSiteB() {
        try {
            Utility.waitForElementToBeVisible(togglesites1);
            Utility.waitForElementToBeClickable(togglesites1);
            togglesites1.click();
            Log.addMessage("Clicked the site dropdown");
        }catch(Exception e) {
            Log.addMessage("Site dropdown not visible");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Site dropdown not visible");
        }
    }


	
	//click site button
	
	
	public void clickSiteDropdpwn() {
        try {
            Utility.waitForElementToBeVisible(clicksite);
            Utility.waitForElementToBeClickable(clicksite);
            clicksite.click();
            Log.addMessage("Clicked the site dropdown");
        }catch(Exception e) {
            Log.addMessage("Site dropdown not visible");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Site dropdown not visible");
        }
    }


	public void toggleSites() {
		try {
			Utility.waitForElementToBeVisible(togglesites);
			Utility.waitForElementToBeClickable(togglesites);
			togglesites.click();
			Log.addMessage("Clicked the toggle between sites successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click toggle between sites");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click toggle between sites");
		}
	}

//

	//Site Management - Unit List View(Click Location Tab)


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
	// Site Management - Unit List View(Click the building)

	public void clickSettingButton() {
		try {
			
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clicksettingbtn);
			Utility.waitForElementToBeClickable(clicksettingbtn);
			clicksettingbtn.click();
			Log.addMessage("Clicked setting button successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click Setting Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click Setting Btn");
		}
	}

	//Edit the site name

	public void editTheSiteName(String name) {
		try {
			Utility.waitForElementToBeVisible(editsite);
			Utility.waitForElementToBeClickable(editsite);
			editsite.click();
			editsite.clear();
			editsite.sendKeys(name);
			editsite.click();

			Log.addMessage("Edit the site name successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to edit the site name");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to edit the site name");
		}
	}
	
	
	//Edit the site name

	public void editsiteaddress(String address) {
		try {
			Utility.waitForElementToBeVisible(editsiteadress);
			Utility.waitForElementToBeClickable(editsiteadress);
			editsiteadress.click();
			editsiteadress.clear();
			editsiteadress.sendKeys(address);
			editsite.click();

			Log.addMessage("Edit the site address  successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to edit the site address");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to edit the site address");
		}
	}
	
	//Edit the site name

	public void Uploadsitepicture() {
		try {
			
			//Add button 
			Utility.waitForElementToBeVisible(addpicture);
			Utility.waitForElementToBeClickable(addpicture);
			addpicture.click();
			
			//Media pop up handle
			Utility.waitForElementToBeVisible(mediapopuphandle);
			Utility.waitForElementToBeClickable(mediapopuphandle);
			mediapopuphandle.click();
			
			//Select gallary option
			
		
			Utility.waitForElementToBeVisible(clickgallery);
			Utility.waitForElementToBeClickable(clickgallery);
			clickgallery.click();
			
			//Select site  image
			
			
			Utility.waitForElementToBeVisible(siteimage);
			Utility.waitForElementToBeClickable(siteimage);
			siteimage.click();
			
			Utility.waitForElementToBeVisible(croptick);
			Utility.waitForElementToBeClickable(croptick);
			croptick.click();
			
			

			



			Log.addMessage("site picture added  successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to add  the site picture");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to add the site picture");
		}
	}
	

	public void set_site_timezone(String timezone) {
		try {
			Utility.waitForElementToBeVisible(sitetimezone);
			Utility.waitForElementToBeClickable(sitetimezone);
			sitetimezone.click();
			
			Utility.androidScroll(timezone);
			
			//click timezone
			
			  Thread.sleep(2000);
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+timezone+"\"]"));
         System.out.println(element);
         Thread.sleep(2000);
     	Utility.waitForElementToBeVisible(element);
			element.click();
		
		
			
			
			Log.addMessage("site time zone  added  successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to add  the site picture");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to add the site picture");
		}
	}
	
	
	
	
//  Click done Button
	
	
	

	public void clickDoneButton() {
		try {
			Utility.waitForElementToBeVisible(clickDone);
			Utility.waitForElementToBeClickable(clickDone);
			clickDone.click();
			Log.addMessage("Clicked the Done Button SUccessfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click the Done Button");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click the Done Button");
		}
	}
	
	public void Toggle_between_sites(String site)  {	
		try {
		
			  Thread.sleep(2000);
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+site+"\"]"));
           System.out.println(element);
           Thread.sleep(2000);
       	Utility.waitForElementToBeVisible(element);
			element.click();
			  
		
			Log.addMessage("Site Selected");
		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed select site");
			Assert.assertTrue(false, "Failed to select site ");
		}
	}
	
	
	
	
	

		

	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//

	

	public void verifyViewListofsite() {
		try {
			Utility.waitForElementVisible(verifysitename, driver);
			String sitename = verifysitename.getText();
			Assert.assertEquals("Auto Site A", sitename);	
			Log.addMessage("Verify the List of View All sites successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to Verify ViewAll Sites");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to Verify ViewAll Sites");
		}
	}


}
