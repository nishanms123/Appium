package com.PeppaApp.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	AndroidDriver driver;
	@FindBy(xpath="//android.view.View[@content-desc='Profile Tab 4 of 4']")
	private WebElement profile;
	@FindBy(xpath="/android.view.View[@content-desc='Sign In or Register']")
	private WebElement signInLink;
	@FindBy(xpath="//android.widget.Button[@content-desc='SIGN IN WITH EMAIL']")
	private WebElement SigInwithEmailbtn;
	@FindBy(xpath="//android.widget.EditText[@text='demo@demo.com']")
	private WebElement email;
	@FindBy(xpath="//android.widget.EditText[@text='demodemo']")
	private WebElement password;
	@FindBy(xpath="//android.widget.Button[@content-desc='SIGN IN']")
	private WebElement loginbttn;
	
	public LoginPage(AndroidDriver driver)
	{   
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getSigInwithEmailbtn() {
		return SigInwithEmailbtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbttn() {
		return loginbttn;
	}
	public void login(String Email,String Password)
	{
		profile.click();
		signInLink.click();
		SigInwithEmailbtn.click();
		email.sendKeys(Email);
		password.sendKeys(Password);
		loginbttn.click();
	}

}
