package com.atmecs.orangrhr;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectFlight extends SearchPage {
	@Test(priority=3)
	public void select() throws IOException, InterruptedException {
		FlightProperties fp = new FlightProperties();
		Thread.sleep(5000);
	driver.findElement(By.xpath(fp.readPropertiesFile("selectflight.book.txt"))).click();

}
}
