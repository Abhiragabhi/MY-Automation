package tests.app.mf;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import pages.app.mf.BuildingsPageMF;
import pages.app.mf.FilterMethods;
import pages.app.mf.Genericmethods;
import pages.app.mf.HomeUsersPageAppMF;
import pages.app.mf.UnitManagementPages;
import pages.app.mf.UserAccessManagementMethods;
import pages.app.mf.UserManagement;
import pages.app.mf.Usergroup_Apppage_MF;
import utility.Log;
import utility.Utility;
import utility.Utility.Direction;

public class UserAccessManagementTest extends Settings {



	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	



	
	
///
	
	
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =2)
			public void Adduser_Enter_user_name_and_type() {
				try {
					
			
					
					UserAccessManagementMethods user = new  UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					HomeUsersPageAppMF search = new   HomeUsersPageAppMF((AppiumDriver<MobileElement>) driver);

					Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
					g.Relauchtheapp();
			         Thread.sleep(5000);
					
					search.clickOnpeoplebutton();
					user.clickOnAdduser();
					 user.Adduser_Enterusernameandtype("abhirag@gmail.com", "MF Test", "Auto", "User");
				
					
					Log.addMessage("Successfully provide first name and last name and user type");

				} catch (Exception e) {
					Log.addMessage("provide first name and last name failed");
					e.printStackTrace();
					Assert.assertTrue(false, "provide first name and last name, and user type functionality failed");
				}
			}
    
    
    

		
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =3)
			public void Search_and_SelectUserGroup() {
				try {
					
					
					 Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
						
					
					 UserAccessManagementMethods sg = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					usergroup.SearchGroup("vibe");
					 sg.clickOngroup();
					 sg.clickOngroupcontinue();
                  
					Log.addMessage("Successfully select user group");

				} catch (Exception e) {
					Log.addMessage("failed to select user group");
					e.printStackTrace();
					Assert.assertTrue(false, "Select user group functionality failed");
				}
			}
    
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =4)
			public void Add_user_Filterunit_and_AP() {
				try {
					
					
				
					UserAccessManagementMethods su = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					 su.selectbuilding();
				    su.clickOnfliterbutton();
				
		     	 
				    su.selectbyfloor();
				    su.clickonresult();
           		
              
					Log.addMessage("Successfully select units");

				} catch (Exception e) {
					Log.addMessage("Failed to select units");
					e.printStackTrace();
					Assert.assertTrue(false, "Select units functionality failed");
				}
			}
    
			

			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =5)
			public void Select_Units_from_Building() {
				try {
					Genericmethods generic = new   Genericmethods((AppiumDriver<MobileElement>) driver);
					UserAccessManagementMethods su = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					UnitManagementPages clickonbuilding = new UnitManagementPages((AppiumDriver<MobileElement>) driver);
					clickonbuilding.Clickfirstunit();
					Thread.sleep(2000);
					 su.clickoncontinuefloor();
					 su.clickOncontinuegroup();
				     generic.Clickoncontinuebutton();
					Log.addMessage("Successfully select units building");

				} catch (Exception e) {
					Log.addMessage(" failed to  select units building");
					e.printStackTrace();
					Assert.assertTrue(false, "Select units building functionality failed");
				}
			}
			
		
	
			
			
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =6)
			public void NoT_ime_limitation() {
				try {
					UserAccessManagementMethods caa = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					Genericmethods generic = new   Genericmethods((AppiumDriver<MobileElement>) driver);
					Thread.sleep(5000);
			        caa.Accesstimepageverification();
				     generic.Clickoncontinuebutton();
				     
				     caa.verifyshareaccesspage();
				
					Log.addMessage("Successfully set without limitation ");

				} catch (Exception e) {
					Log.addMessage(" Failed to set without limitation");
					e.printStackTrace();
					Assert.assertTrue(false, "Set without limitation functionality failed");
				}
			}
			
			

			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =7)
			public void Limited_Time() {
				try {
					UserAccessManagementMethods la = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					 

					la.backtoaccessbutton();
					 la.setaccesstimestart();
					 la.clicktosetaccesstime();
					 la.setaccesstimeend();
					 la.setaccesstimeendselectmont();
					 la.setaccesstimeendselect();
			     	 la.clicktoendaccesstime();
					 la.clickonaccesscontinuetimebtn();
					
					Log.addMessage("Successfully set limitation");

				} catch (Exception e) {
					Log.addMessage("Failed to set limitation");
					e.printStackTrace();
					Assert.assertTrue(false, "Failed to set limitation functionality failed");
				}
			}
			
              

			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =8)
			public void Limited_Time_Repeat_Limit_by_weekday_Time() {
				try {
					UserAccessManagementMethods tr = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					 tr.backtoaccessbutton();
					 tr.clickOnrepeat();
					 
			//		 tr.clickonout();
					 tr.selectday();
					 tr.clickOnrepeatweek();
                  
					Log.addMessage("Successfully set limited Repeat ");

				} catch (Exception e) {
					Log.addMessage(" Failed to set limited Repeat");
					e.printStackTrace();
					Assert.assertTrue(false, "set limited Repeat functionality failed");
				}
			}
			
			
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management", priority =9)
//			public void ShareAccesswithUser() {
//				try {
//					UserAccessManagementMethods sa = new    UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					 sa.shareaccesstouser();
//					 sa.shareaccesstouse();
//					 sa.shareaccessclick();
//					 sa.shareaccessclickdone();
//					 Utility.simpleWait(3000);
//					 Utility.Clickbackbutton();
//                  
//					Log.addMessage("Successfully share the code");
//
//				} catch (Exception e) {
//					Log.addMessage("Failed to share the code");
//					e.printStackTrace();
//					Assert.assertTrue(false, "Share the code functionality failed");
//				}
//			}
//    
			
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =9)
			public void Adduser_Createusergroup() {
				try {
					
					
					Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
					g.Relauchtheapp();			         
					Thread.sleep(5000);
					
					
					
					 UserAccessManagementMethods sg = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
						Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
					sg.clickOnpeoplebutton();
					
					
					
					
					sg.clickOnAdduser();
					 sg.Adduser_Enterusernameandtype("abhirag@gmail.com", "MF Test", "Auto", "User");
						
					  String Gname = "User Access Group";
					  String Description = "Created for User Access";
					  usergroup.AddnewGroup(Gname, Description);
					
					 sg.clickOngroupcontinue();
                  
					Log.addMessage("Successfully created  user group from add user work flow");

				} catch (Exception e) {
					Log.addMessage("failed to select user group");
					e.printStackTrace();
					Assert.assertTrue(false, "Select user group functionality failed");
				}
			}
    
			
			
			
			@SuppressWarnings("unchecked")
			@Test(groups="User Access Management", priority =10)
			public void Adduser_Createusergroup_select_AP() {
				try {
					
					
					 Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
				BuildingsPageMF building = new BuildingsPageMF((AppiumDriver<MobileElement>) driver);
				Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
		      building.SelectBuilding("MF Auto");
					Thread.sleep(3000);
					generic.Selectbyname("Access Point 1");
					Thread.sleep(2000);
					generic.Clickoncontinuebutton();
					generic.Clickoncontinuebutton();
					
					Log.addMessage("Successfully select user group");
					
					
					UserAccessManagementMethods sg = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
					Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
        			g.Relauchtheapp();
		         Thread.sleep(5000);	
		         sg.clickOnpeoplebutton();
			 usergroup.click_on_user_tab_settings_icon();
		         g.Searchanitem("User Access Group");
		         Thread.sleep(3000);
		         Utility.Selectbyname("User Access Group");
		         Thread.sleep(3000);
		         usergroup.deleteusergroup();


				} catch (Exception e) {
					Log.addMessage("failed to select user group");
					e.printStackTrace();
					Assert.assertTrue(false, "Select user group functionality failed");
				}
			}
    
			
//			
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management", priority =11)
//			public void Adduser_Createusergroup_selectnewgroup() {
//				try {
//					
//					
//					 Usergroup_Apppage_MF usergroup = new Usergroup_Apppage_MF((AppiumDriver<MobileElement>) driver);
//						
//					
//					 UserAccessManagementMethods sg = new   UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					Thread.sleep(2000);
//					usergroup.SearchGroup("User Access Group");
//					 sg.clickOngroup();
//					 sg.clickOngroupcontinue();
//                  
//					Log.addMessage("Successfully select user group");
//					
//					
//					///Delete the user group created
//					
//				
//		         
//				} catch (Exception e) {
//					Log.addMessage("failed to select user group");
//					e.printStackTrace();
//					Assert.assertTrue(false, "Select user group functionality failed");
//				}
//			}
//    
//			
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management", priority =12)
//			public void Search_for_existing_user() {
//				try {
//					
//					Genericmethods g = new Genericmethods((AppiumDriver<MobileElement>) driver);
//        			g.Relauchtheapp();
//		         Thread.sleep(5000);					
//					
//					
//					Genericmethods generic = new Genericmethods((AppiumDriver<MobileElement>) driver);
//					UserAccessManagementMethods su = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//			       // su.clicktoallowlocation();
//					su.clickOnpeoplebutton();
//					
//					su.clickOnAdduser();
//					su.clckonsearch();
//					su.verifysearchpage();
//					generic.clearsearchbox();
//					Log.addMessage("Successfully done search for user Functionality");
//
//				} catch (Exception e) {
//					Log.addMessage(" Search for user Functionality failed");
//					e.printStackTrace();
//					Assert.assertTrue(false, " Search for user Functionality failed");
//				}
//			}

	
//
//				@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management",priority =12)
//			public void AccessforPMA() {
//				try {
//					UserAccessManagementMethods pmauser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					
//				
//					
//					
//					pmauser.clickonpeoplebutton();		
//					pmauser.clicktoadduser();
//			        Utility.swipeScreen(Direction.UP);
//					pmauser.clickonPMAadmin();
//					pmauser.shareaccesstouser();
//					pmauser.shareaccesstouse();
//					pmauser.shareaccessclick();
//					pmauser.shareaccessclickdone();
//				//	pmauser.verifypmaaccessshare();
//					pmauser.clickonbacknavigation();
//					
//					Log.addMessage("Successfully Pma access code share Functionality");
//
//				} catch (Exception e) {
//					Log.addMessage("Pma access code share Functionality failed");
//					e.printStackTrace();
//					Assert.assertTrue(false, " Pma access code share Functionality failed");
//				}
//			}
//			
//			
//				
//				
//				@SuppressWarnings("unchecked")
//				@Test(groups="User Access Management",priority =13)
//				public void AccessforPMU() {
//					try {
//						UserAccessManagementMethods pmuuser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//						
//			
//						
//						
//						pmuuser.clickonpeoplebutton();		
//						pmuuser.clicktoadduser();		
//						pmuuser.shareaccesstouser();
//						pmuuser.shareaccesstouse();
//						pmuuser.shareaccessclick();
//						pmuuser.shareaccessclickdone();
//					//	pmuuser.verifypmaaccessshare();
//						pmuuser.clickonback();
//						Log.addMessage("Successfully Pmu access code share Functionality");
//
//					} catch (Exception e) {
//						Log.addMessage("Pmu access code share Functionality failed");
//						e.printStackTrace();
//						Assert.assertTrue(false, " Pmu access code share Functionality failed");
//					}
//				}
//				
//				
//				
////
//			@SuppressWarnings("unchecked")
//		@Test(groups="User Access Management",priority =12)
//		public void AccessforPMA() {
//			try {
//				UserAccessManagementMethods pmauser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//				
//			
//				
//				
//				pmauser.clickonpeoplebutton();		
//				pmauser.clicktoadduser();
//		        Utility.swipeScreen(Direction.UP);
//				pmauser.clickonPMAadmin();
//				pmauser.shareaccesstouser();
//				pmauser.shareaccesstouse();
//				pmauser.shareaccessclick();
//				pmauser.shareaccessclickdone();
//			//	pmauser.verifypmaaccessshare();
//				pmauser.clickonbacknavigation();
//				
//				Log.addMessage("Successfully Pma access code share Functionality");
//
//			} catch (Exception e) {
//				Log.addMessage("Pma access code share Functionality failed");
//				e.printStackTrace();
//				Assert.assertTrue(false, " Pma access code share Functionality failed");
//			}
//		}
//		
//		
//			
//			
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management",priority =13)
//			public void AccessforPMU() {
//				try {
//					UserAccessManagementMethods pmuuser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					
//		
//					
//					
//					pmuuser.clickonpeoplebutton();		
//					pmuuser.clicktoadduser();		
//					pmuuser.shareaccesstouser();
//					pmuuser.shareaccesstouse();
//					pmuuser.shareaccessclick();
//					pmuuser.shareaccessclickdone();
//				//	pmuuser.verifypmaaccessshare();
//					pmuuser.clickonback();
//					Log.addMessage("Successfully Pmu access code share Functionality");
//
//				} catch (Exception e) {
//					Log.addMessage("Pmu access code share Functionality failed");
//					e.printStackTrace();
//					Assert.assertTrue(false, " Pmu access code share Functionality failed");
//				}
//			}
//			
//			
//			
//
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management",priority =14)
//			public void AccessforIA() {
//				try {
//					UserAccessManagementMethods iauser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					
//					
//					iauser.clickonpeoplebutton();		
//					iauser.clicktoadduser();
//		                Utility.swipeScreen(Direction.UP);
//		      
//					iauser.clickonadmin();
//					iauser.selectgrouptoaccess();
//					iauser.selectbuldingtoaccess();
//					iauser.selectfloortoaccess();
//					iauser.selectcontinueaccess();
//					iauser.continueaccessbutton();
//					iauser.shareaccesstouser();
//					iauser.shareaccesstouse();
//					iauser.shareaccessclick();
//					iauser.shareaccessclickdone();
//					iauser.clickonbackbtn();
//			//		iauser.verifypmaaccessshare();
//					
//					Log.addMessage("Successfully IA access code share Functionality");
//
//				} catch (Exception e) {
//					Log.addMessage("IA access code share Functionality failed");
//					e.printStackTrace();
//					Assert.assertTrue(false, " IA access code share Functionality failed");
//				}
//			}
//			
//			
//			
//			
//			@SuppressWarnings("unchecked")
//			@Test(groups="User Access Management",priority =15)
//			public void AccessforIU() {
//				try {
//					UserAccessManagementMethods iuuser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//					
//					
//					
//					iuuser.clickonpeoplebutton();		
//					iuuser.clicktoadduser();
//					iuuser.selectgrouptoaccess();
//					iuuser.selectbuldingtoaccess();
//					iuuser.selectfloortoaccess();
//					iuuser.clickoncontinuebuilding();
//					iuuser.continueaccessbutton();
//					iuuser.shareaccesstouser();
//					iuuser.shareaccesstouse();
//					iuuser.shareaccessclick();
//					iuuser.shareaccessclickdone();
//					iuuser.clickbackbtn();
//			//		iauser.verifypmaaccessshare();
//					
//					Log.addMessage("Successfully IU access code share Functionality");
//
//				} catch (Exception e) {
//					Log.addMessage("IU access code share Functionality failed");
//					e.printStackTrace();
//					Assert.assertTrue(false, " IU access code share Functionality failed");
//				}
//			}
//				@SuppressWarnings("unchecked")
//				@Test(groups="User Access Management",priority =14)
//				public void AccessforIA() {
//					try {
//						UserAccessManagementMethods iauser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//						
//						
//						iauser.clickonpeoplebutton();		
//						iauser.clicktoadduser();
//			                Utility.swipeScreen(Direction.UP);
//			      
//						iauser.clickonadmin();
//						iauser.selectgrouptoaccess();
//						iauser.selectbuldingtoaccess();
//						iauser.selectfloortoaccess();
//						iauser.selectcontinueaccess();
//						iauser.continueaccessbutton();
//						iauser.shareaccesstouser();
//						iauser.shareaccesstouse();
//						iauser.shareaccessclick();
//						iauser.shareaccessclickdone();
//						iauser.clickonbackbtn();
//				//		iauser.verifypmaaccessshare();
//						
//						Log.addMessage("Successfully IA access code share Functionality");
//
//					} catch (Exception e) {
//						Log.addMessage("IA access code share Functionality failed");
//						e.printStackTrace();
//						Assert.assertTrue(false, " IA access code share Functionality failed");
//					}
//				}
//				
//				
//				
//				
//				@SuppressWarnings("unchecked")
//				@Test(groups="User Access Management",priority =15)
//				public void AccessforIU() {
//					try {
//						UserAccessManagementMethods iuuser = new UserAccessManagementMethods((AppiumDriver<MobileElement>) driver);
//						
//						
//						
//						iuuser.clickonpeoplebutton();		
//						iuuser.clicktoadduser();
//						iuuser.selectgrouptoaccess();
//						iuuser.selectbuldingtoaccess();
//						iuuser.selectfloortoaccess();
//						iuuser.clickoncontinuebuilding();
//						iuuser.continueaccessbutton();
//						iuuser.shareaccesstouser();
//						iuuser.shareaccesstouse();
//						iuuser.shareaccessclick();
//						iuuser.shareaccessclickdone();
//						iuuser.clickbackbtn();
//				//		iauser.verifypmaaccessshare();
//						
//						Log.addMessage("Successfully IU access code share Functionality");
//
//					} catch (Exception e) {
//						Log.addMessage("IU access code share Functionality failed");
//						e.printStackTrace();
//						Assert.assertTrue(false, " IU access code share Functionality failed");
//					}
//				}
				
				
				
				
				
	

				
				
			
			
		

//		
			
			
	
}
	
	
	
	
	
	
	

