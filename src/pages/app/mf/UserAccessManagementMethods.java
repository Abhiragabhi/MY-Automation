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
import utility.Log;
import utility.Utility;

public class UserAccessManagementMethods extends Settings{
/// share access code
	
	@AndroidFindAll({
		@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),
		})
		@CacheLookup
		private MobileElement clickmail;

	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement Adduserdonebutton;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleShareUserAccess"),
	})
	@CacheLookup
	private MobileElement shareuseraccess_page;
	
	@AndroidFindAll({
		@AndroidBy (id = "com.kwikset.multifamily.dev:id/titleAccessTime"),
	})
	@CacheLookup
	private MobileElement Accesstimepage;

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/button_continue"),
	
		
	})
	@CacheLookup
	private MobileElement clickcontinuebutton;
	
	

	@AndroidFindAll({
		@AndroidBy (xpath = "com.kwikset.multifamily.dev:id/buttonDone"),
	})
	@CacheLookup
	private MobileElement shareaccessdonebutton;

	@AndroidFindAll({
		@AndroidBy (xpath= "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	})
		@CacheLookup
		private MobileElement clickmobileno;

	@AndroidFindAll({
		@AndroidBy (id = "//android.widget.EditText[@text=\"Mobile\"]"),
	})
	@CacheLookup
	private MobileElement Entermobilenumber;


	

	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/buttonDone")
	})
	@CacheLookup
	private MobileElement shareaccessscontinue;
	

	

	@AndroidFindAll({
	    @AndroidBy(id="com.kwikset.multifamily.dev:id/buttonDone")
	})
	@CacheLookup
	private MobileElement shareaccesssdone;
	
	
	
	///share access for IA
	
@AndroidFindAll({
		
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/editText"),
		
	})
	@CacheLookup
	private MobileElement addemail;
	

	@AndroidFindAll({
		//@AndroidBy(id = "com.kwikset.multifamily.dev:id/users_nav_graph"),
		@AndroidBy(xpath ="//android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout"),
		
	})
	@CacheLookup
	private MobileElement clickonpeoplebtn;
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),
	
	
	})
	@CacheLookup
	private MobileElement clickonadduser;
	
	
	

	@AndroidFindAll({
	
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"First Name\"]"),
	
	})
	@CacheLookup
	private MobileElement AddFusername;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.EditText[@text=\"Last Name\"]"),
		
	})
	@CacheLookup
	private MobileElement AddLusername;
	
	
	

	@AndroidFindAll({
	//	@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
	
	})
	@CacheLookup
	private MobileElement SelectIAUser;
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/switchAsAnAdmin"),
	
	
	})
	@CacheLookup
	private MobileElement selectIAAdmin;
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/button_continue"),
	
	
	})
	@CacheLookup
	private MobileElement clickonaddusercontinue;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
	
	})
	@CacheLookup
	private MobileElement selectgroup;
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	
		

	})
	@CacheLookup
	private MobileElement clickcontinuetogroup;
	
	

	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"),
		

	})
	@CacheLookup
	private MobileElement clickonbuilding;
	
	
	@AndroidFindAll({
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"),

	})
	@CacheLookup
	private MobileElement clicktofloor;
	
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickcontinuebtn; 
	
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickcontinuebuildingbtn; 
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickcontinueaccessbtn; 
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickcontinueassignaccessbtn; 
	

	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/nameValueText"),

	})
	@CacheLookup
	private MobileElement iashare;
	
	
	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),

	})
	@CacheLookup
	private MobileElement clickonback;
	
	
	
	
	///Share access for IU
	

	

	@AndroidFindAll({
	//	@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
	
	})
	@CacheLookup
	private MobileElement SelectIU;
	

	
	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement clickonbacknavigation; 
	
	
	
	//Share access with PMA
	

	

	@AndroidFindAll({
	//	@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
		@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
	
	})
	@CacheLookup
	private MobileElement SelectpmaUser;
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/switchAsAnAdmin"),
	
	
	})
	@CacheLookup
	private MobileElement selectPMAdmin;
	


	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/nameValueText"),
	
	
	})
	@CacheLookup
	private MobileElement pmashare;
	
	
	

	@AndroidFindAll({
		@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),

	})
	@CacheLookup
	private MobileElement backnavigation;

	
	//Share access with PMU





@AndroidFindAll({
//	@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),

})
@CacheLookup
private MobileElement SelectpmuUser;




@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/nameValueText"),


})
@CacheLookup
private MobileElement pmushare;

	

//// UNITS GROUP


@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"),

	
})
@CacheLookup
private MobileElement selectfloor;




@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),

	
})
@CacheLookup
private MobileElement clickcontinueselectfloor;





@AndroidFindAll({
    @AndroidBy(id="com.kwikset.multifamily.dev:id/imageFilter")
})
@CacheLookup
private MobileElement clickonfilter;


///select user group


@AndroidFindAll({
//	@AndroidBy(xpath = "//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.ImageView[2]"),

})
@CacheLookup
private MobileElement SelectUser;







@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),


})
@CacheLookup
private MobileElement clickonbackNavigation;


@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_right"),


})
@CacheLookup
private MobileElement clickongroupsetting;





@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_right"),


})
@CacheLookup
private MobileElement clickonaddgroup;



@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),


})
@CacheLookup
private MobileElement clickonaddgroupName;

@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),


})
@CacheLookup
private MobileElement clickonaddgroupName1;


@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText"),


})
@CacheLookup
private MobileElement clickonaddgroupdescription;



@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),


})
@CacheLookup
private MobileElement clickonaddgroupcontiue;





@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"),


})
@CacheLookup
private MobileElement SelectBuilding;







@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),

})
@CacheLookup
private MobileElement selectfloorcontinue;



@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/btnContinue"),


})
@CacheLookup
private MobileElement Buildingcontinue;





@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/view_left"),


})
@CacheLookup
private MobileElement BackNavigation;



//Existing user group


@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
	})
	@CacheLookup
	private MobileElement selectinstaller;



@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/button_continue"),
	})
	@CacheLookup
	private MobileElement clickoncontinuebtn;





@AndroidFindAll({
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup/android.widget.ImageView[2]"),
	})
	@CacheLookup
	private MobileElement clickongrp;


@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickoncontinue;





@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backtonavigation;






@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backnavigationuser;





@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/view_left"),
	})
	@CacheLookup
	private MobileElement backnavigationhome;







@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_right"),
	
})
@CacheLookup
private MobileElement settingsgroupbtn;




@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/search_src_text"),
	
})
@CacheLookup
private MobileElement groupsearchbtn;



@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),
	
})
@CacheLookup
private MobileElement backnavigationbtn;


///Existing user group





@AndroidFindAll({
	//@AndroidBy(id = "com.kwikset.multifamily.dev:id/users_nav_graph"),
	@AndroidBy(xpath ="//android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout"),
	
})

private MobileElement clickpeoplebutton;





@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/search_src_text"),
	
})
@CacheLookup
private MobileElement searchbox;


@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/userNameText"),
	
})
@CacheLookup
private MobileElement verifysearchpage;


/// time limitation


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

	@AndroidBy(xpath = "//android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView//android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]"),
	
})
@CacheLookup
private MobileElement clickinstaller;









@AndroidFindAll({

	@AndroidBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/android.view.ViewGroup/android.widget.TextView"),
	
})
@CacheLookup
private MobileElement clickgroup;





@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/buttonContinue"),
	
})
@CacheLookup
private MobileElement clickongroupcontinue;






@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/buttonContinue"),
	
})
@CacheLookup
private MobileElement clickonaccesscontinue;



@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/buttonContinue"),
	
})
@CacheLookup
private MobileElement clickonaccesscontinuebtn;


/// Limited time



@AndroidFindAll({
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),

	
})
@CacheLookup
private MobileElement clickbackbutton;










@AndroidFindAll({
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/buttonContinue"),

	
})
@CacheLookup
private MobileElement clickoncontinuelimitedbutton;



@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/editStarts"),
	
})
@CacheLookup
private MobileElement clickonaccessstarttime;



@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/touch_outside"),
	
})
@CacheLookup
private MobileElement clickonaccessstarttimeclick;



@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/expiresGroup"),
	
})
@CacheLookup
private MobileElement accessendtimeclick;

//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[2]



@AndroidFindAll({

	@AndroidBy(xpath= "//android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.Button[2]"),
	
})
@CacheLookup
private MobileElement accessendtimeselected;



//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText



@AndroidFindAll({

	@AndroidBy(xpath= "//android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText"),
	
})
@CacheLookup
private MobileElement accessendtimeselect;





@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/buttonContinue"),
	
})
@CacheLookup
private MobileElement clickonaccesstimecontinue;





@AndroidFindAll({

	@AndroidBy(id= "com.kwikset.multifamily.dev:id/touch_outside"),
	
})
@CacheLookup
private MobileElement clickaccessendtimeclick;



@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/switchRepeatButton"),
	})
	@CacheLookup
	private MobileElement clickonrepeat;


@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/editEndTime"),
	})
	@CacheLookup
	private MobileElement clickonendtime;

//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup//android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText



@AndroidFindAll({
	@AndroidBy (xpath = "//android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText"),
	})
	@CacheLookup
	private MobileElement selectendtime;





@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/touch_outside"),
	})
	@CacheLookup
	private MobileElement clickonoutside;

//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.ToggleButton






@AndroidFindAll({
	@AndroidBy (xpath ="//android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.ToggleButton"),
	})
	@CacheLookup
	private MobileElement clickondays;








@AndroidFindAll({
	@AndroidBy (id = "com.kwikset.multifamily.dev:id/buttonContinue"),
	})
	@CacheLookup
	private MobileElement clickonrepeatbyweek;


/// filter unit



@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),

	
})
@CacheLookup
private MobileElement clickbuilding;



@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/imageFilter"),

	
})
@CacheLookup
private MobileElement clickonfloorbuilding;






@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox"),

	
})
@CacheLookup
private MobileElement clickonnorth;








@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView"),


	
	
})
@CacheLookup
private MobileElement clickonsouth;







@AndroidFindAll({
	@AndroidBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView"),


	
	
})
@CacheLookup

private MobileElement clickonnorthsouth;






@AndroidFindAll({
	@AndroidBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.TextView"),


	
	
})
@CacheLookup

private MobileElement clickonfloor;











@AndroidFindAll({
	@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"),


	
	
})
@CacheLookup
private MobileElement clickonfloor1;





@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/imageFilter"),

	
})
@CacheLookup
private MobileElement clickonseeresult;








@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/btn_see_results"),


	
	
})
@CacheLookup
private MobileElement clickonresult;


@AndroidFindAll({
	@AndroidBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.kwikset.multifamily.dev:id/check_box\"])[1]"),
	
})
@CacheLookup
private MobileElement clickusergroup;


@AndroidFindAll({
	@AndroidBy(id = "com.kwikset.multifamily.dev:id/buttonContinue"),

	
})
@CacheLookup
private MobileElement clickgroupcontinue;




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
	@AndroidBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"),
})
@CacheLookup
private MobileElement clickoncontinueaccess;











	
	
	
	
	
	
	
	
	
	



	@SuppressWarnings("static-access")
	public UserAccessManagementMethods (AppiumDriver<MobileElement> driver) {
		this.appiumDriver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	

	public void clickoncontinueaccessbtn() {
		try {
			Thread.sleep(5000);
			Utility.waitForElementToBeVisible(clickoncontinueaccess);
			
			clickoncontinueaccess.click();
			
			
			
			Log.addMessage("Clicked on continue access");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on continue access1");
			Assert.assertTrue(false, "Failed to click on continue access1");
		}
	}
	
	

	public void shareaccesstouser() {
		try {
			Thread.sleep(4000);
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
	
	
	
	public void verifyshareaccesspage() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(shareuseraccess_page);
			//String text = shareuseraccess_page.getText();
			//Assert.assertEquals("Share User Access",text);		
			Log.addMessage("share access page verified");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed verify share access page");
			Assert.assertTrue(false, "Failed to verify share access page");
		}
		
	}
	
	
	
	public void Accesstimepageverification() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(Accesstimepage);
			//String text = shareuseraccess_page.getText();
			//Assert.assertEquals("Share User Access",text);		
			Log.addMessage(" access time page verified");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed verify  access time  page");
			Assert.assertTrue(false, "Failed to verify  access time page");
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
						Thread.sleep(9000);
						Utility.waitForElementToBeVisible(shareaccesssdone);
						shareaccesssdone.click();		
						Log.addMessage("Clicked on a shareaccess done");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on shareaccess done");
						Assert.assertTrue(false, "Failed to shareaccess done");
					}
					

			}
	
				

				public void clickOncontinuegroup() {
					try {
						Utility.waitForElementToBeVisible(clickoncontinue);
						clickoncontinue.click();
						Log.addMessage("Clicked on a continue group ");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue group");
						Assert.assertTrue(false, "Failed to click on continue group");
					}
				}
				
	

				public void clickonpeoplebutton() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickonpeoplebtn);
						
						clickonpeoplebtn.click();
						
						
						Log.addMessage("Clicked on PeopleButton");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on PeopleButton");
						Assert.assertTrue(false, "Failed to click on PeopleButton");
					}
				}
				
				public void clicktoadduser() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickonadduser);
						
						
						
						Thread.sleep(3000);

						clickonadduser.click();
						
//						
//						Utility.waitForElementToBeVisible(addemail);
//						addemail.click();
//						addemail.sendKeys("arun21@yopmail.com");
//						Thread.sleep(3000);
//						driver.findElement(By.id("com.kwikset.multifamily.dev:id/submitButton")).click();
//						
						
						Thread.sleep(3000);
						AddFusername.click();
						AddFusername.sendKeys("IA");
						
						
						Thread.sleep(3000);
						AddLusername.click();
						AddLusername.sendKeys("Home");
						
						
						Thread.sleep(2000);
						SelectIAUser.click();
						
//						Thread.sleep(3000);
//						selectIAAdmin.click();
//						
//						
//						clickonaddusercontinue.click();
						

						Log.addMessage("Clicked on Clickonadduser");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on Clickonadduser");
						Assert.assertTrue(false, "Failed to click on Clickonadduser");
					}
				}
				
				


				public void clickonadmin() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(selectIAAdmin);
						selectIAAdmin.click();		
						clickonaddusercontinue.click();
						Log.addMessage("Clicked on Admin");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on Admin");
						Assert.assertTrue(false, "Failed to click on Admin");
					}
				}
				
				

				public void selectgrouptoaccess() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(selectgroup);
						selectgroup.click();		
						
						clickcontinuetogroup.click();
						
						
						Log.addMessage("select on group");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on group");
						Assert.assertTrue(false, "Failed to click on group");
					}
				}
				

				public void selectbuldingtoaccess() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickonbuilding);
									
						clickonbuilding.click();	       		
			     		Log.addMessage("select on bulding");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on bulding");
						Assert.assertTrue(false, "Failed to click on bulding");
					}
				}
				
				
				


				public void selectfloortoaccess() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clicktofloor);
									
						clicktofloor.click();	 
						clickcontinuebtn.click();
			     		Log.addMessage("select on floor");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on floor");
						Assert.assertTrue(false, "Failed to click on floor");
					}
				}


				
				
				
				
				
				public void clickoncontinuebuilding() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickcontinuebuildingbtn);
						
						clickcontinuebuildingbtn.click();		
						Log.addMessage("Clicked on continue building Button");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue building Button");
						Assert.assertTrue(false, "Failed to click on continue building Button");
					}
				}
				
				
				
				public void selectcontinueaccess() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickcontinueaccessbtn);
									
						clickcontinueaccessbtn.click();	       		
			     		Log.addMessage("Clicked on continue access Button");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continue access Button");
						Assert.assertTrue(false, "Failed to click on continue access Button");
					}
				}
				
				
				
				
				
				public void continueaccessbutton() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickcontinueassignaccessbtn);
									
						clickcontinueassignaccessbtn.click();	       		
			     		Log.addMessage("select on continueaccess");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on continueaccess");
						Assert.assertTrue(false, "Failed to click on continueaccess");
					}
				}
				
				
				
				
				
				
				
				
				public void clickonbackbtn() {
					try {
						Thread.sleep(2000);
						Utility.waitForElementToBeVisible(clickonback);
									
						clickonback.click();	       		
			     		Log.addMessage("click on back button");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on back button");
						Assert.assertTrue(false, "Failed to click on back button");
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//***********************************************************************************************************************//
					//****************************************** Verification Methods *******************************************************//
					//***********************************************************************************************************************//
					
					
					
					public void verifypmaaccessshare() {
						try {
							Utility.waitForElementVisible(iashare, driver);
							String iaaccess = iashare.getText();
							Assert.assertEquals("IA Home",iaaccess);
							Log.addMessage("share IA access code page displayed successfully");
						}catch(Exception e) {
							e.printStackTrace();
							Log.addMessage("Failed to share IA access code page");
							Assert.assertTrue(false, "Failed to share IA access code page");
						}
					}
				
				
	//SHARE ACCESS WITH IU
					
	
					

					public void clickbackbtn() {
						try {
							Thread.sleep(2000);
							Utility.waitForElementToBeVisible(clickonbacknavigation);
										
							clickonbacknavigation.click();	       		
				     		Log.addMessage("click back button");
						} catch(Exception e) {
							e.printStackTrace();
							Log.addMessage("Failed to click back button");
							Assert.assertTrue(false, "Failed to click back button");
						}
					}
					
					
					
					
			///Share access with PMA
					
					
					public void clickonPMAadmin() {
						try {
					
							
							
							Thread.sleep(3000);
							selectPMAdmin.click();
							
							clickonaddusercontinue.click();
							
							
							Log.addMessage("Clicked on Admin");
						} catch(Exception e) {
							e.printStackTrace();
							Log.addMessage("Failed to click on Admin");
							Assert.assertTrue(false, "Failed to click on Admin");
						}
					}

					
					
					
					
					public void clickonbacknavigation() {
						try {
					
							
							
							Thread.sleep(3000);
							backnavigation.click();
							
							
							Log.addMessage("Clicked on Back");
						} catch(Exception e) {
							e.printStackTrace();
							Log.addMessage("Failed to click on Back");
							Assert.assertTrue(false, "Failed to click on Back");
						}
					}

				///Share access with PMU
					
					

public void clickonback() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(backnavigation);
		
		backnavigation.click();
		

		Log.addMessage("Clicked on Back Button");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on Back Button");
		Assert.assertTrue(false, "Failed to click on Back Button");
	}
}

	
	//Unit filter

public void selectbuilding() {
	try {
		Utility.waitForElementToBeVisible( clickonbuilding);
		clickonbuilding.click();
		Log.addMessage("Clicked on a peoplebutton");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to peoplebutton");
		Assert.assertTrue(false, "Failed to click on peoplebutton");
	}
}



public void clickOnfliterbutton() {
	try {
		Utility.waitForElementToBeVisible(clickonfilter);
		clickonfilter.click();
		Log.addMessage("Clicked on a fliterbutton");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to fliterbutton");
		Assert.assertTrue(false, "Failed to click on fliterbutton");
	}
}


public void clickonfloor() {
	try {
		Utility.waitForElementToBeVisible(selectfloor);
		selectfloor.click();
		Log.addMessage("Clicked on a peoplebutton");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to peoplebutton");
		Assert.assertTrue(false, "Failed to click on peoplebutton");
	}
}




public void clickoncontinuefloor() {
	try {
		Utility.waitForElementToBeVisible(clickcontinueselectfloor);
		clickcontinueselectfloor.click();
		Log.addMessage("Clicked on a peoplebutton");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to peoplebutton");
		Assert.assertTrue(false, "Failed to click on peoplebutton");
	}
}



public void selectusertype() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(SelectUser);
		
		
		
        SelectUser.click();
		
		
		clickonaddusercontinue.click();
		
		
		
		Log.addMessage("Clicked on add user type");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add user type");
		Assert.assertTrue(false, "Failed to click on  add user type");
	}
}







public void clickonBackNavigation() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(clickonbackNavigation);
		
		clickonbackNavigation.click();
		
		
		Log.addMessage("Clicked on back button");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on back button");
		Assert.assertTrue(false, "Failed to click on  back button");
	}
}



public void clickongroupsetting() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(clickongroupsetting);
		
		clickongroupsetting.click();
		
		
		Log.addMessage("Clicked on group setting");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on group setting");
		Assert.assertTrue(false, "Failed to click on group setting");
	}
}



















public void clickongroupname() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(clickonaddgroupName);
		
		clickonaddgroupName.click();
		clickonaddgroupName.sendKeys("vibe");
		
		Log.addMessage("Clicked on add group name");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add group name");
		Assert.assertTrue(false, "Failed to click on  add group name");
	}
}





public void clickongroupname1() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(clickonaddgroupName1);
		
		clickonaddgroupName1.click();
		clickonaddgroupName1.sendKeys("vibe1");
		
		Log.addMessage("Clicked on add group name");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add group name");
		Assert.assertTrue(false, "Failed to click on  add group name");
	}
}

public void Addgroupdescription() {
	try {
		Thread.sleep(3000);
		Utility.waitForElementToBeVisible(clickonaddgroupdescription);
		
		clickonaddgroupdescription.click();
		clickonaddgroupdescription.sendKeys("do not accesss to others");
		
		Log.addMessage("Clicked on add group description");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add group description");
		Assert.assertTrue(false, "Failed to click on  add group description");
	}
}




public void clickonaddgroupcontiue () {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(clickonaddgroupcontiue);
		
		clickonaddgroupcontiue.click();
		
		
		Log.addMessage("Clicked on add group contiue ");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add group contiue");
		Assert.assertTrue(false, "Failed to click on  add group contiue");
	}
}





public void SelectBuildingtogroup () {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(SelectBuilding);
		
		SelectBuilding.click();
		
		
		Log.addMessage("Click to Select Building to group");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on  Select Building to group");
		Assert.assertTrue(false, "Failed to click on   Select Building to group");
	}
}




public void clickonSelectfloor() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(selectfloor);
		
		selectfloor.click();
		
		
		Log.addMessage("Clicked on add group Select floor");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on add group Select floor");
		Assert.assertTrue(false, "Failed to click on  add group Select floor");
	}
}







public void clickonfloorcontinue() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(selectfloorcontinue);
		
		selectfloorcontinue.click();
		
		
		Log.addMessage("Clicked on add Select floor continue");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on Select floor continue");
		Assert.assertTrue(false, "Failed to click on Select floor continue");
	}
}







public void clickonBuildingcontinue() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(Buildingcontinue);
		
		Buildingcontinue.click();
		
		
		Log.addMessage("Clicked on add Select Building continue");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on Select Building continue");
		Assert.assertTrue(false, "Failed to click on Select Building continue");
	}
}



public void clickonBackNavigationbtn() {
	try {
		Thread.sleep(2000);
		Utility.waitForElementToBeVisible(BackNavigation);
		
		BackNavigation.click();
		
		
		Log.addMessage("Clicked on add Select Building continue");
	} catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to click on Select Building continue");
		Assert.assertTrue(false, "Failed to click on Select Building continue");
	}
}


//existing user group
 
 public void selectinstaller() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(selectinstaller);
			selectinstaller.click();	
			
			Thread.sleep(2000);
			
			clickoncontinuebtn.click();
			
			Log.addMessage("Clicked on installer");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on installer");
			Assert.assertTrue(false, "Failed to click on installer");
		}
		
	}
	
	
	
	
	public void selectgroup() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickongrp);
			clickongrp.click();	
			
			
			Log.addMessage("Clicked on group");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on group");
			Assert.assertTrue(false, "Failed to click on group");
		}
		
	}
	
	
	

	public void continuegroup() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(clickoncontinue);
			clickoncontinue.click();	
			
			
			Log.addMessage("Clicked on continue group");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on continue group");
			Assert.assertTrue(false, "Failed to click on continue group");
		}
		
	}
	
	
	
	
	public void clickbacktonavigation() {
		try {
			Thread.sleep(3000);
			Utility.waitForElementToBeVisible(backtonavigation);
			backtonavigation.click();	
			
			
			Log.addMessage("Clicked on Back Navigation");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Back Navigation");
			Assert.assertTrue(false, "Failed to click on Back Navigation");
		}
		
	}
	
	
	

	public void clickuserbacktonavigation() {
		try {
			Thread.sleep(2000);
			Utility.waitForElementToBeVisible(backnavigationuser);
			backnavigationuser.click();	
			
			
			Log.addMessage("Clicked on Back user Navigation");
		} catch(Exception e) {
			e.printStackTrace();
			Log.addMessage("Failed to click on Back user Navigation");
			Assert.assertTrue(false, "Failed to click on Back user Navigation");
		}
		
	}
		
		
		
		public void clickhomebacktohome() {
			try {
				Thread.sleep(3000);
				Utility.waitForElementToBeVisible(backnavigationhome);
				backnavigationhome.click();	
				
				
				Log.addMessage("Clicked on Back Home Navigation");
			} catch(Exception e) {
				e.printStackTrace();
				Log.addMessage("Failed to click on Back Home Navigation");
				Assert.assertTrue(false, "Failed to click on Back Home Navigation");
			}}
		
		//filter unit
			
			

			public void clickonbuilding() {
				try {
					Utility.waitForElementToBeVisible(clickbuilding);
					clickbuilding.click();
					Log.addMessage("Clicked on a clickonbuilding");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonbuilding");
					Assert.assertTrue(false, "Failed to click on clickonbuilding");
				}
			}
			
			

			public void selectonbuilding() {
				try {
					Utility.waitForElementToBeVisible (clickonfloorbuilding);
					clickonfloorbuilding.click();
					Log.addMessage("Clicked on a clickongroup");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickongroup");
					Assert.assertTrue(false, "Failed to click on clickongroup");
				}
			}
			


			public void selectonfilter() {
				try {
					Utility.waitForElementToBeVisible (clickonfilter);
					clickonfilter.click();
					Log.addMessage("Clicked on a clickonfilter");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonfilter");
					Assert.assertTrue(false, "Failed to click on clickonfilter");
				}
			}
			
			
			


			public void selectonfloor() {
				try {
					Utility.waitForElementToBeVisible (clickonfilter);
					clickonfilter.click();
					Log.addMessage("Clicked on a clickonfloor");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to  clickonfloor");
					Assert.assertTrue(false, "Failed to click on  clickonfloor");
				}
			}
			
			
			

			
			
			public void selectonnorth() {
				try {
					Utility.waitForElementToBeVisible (clickonnorth);
					clickonnorth.click();
					Log.addMessage("Clicked on a clickonnorth");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonnorth");
					Assert.assertTrue(false, "Failed to click on clickonnorth");
				}
			}
			
			

			
			

			public void selectonsouthbutton() {
				try {
					Utility.waitForElementToBeVisible ( clickonsouth);
					 clickonsouth.click();
					Log.addMessage("Clicked on a clickonsouth");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonsouth");
					Assert.assertTrue(false, "Failed to click on clickonsouth");
				}
			}
			
			
			
			

			public void selectonnorthsouthbutton() {
				try {
					Utility.waitForElementToBeVisible ( clickonnorthsouth);
					clickonnorthsouth.click();
					Log.addMessage("Clicked on a clickonnorthsouth");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonnorthsouth");
					Assert.assertTrue(false, "Failed to click on clickonnorthsouth");
				}
			}
			
			
			

			

			public void selectbyfloor() {
				try {
					Utility.waitForElementToBeVisible (clickonfloor);
					clickonfloor.click();
					Log.addMessage("Clicked on a filterbyfloor");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to filterbyfloor");
					Assert.assertTrue(false, "Failed to click on filterbyfloor");
				}
			}
			
			
			
			
			
			

			

			public void clickonresult() {
				try {
					Utility.waitForElementToBeVisible (clickonresult);
					clickonresult.click();
					Log.addMessage("Clicked on a clickonresult");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickonresult");
					Assert.assertTrue(false, "Failed to click on clickonresult");
				}
			}
			

			public void clickOngroup() {
				try {
					Utility.waitForElementToBeVisible(clickusergroup);
					clickusergroup.click();
					Log.addMessage("Clicked on a clickongroup");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickongroup");
					Assert.assertTrue(false, "Failed to click on clickongroup");
				}
			}
			
			


			public void clickOngroupcontinue() {
				try {
					Utility.waitForElementToBeVisible( clickgroupcontinue);
					 clickgroupcontinue.click();
					Log.addMessage("Clicked on a clickgroupcontinue");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to clickgroupcontinue");
					Assert.assertTrue(false, "Failed to click on clickgroupcontinue");
				}
			}
			
			
			
			
			
			
			
			
			
			
			/////
			
			
		

			
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
					Thread.sleep(2000);
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


			


			
			
		
			
			

			public void continueaccess () {
				try {
					Utility.waitForElementToBeVisible(clickonaccesscontinue);
					clickonaccesscontinue.click();
					Log.addMessage("Clicked on a continue Access");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on continue Access");
					Assert.assertTrue(false, "Failed to click on continue Access");
				}
			}
			

			
			
			
			

			public void backtoaccessbutton () {
				try {
					Utility.waitForElementToBeVisible(clickbackbutton);
					Thread.sleep(6000);
					clickbackbutton.click();
					Log.addMessage("Clicked on a back to Access");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on back to Accesss button");
					Assert.assertTrue(false, "Failed to click on Accesss button");
				}
			}
			
			
			


			public void clickoncontinuelimited() {
				try {
					Utility.waitForElementToBeVisible(clickoncontinuelimitedbutton);
					Thread.sleep(6000);
					clickoncontinuelimitedbutton.click();
					Log.addMessage("Clicked on continuelimited");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on continuelimited button");
					Assert.assertTrue(false, "Failed on continuelimited button");
				}
			}
			
			
			
			
			public void setaccesstimestart () {
				try {
					Utility.waitForElementToBeVisible(clickonaccessstarttime);
					clickonaccessstarttime.click();
					Log.addMessage("Clicked on a access time start");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on access time start");
					Assert.assertTrue(false, "Failed to click on access time start");
				}
			}
			
			

			public void clicktosetaccesstime () {
				try {
					Utility.waitForElementToBeVisible(clickonaccessstarttimeclick);
					clickonaccessstarttimeclick.click();
					Log.addMessage("Clicked on to get in end access time");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to get in end access time");
					Assert.assertTrue(false, "Failed to get in end access time");
				}
			}
			
		    

			public void setaccesstimeend() {
				try {
					Utility.waitForElementToBeVisible(accessendtimeclick);
					accessendtimeclick.click();		
					Log.addMessage("Clicked on a set end accesstime");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on end accesstime");
					Assert.assertTrue(false, "Failed to click on end accesstime");
				}
			}
			
			
			
			

			public void setaccesstimeendselectmont() {
				try {
					Utility.waitForElementToBeVisible(accessendtimeselected);
					accessendtimeselected.click();		
					Log.addMessage("Clicked on a set end accesstime");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on end accesstime");
					Assert.assertTrue(false, "Failed to click on end accesstime");
				}
			}
			
			
			
			  

				public void setaccesstimeendselect() {
					try {
						Utility.waitForElementToBeVisible(accessendtimeselect);
						accessendtimeselect.click();
				//		accessendtimeselect.findElement("24", application).click();
						Log.addMessage("Clicked on a time set to end time");
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on time set to end time");
						Assert.assertTrue(false, "Failed to click on time set to end time");
					}
				}
			
			
			

			public void clicktoendaccesstime () {
				try {
					Utility.waitForElementToBeVisible(clickaccessendtimeclick);
					clickaccessendtimeclick.click();
					Log.addMessage("Clicked on to get in continue");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on continue");
					Assert.assertTrue(false, "Failed to click on continue");
				}
			}
			
		   
			

			public void clickonaccesscontinuetimebtn() {
				try {
					Utility.waitForElementToBeVisible(clickonaccesstimecontinue);
					clickonaccesstimecontinue.click();		
					Log.addMessage("Clicked on a continue accesstime");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on continue accesstime");
					Assert.assertTrue(false, "Failed to click on continue accesstime");
				}
			}
			
			
			


			
			public void clickOnrepeat() {
				try {
					Utility.waitForElementToBeVisible(clickonrepeat);
					clickonrepeat.click();
					Log.addMessage("Clicked on a Repeatbutton");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to Repeatbutton");
					Assert.assertTrue(false, "Failed to click on Repeatbutton");
				}
			}
			
			

			
			public void clickOnendtiming() {
				try {
					Utility.waitForElementToBeVisible(clickonendtime);
					clickonendtime.click();
					Log.addMessage("Clicked on end time");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to end time");
					Assert.assertTrue(false, "Failed to click on end time");
				}
			}
			
			
			
			
			

			
			public void selectendtimerepeat() {
				try {
					Utility.waitForElementToBeVisible(selectendtime);
					selectendtime.click();
					Log.addMessage("Clicked on end time");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to end time");
					Assert.assertTrue(false, "Failed to click on end time");
				}
			}
			
			
			

			
			public void clickonout() {
				try {
					Utility.waitForElementToBeVisible(clickonoutside);
					clickonoutside.click();
					Log.addMessage("Clicked on outside of timing");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to outside of timing");
					Assert.assertTrue(false, "Failed to click on outside of timing");
				}
			}
			
			
			

			
			public void selectday() {
				try {
					Utility.waitForElementToBeVisible(clickondays);
					clickondays.click();
					Log.addMessage("Clicked on days");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to days");
					Assert.assertTrue(false, "Failed to click on days");
				}
			}
			
			
			
			
			

			public void clickOnrepeatweek() {
				try {
					Utility.waitForElementToBeVisible(clickonrepeatbyweek);
					clickonrepeatbyweek.click();
					Log.addMessage("Clicked on a Repeatweek");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to Repeatweek");
					Assert.assertTrue(false, "Failed to click on Repeatweek");
				}
			}
			
			public void clckonsearch() {
				try {
					Utility.waitForElementToBeVisible(searchbox);
					searchbox.click();
					searchbox.sendKeys("MF Mobile Test User");
					Log.addMessage("give search name");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to give search name");
					Assert.assertTrue(false, "Failed to give search name");
				}
			}
			
			//***********************************************************************************************************************//
			//****************************************** Verification Methods *******************************************************//
			//***********************************************************************************************************************//
			
			
			
			public void verifysearchpage() {
				try {
					Utility.waitForElementVisible(verifysearchpage, driver);
					String sitesettings = verifysearchpage.getText();
					Assert.assertEquals("MF Mobile Test User", sitesettings);
					Log.addMessage("search page page displayed successfully");
				}catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to displayed site setting page");
					Assert.assertTrue(false, "Failed to displayed site setting page");
				}
			}
			

			public void clickonsettingsgroupbtn() {
				try {
					Thread.sleep(8000);
					Utility.waitForElementToBeVisible(settingsgroupbtn);
					settingsgroupbtn.click();
					Log.addMessage("Clicked on a setting group");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on setting group");
					Assert.assertTrue(false, "Failed to click setting group");
				}
			}
			
			
			


			public void clickongroupsearchbtn() {
				try {
					Thread.sleep(8000);
					Utility.waitForElementToBeVisible(groupsearchbtn);
					groupsearchbtn.click();
					groupsearchbtn.sendKeys("vibe");
					Log.addMessage("Clicked on a search");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on search");
					Assert.assertTrue(false, "Failed to click on search");
				}
			}
	
			
			
			
			public void clickongroup() {
				try {
					Thread.sleep(2000);
					Utility.waitForElementToBeVisible(clickongroup);
					
					clickongroup.click();
					
					clickoncontinuegrp.click();
					
					Log.addMessage("Clicked on group");
				} catch(Exception e) {
					e.printStackTrace();
					Log.addMessage("Failed to click on group");
					Assert.assertTrue(false, "Failed to click on group");
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
					driver.findElement(By.id("com.kwikset.multifamily.dev:id/button_continue")).click();
					Log.addMessage("Clicked on a clickcontinue on group page");
					
					Thread.sleep(3000);
				
					///Access time page continue
					Thread.sleep(3000);
					driver.findElement(By.id("com.kwikset.multifamily.dev:id/button_continue")).click();
					Log.addMessage("Clicked on a continue on acccess page");
					
					
					///Enter mobile number
					
					Utility.waitForElementToBeVisible(Entermobilenumber);
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
				
			
				
			
			  
			  

			  public  void Adduser_Enterusernameandtype(String Email, String Firstname, String Lastname, String Usertype) {
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
					
					
					
					} catch(Exception e) {
						e.printStackTrace();
						Log.addMessage("Failed to click on done button  ");
						Assert.assertTrue(false, "Failed to click on done button ");
					}
				}
				
			
				
				
			    
			
			  
			  
			  
			

}
