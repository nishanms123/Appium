package com.peppaiApp;

import java.time.Duration;

import org.testng.annotations.Test;

import com.PeppaApp.PomPage.CartPage;
import com.PeppaApp.PomPage.CategoriesPage;

import genericUtility.BaseClassForPeppaApp;

public class PurchaseProductTest extends BaseClassForPeppaApp {
	
	@Test
	public void purchaseProduct() throws Throwable 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		h.womencontentCategories();
		CategoriesPage c=new CategoriesPage(driver);
		c.getAddCart();
		CartPage ca=new CartPage(driver);
		ca.CartBttn();
		ca.purchase();

	}
	

}
