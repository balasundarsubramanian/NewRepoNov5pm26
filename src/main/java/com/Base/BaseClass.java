package com.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String name) {

		// chrome.equals chrome
		if (name.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		}

		else if (name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}
		return driver;

	}
	
	public static void maxi() {
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void inputValue(WebElement ele, String cred) {
		ele.sendKeys(cred);
	}
	
	public static void clickOnElement(WebElement cl) {
		cl.click();
	}
	
	public static void snap(String fname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\balas\\eclipse-workspace\\Project8New\\Screenshot\\"+fname+".png");
		FileUtils.copyFile(src, des);
		
		
		
	}
	
	public static void cancel() {
		driver.quit();
	}

}
