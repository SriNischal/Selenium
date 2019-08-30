package com.atmecs.orangrhr;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHR {
	
	WebDriver driver;
	@Test
		public void test() throws IOException {
		//	test t = new test();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.orangehrm.com");
			driver.manage().window().maximize();

	// Perform actions on HTML elements, entering text and submitting the form
			/*WebElement contactElement = driver.findElement(
					By.cssSelector("#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a "));
			contactElement.click();
			WebElement firstElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.firstname")));
			firstElement.sendKeys("Nischal");
			WebElement lastElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.lastname")));
			lastElement.sendKeys("Thparani");
			 WebElement companyElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.companyname")));
			companyElement.sendKeys("atmecs");
			WebElement employeeElement = driver
					.findElement(By.name(t.readPropertiesFile("locators.textarea.numemployees")));
			employeeElement.sendKeys("17");
			WebElement phoneElement = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.phone")));
			phoneElement.sendKeys("17045785");
			WebElement JobTitle = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.jobtitle")));
			JobTitle.sendKeys("Software-Trainee");
			WebElement email = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.email")));

			email.sendKeys("srinischalthiparani@gmail.com");
			WebElement Country = driver.findElement(By.name(t.readPropertiesFile("locators.textarea.country")));
			
			Country.sendKeys("India");

		
			
			
			*/
			
		

			//driver.quit();
	
	
	}
}