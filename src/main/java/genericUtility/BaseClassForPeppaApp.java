package genericUtility;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.PeppaApp.PomPage.HomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClassForPeppaApp {
	AppiumDriverLocalService services;
	public FileUtility fi=new FileUtility();
	public AndroidDriver driver;
	public GestureUtility gest;
	public HomePage h;
	public static AndroidDriver sdriver;
	
	
	@BeforeSuite
	public void launchServer()
	{
		File f=new File("C:\\Users\\msani\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 services=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(300)).build();
		services.start();
	}
	@BeforeMethod
	public void openApp() throws Throwable
	{  
		String p_name =fi.getDataFromPropertyFile("platformname");
		String d_name =fi.getDataFromPropertyFile("devicename");
		String A_name =fi.getDataFromPropertyFile("automationname");
		String udid =fi.getDataFromPropertyFile("udid");
		String Username = fi.getDataFromPropertyFile("username");
		String Password=fi.getDataFromPropertyFile("password");
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,p_name);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,d_name);
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,A_name);
		dc.setCapability(MobileCapabilityType.UDID,udid);
		
	     dc.setCapability("appPackage","com.webkul.mobikul_prestashop_app");
	     dc.setCapability("appActivity",".MainActivity");
	     
	     URL url=new URL("http://localhost:4723");
	       driver=new AndroidDriver(url, dc);
	       sdriver=driver;
	        gest=new GestureUtility(driver);
	        h=new HomePage(driver);
	        
			 
	}
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
	
	@AfterSuite
	public void closeServer()
	{
		//services.stop();
	}

}
