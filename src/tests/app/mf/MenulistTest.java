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

public class MenulistTest extends Settings  {
	
	
	

	
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
	@Test(enabled =true, priority =1,groups="Menu list")
	public void Verify_Menu_list() throws InterruptedException {
		try {	
			
                
	
			
			LockDashboardAppMF dashboard = new LockDashboardAppMF((AppiumDriver<MobileElement>) driver);
			AccountSettingsPageAppMF settings = new AccountSettingsPageAppMF((AppiumDriver<MobileElement>) driver);
			System.out.print("Hamberger menu list validation test  started");
			Utility.simpleWait(4000); 
			dashboard.clickOnHamburgerMenu();
			settings.VerifyHambergurmenulist();
			dashboard.clickMenuCloseIcon();
		
		Log.addMessage("Sucessfully verified Hamberger menu list");

		} catch (Exception e) {
			Log.addMessage("Failed to verify  Hamberger menu list" +e);
			Assert.assertTrue(false, "Failed verify to Hamberger menu list");
		}
	}
	





		
    ExcelRead excel = new ExcelRead();
	
	@DataProvider(name = "userName")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "App2.0", "Menu");
	}	

}
