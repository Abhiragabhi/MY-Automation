package pages.app.mf;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.Settings;
import groovy.time.Duration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.Log;
import utility.Utility;
import utility.Utility.Direction;

public class LockDashboardAppMF extends Settings{
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"ic_plus_circle\"]")
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.blewifi.dev:id/tv_lock_status"),//commented for fp lock on 16-06-2020
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/view_right"),//added on 16-06-2020
		@AndroidBy(id = "com.kwikset.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement addMenuButton;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.blewifi.dev:id/tv_lock_status"),//commented for fp lock on 16-06-2020
		@AndroidBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.TextView"),//added on 16-06-2020
		@AndroidBy(id = "com.kwikset.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement addHomeOption;
	
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Add Lock\"])[2]")
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.blewifi.dev:id/tv_lock_status"),//commented for fp lock on 16-06-2020
		@AndroidBy(id = "//androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.TextView"),//added on 16-06-2020
		@AndroidBy(id = "com.kwikset.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement addLockOption;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.blewifi.dev:id/tv_lock_status"),//commented for fp lock on 16-06-2020
		@AndroidBy(xpath = "//androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.TextView"),
		//added on 16-06-2020
		//@AndroidBy(xpath = "android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.TextView"),
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/homeTitleText"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement mainHomedropdown;
	
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/navigation_settings"),
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/settingImage"),
		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/tv_lock_status")
	})
	@CacheLookup
	private MobileElement manageHomeIcon;
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	
	})
	@CacheLookup
	private MobileElement hamburgerMenu;
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/logoutButton"),
	})
	@CacheLookup
	private MobileElement logOutBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.blewifi.dev:id/appVersionText"),
		@AndroidBy (xpath = "//android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.TextView"),
	})
	@CacheLookup
	private MobileElement appdetails;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/yesButton"),
	})
	@CacheLookup
	private MobileElement yesBtn;
	
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Skip Installation Guide\"]")
	@AndroidFindAll({
		@AndroidBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout")
	})
	@CacheLookup
	private MobileElement lockSelect;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.TextView[3]"),
	})
	@CacheLookup
	private MobileElement pgTitle;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView[2]"),
	})
	@CacheLookup
	private MobileElement accountSettings;
	

	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView")
	@CacheLookup		
	private List<MobileElement> homeList;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/lockStatusText"),
	})
	@CacheLookup
	private MobileElement lockStatus;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton[3]")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/navigation_history"),
	})
	@CacheLookup
	private MobileElement lockHistorty;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"),
	@AndroidBy (xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
	
	})
	@CacheLookup
	private MobileElement lockname;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/negativeButton"),
	})
	@CacheLookup
	private MobileElement notNowBtn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/positiveButton"),
	})
	@CacheLookup
	private MobileElement continueBtn;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/settingsIcon"),
	})
	@CacheLookup
	private MobileElement lockSettings;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic_lock_user_access\"]")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/navigation_people"),
	})
	@CacheLookup
	private MobileElement peopleButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD A LOCK\"]")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/addLockButton"),
	})
	@CacheLookup
	private MobileElement addLockButton;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton[3]")
	@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.blewifi.dev:id/settingsIcon"),
	})
	@CacheLookup
	private MobileElement lsettings;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='base_circle']//preceding::XCUIElementTypeButton[1]")
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.blewifi.dev:id/lockStatusText"),
		@AndroidBy(id = "com.kwikset.blewifi:id/imgLock"),
		@AndroidBy(id = "com.spectrum.giga:id/imgLock"),
		@AndroidBy(id = "com.weiser.blewifi:id/imgLock"),
		@AndroidBy(id = "com.weiser.blewifi.dev:id/imgLock")
	})
	@CacheLookup
	private MobileElement lockUnlockButton;
	
	
	@AndroidFindAll({
	@AndroidBy (xpath ="//android.widget.TextView[@resource-id='com.kwikset.blewifi.dev:id/loggedInLabel']"),
	})
	@CacheLookup
	private MobileElement menuLoggedInAsText;
	
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.TextView[@resource-id='com.kwikset.blewifi.dev:id/userNameText']"),
		})
		@CacheLookup
		private MobileElement menuLoggedInUSernameText;
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.LinearLayout/android.widget.TextView[1]"),
		})
		@CacheLookup
		private MobileElement menuDashboardButton;
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.LinearLayout/android.widget.TextView[3]"),
		})
		@CacheLookup
		private MobileElement menuWorkswithButton;
	
	@AndroidFindAll({
		@AndroidBy (xpath ="//android.widget.LinearLayout/android.widget.TextView[4]"),
		})
		@CacheLookup
		private MobileElement menuHelpFaqButton;
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.blewifi.dev:id/appVersionText"),
		})
		@CacheLookup
		private MobileElement menuAppVersionText;
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.blewifi.dev:id/logoutButton"),
		})
		@CacheLookup
		private MobileElement menuLogoutButton;
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/closeButton"),
		})
		@CacheLookup
		private MobileElement menuCloseIcon;
	
	//@iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"This home does not have any locks.\"]")
	@AndroidFindAll({
//		@AndroidBy(id = "com.kwikset.blewifi.dev:id/buttonCreateUser"),
//		@AndroidBy(id = "com.spectrum.giga:id/tv_lock_status"),
//		@AndroidBy(id = "com.weiser.blewifi:id/tv_lock_status"),
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.ImageView")
	})
	@CacheLookup
	private MobileElement user_management;
	
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/image_drop_down"),
		})
		@CacheLookup
		private MobileElement site_management_dropdown;
	@AndroidFindAll({
		@AndroidBy (id ="com.kwikset.multifamily.dev:id/textSiteName"),
		})
		@CacheLookup
		private MobileElement preferred_site_management_option;
	
	@AndroidFindAll({
		@AndroidBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
		})
		@CacheLookup
		private MobileElement building_icon;
	
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
	})
	@CacheLookup
	private MobileElement locationclick;
	
	
	
	
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.TextView[@text=\"Add Lock\"]"),
	})
	@CacheLookup
	private MobileElement addlockbutton;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/skipInstallationGuide"),
	})
	@CacheLookup
	private MobileElement skipplocklink;
	

	@AndroidFindAll({
		@AndroidBy (id = "com.android.permissioncontroller:id/permission_allow_one_time_button"),
	})
	@CacheLookup
	private MobileElement Scanmediapophandle;
	

	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.TextView[@text=\"Lock Installed\"]"),
	})
	@CacheLookup
	private MobileElement Firstmilestonepage;
	
	
	
	
	@AndroidFindAll({
		@AndroidBy (xpath = "//android.widget.TextView[@text=\"Scan QR Code\"]"),
	})
	@CacheLookup
	private MobileElement scanlockpage;
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/doNotHaveQrCodeButton"),
	})
	@CacheLookup
	private MobileElement enterserialnumberbtn;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/editText"),
	})
	@CacheLookup
	private MobileElement enterserialnumber;
	
	
	
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/editText"),
	})
	@CacheLookup
	private MobileElement enterlockname;
	
	
	

	
	

	@AndroidFindAll({
	
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/imgSuccess"),
		
	})
	@CacheLookup
	private MobileElement Verifysuccesspage;
	      				
	

	@AndroidFindAll({
	
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnSkipLockActivation"),
		
	})
	@CacheLookup
	private MobileElement skiplockactivation;
	      				
	
	@AndroidFindAll({
		
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/nameLockText"),
		
	})

	private MobileElement editlocknametab;
	      				
	
	
	
	@AndroidFindAll({
		
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/continueButton"),
		
	})

	private MobileElement continuebutton;
	      				
	
	
	
	
	@AndroidFindAll({
		
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/viewRemoveLock"),
		
	})
	@CacheLookup
	private MobileElement removelock;
	      				
	
	
	@AndroidFindAll({
		
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/positiveButton"),
		
	})
	@CacheLookup
	private MobileElement yestoremove;
	      				
	
	
	
	
	
	public static final String APP_FILE = "propertyFiles/app.properties";
	Utility util =new Utility();
	SoftAssert softassert = new SoftAssert();
	
	@SuppressWarnings("static-access")
	public LockDashboardAppMF(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	public void clickOnsitedropdown() {
		try {
			Utility.waitForElementToBeVisible(site_management_dropdown);
			site_management_dropdown.click();
			Log.addMessage("Clicked on  site dropdown on HomePage");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on site dropdown on Homepage");
			Assert.assertTrue(false, "Failed to click on site dropdown on Homepage");
		}
	}
	public void chooseSitefromdropdown() {
		try {
			//Utility.waitForElementToBeVisible(site_management_dropdown);
			//site_management_dropdown.click();
			Utility.waitForElementToBeVisible(preferred_site_management_option);
			preferred_site_management_option.click();
			Log.addMessage("Clicked on preferred site from dropdown on HomePage");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on preferred site from dropdown on Homepage");
			Assert.assertTrue(false, "Failed to click on preferred site  from dropdown on Homepage");
		}
	}
	
	public void clickOnBuildingIcon() {
		try {
			Utility.waitForElementToBeVisible(building_icon);
			building_icon.click();
			Log.addMessage("Clicked on Building option on HomePage");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Building option on Homepage");
			Assert.assertTrue(false, "Failed to click on Building option on Homepage");
		}
	}
	
	public void clickOnUserManagement() {
		try {
			Utility.waitForElementToBeVisible(user_management);
			user_management.click();
			Log.addMessage("Clicked on User Management icon on HomePage");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on User Management icon on HomePage");
			Assert.assertTrue(false, "Failed to click on User Management icon on HomePage");
		}
	}
	
	public void clickAddMenuButton() {
		try {
			Utility.waitForElementVisible(addMenuButton, driver);
			addMenuButton.click();
			Log.addMessage("Clicked on add menu button successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click add menu button");
			Assert.assertTrue(false, "Failed to click add menu button");
		}
	}
	
	public void fetchallhomes() throws InterruptedException {
		try {
			 Thread.sleep(3000);
			  String lname = " ";
				if (device.equalsIgnoreCase("iOS")) {
					Utility.waitForElementVisible(pgTitle, driver);
					System.out.println("Size of lock list::"+homeList.size());
					for (int i = 0; i <= homeList.size()-1; i++) {
//						WebDriverWait wait = new WebDriverWait(driver, 30);
//						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")));
						int j = i+1;
						WebElement p=driver.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
					    String aname= p.getText();
						System.out.println("Accesscode Name::" + aname);
						System.out.println("Access code pin::"+ driver.findElement(By.xpath("//XCUIElementTypeTable/XCUIElementTypeCell["+j+"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[4]")).getText());
						System.out.println("--------------------------" );
						Utility.simpleWait(2000);
					}
				} 
				if (device.equals("android")) {
					Utility.waitForElementVisible(pgTitle, driver);
					System.out.println("Total number of homes is "+homeList.size());
					System.out.println("--------------------------" );
					for (int i = 0; i <= homeList.size()-1; i++) {
						WebDriverWait wait = new WebDriverWait(driver, 30);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")));
						int j = i+1;
						WebElement p=driver.findElement(By.xpath("//android.view.ViewGroup["+j+"]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView"));
					    String l_name= p.getText();
						System.out.println("Name of Home no "+j+" is "+ l_name);
						Utility.simpleWait(2000);
					}
				}
		  }catch(NoSuchElementException e) {
			  e.printStackTrace();
			  Log.addMessage("Failed to fetch home names");
			  Assert.assertTrue(false, "Failed to fetch home names");
		  }
	}
	
	public void clickAddHome() {
		try {
			Utility.waitForElementVisible(addHomeOption, driver);
			addHomeOption.click();
			Log.addMessage("Clicked on add Home option successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click add home button");
			Assert.assertTrue(false, "Failed to click add home button");
		}
	}
	
	public void getLockNameFromDashboard() {
		try {
			String firstLock =driver.findElement(By.id("com.kwikset.blewifi.dev:id/lockNameText")).getText();
			System.out.println("First Lock Name::"+firstLock);
			Log.addMessage("First Lock Name::"+firstLock);
//			Utility.swipeScreen(Direction.RIGHT);
//			Thread.sleep(5000);
//			String secondLock = driver.findElement(By.id("com.kwikset.blewifi.dev:id/lockNameText")).getText();
//			System.out.println("Second Lock Name::"+secondLock);
//			Log.addMessage("Second Lock Name::"+secondLock);
//			Utility.swipeScreen(Direction.LEFT);
		}catch(Exception e) {
			Log.addMessage(e.getMessage().toString());
			Log.addMessage("Unable to fetch the lock Name");
			Assert.assertTrue(false, "Unlock Operation failed");
		} 	
	}
	
	public void clickAddLock() {
		try {
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			WebElement element = null;
			if(device.equals("iOS")) {
				element = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Add Lock\"])[2]"));
			}
			else {
				element = driver.findElement(By.id("com.kwikset.blewifi.dev:id/add_lock_option"));
			}
			action.moveToElement(element).click().build().perform();
			Log.addMessage("Clicked on add Lock option successfully");
			if(device.equals("android")) {
				Utility.waitForElementClickable(lockSelect, driver);
				lockSelect.click();
				Log.addMessage("Lock Selected successfully");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click add Lock button");
			Assert.assertTrue(false, "Failed to click add Lock button");
		}
	}
	
	public void clickAddLockfromcard() {
		try {
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			WebElement element = null;
			if(device.equals("iOS")) {
				element = driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Add Lock\"])[2]"));
			}
			else {
				element = driver.findElement(By.id("com.kwikset.blewifi.dev:id/addLockButton"));
			}
			action.moveToElement(element).click().build().perform();
			Log.addMessage("Clicked on add Lock option successfully");
			if(device.equals("android")) {
				Utility.waitForElementClickable(lockSelect, driver);
				
			}
			Log.addMessage("Clicked on add Lock option successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click add Lock button");
			Assert.assertTrue(false, "Failed to click add Lock button");
		}
	}
	
	public void clickOnDropdownMenu() {
		try {
			
			Utility.waitForElementClickable(mainHomedropdown, driver);
			mainHomedropdown.click();
			Log.addMessage("Clicked on dropdown successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click dropdown ");
			Assert.assertTrue(false, "Failed to click dropdown ");
		}
	}
	
	public void getPageMenu() {
		try {
			
		appiumDriver.getPageSource();
		
		//	driver.findElement(By.id("com.kwikset.blewifi.dev:id/homeTitleText")).click();
			Log.addMessage("Clicked on dropdown successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click dropdown ");
			Assert.assertTrue(false, "Failed to click dropdown ");
		}
	}
	
	public void clickOnHomeSettingsIcon() {
		try {
			Utility.waitForElementClickable(manageHomeIcon, driver);
			manageHomeIcon.click();
			Log.addMessage("Clicked on manage Home Icon successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click manage Home Icon ");
			Assert.assertTrue(false, "Failed to click manageHomeIcon ");
		}
	}
	
	public void lockNameVisible() {
		try {
			Utility.waitForElementVisible(lockname, driver);
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click manage Home Icon ");
		}
	}
//	
	public void clickOnHamburgerMenu() {
		try {
			Utility.waitForElementToBeVisible(hamburgerMenu);
			Utility.waitForElementToBeClickable(hamburgerMenu);
			hamburgerMenu.click();
			Log.addMessage("Clicked on hamburger Menu successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click hamburger Menu");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click hamburger Menu");
		}
	}
	
	public void clickOnLogOutBtn() {
		try {
			Utility.waitForElementToBeVisible(logOutBtn);
			Utility.waitForElementToBeClickable(logOutBtn);
			logOutBtn.click();
			Log.addMessage("Clicked on log out btn successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click on log out btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click on log out btn");
		}
	}
		
	public void getappdetails() {
		try {
//			Utility.waitForElementToBeVisible(appdetails);
			String details = appdetails.getText();
			System.out.println(details);
			Properties props = new Properties();
			FileOutputStream fos = new FileOutputStream(APP_FILE);
			props.setProperty("AppDetails", details);
			props.store(fos, "Temporary file for storing the test results");
			System.out.println("App details retrived");
			Log.addMessage("App details retrived");
		}catch(Exception e) {
			Log.addMessage("Failed to click on log out btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click on log out btn");
		}
	}
//	
	public void clickOnLogoutConfirmation() {
		try {
			Utility.waitForElementToBeVisible(yesBtn);
			Utility.waitForElementToBeClickable(yesBtn);
			yesBtn.click();
			Log.addMessage("Clicked on yes btn successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click on yes btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click on yes btn");
		}
	}
//	
	public void clickOnAccountSettings() {
		try {
			Utility.waitForElementToBeVisible(accountSettings);
			Utility.waitForElementToBeClickable(accountSettings);
			accountSettings.click();
			Log.addMessage("Clicked on account Settings successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click on account Settings");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click on account Settings");
		}
	}
	
	
	public void clickOnNotNowBiometricBtn() {
		try {
//			Utility.waitForElementToBeVisible(notNowBtn);
//			Utility.waitForElementToBeClickable(notNowBtn);
			Thread.sleep(2000);
			notNowBtn.click();
			Log.addMessage("Clicked on not now btn successfully");
		}catch(Exception NoSuchElementException) {
			Log.addMessage("Failed to click on not now button");
			//System.out.println(exception.getMessage().toString());
//			Assert.assertTrue(false, "Failed to click on not now button");
		}
	}

	public void clickOnContinueBtnInBiometricPopup() {
		try {
//			Utility.waitForElementToBeVisible(continueBtn);
//			Utility.waitForElementToBeClickable(continueBtn);
			continueBtn.click();
			Log.addMessage("Clicked on Continue btn successfully");
		}catch(Exception NoSuchElementException) {
			Log.addMessage("Failed to click on Continue btn button");
		//	System.out.println(exception.getMessage().toString());
//			Assert.assertTrue(false, "Failed to click on Continue btn button");
		}
	}
	
	public void getLockStatus() {
		try {
			Utility.waitForElementToBeVisible(lockStatus);
			String status= lockStatus.getText();
			System.out.println("Lock is currently::"+status);
			if(status.equalsIgnoreCase("Locked")) {
				lockStatus.click();
				Log.addMessage("Lock is unlocked");
			} else {
				lockStatus.click();
				Log.addMessage("Lock is locked");
			}
			Log.addMessage("Clicked on account Settings successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click on account Settings");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click on account Settings");
		}
	}
	
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
		
		public void verifyTwoStepVerificationIsDisabled() {
			try {
				Utility.waitForElementVisible(hamburgerMenu, driver);
				if(hamburgerMenu.isDisplayed()) {
				Log.addMessage("User is directly navigated to lock dashboard");
				} else {
					Log.addMessage("2 Step Verification is enabled");
				}
			}catch(Exception NoSuchElementException) {
				//e.printStackTrace();
				Log.addMessage("Failed to navigate to lock dashboard");
				Assert.assertTrue(false, "Failed to navigate to lock dashboard");
			}
		}
		
		
		public void lockUnlockTest() {
			try {
				Utility.waitForElementClickable(lockStatus,driver);
				lockStatus.click();
				Thread.sleep(5000);
				Log.addMessage("Unlocking successful");
				Utility.waitForElementClickable(lockStatus,driver);
				lockStatus.click();
				Thread.sleep(5000);
				Log.addMessage("Locking successful");
				Thread.sleep(8000);
			}catch(Exception NoSuchElementException) {
				Log.addMessage("Failed to lock/unlock");
			//	System.out.println(exception.getMessage().toString());
				Assert.assertTrue(false, "Failed to lock/unlock");
			}
		}
		
		public void clickOnHistoryIcon() {
			try {
				Utility.waitForElementToBeVisible(lockHistorty);
				Utility.waitForElementToBeClickable(lockHistorty);
				lockHistorty.click();
				Log.addMessage("Clicked on Lock History successfully");
			}catch(Exception NoSuchElementException) {
				Log.addMessage("Failed to click on Lock History btn button");
			//	System.out.println(exception.getMessage().toString());
//				Assert.assertTrue(false, "Failed to click on Lock History btn button");
			}
		}
		
		public void clickLockSettings() {
			try {
				
				Utility.waitForElementClickable(lockSettings,driver);
				lockSettings.click();
				Log.addMessage("Clicked on Lock Settings button");
			}catch(Exception e) {
				Log.addMessage("Failed to click on Lock Settings button");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click on Lock Settings btn");
			}
		}
		
		public String lock_name() {
			try {
				Utility.waitForElementClickable(lockname,driver);
				String name = lockname.getText();
				return name;
			}catch(Exception e) {
				Log.addMessage(e.getMessage().toString());
				Log.addMessage("Failed to retrieve lock name");
				Assert.assertTrue(false, "Failed to retrieve lock name");
				return null;
			}
		}
		
		public void clickPeopleButton() {
			try {
				
				Utility.waitForElementClickable(peopleButton,driver);
				peopleButton.click();
				Log.addMessage("Clicked on People button");
			}catch(Exception e) {
				Log.addMessage("Failed to click on People button");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click on People btn");
			}
		}
		
		
		public void clickAddLockButton() {
			try {
				
				Utility.waitForElementClickable(addLockButton,driver);
				addLockButton.click();
				Log.addMessage("Clicked on Add Lock button");
			}catch(Exception e) {
				Log.addMessage("Failed to click on Add Lock button");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click on Add Lock btn");
			}
		}
		
		public void clickLockSettingsButton() {
			try {
				
				Utility.waitForElementClickable(lsettings,driver);
				lsettings.click();
				Log.addMessage("Clicked on Lock Settings");
			}catch(Exception e) {
				Log.addMessage("Failed to click on Lock Settings");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click on Lock Settings");
			}
		}	
		
		public String checkLockname(String lockname) {
			String lock_name = "None";
			System.out.println(lockname);
				if(lockname.equals("Biometric Lock(HALO-FP-01:0)-0A.05")) {
					lock_name = "Halo Fingerprint Lock";
				}
				else if(lockname.equals("Wi-Fi Lock(HALO-02:1)-09.01")) {
					lock_name = "Halo Keypad Lock (ST)";
				}
				else if(lockname.equals("Wi-Fi Lock(HALO-02:0)-09.00")) {
					lock_name = "Halo Keypad Lock";
				}
				else if(lockname.equals("Wi-Fi Lock(HALO-01:3)-09.03")) {
					lock_name = "Halo Touchscreen Lock (ST)";
				}
				else if(lockname.equals("LC BLE Lock(AURA-01:0)-08.00")) {
					lock_name = "Aura Lock";
				}
				else if(lockname.equals("Wi-Fi Lock(HALO-01:0)-09.08")) {
					lock_name = "Halo Touchscreen Lock (New Variant)";
				}
				else if(lockname.equals("Wi-Fi Lock(HALO-01:0)-09.04")) {
					lock_name = "Halo Touchscreen Lock (Old Variant)";
				}
				else {
					lock_name = "Lock name not listed";
				}
				return lock_name;
		}	
		
//		public String getLockStatus() {
//			try {
//				Utility.waitForElementClickable(lockStatus,driver);
//				String status = lockStatus.getText();
//				return status;
//			}catch(Exception e) {
//				Log.addMessage(e.getMessage().toString());
//				Log.addMessage("Failed to retrieve lock status");
//				Assert.assertTrue(false, "Failed to retrieve lock status");
//				return null;
//			}
//		}
		
		public void lockUnlockOperation() {
			try {
				lockUnlockButton.click();
				System.out.println("After clicking");
				Log.addMessage("Clicked on the Lock/Unlock button");
			}catch(Exception e) {
				Log.addMessage(e.getMessage().toString());
				Log.addMessage("Unlock Operation failed");
				Assert.assertTrue(false, "Unlock Operation failed");
			} 	
		}
		
		public void verifyHamburgerMenuOption(String username) throws InterruptedException {
           try {
			Utility.waitForElementVisible(menuLoggedInAsText, driver);	
			Utility.waitForElementVisible(menuDashboardButton, driver);
			Utility.waitForElementVisible(accountSettings, driver);
			Utility.waitForElementVisible(menuWorkswithButton, driver);
			Utility.waitForElementVisible(menuHelpFaqButton, driver);
			Utility.waitForElementVisible(menuAppVersionText, driver);
			Utility.waitForElementVisible(menuLogoutButton, driver);
			Utility.waitForElementVisible(menuLoggedInUSernameText, driver);
			Assert.assertEquals(menuLoggedInUSernameText.getText().contains(username), true);
			Log.addMessage("Sucessfully verfied Hamburger menu options");
           } catch (Exception e) {
        	   e.printStackTrace();
				Log.addMessage("Failed in verfiying Hamburger menu options");
				Assert.assertTrue(false, "Failed in verfiying Hamburger menu options");
        	   
           }
			
			
//		    softassert.assertTrue(util.isElementDisplayed(menuLoggedInAsText),"Logged in as -Text not displayed in Menu option");
//		    softassert.assertTrue(util.getText(menuLoggedInUSernameText).contains(username),"Logged in as -Username is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(menuDashboardButton),"Dashboard button is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(accountSettings),"Account settings button is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(menuWorkswithButton),"Works With button is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(menuHelpFaqButton),"Help/FAQ button is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(menuAppVersionText),"APP Version  button is not displayed in Menu option");
//		    softassert.assertTrue(util.isElementDisplayed(menuLogoutButton),"Logout button is not displayed in Menu option");
//		    softassert.assertAll();						
		}
		
		public void homePageNavigation() {
			try {
				Utility.waitForElementVisible(manageHomeIcon, driver);				
				Log.addMessage("Navigated to Home screen successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to navigate to Home screen");
				Assert.assertTrue(false, "Failed to navigate to Home screen");
			}
		}
		
		public void clickMenuCloseIcon() {
			try {
				//Utility.waitForElementVisible(menuCloseIcon, driver);
				Utility.waitForElementToBeVisible(menuCloseIcon);
				Utility.waitForElementToBeClickable(menuCloseIcon);
				menuCloseIcon.click();
				Log.addMessage("Sucessfully clicked the Hamburger Menu close Icon button");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to clicked the Hamburger Menu close Icon button");
				Assert.assertTrue(false, "Failed to clicked the Hamburger Menu close Icon button");
			}
		}
		
		public void verifyMainHomeText() {
			try {
				Utility.waitForElementVisible(mainHomedropdown, driver);
				Assert.assertTrue(mainHomedropdown.getText().contains("Main Home"),"Main Home page is not displayed");
				Log.addMessage("Navigated to Home screen successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to navigate to Home screen");
				Assert.assertTrue(false, "Failed to navigate to Home screen");
			}
			
		}
		
		
		
		public void Addbutton() {
			try {
				Utility.waitForElementVisible(addlockbutton, driver);
				addlockbutton.click();
				Log.addMessage("Clicked add lock button clicked  successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on add lock button");
				Assert.assertTrue(false, "Failed to click on add lock button");
			}
			
		}
				
				
		
		
		
		public void Click_Skip_installation_lockpage() {
			try {
				Utility.waitForElementVisible(skipplocklink, driver);
				skipplocklink.click();
				Log.addMessage("CLicked on Skip installation button successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click  on skip installation button");
				Assert.assertTrue(false, "Failed to click  on skip installation button");
			}
			
		}
		
		
		
		public void Verify_miletonepage_display() {
			try {
				Utility.waitForElementVisible(Firstmilestonepage, driver);
				
				
				Assert.assertTrue(Firstmilestonepage.getText().contains("Lock Installed"),"Mile stone page is  displayed");
				Log.addMessage("Navigated to Home screen successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to navigate  mile stone  screen");
				Assert.assertTrue(false, "Failed to navigate to mile stone screen");
			}
			
		}
		
		public void Verify_View_lock_details_funtionality() {
			try {
				Utility.waitForElementVisible(scanlockpage, driver);
		       String text = scanlockpage.getText();
		       Assert.assertEquals("Scan QR Code", text);
				Log.addMessage("Verified scan QR Code page successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to verify scan QR Code page ");
				Assert.assertTrue(false, "Failed to verify scan QR Code page ");
			}
			
		}
				
		
				
		public void Edit_and_verifylockname(String name) {
			try {
				Utility.waitForElementVisible(editlocknametab, driver);
				editlocknametab.click();
				Thread.sleep(3000);
				
				Utility.waitForElementToBeVisible(enterlockname);
				Utility.waitForElementToBeClickable(enterlockname);
				enterlockname.click();
				enterlockname.clear();
				enterlockname.sendKeys(name);
				continuebutton.click();
				Thread.sleep(5000);
				
				Utility.waitForElementVisible(editlocknametab, driver);
				String text= editlocknametab.getText();
				 Assert.assertEquals(name, text);
				Log.addMessage("Updated lock name successfully");
			}catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to update lock name");
				Assert.assertTrue(false, "Failed to update lock name");
			}
			
		}
		
		
		
		

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

		public void Scanmediapopuphandle() {
			try {
				Utility.waitForElementToBeVisible(Scanmediapophandle);
				Utility.waitForElementToBeClickable(Scanmediapophandle);
				Scanmediapophandle.click();
				Log.addMessage("Clicked media access successfully");
			}catch(Exception e) {
				Log.addMessage("Failed to click media access popup");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click media access popup");
			}
		}
		
		public void Enterlockserialnumber(String number) {
			try {
				Utility.waitForElementToBeVisible(enterserialnumberbtn);
				Utility.waitForElementToBeClickable(enterserialnumberbtn);
				enterserialnumberbtn.click();
		

				
				Utility.waitForElementToBeVisible(enterserialnumber);
				Utility.waitForElementToBeClickable(enterserialnumber);
				enterserialnumber.click();
				enterserialnumber.clear();
				enterserialnumber.sendKeys(number);
				
				Log.addMessage("Lock serail number entered successfully");
			}catch(Exception e) {
				Log.addMessage("Lock serail number input failed");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Lock serail number input failed");
			}
		}
		
		public void Enterlockname(String name) {
			try {
				Utility.waitForElementToBeVisible(enterlockname);
				Utility.waitForElementToBeClickable(enterlockname);
				enterlockname.click();
				enterlockname.clear();
				enterlockname.sendKeys(name);
				
	
				
				Log.addMessage("Lock name entered successfully");
			}catch(Exception e) {
				Log.addMessage("Lock  name input failed");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Lock name input failed");
			}
		}
		
		
		public void Addlocksuccess_validation() {
			try {
				Utility.waitForElementToBeVisible(Verifysuccesspage);
			
		
	
				
				Log.addMessage("Add lock  successfully");
			}catch(Exception e) {
				Log.addMessage("failed to add lock");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Lock name input failed");
			}
		}
		
		
		
		public void Skiplockactivation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(skiplockactivation);
				skiplockactivation.click();
		
	
				
				Log.addMessage("Clicked on skip lock activation button");
			}catch(Exception e) {
				Log.addMessage("Click on skip lock activation button failed");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "failed to click on skip lock activation");
			}
		}
		
		
		public void verifylock() {
			try {
				Utility.waitForElementToBeVisible(Verifysuccesspage);
			
		
	
				
				Log.addMessage("Add lock  successfully");
			}catch(Exception e) {
				Log.addMessage("failed to add lock");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Lock name input failed");
			}
		}
		
		
		
		
		public void Deletelock() {
			try {
				Utility.simpleWait(3000);
				  Utility.swipeScreen(Direction.UP);
				  Utility.swipeScreen(Direction.UP);
				Utility.waitForElementToBeVisible(removelock);
				removelock.click();
				yestoremove.click();
				Utility.simpleWait(3000);
		
	
				
				Log.addMessage("Lock removed successfully");
			}catch(Exception e) {
				Log.addMessage("failed to remove lock");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to remove lock");
			}
		}
		
		

}
