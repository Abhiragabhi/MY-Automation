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

public class LoginPageAppMF extends Settings{
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/titleText"),
	})
	@CacheLookup
	private MobileElement pageTitle;
	
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	@AndroidFindAll({
//	@AndroidBy (id = "com.kwikset.blewifi.dev:id/tv_email"),
//	@AndroidBy (xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
//	@AndroidBy (xpath = "//android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup"),
//	@AndroidBy (id = "com.weiser.blewifi:id/tv_email"),
//	@AndroidBy (id = "com.weiser.blewifi.dev:id/tv_email")
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/editText")
	})
	@CacheLookup
	private MobileElement emailTextField;
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
	@AndroidFindAll({
//	@AndroidBy (id = "com.kwikset.blewifi.dev:id/tv_password"),
//	@AndroidBy (xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
//	@AndroidBy (xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup"),
//	@AndroidBy (id = "com.weiser.blewifi:id/tv_password"),
//	@AndroidBy (id = "com.weiser.blewifi.dev:id/tv_password")
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	})
	@CacheLookup
	private MobileElement passwordTextField;
	

	
		@AndroidFindAll({
//	
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/signInButton"),

		})
		@CacheLookup
		private MobileElement logInButton;
		
		
		
		@AndroidFindAll({
//	
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/signInButton"),

		})
		@CacheLookup
		private MobileElement Loginbutton;
		
		
	
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
//	@AndroidBy (id = "com.kwikset.blewifi.dev:id/tv_login"),
//	@AndroidBy (id = "com.kwikset.blewifi.dev:id/signInButton"),
//	@AndroidBy (id = "com.spectrum.giga:id/tv_login"),
//	@AndroidBy (id = "com.weiser.blewifi:id/tv_login"),
//	@AndroidBy (id = "com.weiser.blewifi.dev:id/tv_login")
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/passwordVisibilityButton"),
		//@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup")
		//@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	})
	@CacheLookup
	private MobileElement showPasswordbutton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/rememberSwitch"),
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
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.TextView[@text=\"Today’s Overview\"]"),
	})
	@CacheLookup
	private MobileElement LoggedinDashbord;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/sign_in_button"),
	})
	@CacheLookup
	private MobileElement signInButton;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.TextView[@text=\"Login with phone number\"]"),
		})
		@CacheLookup
		private MobileElement Loginwithphone;
		
		
		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		})
		@CacheLookup
		private MobileElement Phonenofield;
	
	
	

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.EditText[@text=\"Password\"]"),
	})
	@CacheLookup
	private MobileElement Enterpassword_phone;

//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeMenuItem[@name='Select All']")
//	@CacheLookup
//	private MobileElement selectAllMenu;
//	
//	By loginBtn =By.xpath("//XCUIElementTypeButton[@name='Log In']");
//	By loginBtnAn =By.xpath("//android.widget.Button[@text='Log In']");
//	By loginSelAll = By.xpath("//XCUIElementTypeMenuItem[@name='Select All']");
	
	//Constructor
	@SuppressWarnings("static-access")
	public LoginPageAppMF(AppiumDriver<MobileElement> driver) {
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
			//Utility.waitForElementToBeVisible(passwordTextField);
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
	
	
	
	@SuppressWarnings("rawtypes")
	public void Loginwithphonenumber(String phonenumber,String password ) {
		try {
			Utility.waitForElementClickable(Loginwithphone, driver);
			Thread.sleep(3000);
			Loginwithphone.click();
			Phonenofield.clear();
			Phonenofield.sendKeys(phonenumber);
			Log.addMessage("Phone number entered");
			
			Thread.sleep(3000);
			Enterpassword_phone.click();
			Enterpassword_phone.clear();
			Enterpassword_phone.sendKeys(password);
			Log.addMessage("password  entered");
			
		}catch(Exception e) {
			Log.addMessage(" password field is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, " password field is not visible");
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
	
	public void Loginbuttonclick() {
		try {
			Utility.waitForElementToBeVisible(Loginbutton);
			Utility.waitForElementToBeClickable(Loginbutton);
			Loginbutton.click();
			Log.addMessage("Clicked Login button");
		}catch(Exception e) {
			Log.addMessage("Login button is not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Login button is not visible");
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
	
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
	
	public void verifyLogInErrorIsDisplayed() {
		try {
			Utility.waitForElementVisible(logInError, driver);
			String error = logInError.getText();
			Assert.assertEquals("Please check email or password.", error);	
			Log.addMessage("Account deletion is successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to delete account");
			Assert.assertTrue(false, "Failed to delete account");
		}
	}

	
	public void VerifyDashboard_Displayed() {
		try {
			Utility.waitForElementVisible(LoggedinDashbord, driver);
			String Dashbordmessage = LoggedinDashbord.getText();
			Assert.assertEquals("Today’s Overview", Dashbordmessage);	
			Log.addMessage("Dahbord is displayed successfully after login");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Dahbord is not  displayed  after login");
			Assert.assertTrue(false, "Dahbord is not  displayed  after login");
		}
	}

	
}
