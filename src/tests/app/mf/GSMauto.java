package tests.app.mf;

import java.util.logging.Level;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.AccesspointManagment_methods;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FloorPageMF;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomePageMF;
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.UnitManagementPages;
import pages.app.mf.Usergroup_Apppage_MF;
import utility.APICommonFunctions;
import utility.ExcelRead;
import utility.Log;
import utility.ReadEmail;
import utility.Utility;
import utility.Utility.Direction;

public class GSMauto extends Settings{

	
	
	
	
	public void enterVerificationCode_phone2() {
        try {
        	Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
        	generic.enterVerificationCode_phone2();
            Log.addMessage("Verification code entered");
        }catch(Exception e) {
            e.printStackTrace();
            Log.addMessage("Fail to enter Verification code");
            Assert.assertTrue(false, "Failed to enter Verification code");
        }
    }
	
	
	
	
	
	

	
	
	ExcelRead excel = new ExcelRead();

	
	@DataProvider(name = "login")
	public Object[][] getData() throws Exception {
	return excel.getTableArray(InputData, "MF_app", "Login");
	}
	@DataProvider(name = "AddFloor_details")
	public Object[][] getData2() throws Exception {
		return excel.getTableArray(InputData, "TestData", "AddFloor_details");
	}
	@DataProvider(name = "EditFloor_details")
	public Object[][] getData3() throws Exception {
		return excel.getTableArray(InputData, "TestData", "EditFloor_details");
	}
}
