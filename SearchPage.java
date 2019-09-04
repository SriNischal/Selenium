package com.atmecs.orangrhr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchPage extends Flight {
	@Test(priority=2)
	public void flight1() throws IOException {
	
		FlightProperties fp = new FlightProperties();
			driver.findElement(By.xpath(fp.readPropertiesFile("searchpage.From.txt"))).sendKeys("Hyderabad");
			driver.findElement(By.xpath(fp.readPropertiesFile("searchpage.From.txt"))).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath(fp.readPropertiesFile("searchpage.To.txt"))).sendKeys("Vijayawada");
			driver.findElement(By.xpath(fp.readPropertiesFile("searchpage.To.txt"))).sendKeys(Keys.ENTER);
			clickOnElement(driver, "//input[@id='DepartDate']");
			clickOnElement(driver, fp.readPropertiesFile("searchpage.Departon.txt"));
			selectDropdown(fp.readPropertiesFile("searchpage.Adults.txt"), "1");
			selectDropdown(fp.readPropertiesFile("searchpage.Children.txt"), "1");
			driver.findElement(By.xpath(fp.readPropertiesFile("searchpage.searchFlight.txt"))).click();
		
		}	

	public void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);

	}

	public void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}
}