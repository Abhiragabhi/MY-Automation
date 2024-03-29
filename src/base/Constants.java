package base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.PropertyUtility;
import utility.ReadEmail;

public class Constants {
	   
	public static WebDriver driver;
	public static AppiumDriver<MobileElement> appiumDriver;
	public static DesiredCapabilities iOSCapabilities = new DesiredCapabilities();
	public static DesiredCapabilities androidCapabilities = new DesiredCapabilities();
	public static DesiredCapabilities webCapabilities = new DesiredCapabilities();
	public static Properties sysProps = System.getProperties();
	public static String userDirectory = sysProps.getProperty("user.dir");
	
	
	public static String environment;
	public static int counter = 1;
	public static String appType;
	public static String product;
	public static String model;
	public static String hard_rev;
	public static String combined_lockname="";
	public static String full_lockname="";
	public static String t_full_lockname="";
	public static String temp_full_lockname="";
	public static String browser;
	public static String Reg_lockname = null;
	public static String suite = sysProps.getProperty("suite");
	
	public static String baseUri;
	public static String lockCount_s = "2";
	public static int lock_count = 0;
	public static int swipe_count = 0;
	public static RequestSpecification httpRequest;
	public static Response response;
	public static String responseBody;
	public static String lockname []=new String[20];
	public static String temp_lockname []=new String[20];
	public static String homename []=new String[50];
	public static String accessName;
	public static int statusCode;
	public static String contentType;
	public static String datafile;
	public static ReadEmail emailUtils;
	String currentURL = "";
	public static String OS = System.getProperty("os.name");
	public static String env;
    protected static String dataFile = PropertyUtility.getProperty("iOSDatafile");
    protected static String logfile = PropertyUtility.getProperty("Logfile");
    protected static String reportfile = PropertyUtility.getProperty("Reportfile");
    protected static String ip = PropertyUtility.getProperty("Ip");
    public static String url=null;
    public static String testdata =null;
	protected static String InputData = PropertyUtility.getProperty("InputData");
	protected static String OutputLockData = PropertyUtility.getProperty("OutputLockData");

	public static String projectName=PropertyUtility.getProperty("ProjectName");
	public static String prodSite=PropertyUtility.getProperty("prodUrl");
	public static String testSite=PropertyUtility.getProperty("testUrl");
	public static String intSite=PropertyUtility.getProperty("integrationUrl");
	public static String devSite=PropertyUtility.getProperty("devUrl");
	public static String subject;
	public static String site = null;
	public static List<String[]> data = new ArrayList<String[]>();
	public static List<String[]> list = new ArrayList<String[]>();
	public String application;
	public static File file;
	public static String device;
	 protected static String port = PropertyUtility.getProperty("Port");
}
