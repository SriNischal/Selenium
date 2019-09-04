package com.atmecs.orangrhr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flight {
   WebDriver driver;

	@Parameters("selecteddriver")
	@Test(priority=1)
	public void setBrowser(String selecteddriver) throws IOException {

		switch (selecteddriver) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Srinischal.Thiparani\\Downloads\\geckodriver-v0.24.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.get("https://www.cleartrip.com/");
		
	}

}