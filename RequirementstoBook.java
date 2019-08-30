package com.atmecs.orangrhr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RequirementstoBook extends Driver {
	@Test(priority=2)
	public void test() {
		driver.findElement(By.xpath("(//li[@class=\"clearfix\"])[1]")).click();
        driver.findElement(By.xpath("(//i[@class=\"icon icon-tick_single fr\"])[1]")).click();
        driver.findElement(By.xpath("(//li[@class=\"clearfix\"])[2]")).click();
        driver.findElement(By.xpath("(//i[@class=\"icon icon-tick_single fr\"])[2]")).click();
        driver.findElement(By.xpath("(//li[@class=\"clearfix\"])[3]")).click();
        driver.findElement(By.xpath("(//i[@class=\"icon icon-tick_single fr\"])[3]")).click();
        //driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[1]")).click();
        //driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[2]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[3]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[4]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[5]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[6]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[7]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[8]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[9]")).click();
        driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[10]")).click();
        //driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[11]")).click();
        //driver.findElement(By.xpath("(//label[@class=\"custom-checkbox\"])[12]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[1]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[2]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[3]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[4]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[5]")).click();
        driver.findElement(By.xpath("(//span[@class=\"fl\"])[6]")).click();
        //driver.findElement(By.xpath("(//span[@class=\"fl\"])[7]")).click();
		//driver.findElement((By.xpath("(//div[@class=\"button\"])[1]"))).click();
		driver.findElement((By.xpath("(//div[text()=\"View Seats\"])[1]"))).click();
		//driver.findElement(By.xpath("(//div[@class=\"radio-unchecked\"])[1]")).click();
		//driver.findElement(By.xpath("(//div[@class=\"radio-unchecked\"])[4]")).click();
	}

}
