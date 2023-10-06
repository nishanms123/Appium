package com.PeppaApp.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class CategoriesPage {
        AndroidDriver driver;
	@FindBy(xpath="//android.widget.Button[@content-desc='Add To Cart']")
	private WebElement addCart;
	
	public CategoriesPage(AndroidDriver driver)
	{     
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void getAddCart() throws Throwable  {
			
		
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",898,"y",566));
		
			Thread.sleep(5000);
		
		addCart.click();
		Thread.sleep(5000);
		
	}
	
	
	

}
