package com.peppaiApp;



import org.testng.annotations.Test;

import com.PeppaApp.PomPage.LoginPage;

import genericUtility.BaseClassForPeppaApp;

public class LoginTest extends BaseClassForPeppaApp{

	   
	  @Test
	  public void login()
	  {
		  LoginPage l=new LoginPage(driver);
		  l.login("demo@demo","demodemo");
	  }
	  
}
