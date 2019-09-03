package com.atmecs.orangrhr;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginDriver {
public static WebDriver driver;

@BeforeClass
public void launchDriver() throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

 
 }
