package genericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.print.PrintOptions.Orientation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.appmanagement.ApplicationState;

public class DriverUtility {
	AndroidDriver driver;
	public DriverUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean installApk(String pathOfApk,String packageName)
	{
		driver.installApp(pathOfApk);
		return driver.isAppInstalled(packageName);
	}
	public void unInstallApk(String packageName)
	{
		driver.removeApp(packageName);
	}
	public void openAnotherApp(String packageName)
	{
		driver.activateApp(packageName);
	}
	public ApplicationState runAppInbackground(int time,String packageName)
	{
		driver.runAppInBackground(Duration.ofSeconds(10));
		 return driver.queryAppState(packageName);
	}
	public boolean deviceLocked()
	{
		return driver.isDeviceLocked();
	}
	public void opennotifcation()
	{
		driver.openNotifications();
	}
  
	public void hideKEyboard()
	{
		driver.hideKeyboard();
	}
	
	public void contextHandle()
	{
		Set<String> contextHandle = driver.getContextHandles();
        int count = contextHandle.size();
        System.out.println(count);
        for(String s:contextHandle)
        {
      	  System.out.println(s);
        }
	}
	public void context(String webview)
	{
		driver.context(webview);
	}
	public void landscapeOrientation()
	{
		ScreenOrientation s = driver.getOrientation();
		driver.rotate(s.LANDSCAPE);
	}
	
	
	
	
}
