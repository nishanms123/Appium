package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	AndroidDriver driver;
	public GestureUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void dragAndDrop(WebElement element,int endX,int endY)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", endX,
			    "endY", endY
			));
	}
	public void clickGesture(WebElement element)
	{
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()));
	}
	public void longPressGesture(WebElement element,int duration)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",duration));
	}
	
	public void scrollGesture(String optionValue)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+optionValue+"\"));"));
	}
	
	public void swipeGesture(int left,int top,int width,int height,String direction,int percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top",top, "width", width, "height",height,
			    "direction", direction,
			    "percent", percent
			));
	}
	
	public void pinchInGesture(WebElement element,int percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement) element).getId(),
			    "percent", percent
			));
	}
	public void pinchCloseGesture(WebElement element,int percent)
	{
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", percent
			));
	}
			

}
