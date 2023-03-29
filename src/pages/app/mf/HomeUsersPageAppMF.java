package pages.app.mf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class HomeUsersPageAppMF extends Settings {

	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
//		@AndroidBy(id = "com.kwikset.blewifi.dev:id/subtitle"),
//		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
//		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/headerView")
	})
	@CacheLookup
	private MobileElement screenTitle;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.view.ViewGroup[2]"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement guestuser;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonCreateUser"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement createUser;
	
	

	
	
	
	
	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
//		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonCreateUser"),
//		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
//		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/detailImage")
	})
	@CacheLookup
	private MobileElement viewUserProfile;
	
//	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
//	@AndroidFindAll({
////		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonCreateUser"),
////		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
////		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
//		@AndroidBy(id = "com.kwikset.multifamily.dev:id/detailImage")
//	})
//	@CacheLookup
//	private MobileElement user_management;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/view_left"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement navback;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/backButton"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private List<MobileElement> homeUserslist;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_right"),
	})
	@CacheLookup
	private MobileElement Settingsicon;
	
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/tv_no_result_title"),
	})
	@CacheLookup
	private MobileElement Nodatamessage;
	
	
	@CacheLookup
	private MobileElement clickonaddgroup;
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textGroupName\"]"),
		})


	@CacheLookup
	private MobileElement usergroup;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleAssignGroup"),
	})
	@CacheLookup
	private MobileElement Groppagetitle;
	
	
	////user management elements

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
	
		@AndroidBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		
	})
	@CacheLookup
	private MobileElement addfirstname;
	

	
	@AndroidFindAll({
	
		@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		
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
			
			
	///sie name
			@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Floor Management']")
			@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/textSmall"),
			})
			@CacheLookup
			private MobileElement verifysitedropdown;
			
			
			
///search box
			
			@AndroidFindAll({
				
				@AndroidBy(id= "com.kwikset.multifamily.dev:id/search_src_text"),
				
			})
			@CacheLookup
			private MobileElement searchbox;
			
			///filter button on user tab user list page
			
			@AndroidFindAll({
				
				@AndroidBy(id= "com.kwikset.multifamily.dev:id/imageFilter"),
				
			})
			@CacheLookup
			private MobileElement filterButton;
			
///SEE RESULT BUTTON ON FILTER OPTION
		
	
			
			@AndroidFindAll({
				
				@AndroidBy(id= "com.kwikset.multifamily.dev:id/btn_see_results"),
				
			})
			@CacheLookup
			private MobileElement Filterresultbtn;
	
	@SuppressWarnings("static-access")
	public HomeUsersPageAppMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
//	public void clickOnUserManagement() {
//		try {
//			Utility.waitForElementToBeVisible(user_management);
//			user_management.click();
//			Log.addMessage("Clicked on User Management icon on HomePage");
//		} catch(Exception e) {
//			e.printStackTrace();
//			Log.addMessage("Failed to click on User Management icon on HomePage");
//			Assert.assertTrue(false, "Failed to click on User Management icon on HomePage");
//		}
//	}
	
	public void verifyPageTitle() {
		try {
			WebDriverWait wait = new WebDriverWait(appiumDriver, 60);
			
			wait.until(ExpectedConditions.visibilityOf(screenTitle));
			System.out.println("Before "+screenTitle.getText());
			//System.out.println("User is on::"+screenTitle.getText()+" "+"page");
			System.out.println("User is on::"+driver.getTitle()+" "+"page");
			//Assert.assertEquals(screenTitle.getText(), "Users");
			System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(), "Users");

			//Log.addMessage("User is on::"+screenTitle.getText()+" "+"page");
			Log.addMessage("User is on::"+driver.getTitle()+" "+"page");
		} catch(NoSuchElementException e) {
			e.printStackTrace();
			Log.addMessage("Failed to verify screen name");
			Assert.assertTrue(false, "Failed to verify screen name");
		}
	}
	

	
	
	
	public void clickOnUserProfile() {
		try {
			Utility.waitForElementToBeVisible(viewUserProfile);
			viewUserProfile.click();
			Log.addMessage("Clicked on a User profile successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on user profile");
			Assert.assertTrue(false, "Failed to click on user profile");
		}
	}
	
	public void clickOnCreateUser() {
		try {
			Utility.waitForElementToBeVisible(createUser);
			createUser.click();
			Log.addMessage("Clicked on Add Home Users button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click add home users button");
			Assert.assertTrue(false, "Failed to click add home users button");
		}
	}
	
	public void clickOnBackBtn() {
		try {
			Utility.waitForElementToBeVisible(navback);
			navback.click();
			Log.addMessage("Clicked on navigate back button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click navigate back button");
			Assert.assertTrue(false, "Failed to click navigate back button");
		}
	}
	
	public void clickguest() {
		try {
			Utility.waitForElementToBeVisible(guestuser);
			guestuser.click();
			Log.addMessage("Clicked on guest user button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click navigate back button");
			Assert.assertTrue(false, "Failed to click navigate back button");
		}
	}
	
	
	public void clickOnSettingsiconBtn() {
		try {
			Utility.waitForElementToBeVisible(Settingsicon);
			Settingsicon.click();
			Log.addMessage("Clicked on navigate settings button successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click navigate settings button");
			Assert.assertTrue(false, "Failed to click settings button");
		}
	}
	
	
	
	
	
	
	//// user management funtions
	
	
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
			Thread.sleep(5000);
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
	
	

	public void addfirstusername() {
		try {
			Utility.waitForElementToBeVisible(addfirstname);
			addfirstname.click();
			addfirstname.sendKeys("make");
			Log.addMessage("add firstusername successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on firstusername");
			Assert.assertTrue(false, "Failed to click on firstusername");
		}
	}
	

	public void addlastusername() {
		try {
			Utility.waitForElementToBeVisible(addlastname);
			Thread.sleep(3000);
			addlastname.click();
			addlastname.sendKeys("user");
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
	 
	
	
	public void Searchanuser(String user_name) {
		try {
			Utility.waitForElementToBeVisible(searchbox);
			searchbox.click();
			searchbox.sendKeys(user_name);
			searchbox.click();
			Log.addMessage("searched the user successfully");
			//verify search result
			Thread.sleep(3000);
			Utility.waitForElementVisible(Userlist, driver);
		String username=	Userlist.getText();
		   Assert.assertEquals(username, user_name);  
		
			Log.addMessage("verified searched  user result successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  search user");
			Assert.assertTrue(false, "Failed to  search user");
		}
	}

	public void CLearsearchbox() {
		try {
			Utility.waitForElementToBeVisible(searchbox);
			searchbox.click();
		     searchbox.clear();
		
			Log.addMessage(" searched   result cleared successfully");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to  clear search box");
			Assert.assertTrue(false, "Failed to  search user");
		}
	}
	

	public void Clickfilterbutton() {
		try {
			Utility.waitForElementToBeVisible(filterButton);
			filterButton.click();
			
			
			
			Log.addMessage("Click filter button");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on filter Button");
			Assert.assertTrue(false, "Failed to click on filter Button functionality");
		}
	}
	
	
	public void Verifyfilterbutton() {
		try {
			Utility.waitForElementToBeVisible(filterButton);
			filterButton.click();
			
			Utility.waitForElementToBeVisible(Filterresultbtn);
			Filterresultbtn.click();
			
			Log.addMessage("Veified  filter UI on user tab");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on filter Button");
			Assert.assertTrue(false, "Failed to click on filter Button functionality");
		}
	}
	
	
	public void selectanuser(String user)  {	
		try {
		

			MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text=\""+user+"\"]"));
           System.out.println(element);
           Thread.sleep(2000);
           Utility.waitForElementToBeVisible(element);
			element.click();
			  
		
			
		
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to uploaded a photo");
			Assert.assertTrue(false, "Failed to uploaded a photo");
		}
	}
		

	
	
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
				
	public void VerifyUsergroupIsDisplayedInUsersGroupList() {
		try {
			
			
			Utility.waitForElementToBeVisible(Groppagetitle);
			Groppagetitle.click();
			
			if(usergroup.isDisplayed())
			{
				
	
			Log.addMessage("user groups displayed");
			}
			else
			{
				Log.addMessage("No user groups displayed");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click navigate back button");
			Assert.assertTrue(false, "Failed to click navigate back button");
		}
	}
	
	
	public void verifyUserIsDisplayedInHomeUsersList(String newUser) {
		try {
			String users="";
			WebDriverWait wait = new WebDriverWait(appiumDriver, 60);
				for (int i = 1; i <= homeUserslist.size(); i++) {
				 wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//android.view.ViewGroup[" + i +"]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]"))));
				 users = driver.findElement(By.xpath("//android.view.ViewGroup[" + i +"]/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")).getText();
				 System.out.println("List of Home Users::" + users);			
				if(users.equalsIgnoreCase(newUser)) {
					 System.out.println("List of Home Users::" + users);
					Log.addMessage("Home User added is list on User list");
					break;
				}
			}
			Log.addMessage("Home user created message displayed successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to display Home user created message");
			Assert.assertTrue(false, "Failed to display Home user created message");
			}
		}
	
	
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
