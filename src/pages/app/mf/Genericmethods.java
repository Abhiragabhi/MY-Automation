package pages.app.mf;

import java.net.URL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.appium.java_client.ExecutesMethod;
import io.appium.java_client.HasOnScreenKeyboard;
import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;
import io.appium.java_client.android.GsmVoiceState;
import io.appium.java_client.android.SupportsSpecialEmulatorCommands;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.Log;
import utility.PropertyUtility;
import utility.ReadEmail;
import utility.Utility;

public class Genericmethods extends Settings {


	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
	
	
	})

	private MobileElement searchbox;
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/negativeButton"),
	
	
	})

	private MobileElement cancelbuuton;
	

	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement shareaccessdonebutton;

		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textBuildingName"),
		})
		@CacheLookup
		private MobileElement Buildinglist;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
		})
	
		private MobileElement Donebutton;
		
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonSave"),
		})
	
		private MobileElement savebutton;
		
		
		
		@AndroidFindAll({
			
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
			
		})
		@CacheLookup
		private MobileElement addfirstname;
		

		@AndroidFindAll({
		
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/editText"),
			
		})
		@CacheLookup
		private MobileElement addemail;
		      				
		
		
		
		

		@AndroidFindAll({
		
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/imgSuccess"),
			
		})
		@CacheLookup
		private MobileElement Verifysuccesspage;
		      				
		
		
		
		   

		
		@AndroidFindAll({
		
			@AndroidBy(xpath = "//android.view.ViewGroup//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup"),
			
		})
		@CacheLookup
		private MobileElement clickuserproperty;
		
		

		
		@AndroidFindAll({
		
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]"),
			
		})
		@CacheLookup
		private MobileElement clickinstaller;
		
		

		
		@AndroidFindAll({
		
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.view.ViewGroup"),
			
		})
		@CacheLookup
		private MobileElement clickuser;
		
		

		@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/button_continue"),
		
			
		})
		@CacheLookup
		private MobileElement clickcontinuebutton;
		
		
		@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"Mobile*\"]"),
		})
		@CacheLookup
		private MobileElement clickmobiletext;

		
		@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		})
		@CacheLookup
		private MobileElement Entermobilenumber;

		
		
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
		})
		@CacheLookup
		private MobileElement Adduserdonebutton;
		
		
		@AndroidFindAll({
			
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
			
		})
		@CacheLookup
		private MobileElement addlastname;
		
		
		@AndroidFindAll({
			
			@AndroidBy(xpath = "//android.widget.Button[@text=\"CONTINUE\"]"),
			
		})

		private MobileElement phonecode;
		
		@AndroidFindAll({
		
			@AndroidBy(xpath = "//android.widget.Button[@text=\"CONTINUE\"]"),
			
		})

		private MobileElement continuebutton;
		
		
		@AndroidFindAll({
			
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/inputContainer"),
			
		})

		private MobileElement phonecodebox;
		
		
		
		
		//android.widget.TextView[@text="Property Manager"]
		
	@SuppressWarnings("static-access")
	public Genericmethods(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	public void verifyBuildingList() {
		try {
			//Utility.waitForElementVisible(buildingsListView, driver);
			//Thread.sleep(3000);
			//Assert.assertTrue(buildingsListView.isDisplayed(), "Buildings are listed");
			
			Log.addMessage("List of buildings are displayed");
		}catch(Exception e) {
			Log.addMessage("List of buildings are not visible");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "List of buildings are not visible");
		}
	}
	
	
    public  void  verifyrecorddisplayed(String text)  {	
	 
		

			MobileElement element = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\""+text+"\"]"));
			Utility.waitForElementVisible(element, driver);
	    	 if (element.isDisplayed())
	    	 {
	    		 Log.addMessage("Record is present");


	    	 }
			
		
	    	 else
	    	 {
	    		 Log.addMessage("Record is not displayed");
                    Assert.fail("No records displayed");
 
	    	 }
		}
	

    
    
    
    public  void  GSMVoice()  {	
   	 
        //((SupportsSpecialEmulatorCommands) driver).setGsmVoice(GsmVoiceState.HOME);
        ((SupportsSpecialEmulatorCommands) driver).sendSMS("9400169500", "Hey lol");



    }
       
    



	
	
	public void Relauchtheapp() {
		try {
			
			
			InteractsWithApps interact = (InteractsWithApps) driver;
		
			interact.terminateApp("com.kwikset.multifamily.dev");
			interact.activateApp("com.kwikset.multifamily.dev");
	
		}catch(Exception e) {

			Log.addMessage("Appium Server not started. Plesae refer error log for more details");


		}
	}

	public void Searchanitem(String Naame) {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(searchbox);
		
			searchbox.click();
			searchbox.clear();
			searchbox.sendKeys(Naame);
			
			
			
			
			Log.addMessage("searched  the item  successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to search  ");
			Assert.assertTrue(false, "Failed to search  ");
		}
	}
	
	
	
	


	public void Hidekeyboard( ) {
		try {
			
			
			
			
			
			Thread.sleep(200);

			boolean isKeyboardShown = ((HasOnScreenKeyboard) driver).isKeyboardShown();

			if (isKeyboardShown==true)
			{
				HidesKeyboard h =	((HidesKeyboard) driver);
				h.hideKeyboard();
				Thread.sleep(200);
				Log.addMessage("keyboard hide successfully");
				
			}
			
			else {
				Log.addMessage("keyboard is not displayed");
				
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to hide Keybord  ");
			Assert.assertTrue(false, "Failed to hide Keybord ");
		}
	}
	


	public void clearsearchbox() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(searchbox);
			searchbox.clear();
		
			
			Log.addMessage("searched  the item  successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to search  ");
			Assert.assertTrue(false, "Failed to search  ");
		}
	}
	
	
    public  void backnavigation() {
    	try {
    	Utility.simpleWait(3000);
    	
    	MobileElement element = (MobileElement) driver.findElement(By.id("com.kwikset.multifamily.dev:id/view_left"));
    	Thread.sleep(3000);
    	Utility.waitForElementToBeVisible(element);
    	Utility.waitForElementToBeClickable(element);
    	element.click();
    	Thread.sleep(3000);
    	Log.addMessage("Navigate to previous pagey");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to navigate to previous page  ");
			Assert.assertTrue(false, "Failed to navigate to previous page ");
		}
	}
    public  void  Selectbyname(String text)  {	
    	try {
		
    	Utility.simpleWait(3000);
    	
			MobileElement element = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text=\""+text+"\"]"));
			Utility.waitForElementToBeVisible(element);
	    	Utility.waitForElementToBeClickable(element);
	    	element.click();
	    	Thread.sleep(3000);
	    	Log.addMessage("Select the item successfully");
    	} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to select  item  ");
			Assert.assertTrue(false, "Failed to select  item ");
		}
	}
	
    
    public  void Clickonsettingsbutton() {
    	try {
    	Utility.simpleWait(3000);
    	
    	MobileElement element = (MobileElement) driver.findElement(By.id("com.kwikset.multifamily.dev:id/view_right"));
    	Utility.waitForElementToBeVisible(element);
    	Utility.waitForElementToBeClickable(element);
    	element.click();
    	Log.addMessage("Navigate to previous pagey");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to navigate to previous page  ");
			Assert.assertTrue(false, "Failed to navigate to previous page ");
		}
	}
    
    
    
    public  void CLickDonebutton() {
    	try {
    	Utility.simpleWait(3000);
    	
    
    	Utility.waitForElementToBeVisible(Donebutton);
    	Utility.waitForElementToBeClickable(Donebutton);
    	Donebutton.click();
    	Utility.simpleWait(2000);
    	Log.addMessage("CLicked on DOne button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on done button  ");
			Assert.assertTrue(false, "Failed to click on done button ");
		}
	}
	
    
    public  void Clickonsavebutton() {
    	try {
    	Utility.simpleWait(3000);
    	
    
    	Utility.waitForElementToBeVisible(savebutton);
    	Utility.waitForElementToBeClickable(savebutton);
    	savebutton.click();
    	Utility.simpleWait(2000);
    	Log.addMessage("CLicked on DOne button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on done button  ");
			Assert.assertTrue(false, "Failed to click on done button ");
		}
	}
    
    
    public  void Clickoncontinuebutton() {
    	try {
    	Utility.simpleWait(3000);
    	
    
    	Utility.waitForElementToBeVisible(continuebutton);
    	Utility.waitForElementToBeClickable(continuebutton);
    	continuebutton.click();
    	Utility.simpleWait(2000);
    	Log.addMessage("CLicked on continue button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on continue button  ");
			Assert.assertTrue(false, "Failed to click on done button ");
		}
	}
    
    
    
    
    
	
	
    
    
    
    public  void AddusertotheAccount(String Email, String Firstname, String Lastname, String Usertype, String Groupname, String phonenumber) {
    	try {
    		
    		
    		// Enter email address
    		Utility.waitForElementToBeVisible(addemail);
			addemail.click();
			addemail.clear();
			addemail.sendKeys(Email);
			Thread.sleep(3000);
			driver.findElement(By.id("com.kwikset.multifamily.dev:id/submitButton")).click();
			
			
			//Enter first name
			Utility.waitForElementToBeVisible(addfirstname);
			addfirstname.click();
			addfirstname.clear();
			addfirstname.sendKeys(Firstname);
			
			addfirstname.click();
		Log.addMessage("add firstusername successfully");
		///Enter last name
		Utility.waitForElementToBeVisible(addlastname);
		Thread.sleep(3000);
		addlastname.click();
		addlastname.clear();
		addlastname.sendKeys(Lastname);
		Log.addMessage("add lastname successfully");
		
		Thread.sleep(3000);
///Select user type
		Utility.Selectbyname(Usertype);
		
		Log.addMessage("User type selected");
		
		//CLick continue button from User type  page
				Utility.waitForElementToBeVisible(clickcontinuebutton);
				clickcontinuebutton.click();
				Log.addMessage("Clicked on a clickcontinue");
		
		///Search and select group
		Utility.waitForElementToBeVisible(searchbox);
		searchbox.click();
		searchbox.clear();
		searchbox.sendKeys(Groupname);
		Thread.sleep(3000);
		Utility.Selectbyname(Groupname);
/// click continue button from user group page
		
		Thread.sleep(3000);
		Utility.waitForElementToBeVisible(continuebutton);
		continuebutton.click();
	//	driver.findElement(By.xpath("//android.widget.Button[@text=\"CONTINUE\"]")).click();
		Log.addMessage("Clicked on a clickcontinue on group page");
		
		Thread.sleep(3000);
	
		///Access time page continue
		Thread.sleep(3000);
		Utility.waitForElementToBeVisible(continuebutton);
		continuebutton.click();
		//driver.findElement(By.xpath("//android.widget.Button[@text=\"CONTINUE\"]")).click();
		Log.addMessage("Clicked on a continue on acccess page");
		
		
		///Enter mobile number
		
		Utility.waitForElementToBeVisible(clickmobiletext);
		clickmobiletext.click();
	//	Utility.waitForElementToBeVisible(Entermobilenumber);
		Entermobilenumber.click();
		Entermobilenumber.clear();
		Entermobilenumber.sendKeys(phonenumber);
		Utility.waitForElementToBeVisible(shareaccessdonebutton);
		shareaccessdonebutton.click();
		
		///Add user flow finish
		Utility.waitForElementToBeVisible(Adduserdonebutton);
		Adduserdonebutton.click();
		
		
		
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on done button  ");
			Assert.assertTrue(false, "Failed to click on done button ");
		}
	}
	
    
    public void enterVerificationCode_phone2() {
        try {
            Utility.simpleWait(15000);
           // Utility.waitForElementClickable(phonecode,driver);
            Utility.simpleWait(15000);
            new ReadEmail(".com", "", PropertyUtility.getProperty("email.server"), PropertyUtility.getProperty("email.protocol"),993,ReadEmail.EmailFolder.INBOX);
            String code = ReadEmail.Fp_getAccessCode("New text message from (760) 642-5521");
            System.out.println("code before replace="+code);
            code = code.replace("code is ", "");
            System.out.println("code after replace="+code);
            phonecode.clear();
            phonecode.click();
            phonecode.sendKeys(code);
            Log.addMessage("Verification code entered");
        }catch(Exception e) {
            e.printStackTrace();
            Log.addMessage("Fail to enter Verification code");
            Assert.assertTrue(false, "Failed to enter Verification code");
        }
    }
	
    
    
    
    public void Two_step_validation_code() {
        try {
            Utility.simpleWait(15000);
            
            
           //Utility.waitForElementClickable(phonecode,driver);
            Utility.simpleWait(15000);
            Utility.waitForElementClickable(phonecodebox,driver);
            new ReadEmail("automationuser2@goconcourse.com","fklnubsrmwfvzynd", PropertyUtility.getProperty("email.server"), PropertyUtility.getProperty("email.protocol"),993,ReadEmail.EmailFolder.INBOX);
            String code = ReadEmail.Fp_getAccessCode("New text message from (760) 642-5521");
            code = code.replace("code is ", "");
            System.out.println("code after replace="+code);
            phonecode.clear();
            phonecode.click();
            phonecode.sendKeys(code);
            Log.addMessage("Verification code entered");
        }catch(Exception e) {
            e.printStackTrace();
            Log.addMessage("Fail to enter Verification code");
            Assert.assertTrue(false, "Failed to enter Verification code");
        }
    }
    
    
    
    
    public void cancelerrorpopup() {
        try {
            Utility.simpleWait(3000);
            
            
           
            Utility.waitForElementClickable(cancelbuuton,driver);
          
            cancelbuuton.click();
       
            Log.addMessage("Verification code entered");
        }catch(Exception e) {
            e.printStackTrace();
            Log.addMessage("Fail to enter Verification code");
            Assert.assertTrue(false, "Failed to enter Verification code");
        }
    }
    
    
    

    
}
