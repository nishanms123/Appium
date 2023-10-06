package com.PeppaApp.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CreateAccountPage {
  AndroidDriver driver;
	@FindBy(xpath="(//android.widget.EditText)[1]")
	private WebElement firstName;
	@FindBy(xpath="(//android.widget.EditText)[2]")
	private WebElement lastName;
	@FindBy(xpath="(//android.widget.EditText)[3]")
	private WebElement email;
	@FindBy(xpath="(//android.widget.EditText)[4]")
	private WebElement password;
	@FindBy(xpath="(//android.widget.EditText)[5]")
	private WebElement confirmpassowrd;
	@FindBy(xpath="(//android.widget.EditText)[6]")
	private WebElement  dateofbirth;
	@FindBy(xpath="(//android.widget.CheckBox)[0]")
	private WebElement checkbox;
	
	public CreateAccountPage(AndroidDriver driver)
	{   
		  this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassowrd() {
		return confirmpassowrd;
	}

	public WebElement getDateofbirth() {
		return dateofbirth;
	}
	
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public void createAccount(String name,String lastname,String Email,String Password,String ConfirmPassword,String dateofb)
	{
		
		firstName.sendKeys(name);
		lastName.sendKeys(lastname);
		email.sendKeys(Email);
		password.sendKeys(Password);
		confirmpassowrd.sendKeys( ConfirmPassword);
		dateofbirth.sendKeys( dateofb);
		checkbox.click();
		
	}
	
}
