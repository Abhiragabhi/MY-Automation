package pages.app.mf;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class AccesspointManagment_methods extends Settings{

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleText"),
	})
	@CacheLookup
	private MobileElement pageTitle;


	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/positiveButton"),
	})
	@CacheLookup
	private MobileElement confirmdelete;



	@AndroidFindAll({
		
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"Last Name\"]"),
		
	})
	@CacheLookup
	private MobileElement addlastname;
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/search_src_text"),
	
	
	})
	@CacheLookup
	private MobileElement searchbox;
	

	




	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/textRemove"),
	})
	@CacheLookup
	private MobileElement deleteunit;

	@AndroidFindAll({
		@AndroidBy (id = "//android.widget.EditText[@text=\"Mobile\"]"),
	})
	@CacheLookup
	private MobileElement Entermobilenumber;


	@AndroidFindAll({
		@AndroidBy (xpath = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement shareaccessdonebutton;




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
	private MobileElement togglesites;



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ImageView"),
	})
	@CacheLookup
	private MobileElement locationclick;

//	//Click the building Button
//
//
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//*[@text='Building Ganesh']"),
	})
	@CacheLookup
	private MobileElement clickbuilding;


//
	// Verify Unit List View



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/textFloorName"),
	})
	@CacheLookup
	private MobileElement verifyunitlist;
	
	

	// Unit Management-View details of unit(Click Unit)



	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
	@AndroidFindAll({
		@AndroidBy (xpath = "//*[@text='TE01']"),
	})
	@CacheLookup
	private MobileElement clickunit;

	
	// Unit Management- Verify View details of unit()



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]"),
		})
		@CacheLookup
		private MobileElement verifyUnit;



		@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Log In']")
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Activity\"]/android.widget.TextView"),
		})
			
		@CacheLookup
		private MobileElement AllActivity;

	


		
		@AndroidFindAll({
			@AndroidBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Details\"]/android.widget.TextView"),
		})
			
		@CacheLookup
		private MobileElement Detailstab;

	

		@AndroidFindAll({
			@AndroidBy (xpath ="//android.widget.TextView[@text=\"Add User\"]"),
		})
		@CacheLookup
		private MobileElement clickonAddUser;
	

		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buildings_nav_graph"),
		})
		@CacheLookup
		private MobileElement clickonviewbuilding;
		
		

		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"),
		})
		@CacheLookup
		private MobileElement clickonbuilding;
		

		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]"),
		})
		@CacheLookup
		private MobileElement clickonviewAccesspoint;

		
		

		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup"),
		})
		@CacheLookup
		private MobileElement scrollpagetoClick;
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/layoutAddUser"),
		})
		@CacheLookup
		private MobileElement clickonadduser;
		
		
	  
		
		
		@AndroidFindAll({
			@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
		})
		@CacheLookup
		private MobileElement Adduserdonebutton;
		
		
	  
		
		
		

		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		})
		@CacheLookup
		private MobileElement clickonaddfname;
		
		
		
		
		
		

		@AndroidFindAll({
			@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		})
		@CacheLookup
		private MobileElement clickonaddSname;
		
		
		
		
		
		
		

	        	@AndroidFindAll({
					@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup"),
				})
				@CacheLookup
				private MobileElement clickonuser;
				

	        	
	        	
	        	
	        	
	        	@AndroidFindAll({
	        		@AndroidBy (xpath = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"),
	        	})
	        	@CacheLookup
	        	private MobileElement clickoncontinue;
			  
	        	
	        	
	        	
	        	@AndroidFindAll({
					@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
				})
				@CacheLookup
				private MobileElement clickongroup;

	        	
	        		

	        	@AndroidFindAll({
	        		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	        	})
	        	@CacheLookup
	        	private MobileElement clickoncontinuegrp;
	        	
	        	
	        	
	        	@AndroidFindAll({
	        		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	        	})
	        	@CacheLookup
	        	private MobileElement clickoncontinueaccess;
	        	
	        	
	        	
	        	
	        	
	        	
	        	

	        	@AndroidFindAll({
	        		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	        		})
	        		@CacheLookup
	        		private MobileElement clickmail;



	        	@AndroidFindAll({
	        		@AndroidBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	        	})
	        		@CacheLookup
	        		private MobileElement clickmobileno;


	        	

	        	@AndroidFindAll({
	        	    @AndroidBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	        	})
	        	@CacheLookup
	        	private MobileElement shareaccessscontinue;
	        	

	        	

	        	@AndroidFindAll({
	        	    @AndroidBy(id="com.kwikset.multifamily.dev:id/buttonDone")
	        	})
	        	@CacheLookup
	        	private MobileElement shareaccesssdone;
		
	        	
		
	        	@AndroidFindAll({
	        	    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        	})
	        	@CacheLookup
	        	private MobileElement BackNavigation;
		
	        	
	        	
	        	
	        	@AndroidFindAll({
	        	    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        	})
	        	@CacheLookup
	        	private MobileElement BackNavigationaccess;
	        	
	        	
	        	
	        	@AndroidFindAll({
	        	    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        	})
	        	@CacheLookup
	        	private MobileElement BackNavigationbuilding;
	        	
	        	
	        	@AndroidFindAll({
	        		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]"),
	        		})
	        		@CacheLookup
	        		private MobileElement locationpermission;

	        	
	        	@AndroidFindAll({
	        		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"),
	        	})
	        	@CacheLookup
	        	private MobileElement clickonselectbuilding;
	        	

	        	
	        	
	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[2]"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonunits;
	        	

	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonAddUserfFname;
	        		   
	        			
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	        			})
	        			@CacheLookup
	        			private MobileElement AddUserSname;
	        		
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.TextView"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonusertoadd;
	        			
	        			
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/button_continue"),
	        			})
	        			@CacheLookup
	        			private MobileElement ClickOnContinuebtn ;
	        		
	        			
	       
	        		
	        			
	        			@AndroidFindAll({
	        			    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        			})
	        			@CacheLookup
	        			private MobileElement clickonbackbtn;
	        	
	        			
	        			
	        			
	        			@AndroidFindAll({
	        			    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        			})
	        			@CacheLookup
	        			private MobileElement clickonbacknavigationbtn;
	        			
	        			
	        			@AndroidFindAll({
	        			    @AndroidBy(id="com.kwikset.multifamily.dev:id/view_left")
	        			})
	        			@CacheLookup
	        			private MobileElement backnavigationbtn;
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath="(//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textFloor\"])[1]"),
	        			})
	        	
	        		
	        			@CacheLookup
	        			private MobileElement selectfirstfloor;
	        			
	        			
	     
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath="//android.widget.LinearLayout[@resource-id=\"com.kwikset.multifamily.dev:id/editUnit\"]//android.view.ViewGroup//android.widget.EditText"),
	        			})
	        	
	        		
	        			@CacheLookup
	        			private MobileElement editunit;
	        			
	        			
	     
	        			
	        			
	        			  
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	        			})
	        	
	        		
	        			@CacheLookup
	        			private MobileElement editunitnumber;
	        			
	        			
	     
	        			
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
	        				@AndroidBy(xpath = "(//android.widget.TextView[@resource-id=\"com.kwikset.multifamily.dev:id/textUnitName\"])[1]"),
	        			
	        				
	        			})
	        			@CacheLookup
	        			private MobileElement Clickfirstunit;
	        			
	        			
	        			 			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/layoutViewAllUsers"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonviewAlluser;
	        			
	        			
	        		
	        			
	        			

	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/deleteText"),
	        			})

	        			@CacheLookup
	        			private MobileElement clickonRemoveuser;
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/positiveButton"),
	        			})

	        			@CacheLookup
	        			private MobileElement clickonRemoveuseryes;
	        			
	        					


	        		

	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonviewUsers;
	        			
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup"),
	        			})
	        			@CacheLookup
	        			private MobileElement clickonuserToviewAccess;
	        			
	        			
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/accessGroup"),
	        			})
	        			@CacheLookup
	        			private MobileElement SelectAccess;
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	        			})
	        			@CacheLookup
	        			private MobileElement backnavigation;
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	        			})
	        			@CacheLookup
	        			private MobileElement homebacknavigation;
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	        			})
	        			@CacheLookup
	        			private MobileElement userbacknavigation;
	        			
	        			
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	        			})
	        			@CacheLookup
	        			private MobileElement buildingbacknavigation;
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	        			})
	        			@CacheLookup
	        			private MobileElement mainbuildingnavigation;
	        	
	        			
	        			
	        			
	        			
	        			
	        			
	        		
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"),
	        				})
	        				@CacheLookup
	        				private MobileElement clickonaccesspoint;
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleDevice"),
	        				})
	        				@CacheLookup
	        				private MobileElement verifyaccesspage;
	        			
	        			
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/accessPointPhoto"),
	        				})
	        				@CacheLookup
	        				private MobileElement Accesspoint_photo;
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/accessPointGroupTitleText"),
	        				})
	        				@CacheLookup
	        				private MobileElement Accesspoint_tab;
	        			
	        			
	        			        	
	
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/groupValueText"),
	        				})
	        				@CacheLookup
	        				private MobileElement Accesspoint_group_tab;
	        			
	        			
	        			        	
	       	
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/editText"),
	        				})
	        				@CacheLookup
	        				private MobileElement Edit_Accesspoint_name;
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/btnSave"),
	        				})
	        				@CacheLookup
	        				private MobileElement Savebutton;
	        			
	        			
	        			@AndroidFindAll({
	        				@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
	        				})
	        				@CacheLookup
	        				private MobileElement EditAccesspoint_count;
	        			

	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/deleteText"),
	        				})
	        				@CacheLookup
	        				private MobileElement deleteuser;
	        			        	
	        			 	  			        	
	        			@AndroidFindAll({
	        				@AndroidBy (id = "com.kwikset.multifamily.dev:id/positiveButton"),
	        				})
	        				@CacheLookup
	        				private MobileElement confirmbutton;
	        			        	
	  			        	
			@AndroidFindAll({
				@AndroidBy (id = "com.kwikset.multifamily.dev:id/deviceTypeGroup"),
				})
				@CacheLookup
				private MobileElement Ap_group;
			        				 	  			        	
        	
@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/textViewTitle"),
	})
	@CacheLookup
	private MobileElement pagetitle;
        				 	  			        	
			        	
			
			
				        	
	        			
	        			
	       	
	        		
	//Constructor
	@SuppressWarnings("static-access")
	public AccesspointManagment_methods(AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}


	

	public void Verifyaccesspointsettings() {
		try {
			
			//title name
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(Accesspoint_photo);
		
			//access point tab displaed verification
		Utility.waitForElementToBeVisible(Accesspoint_tab);
		
			///Access point group tab displayed
			Utility.waitForElementToBeVisible(Accesspoint_group_tab);
	
			
	
			Log.addMessage("Access point settings tab displayed");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Access point settings tab verification failed");
			Assert.assertTrue(false, "FAccess point settings tab verification failed");
		}
	}
	
	
	public void Edit_Accesspoint_name(String name) {
		try {
			
			//title name
	        Thread.sleep(3000);
		
		
			//access point tab displaed verification
		Utility.waitForElementToBeVisible(Accesspoint_tab);
		Accesspoint_tab.click();
		
		Utility.waitForElementToBeVisible(Edit_Accesspoint_name);
		Edit_Accesspoint_name.click();
		Edit_Accesspoint_name.clear();
		Edit_Accesspoint_name.sendKeys(name);
		Utility.waitForElementToBeVisible(Savebutton);
		Savebutton.click();
			
			Log.addMessage("Clicked on access point");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on access point");
			Assert.assertTrue(false, "Failed to click on access point");
		}
	}
	
	
	public void VerifyupdatedAPname(String name) {
		try {
			
			//title name
	        Thread.sleep(3000);
		
		
			//access point tab displaed verification
		Utility.waitForElementToBeVisible(pagetitle);
		String title = pagetitle.getText();
		Assert.assertEquals(title, name);
		
		
			Log.addMessage(" access point name updated");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to update the access point name");
			Assert.assertTrue(false, "Failed to update the access point name");
		}
	}
	
	

	public void clickaccesspoint() {
		try {
	        Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonaccesspoint);
			clickonaccesspoint.click();
			Log.addMessage("Clicked on access point");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on access point");
			Assert.assertTrue(false, "Failed to click on access point");
		}
	}
	
	
	
	
	public void verifyaccessspoint() {
		try {
			Utility.waitForElementVisible(verifyaccesspage, driver);
			String building =verifyaccesspage.getText();
			Assert.assertEquals("Appareil", building);
			Log.addMessage("access point page verify successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to access point page verify");
			Assert.assertTrue(false, "Failed to verify access point page ");
		}
	}
	
	
	
	
	 

		public void clicktoviewUsers() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonviewUsers);
				clickonviewUsers.click();			
				Log.addMessage("Clicked on a view user");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on view user");
				Assert.assertTrue(false, "Failed to click on view user");
			}
		}
	
		
		

		public void ClickonuserToviewAccess() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonuserToviewAccess);
				clickonuserToviewAccess.click();
				Log.addMessage("Clicked on a view user access");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on view user access");
				Assert.assertTrue(false, "Failed to click on view user access");
			}
		}
	
			
		


		public void viewAccess() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(SelectAccess);
				SelectAccess.click();
				Log.addMessage("Clicked on a view Access");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on view Access");
				Assert.assertTrue(false, "Failed to click on view Access");
			}
		}
	
		
		public void BackNavigation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(backnavigation);
				backnavigation.click();
				Log.addMessage("Clicked on a back navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on back navigation");
				Assert.assertTrue(false, "Failed to click on back navigation");
			}
		}

		
		public void HomeBackNavigation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(homebacknavigation);
				homebacknavigation.click();
				Log.addMessage("Clicked on a Home back navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Home back navigation");
				Assert.assertTrue(false, "Failed to click on Home back navigation");
			}
		}
		
		
		
		
		
		
		
		public void UserBackNavigation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(userbacknavigation);
				userbacknavigation.click();
				Log.addMessage("Clicked on a Home back navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Home back navigation");
				Assert.assertTrue(false, "Failed to click on Home back navigation");
			}
		}
		
		
		

		
		
		
		public void BuildingBackNavigation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(buildingbacknavigation);
				buildingbacknavigation.click();
				Log.addMessage("Clicked on a Building Back navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Building Back navigation");
				Assert.assertTrue(false, "Failed to click on Home back navigation");
			}
		}
		
		
		
		
		public void MainBuildingBackNavigation() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(mainbuildingnavigation);
				mainbuildingnavigation.click();
				Log.addMessage("Clicked on a Building Back navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Building Back navigation");
				Assert.assertTrue(false, "Failed to click on Home back navigation");
			}
		}
		

		

	
	
	
	public void clicktoViewAllUser() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonviewAlluser);
			clickonviewAlluser.click();
			Log.addMessage("Clicked on a ViewAllUser");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on ViewAllUser");
			Assert.assertTrue(false, "Failed to click on ViewAllUser");
		}
	}
	
	
		
	
	public void clicktoViewUser() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonuser);
			clickonuser.click();
			Log.addMessage("Clicked on a ViewUser");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on ViewUser");
			Assert.assertTrue(false, "Failed to click on ViewUser");
		}
	}
	
	
	
	
	
	
	public void clicktoRemoveuser() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonRemoveuser);
			clickonRemoveuser.click();
			Log.addMessage("Clicked on a Removeuser");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Removeuser");
			Assert.assertTrue(false, "Failed to click on Removeuser");
		}
	}
	
	
	
	
	public void clicktoRemoveuseryes() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickonRemoveuseryes);
			clickonRemoveuseryes.click();
			Log.addMessage("Clicked on a yes");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on yes");
			Assert.assertTrue(false, "Failed to click on yes");
		}
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
			Assert.assertTrue(false, "Failed to click toggle between sites");//android.widget.LinearLayout[@resource-id="com.kwikset.multifamily.dev:id/editUnit"]//android.view.ViewGroup//android.widget.EditText
		}
	}

//

	//Unit Management - Unit List View(Click Location Tab)


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

	
	
	
	public void Deleteunit() {
		try {
			Utility.waitForElementToBeVisible(deleteunit);
			Utility.waitForElementToBeClickable(deleteunit);
			deleteunit.click();
			
			Utility.waitForElementToBeVisible(confirmdelete);
			Utility.waitForElementToBeClickable(confirmdelete);
			confirmdelete.click();
			Thread.sleep(2000);
			Log.addMessage("Unit deleted successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}


	
	
	

    
	public void Clickfirstunit() {
		try {
			
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Clickfirstunit);
			Clickfirstunit.click();
			Thread.sleep(2000);
			Log.addMessage("  opened the unit unit");
			
			
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	
	
	
	
	public void ClickfirstAccesspoint() {
		try {
			
			Thread.sleep(2000);
			
			Utility.waitForElementToBeVisible(Clickfirstunit);
			Clickfirstunit.click();
			Thread.sleep(2000);
			Log.addMessage("  opened the unit unit");
			
			
		}catch(Exception e) {
			Log.addMessage("Failed to delete the unit");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click building Btn");
		}
	}
	
	
	
	
	
//
//	// //Unit Management - Unit List View(Click the building)

	public void clickBuilding() {
		try {
			Utility.waitForElementToBeVisible(clickbuilding);
			Utility.waitForElementToBeClickable(clickbuilding);
			clickbuilding.click();
			Log.addMessage("Clicked Building successfully");
		}catch(Exception e) {
			Log.addMessage("Failed to click Building Btn");
			System.out.println(e.getMessage().toString());
			Assert.assertTrue(false, "Failed to click Building Btn");
		}
	}

	

	// //Unit Management - View Details of Unit(Click the unit)

		public void clickUnits() {
			try {
				Utility.waitForElementToBeVisible(clickunit);
				Utility.waitForElementToBeClickable(clickunit);
				clickunit.click();
				Log.addMessage("Clicked Unit successfully");
			}catch(Exception e) {
				Log.addMessage("Failed to click Unit");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click Unit");
			}
		}

		
		

		public void ClickAllActivity() {
			try {
			
				Utility.waitForElementToBeVisible(AllActivity);
			
				AllActivity.click();
				Log.addMessage(" Activity tab displayed");
			}catch(Exception e) {
				Log.addMessage("Failed to click Unit");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to  Activity tab");
			}
		}

	
		public void ClickonDetailstab() {
			try {
				Thread.sleep(5000);
				Utility.waitForElementToBeVisible(Detailstab);
			
				Detailstab.click();
				Log.addMessage(" Details tab displayed");
			}catch(Exception e) {
				Log.addMessage("Failed to click details tab");
				System.out.println(e.getMessage().toString());
				Assert.assertTrue(false, "Failed to click details tab");
			}
		}
		
		
		
		public void clicktoAddUser() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonAddUser);
				clickonAddUser.click();
				Log.addMessage("Clicked on a  Add User Unit");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Add User Unit");
				Assert.assertTrue(false, "Failed to click on Add User Unit");
			}
		}
		
		
		
		
		public void selectfirstfloor() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(selectfirstfloor);
				selectfirstfloor.click();
				Thread.sleep(2000);
				Log.addMessage("Clicked on a  Add User Unit");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Add User Unit");
				Assert.assertTrue(false, "Failed to click on Add User Unit");
			}
		}
		
		
		public void clicktoviewbuilding() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonviewbuilding);
				clickonviewbuilding.click();
				Log.addMessage("Clicked on a viewbuilding");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on viewbuilding");
				Assert.assertTrue(false, "Failed to click on viewbuilding");
			}
		}
		
		public void Editunit(String numberofunits) {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(editunit);
				editunit.click();
				editunit.clear();
			
				editunit.sendKeys(numberofunits);
				Log.addMessage("Number of units entered");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to edit units");
				Assert.assertTrue(false, "Failed to click on viewbuilding");
			}
		}
		
		
		public void Editunitname(String numberofunits) {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(editunitnumber);
				editunitnumber.click();
				editunitnumber.clear();
			
				editunit.sendKeys(numberofunits);
				
				Log.addMessage("Number of units entered");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to edit units");
				Assert.assertTrue(false, "Failed to click on viewbuilding");
			}
		}
		
		
		
		
		
		
		
		
		
		public void clicktobuilding() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonbuilding);
				clickonbuilding.click();
				Log.addMessage("Clicked on a building");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on building");
				Assert.assertTrue(false, "Failed to click on building");
			}
		}
		
		
		
		public void clicktoAccesspoint() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(clickonviewAccesspoint);
				clickonviewAccesspoint.click();
				Log.addMessage("Clicked on a Accesspoint");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Accesspoint");
				Assert.assertTrue(false, "Failed to click on Accesspoint");
			}
		}
		
		 
		

			public void clickonadduserbtn() {
				try {
				//	Thread.sleep(3000);
					Utility.waitForElementToBeVisible( clickonadduser);
					
					 clickonadduser.click();
					Log.addMessage("Clicked on a viewbuilding");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on viewbuilding");
					Assert.assertTrue(false, "Failed to click on viewbuilding");
				}
			}


			
			
			public void clickonfname() {
				try {
				//	Thread.sleep(3000);
					Utility.waitForElementToBeVisible(clickonaddfname);
					
					clickonaddfname.click();
					clickonaddfname.sendKeys("Access");
					Log.addMessage("sucessfully add first name");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to add first name");
					Assert.assertTrue(false, "Failed to add first name functionality");
				}
			}

			
			
			public void clickonSname() {
				try {
				//	Thread.sleep(3000);
					Utility.waitForElementToBeVisible(clickonaddSname);		
					clickonaddSname.click();
					clickonaddSname.sendKeys("user");
					Log.addMessage("sucessfully add last name");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to add last name");
					Assert.assertTrue(false, "Failed to add last name functionality");
				}
			}
			
			
			
		
			
			
			
			public void selectUser() {
				try {
				//	Thread.sleep(3000);
					Utility.waitForElementToBeVisible(clickonuser);		
					clickonuser.click();
					Log.addMessage("Clicked on a User");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on User");
					Assert.assertTrue(false, "Failed to select user functionality");
				}
			}
			
			
			
			
		
			
			 public void clickoncontinuebtn() {
					try {
						Thread.sleep(3000);
						Utility.waitForElementToBeVisible(clickoncontinue);		
						clickoncontinue.click();
						Log.addMessage("Clicked on a continue");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue");
						Assert.assertTrue(false, "Failed to click on continue functionality");
					}
				}
				
				
				public void selectgroup() {
					try {
					//	Thread.sleep(3000);
						Utility.waitForElementToBeVisible(clickongroup);		
						clickongroup.click();
						Log.addMessage("Clicked on a group");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on group");
						Assert.assertTrue(false, "Failed to select group functionality");
					}
				}
			
	           
				
				
				
				public void clickoncontinuegroup() {
					try {
						Thread.sleep(3000);
						Utility.waitForElementToBeVisible(clickoncontinuegrp);		
						clickoncontinuegrp.click();
						Log.addMessage("Clicked on a continue group");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue group");
						Assert.assertTrue(false, "Failed to click on continue group functionality");
					}
				}
				
				
				
				
				
				public void clickoncontinueaccesss() {
					try {
				    	Thread.sleep(3000);
						Utility.waitForElementToBeVisible(clickoncontinueaccess);		
						clickoncontinueaccess.click();
						Log.addMessage("Clicked on a continue group");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue group");
						Assert.assertTrue(false, "Failed to click on continue group functionality");
					}
				}
				
				
				
				
				
				
				
				
				
				

				public void shareaccesstouser() {
					try {
						Thread.sleep(3000);
						Utility.waitForElementToBeVisible(clickmail);
						clickmail.click();
						clickmail.sendKeys("arun21@yopmail.com");			
						Log.addMessage("Clicked on a mail");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on mail");
						Assert.assertTrue(false, "Failed to click on mail");
					}
					
				}


					public void shareaccesstouse() {
						try {
						//	Thread.sleep(8000);
							Utility.waitForElementToBeVisible(clickmobileno);
							clickmobileno.click();
							clickmobileno.sendKeys("2222222222");
			     			Log.addMessage("Clicked on a mobile number");
						} catch(Exception e) {
			        		e.printStackTrace();
							Log.addMessage("Failed to click on mobile numbe");
							Assert.assertTrue(false, "Failed to click on mobile numbe");
						}
						}
						

					


						public void shareaccessclick() {
							try {
								Thread.sleep(8000);
								Utility.waitForElementToBeVisible(shareaccessscontinue);
								shareaccessscontinue.click();		
								Log.addMessage("Clicked on a shareaccess button");
							} catch(Exception e) {
								e.printStackTrace();
								Log.addMessage("Failed to click on shareaccess button");
								Assert.assertTrue(false, "Failed to shareaccess button");
							}
						}

						
					



							public void shareaccessclickdone() {
								try {
									Thread.sleep(8000);
									Utility.waitForElementToBeVisible(shareaccesssdone);
									shareaccesssdone.click();		
									Log.addMessage("Clicked on a shareaccess done");
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on shareaccess done");
									Assert.assertTrue(false, "Failed to shareaccess done");
								}
								
							}
							
				
							
			


							public void BackNavigationbtn() {
								try {
									Thread.sleep(8000);
									Utility.waitForElementToBeVisible(BackNavigation);
									BackNavigation.click();		
									Log.addMessage("Clicked on a back navigation");
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on back navigation");
									Assert.assertTrue(false, "Failed to back navigation");
								}
								
							}
		
							public void BackaccessNavigationbtn() {
								try {
									Thread.sleep(8000);
									Utility.waitForElementToBeVisible(BackNavigationaccess);
									BackNavigationaccess.click();		
									Log.addMessage("Clicked on a back navigation");
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on back navigation");
									Assert.assertTrue(false, "Failed to back navigation");
								}
								
							}
							
							
							
							
								
							
							public void BackbuildNavigationbtn() {
								try {
									Thread.sleep(8000);
									Utility.waitForElementToBeVisible(BackNavigationbuilding);
									BackNavigationbuilding.click();		
									Log.addMessage("Clicked on a back navigation");
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on back navigation");
									Assert.assertTrue(false, "Failed to back navigation");
								}
								
							}
							
							
							
		
							public void Addusertothesystem() {
								try {
									Thread.sleep(8000);
									Utility.waitForElementToBeVisible(BackNavigationbuilding);
									BackNavigationbuilding.click();		
									Log.addMessage("Clicked on a back navigation");
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on back navigation");
									Assert.assertTrue(false, "Failed to back navigation");
								}
								
							}
							
							
							
		
							public void AdduserfromUnit(String Email, String Firstname, String Lastname, String Usertype, String Group) {
								try {
									Utility.waitForElementToBeVisible(addemail);
									addemail.click();
									addemail.sendKeys(Email);
									Thread.sleep(3000);
									driver.findElement(By.id("com.kwikset.multifamily.dev:id/submitButton")).click();
									
									
									
									Utility.waitForElementToBeVisible(addfirstname);
									addfirstname.click();
									addfirstname.sendKeys(Firstname);
									
									addfirstname.click();
								Log.addMessage("add firstusername successfully");
								
								Utility.waitForElementToBeVisible(addlastname);
								Thread.sleep(3000);
								addlastname.click();
								addlastname.sendKeys(Lastname);
								Log.addMessage("add lastname successfully");
								
								Thread.sleep(3000);

								Utility.Selectbyname(Usertype);
								
								Log.addMessage("User type selected");
								
				
								//CLick continue button from User access type page
								
								Utility.waitForElementToBeVisible(clickcontinuebutton);
								clickcontinuebutton.click();
								Log.addMessage("Clicked on a clickcontinue");
								
								Thread.sleep(3000);
								driver.findElement(By.id("com.kwikset.multifamily.dev:id/button_continue")).click();
								Log.addMessage("Clicked on a clickcontinue on group page");
								
								Thread.sleep(3000);
							
								///Access time st page
								Thread.sleep(3000);
								driver.findElement(By.id("com.kwikset.multifamily.dev:id/button_continue")).click();
								Log.addMessage("Clicked on a continue on acccess page");
								
								
								///Enter mobile number
								
								Utility.waitForElementToBeVisible(Entermobilenumber);
								Entermobilenumber.sendKeys("5655656575");
								Utility.waitForElementToBeVisible(shareaccessdonebutton);
								shareaccessdonebutton.click();
								
								///Add user flow finish
								Utility.waitForElementToBeVisible(Adduserdonebutton);
								Adduserdonebutton.click();
								
								
								
								
								
								
								} catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to click on firstusername");
									Assert.assertTrue(false, "Failed to click on firstusername");
								}
							}



							public void deleteuser() {
								try {
									Utility.simpleWait(3000);
									Utility.waitForElementVisible(deleteuser, driver);
									deleteuser.click();
									
									Utility.waitForElementVisible(confirmbutton, driver);
									confirmbutton.click();
									
									Log.addMessage("user deleted success fully");
								}catch(Exception e) {
									e.printStackTrace();
									Log.addMessage("Failed to Vdelete the user");
									Assert.assertTrue(false, "Failed to delete the user");
								}
							}
						//	
							
	
	
							
							
							
							
							
							
							
							
							
		
	//***********************************************************************************************************************//
	//****************************************** Verification Methods *******************************************************//
	//***********************************************************************************************************************//
//
	public void verifyUnitListViewDisplayed() {
		try {
			Utility.waitForElementVisible(verifyunitlist, driver);
			String unitlist = verifyunitlist.getText();
			//Assert.assertEquals("Floor ten", unitlist);	
			Log.addMessage("Verify Unit List view is successfully");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify Unit List View");
			Assert.assertTrue(false, "Failed to Verify Unit List View");
		}
	}
//	
	

	
	public void verifyDetailsofUnit() {
		try {
			Utility.waitForElementVisible(verifyUnit, driver);
			String unitlist = verifyUnit.getText();
			Assert.assertEquals("Unit TE01", unitlist);	
			Log.addMessage("Verify view Details of unit  is successful");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify view details of unit");
			Assert.assertTrue(false, "Failed to Verify view details of unit");
		}
	}
	

	public void AddAccesspoint(String APcount) {
		try {
			Utility.waitForElementVisible(EditAccesspoint_count, driver);
			EditAccesspoint_count.click();
			EditAccesspoint_count.clear();
			EditAccesspoint_count.sendKeys(APcount);
			Log.addMessage("Verify view Details of unit  is successful");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to Verify view details of unit");
			Assert.assertTrue(false, "Failed to Verify view details of unit");
		}
	}
	

	
	
	
	public void Click_add_group() {
		try {
			Utility.waitForElementVisible(Ap_group, driver);
			Ap_group.click();
			
			
			
			Log.addMessage("Set group button clicked from App settings");
		}catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to navigate to Add grou page");
			Assert.assertTrue(false, "Failed to navigate to Add grou page");
		}
	}
	

	
	
	

}
