package com.PageObjM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.LoginPom;

public class PageObjectManager {
	
	
	public WebDriver driver;
	
	private LoginPom login;



	public LoginPom getLogin() {
		
		login= new LoginPom(driver);
	
		
		return login;
	}
	
	
	public PageObjectManager(WebDriver d) {
		 driver =d;
		 PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	

}
