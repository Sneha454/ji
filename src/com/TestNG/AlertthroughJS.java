package com.TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertthroughJS {

	WebDriver driver;
		@Test
		public void f() throws InterruptedException
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("alert('Hello Friends');");
			//Sleeper.sleepTightInSeconds(10);
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		@BeforeTest
		public void beforeTest()
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		}
        @AfterTest
        public void aftertest() throws InterruptedException
        {
	          Thread.sleep(5000);
	          driver.close();
        }
}