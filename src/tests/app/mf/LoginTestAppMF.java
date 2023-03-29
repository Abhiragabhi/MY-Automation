package tests.app.mf;

import org.openqa.selenium.NoSuchElementException;




import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.LogOutAppPageMF;
import pages.app.mf.LoginPageAppMF;
import pages.app.mf.SiteManagementPage;
import utility.ExcelRead;
import utility.Log;

public class LoginTestAppMF extends Settings{
	ExcelRead excel = new ExcelRead();
	
	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="LoginFunctionality",priority =0)
	public void enter_Login_Credentials_Test(String email, String password) {
	 try {
		 System.out.println("enter LoginC redentials Test Started");
		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
		 HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
		 Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
		 SiteManagementPage viewlistsite= new SiteManagementPage((AppiumDriver<MobileElement>) driver);

		 System.out.println("A");
		 login.clickSignInButton();
	
		 login.enterEmail(email);
		 //generic.Hidekeyboard();
	
		 login.enterPassword(password);
		 Thread.sleep(8000);
	
		 //generic.Hidekeyboard();
		 login.clickshowPassword();
		 login.toggleRememberMe();
		 login.clickLoginButton();
		 Log.addMessage("Successfully logged in to the home page");
		 home.locationAccessPopupAllow();
			home.Multifamil_connect_popup_handle();
			 generic.cancelerrorpopup();
			viewlistsite.Toggle_between_sites("Auto Site A");
	 }catch(Exception e) {
		 Log.addMessage("Failed to enter login credentials");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed to enter login credentials");
	 }
	}
	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="LoginFunctionality",priority =1)
	public void Log_into_Accoutnt_with_Email(String email, String password) {
	 try {
		 
		 
		HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);

	
		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
		
		 System.out.println("Login to Accoutnt with Email");
		 login.clickSignInButton();
	
		 login.enterEmail(email);
		 
		 login.enterPassword(password);
		 login.clickshowPassword();
		 login.toggleRememberMe();
		 login.Loginbuttonclick();
		 home.locationAccessPopupAllow();
		home.Multifamil_connect_popup_handle();
		 

		
		 Log.addMessage("Successfully handled the location popup");
	 



		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to enter login credentials");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed to enter login credentials");
	 }
	}
	
	@SuppressWarnings("unchecked") 
	
	@DataProvider(name = "LoginWithPhoneNo")
	public Object[][] getData_Phone_Login() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "LoginWithPhoneNo");
	}
	
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="LoginWithPhoneNo",groups="LoginFunctionality",priority =2)
	public void Log_into_Account_with_phonenumber(String phone, String password) {
	 try {
		
		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
		
		 System.out.println("Login to Account with phone number");

		
			
		 login.Loginwithphonenumber(phone,password);
		
		
		 login.clickshowPassword();
		 login.clickLoginButton();
		 Thread.sleep(5000);
	
		 Log.addMessage("Logged out of Application");
		 
		 LogOutAppPageMF logout = new LogOutAppPageMF((AppiumDriver<MobileElement>) driver);

		 logout.Logoutapplication();
		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to enter login credentials");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed to enter login credentials");
	 }
	}
	

	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="LoginFunctionality",priority =6)
	public void LogintoMFADisavledAccount(String email, String password) {
	 try {
		
		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
		
		 System.out.println("Login to MFA DisabledAccount T");
		 login.clickSignInButton();
		
		 login.enterEmail(email);
		
		 login.enterPassword(password);
		 login.clickshowPassword();
		 login.clickLoginButton();
		 Log.addMessage("Successfully logged in to the home page");

		
	 }catch(Exception e) {
		 Log.addMessage("Failed to enter login credentials");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed to enter login credentials");
	 }
	}
	
	
	
	@SuppressWarnings("unchecked") 
	//@Test(dataProvider="userName",enabled =true, priority =1)
	@Test(dataProvider="login",groups="LoginFunctionality",priority =3)
	public void Login_Dashbord_Display(String email, String password) {
	 try {
	
		 LoginPageAppMF login = new LoginPageAppMF((AppiumDriver<MobileElement>) driver);
		
		 System.out.println("Login Dashboard displayed test started");
	
		 
		 
	
		 login.VerifyDashboard_Displayed();
		 Log.addMessage("Successfully logged in to the home page");

		 
	 }catch(Exception e) {
		 Log.addMessage("Failed to  login");
		 e.printStackTrace();
		 Assert.assertTrue(false, "Failed  login");
	 }
	}

		
		@SuppressWarnings("unchecked") 
		//@Test(dataProvider="userName",enabled =true, priority =1)
		@Test(dataProvider="login",groups="LoginFunctionality",priority =3)
		public void Homelocationaccesspopup_Hanldle(String email, String password) {
		 try {
			 System.out.println("Connected to popup handle");
			 
			HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
			home.locationAccessPopupAllow();
			
			 Log.addMessage("Successfully handled the location popup");
		 

			 
		 }catch(Exception e) {
			 Log.addMessage("Failed to enter login credentials");
			 e.printStackTrace();
			 Assert.assertTrue(false, "Failed to enter login credentials");
		 }
		}

	
		@SuppressWarnings("unchecked") 
		//@Test(dataProvider="userName",enabled =true, priority =1)
		@Test(dataProvider="login",groups="LoginFunctionality",priority =5)
		public void connecttopopuphandle(String email, String password) {
		 try {
			 System.out.println("Connected to popup handle");
			 
			 HomePageMF home = new HomePageMF((AppiumDriver<MobileElement>) driver);
				home.Multifamil_connect_popup_handle();
			
			 Log.addMessage("Successfully handled the location popup");
		 

			 
		 }catch(Exception e) {
			 Log.addMessage("Failed to enter login credentials");
			 e.printStackTrace();
			 Assert.assertTrue(false, "Failed to enter login credentials");
		 }
		}


	
	

	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
	}
	
	@DataProvider(name = "emailverification")
	public Object[][] getData2() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "EmailVerification");
	}
	
	

}
