package com.ada.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\balas\\eclipse-workspace\\AdaCucumber8AM\\src\\test\\java\\com\\ada\\feature\\Adactin.feature",
glue="com.ada.stepdefinition",dryRun = true
,plugin = {"pretty","html:CucumberReport\\reportdata.html","json:CucumberReport\\reportdata.json"})

public class AdaRunenr extends BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {

		driver = browserLaunch("chrome");
	}

//	@AfterClass
//	public static void tearDown() {
//		driver.close();
//	}

}
