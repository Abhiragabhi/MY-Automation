package pages.app.mf;

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

public class UserprofileApppage extends Settings {

	
@AndroidFindAll({
		
		@AndroidBy(id= "com.kwikset.multifamily.dev:id/view_left"),
		
	})
	@CacheLookup
	private MobileElement menubutton;
	
	
	
@AndroidFindAll({
		
		@AndroidBy(id= "com.kwikset.multifamily.dev:id/userImageText"),
		
	})
	@CacheLookup
	private MobileElement clickonprofile;




@AndroidFindAll({
	
	@AndroidBy(id= "com.kwikset.multifamily.dev:id/action"),
	
})
@CacheLookup
private MobileElement credentialtoggle;



@AndroidFindAll({

@AndroidBy(id= "com.kwikset.multifamily.dev:id/accessValueText"),

})
@CacheLookup
private MobileElement verifypage;








@SuppressWarnings("static-access")
public UserprofileApppage(AppiumDriver<MobileElement> driver) {
this.appiumDriver = driver;
PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
}





public void clickonmenu() {
try {
	Thread.sleep(9000);
	Utility.waitForElementToBeVisible(menubutton);
	menubutton.click();
	Log.addMessage("Clicked on a menu button");
} catch(Exception e) {
	e.printStackTrace();
	Log.addMessage("Failed to menu button");
	Assert.assertTrue(false, "Failed to click on menu button");
}
}


public void clckonprofile() {
try {
	Thread.sleep(4000);
	Utility.waitForElementToBeVisible(clickonprofile);
	clickonprofile.click();
	Log.addMessage("click on profile Button");
} catch(Exception e) {
	e.printStackTrace();
	Log.addMessage("Failed to click on profile Button");
	Assert.assertTrue(false, "Failed to click on filter profile functionality");
}
}

	
	
	
	
	
public void mobilecredentialtoggle() {
try {
	Thread.sleep(4000);
	Utility.waitForElementToBeVisible(credentialtoggle);
	credentialtoggle.click();
	Log.addMessage("enable mobile credential toggle");
} catch(Exception e) {
	e.printStackTrace();
	Log.addMessage("Failed to enable mobile credential toggle");
	Assert.assertTrue(false, "Failed to enable mobile credential toggle functionality");
}
}
	
	
	
	
public void mobilecredentialtoggledisable() {
try {
	Thread.sleep(4000);
	Utility.waitForElementToBeVisible(credentialtoggle);
	credentialtoggle.click();
	Log.addMessage("Disable mobile credential toggle");
} catch(Exception e) {
	e.printStackTrace();
	Log.addMessage("Failed Disable mobile credential toggle");
	Assert.assertTrue(false, "Failed Disable mobile credential toggle functionality");
}
}
	
	



	
public void verifyaccess() {
	try {
		Thread.sleep(4000);
		Utility.waitForElementVisible(verifypage, driver);
		String accesss = verifypage.getText();
		Assert.assertEquals("All Access", accesss);
		Log.addMessage("All Access displayed successfully");
	}catch(Exception e) {
		e.printStackTrace();
		Log.addMessage("Failed to displayed All Access");
		Assert.assertTrue(false, "Failed to displayed All Access");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
