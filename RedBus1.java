package com.atmecs.orangrhr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus1 {

	public static void main(String[] args) {
//ChromeOptions options = new ChromeOptions();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//ul[@class='autoFill']//li[text()='Hyderabad (All Locations)']")));
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//ul[@class='autoFill']//li[text()='Bangalore (All Locations)']")));
			driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			driver.findElement(By.id("dest")).clear();
			driver.findElement(By.id("dest")).sendKeys("Bangalore");
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//ul[@class='autoFill']//li[text()='Bangalore (All Locations)']")));
			driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		}
		driver.findElement(By.id("onward_cal")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("onward_cal")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("#rb-calendar_onward_cal > table > tbody > tr:nth-child(7) > td.current.day"))
				.click();
		driver.findElement(By.cssSelector("div:nth-child(2) > .tal")).click();
		driver.findElement(By.cssSelector("#rb-calendar_return_cal .we")).click();

		driver.findElement(By.xpath("//button[text()=\"Search Buses\"]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement((By.xpath("(//div[text()='View Seats'])[1]")));
		System.out.println(element.getText());
		element.click();
	}
}