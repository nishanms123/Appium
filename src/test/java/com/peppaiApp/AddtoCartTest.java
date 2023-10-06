package com.peppaiApp;


import java.time.Duration;

import org.testng.annotations.Test;

import com.PeppaApp.PomPage.CartPage;
import com.PeppaApp.PomPage.CategoriesPage;


import genericUtility.BaseClassForPeppaApp;


public class AddtoCartTest extends BaseClassForPeppaApp{
	

	@Test
	public void openapp() throws Throwable
	
	{
		    
	     
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		h.womencontentCategories();
		CategoriesPage c=new CategoriesPage(driver);
		c.getAddCart();
		CartPage ca=new CartPage(driver);
		ca.getCartBttn();
		ca.getShirtinCart("White T-shirts couple combo £10.80 Subtotal: £10.80");
		
		
		
	
		
		
	}
}
