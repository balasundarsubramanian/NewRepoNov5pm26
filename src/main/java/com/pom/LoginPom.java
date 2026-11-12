package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	// @FindBy

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(name = "password")
	
	private WebElement pass;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;

//	public WebElement getUser() {
//		return user;
//	}
//
//	public WebElement getPass() {
//		return pass;
//	}
//
//	public WebElement getLogin() {
//		return login;
//	}

	public LoginPom(WebDriver d) { //parameterized constructor

		driver = d;
     PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
