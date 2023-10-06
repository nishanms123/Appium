package com.peppaiApp;

import org.testng.annotations.Test;

import com.PeppaApp.PomPage.Searchpage;

import genericUtility.BaseClassForPeppaApp;

public class SearchProductTest extends BaseClassForPeppaApp{
	@Test
	public void searchProduct()
	{
		Searchpage s=new Searchpage(driver);
		s.searchproduct("nikkie");
	}

}
