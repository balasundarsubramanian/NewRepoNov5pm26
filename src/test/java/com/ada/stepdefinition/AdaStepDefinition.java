package com.ada.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.PageObjM.PageObjectManager;
import com.ada.Runner.AdaRunenr;
import com.config.ConfigurReader;
import com.pom.LoginPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdaStepDefinition extends BaseClass {

	public WebDriver driver = AdaRunenr.driver;

	//LoginPom l = new LoginPom(driver);
	
	PageObjectManager p = new PageObjectManager(driver);
	
	ConfigurReader c;
	
	

	@Given("user lauch the url of the application")
	public void user_lauch_the_url_of_the_application() throws IOException {
		
		c= new ConfigurReader();
		getUrl(c.getUrl());

		// Write code here that turns the phrase above into concrete actions
	}

	@When("user Enters The Username In The Username Field")
	public void user_enters_the_username_in_the_username_field() {
		inputValue(p.getLogin().getUser(),c.getUser());
	}

	@When("user Enters The Password In The Password Field")
	public void user_enters_the_password_in_the_password_field() {
		
		inputValue(p.getLogin().getPass(), c.getPass());
		
	}

	@Then("user Should Click Login And Navigates to search page")
	public void user_should_click_login_and_navigates_to_search_page() {
		
		clickOnElement(p.getLogin().getLogin());
	}

}
