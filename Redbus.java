package com.atmecs.orangrhr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Redbus {
	
	public static WebDriver driver;
	@BeforeClass
public void launch()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
	driver = new ChromeDriver();
}
	}

