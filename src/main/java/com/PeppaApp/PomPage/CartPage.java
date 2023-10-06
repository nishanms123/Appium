package com.PeppaApp.PomPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	AndroidDriver driver;
	@FindBy(xpath="//android.view.View[@content-desc='1']")
	private WebElement cartBttn;
	@FindBy(xpath="//android.widget.ImageView[@content-desc='White T-shirts couple combo £10.80 Subtotal: £10.80']")
	private WebElement shirtinCart;
	@FindBy(xpath="//android.widget.Button[@content-desc='PROCEED']")
	private WebElement purchaseBtn;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Continue as guest\"]")
	private WebElement continueAsGuest;
	
	public CartPage(AndroidDriver driver)
	{
		  this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	

	public WebElement getCartBttn() {
		return cartBttn;
	}

	
	public WebElement getPurchaseBtn() {
		return purchaseBtn;
	}
	

        public WebElement getContinueAsGuest() {
		return continueAsGuest;
	}



		public void CartBttn() {
		
		cartBttn.click();
		
	}

	public void getShirtinCart(String expected) {
		 String actual = shirtinCart.getText();
		 Assert.assertEquals(actual,expected);
	}
	
	public void purchase()
	{
		purchaseBtn.click();
		continueAsGuest.click();
		
	}
	
	
	
}
