package com.PeppaApp.PomPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	  
	AndroidDriver driver;
	
	@FindBy(xpath="//android.view.View[@content-desc='Women']")
	private WebElement womencontent;
	

	 
	public HomePage(AndroidDriver driver)
	{   
		   this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getMencontent() {
		return womencontent;
	}

	public void womencontentCategories() 
	{
		womencontent.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",295,"y",2044));	
	}

}
