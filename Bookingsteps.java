package com.atmecs.orangrhr;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class Bookingsteps extends SelectFlight{
	@Test(priority=4)
	public void booking() throws IOException, InterruptedException {
			FlightProperties fp = new FlightProperties();
			Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFile("Iternitystep.Insurance.txt"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("Iternitystep.ContinueDetails.txt"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFile("Emailaddressstep.EmailId.txt")))
				.sendKeys("srinischalthiparani@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFile("Emailaddressstep.Continue.txt"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.Title.txt"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.FirstName.txt"))).sendKeys("Sri Nischal");
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.LastName.txt"))).sendKeys("Thiparani");
		driver.findElement(By.xpath(fp.readPropertiesFile("locators.textarea.Title"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("locators.textarea.FirstName"))).sendKeys("Suraj");
		driver.findElement(By.xpath(fp.readPropertiesFile("locators.textarea.LastName"))).sendKeys("Konangi");
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.Day.txt"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.Month.txt"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.year.txt"))).click();
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.Mobileno.txt"))).sendKeys("9393818194");
		driver.findElement(By.xpath(fp.readPropertiesFile("travellers.Continue.txt"))).click();
	}
}
