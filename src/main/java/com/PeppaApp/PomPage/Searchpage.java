package com.PeppaApp.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;

public class Searchpage {
	AndroidDriver driver;
	@FindBy(xpath="(//android.widget.Button)[1]")
	private WebElement searchbtn;
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_one_time_button")
	private WebElement allowbtn;
	@FindBy(id="com.android.permissioncontroller:id/permission_deny_button")
	private WebElement allowfinddevice;
	@FindBy(className="android.widget.EditText")
	private WebElement searchfiled;
	
	public Searchpage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getAllowbtn() {
		return allowbtn;
	}

	public WebElement getAllowfinddevice() {
		return allowfinddevice;
	}

	public WebElement getSearchfiled() {
		return searchfiled;
	}
	
	public void searchproduct(String product)
	{
		searchbtn.click();
		allowbtn.click();
		allowfinddevice.click();
		searchfiled.sendKeys(product);
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",995,"y",2205));
		
	}
	

}
