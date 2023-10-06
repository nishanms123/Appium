package com.peppaiApp;

import java.time.Duration;

import org.testng.annotations.Test;

import com.PeppaApp.PomPage.CartPage;
import com.PeppaApp.PomPage.CategoriesPage;
import com.PeppaApp.PomPage.CreateAccountPage;

import genericUtility.BaseClassForPeppaApp;

public class CreateAccountAfterPurchaseTest extends BaseClassForPeppaApp {

	@Test
	public void createAccount() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		h.womencontentCategories();
		CategoriesPage c=new CategoriesPage(driver);
		c.getAddCart();
		CartPage ca=new CartPage(driver);
		ca.CartBttn();
		ca.purchase();
		Thread.sleep(5000);
		CreateAccountPage create=new CreateAccountPage(driver);
		create.createAccount("Nishan","MS","msaninishan63@gmail.com","Nishan@123","Nishan@123","09-09-1997");
	}
}
