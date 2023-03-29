package tests.app.mf;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.Genericmethods;
import pages.app.mf.PartnerDeviceManagementmethods;
import pages.app.mf.UnitManagementPages;
import utility.Log;

public class Partnerdevicetest extends Settings{

	



	
	

	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =0)
	public void partner_device_UI() {
		try {
			
			
			
			Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
			g.Relauchtheapp();
	         Thread.sleep(5000);
			
		
			
			
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);

			UnitManagementPages unit = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
			 Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
		
			device.clicktoviewbuilding();
			device.clickbuilding();
			generic.Searchanitem("Access Point");
		 	unit.ClickfirstAccesspoint();
		     device.clickaccessdevice();
			device.clickaccessname();
			device.clickcontinue();
			device.verifycomboreader();
			device.verifycontroller();
			Log.addMessage("View Controller Reader UI verify  successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to View Controller Reader RemovecomboUI ");
			e.printStackTrace();
			Assert.assertTrue(false, "View Controller Reader UIfunctionality failed");
		}
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =1)
	public void Add_comboreader_to_Accesspoint () {
		try {
		//	ViewControllerReaderUI device = new   ViewControllerReaderUI((AppiumDriver<MobileElement>) driver);
			
			PartnerDeviceManagementmethods  combo = new   PartnerDeviceManagementmethods ((AppiumDriver<MobileElement>) driver);
		    combo.selectcomboreader();
		    combo.clickcontinue();
		    combo.clickinstallationcontinue();
		    combo.clickdevicecontinue();
		    combo.clickpermissiontopic();
		    combo.clickenterserialno();
		    combo.clickserialno();
		    combo.clickonmac();
//		//    combo.clicknotification();
		    combo.clickacontinue();
		    combo.clicknotification();
		    combo.clickdonecontinue();
		    combo.verifycomboreader();
		    combo.clickback();
			Log.addMessage("Add combo reader to access point successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to Add combo reader to access point ");
			e.printStackTrace();
			Assert.assertTrue(false, "Add combo reader to access point functionality failed");
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =2)
	public void Add_controller_device_to_Accesspoint() {
		try {
			
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			PartnerDeviceManagementmethods  controller = new   PartnerDeviceManagementmethods ((AppiumDriver<MobileElement>) driver);
			device.clicktoviewbuilding();
			device.clickbuilding();
			device.clickaccesspoint1();
			device.clickaccessdevice();
			device.clickaccessname();
			device.clickcontinue();
			controller.selectcontroller();
			controller.clickcontinue1();
			controller.clickinstallationcontinue1();
			controller.clickdevicecontinue1();
		    controller.clickpermissiontopic1();
			controller.clickenterserialno1();
			controller.clickserialno1();
			controller.clickonmac1();
	//		combo.clicknotification1();
			controller.clickacontinue1();
			controller.clicknotification1();
			controller.clickdonecontinue1();	
			device.verifycontroller();
//			controller.clickback();
			Log.addMessage("Add Controller to access point successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to Add Controller to access point");
			e.printStackTrace();
			Assert.assertTrue(false, "Add Controller to access pointfunctionality failed");
		}
	}
	
	
	

	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =3)
	public void controller_device_info() {
		try {
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			PartnerDeviceManagementmethods info = new  PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			device.clicktoviewbuilding();
			device.clickbuilding();
			device.clickaccesspoint1();
			device.clickaccessdevice();
			info.clicktocontrollerinfo();
         	info.clicktobackbtn();
         	info.clickbackbtn();
         	info.clickbackaccessbtn();
			Log.addMessage("View Controller Reader device info  successfully");

		} catch (Exception e) {
			Log.addMessage("Failed to View Controller Reader device info ");
			e.printStackTrace();
			Assert.assertTrue(false, "View Controller Reader device info functionality failed");
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =4)
	public void remove_controller_device() {
		try {
			
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			PartnerDeviceManagementmethods  remove = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
//			device.clicktoviewbuilding();
//			device.clickbuilding();
//			device.clickaccesspoint1();
//			device.clickaccessdevice();
			remove.clicktocombo();
			remove.clicktoremovedevice();
			remove.clickyestoremovedevice();
			remove.clicktoback();
			Log.addMessage("successfully remove combo device");

		} catch (Exception e) {
			Log.addMessage("Failed to remove combo device ");
			e.printStackTrace();
			Assert.assertTrue(false, "remove combo device functionality failed");
		}
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =5)
	public void combo_reader_device_info() {
		try {
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			PartnerDeviceManagementmethods info = new  			PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
 
//			device.clicktoviewbuilding();
//			device.clickbuilding();
			device.clickaccesspoint();
			info.clicktocontroller();
			info.clicktocontrollerinfo();
			info.verifycombo();
			info.clicktobackbutton();
			Log.addMessage("View combo Reader device info sucessfully");

		} catch (Exception e) {
			Log.addMessage("Failed to View combo Reader device info sucessfully");
			e.printStackTrace();
			Assert.assertTrue(false, "View combo Reader device info functionality failed");
		}
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Test(groups="Partner Device", priority =6)
	public void Remove_combo_reader_device() {
		try {
			
			PartnerDeviceManagementmethods device = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
			PartnerDeviceManagementmethods  remove = new   PartnerDeviceManagementmethods((AppiumDriver<MobileElement>) driver);
//			device.clicktoviewbuilding();
//			device.clickbuilding();
//			device.clickaccesspoint();
//			device.clickaccessdevice();
			remove.clicktoremovedevice();
			remove.clickyestoremovedevice();

			Log.addMessage("successfully remove combo device");

		} catch (Exception e) {
			Log.addMessage("Failed to remove combo device ");
			e.printStackTrace();
			Assert.assertTrue(false, "remove combo device functionality failed");
		}
	}
	
	
	

	
	
	
	
	
}
