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

public class UserManagement extends Settings{

	

	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.LinearLayout[3]/android.widget.Button[1]"),
		})
		@CacheLookup
		private MobileElement locationpermission;

	

	
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.multifamily.dev:id/users_nav_graph"),
		@AndroidBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout"),
		
	})
	@CacheLookup
	private MobileElement clickpeoplebutton;
	


	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),
	
		
	})
	@CacheLookup
	private MobileElement clickadduserbutton;
	


	
	@AndroidFindAll({
	
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"First Name\"]"),
		
	})
	@CacheLookup
	private MobileElement addfirstname;
	

	@AndroidFindAll({
	
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/editText"),
		
	})
	@CacheLookup
	private MobileElement addemail;
	
	@AndroidFindAll({
	
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"Last Name\"]"),
		
	})
	@CacheLookup
	private MobileElement addlastname;
	
   

	
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
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.TextView"),
		
	})
	@CacheLookup
	private MobileElement verifypage;
	
	
	//User lift
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/userNameText"),
	
		
	})
	@CacheLookup
	private MobileElement Userlist;
	
	//page title
	
		@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/textViewTitle"),
		
			
		})
		@CacheLookup
		private MobileElement pagetitle;
		
		//add user page validation
		
		@AndroidFindAll({
			@AndroidBy(id = "com.kwikset.multifamily.dev:id/textViewTitle"),
				
			})
			
			
			@CacheLookup
			private MobileElement verifyadduserpage;
			
			//user group title
			
				@AndroidFindAll({
					@AndroidBy(id = "com.kwikset.multifamily.dev:id/titleAssignGroup"),
				
					
				})
			
			@CacheLookup
			private MobileElement verifyusergrouppage;
			
			
		
		//verify search box
		
			@AndroidFindAll({
				@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_plate"),
			
				
			})
			@CacheLookup
			private MobileElement Verifysearchbox;
			//verify search box
			
			@AndroidFindAll({
				@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
			
				
			})
			@CacheLookup
			private MobileElement Verifysearchbox_keywords;
			
			@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
			@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
			})
			@CacheLookup
			private MobileElement navigate_to_user_group;
			
			///filter icon 
			
			
			@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
			@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/cardFilter"),
			})
			@CacheLookup
			private MobileElement filtericon;
			
			
	///site name
			@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
			@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textSmall"),
			})
			@CacheLookup
			private MobileElement verifysitedropdown;
			
			
			



	@SuppressWarnings("static-access")
	public UserManagement(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	
	
	public void clickOnlocation() {
		try {
			Utility.waitForElementToBeVisible(locationpermission);
			locationpermission.click();
			Log.addMessage("Clicked on a location");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to location");
			Assert.assertTrue(false, "Failed to click on location");
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
	

	public void clickOnAdduser() {
		try {
			Utility.waitForElementToBeVisible(clickadduserbutton);
			clickadduserbutton.click();
			Log.addMessage("Clicked on a AddUser");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on AddUser");
			Assert.assertTrue(false, "Failed to click on AddUserF");
		}
	}
	
	public void AdduserEnteremail() {
		try {
			Utility.waitForElementToBeVisible(addemail);
			addemail.click();
			addemail.sendKeys("arun21@yopmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("com.kwikset.multifamily.dev:id/submitButton")).click();
			Log.addMessage("add firstusername successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on firstusername");
			Assert.assertTrue(false, "Failed to click on firstusername");
		}
	}

	public void addfirstusername() {
		try {

			//Enter first name
			Utility.waitForElementToBeVisible(addfirstname);
			addfirstname.click();
			addfirstname.clear();
			addfirstname.sendKeys("Test Auto user");
			
			addfirstname.click();
		Log.addMessage("add firstusername successfully");

			Log.addMessage("add firstusername successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on firstusername");
			Assert.assertTrue(false, "Failed to click on firstusername");
		}
	}
	

	public void addlastusername() {
		try {
			///Enter last name
			Utility.waitForElementToBeVisible(addlastname);
			Thread.sleep(3000);
			addlastname.click();
			addlastname.clear();
			addlastname.sendKeys("End user");
			Log.addMessage("add lastname successfully");
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on lastname");
			Assert.assertTrue(false, "Failed to click on lastname");
		}
	}
	

	public void selectpropertymanager() {
		try {
			Utility.waitForElementToBeVisible(clickuserproperty);
			clickuserproperty.click();
			Log.addMessage("Clicked on a propertymanager");
	} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on propertymanager");
			Assert.assertTrue(false, "Failed to click on propertymanager");
		}	}
	


	public void selectusertypeinstaller() {
		try {
			Utility.waitForElementToBeVisible( clickinstaller);
			 clickinstaller.click();
			Log.addMessage("Clicked on a installer");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on installer");
			Assert.assertTrue(false, "Failed to click on installer");
		}
	}

	

	public void selecttypeuser() {
		try {
			Utility.waitForElementToBeVisible( clickuser);
			clickuser.click();
			Log.addMessage("Clicked on a User");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on user");
			Assert.assertTrue(false, "Failed to click on user ");
		}
	}
	
	

	
	public void clickcontinue() {
		try {
			Utility.waitForElementToBeVisible(clickcontinuebutton);
			clickcontinuebutton.click();
			Log.addMessage("Clicked on a clickcontinue");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on clickcontinue");
			Assert.assertTrue(false, "Failed to click on clickcontinue");
		}
	}
	 

	

		
//	
//	public void verifypage() {
//        try {
//            Utility.waitForElementVisible(verifypage, driver);
//            String Assign = verifypage.getText();
//            Assert.assertEquals("family",  Assign);    
//            Log.addMessage("Verify the verifypage");
//        }catch(Exception e) {
//            Log.addMessage("Failed to  verifypage ");
//            System.out.println(e.getMessage().toString());
//            Assert.assertTrue(false, "Failed to family");
//        }
//    }
//	
	
	public void verifypage() {
        try {
            Utility.waitForElementVisible(verifypage, driver);
            String access = verifypage.getText();
            Assert.assertEquals("family", access);    
            Log.addMessage("Verify the List of View All sites successfully");
        }catch(Exception e) {
            Log.addMessage("Failed to Verify ViewAll Sites");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Failed to Verify ViewAll Sites");
        }
    }
	
	
	public void Verifyusertab_details() {
        try {
        	
        	
        	////site name
        	
        	
			Utility.waitForElementVisible(verifysitedropdown, driver);
			
			
			
			Log.addMessage(" Site name validated clicked");
	
        	
        	///verify the user list displayed
            Utility.waitForElementVisible(Userlist, driver);
            Log.addMessage("Verify the List of users successfully");
            ///User tab heading  verification
            
            Utility.waitForElementVisible(pagetitle, driver);
            
        	String title = pagetitle.getText();
        	Assert.assertEquals(title,"Users");
            Log.addMessage("Verify the page title  users successfully");
            
            
            ///search box verification
            Utility.waitForElementVisible(Verifysearchbox, driver);
            Log.addMessage("Verify the search box  users successfully");
     
               ///search box keywords
               
               Utility.waitForElementVisible(Verifysearchbox_keywords, driver);
           String keywords = Verifysearchbox_keywords.getText();
              	Assert.assertEquals(keywords,"Search for keywords");
                  Log.addMessage("Verify the search  box   keywords text  successfully");
            
         ////filter icon
                  Utility.waitForElementVisible(filtericon, driver); 
                  Log.addMessage("Verify the filter icon successfully");
                  
                  
                  
        }catch(Exception e) {
            Log.addMessage("Failed to Verify ViewAll Sites");
            System.out.println(e.getMessage().toString());
            Assert.assertTrue(false, "Failed to Verify ViewAll Sites");
        }
    }
	
	public void VerifySettingsicon_NavigatetoUserGrouppage() {
		try {
			Utility.waitForElementToBeVisible(navigate_to_user_group);
			navigate_to_user_group.click();
			
			Thread.sleep(3000);
			
            Utility.waitForElementVisible(verifyusergrouppage, driver);
            
        	String title = verifyusergrouppage.getText();
        	Assert.assertEquals(title,"Groups");
        	
        	//Back to user list view
        	Thread.sleep(3000);
        	driver.findElement(By.id("com.kwikset.multifamily.dev:id/view_left")).click();
            Log.addMessage("Verify the settings  icon successfully");
            
			
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  verify settings button");
			Assert.assertTrue(false, "Failed to  verify settings button\"");
		}
	}
	
	
	
	public void VerifyAddusericon() {
		try {
			Utility.waitForElementToBeVisible(clickadduserbutton);
			clickadduserbutton.click();
			Thread.sleep(3000);
            ///ADD USER PAGE VALIDATION
			  Utility.waitForElementVisible(verifyadduserpage, driver);
            String title = verifyadduserpage.getText();
        	Assert.assertEquals(title,"Add User");
            Log.addMessage("Verify the Add User Icon  successfully");
            
			
      
        	
        	//Back to user list view
        	Thread.sleep(3000);
        	driver.findElement(By.id("com.kwikset.multifamily.dev:id/view_left")).click();
            Log.addMessage("Verify the add user   icon successfully");
            
			
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  verify add user button");
			Assert.assertTrue(false, "Failed to  verify add user button");
		}
	}

	}


