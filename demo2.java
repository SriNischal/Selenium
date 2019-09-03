package com.atmecs.orangrhr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srinischal.Thiparani\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/search?fromCityName=Hyderabad%20%28All%20Locations%29&fromCityId=124&toCityName=Bangalore%20%28All%20Locations%29&toCityId=122&onward=12-Sep-2019&opId=0&busType=Any");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//li[@id='12341669']//div//div[text()='View Seats']")).click();
		driver.findElement(By.xpath("//div[@class='upper-canvas canvas-wrapper']//canvas[@data-type='upper']")).click();
		driver.findElement(By.xpath("//li[@class='db oh']")).click();
		   System.out.println("pass");
	}

}
