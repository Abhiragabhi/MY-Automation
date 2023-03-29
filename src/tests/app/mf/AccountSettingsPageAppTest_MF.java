package tests.app.mf;

import static org.testng.Assert.assertTrue;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.app.mf.AccountSettingsPageAppMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.LockDashboardAppMF;
import pages.app.mf.LoginPageAppMF;
import utility.ExcelRead;
import utility.Log;
import utility.Utility;

public class AccountSettingsPageAppTest_MF extends Settings  {
	
	
	
//
//	@SuppressWarnings("unchecked") 
//	//@Test(dataProvider="userName",enabled =true, priority =1)
//	@Test(dataProvider="login",groups="LoginFunctionality",priority =1)
//	public void enterLoginCredentialsTest(String email, String password) {
//	 try {
//		 System.out.println("enter LoginC redentials Test Started");
//		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
//		 LoginPageApp2 signin = new LoginPageApp2((AppiumDriver<MobileElement>) driver);
//		 System.out.println("A");
//		 signin.clickSignInButton();
//	
//		 login.enterEmail(email);
//		
//		 login.enterPassword(password);
//		 login.clickshowPassword();
//		 login.toggleRememberMe();
//		 login.clickLoginButton();
//		 Log.addMessage("Successfully logged in to the home page");
//
//		 
//	 }catch(Exception e) {
//		 Log.addMessage("Failed to enter login credentials");
//		 e.printStackTrace();
//		 Assert.assertTrue(false, "Failed to enter login credentials");
//	 }
//	}
//	
	
//	@BeforeClass
//	@SuppressWarnings("unchecked")
//	@Test(groups="user management", priority =0)
//	public void Relauchapplication() {
//		try {
//
//			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
//			g.Relauchtheapp();
//
//			
//			Log.addMessage("Successfully search exisitinguser");
//
//		} catch (Exception e) {
//			Log.addMessage("search exisitinguser failed");
//			e.printStackTrace();
//			Assert.assertTrue(false, "search exisitinguser functionality failed");
//		}
//	}

	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =2)
	public void view_AccountSettings_tab() throws InterruptedException {
		try {	
			
                
	
			
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("View Account settings test started");
			Utility.simpleWait(4000); 
			dashboard.clickOnHamburgerMenu();
			
			settings.Selectmenu("Account Settings");
		

			settings.verifyAccountSettingsScreen();
		Log.addMessage("Sucessfully verified  Account settings screen");

		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Account screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Account screen");
		}
	}
	

//	@SuppressWarnings("unchecked")
//	@Test(enabled =true, priority =3)
//	public void Changelanguage() throws InterruptedException {
//		try {	
//			
//
//	
//
//			
//			
//			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
//			System.out.print("View Account settings test started");
//			Utility.simpleWait(4000); 
//			
//			settings.SelectAccountLanguage("Français");
//			Utility.simpleWait(4000); 
//			settings.SelectAccountLanguage("English");
//		Log.addMessage("Sucessfully changes language ");
//
//		} catch (Exception e) {
//			Log.addMessage("Failed to navigate to Account screen" +e);
//			Assert.assertTrue(false, "Failed to navigate to Account screen");
//		}
//	}
//	
	
	@SuppressWarnings("unchecked")
	@Test(enabled =true, priority =3)
	public void verify_version_info() throws InterruptedException {
		try {	
			

	

		
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);	
			System.out.print("View App version  info test started");
			settings.clickOnBackButton();
			settings.verifyversion();

		} catch (Exception e) {
			Log.addMessage("Failed to verify App info");
			Assert.assertTrue(false, "Failed to verify App info");
		}
	}
	

	
	@SuppressWarnings("unchecked")
	@Test(priority =4,enabled=true)
	public void home_Screen_Navigation() throws InterruptedException {
		try {
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("View Account settings home screen navigation test started");
			dashboard.clickMenuCloseIcon();
			Log.addMessage("Sucessfully navigated to Home page screen");
		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Home page screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Home page screen");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test(priority =9,enabled=true)
	public void hamburgerMenuCloseIcon() throws InterruptedException {
		try {
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("View Account settings close hamberger menu test started");
			dashboard.clickOnHamburgerMenu();
			dashboard.clickMenuCloseIcon();
			dashboard.homePageNavigation();
			Log.addMessage("Sucessfully navigated to Home page screen");
		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Home page screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Home page screen");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test(priority =6,enabled=true)
	public void tabUpdatePhoneNumber() throws InterruptedException {
		try {
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);	
			Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);

			dashboard.clickOnHamburgerMenu();		
			settings.Selectmenu("Account Settings");
			settings.updatePhoneNumberScreenNavigation();
			settings.Enterphonenumber("(9097361012");
			generic.Two_step_validation_code();
			settings.clickOnBackButton();
			Log.addMessage("Sucessfully navigated to Update phone number screen");
		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Update phone number screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Update phone number screen");
		}
	}
	
	@SuppressWarnings("unchecked")
	//@Test(priority =6,dependsOnMethods="tabUpdatePhoneNumber")
	@Test(priority =7)
	public void updateNameScreenNavigation() throws InterruptedException {
		try {
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);	
			settings.updateNameScreenNavigation();
			settings.clickOnBackButton();
			Log.addMessage("Sucessfully navigated to Update name screen");
		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Update name screen" +e);
			Assert.assertTrue(false, "Failed to navigate to Update name screen");
		}
	}
		@SuppressWarnings("unchecked")
//	@Test(priority =7,dependsOnMethods="tabUpdateAccountName")
	public void tabUpdatePassword() throws InterruptedException {
	try {
AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);	
		settings.updatePasswordScreenNavigation();
			settings.clickOnBackButton();
		Log.addMessage("Sucessfully navigated to Update name screen");
		} catch (Exception e) {
			Log.addMessage("Failed to navigate to Update name screen" +e);			Assert.assertTrue(false, "Failed to navigate to Update name screen");
		}
}

		
    ExcelRead excel = new ExcelRead();
	
	@DataProvider(name = "userName")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "App2.0", "Menu");
	}	

}
