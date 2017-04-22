package com.TestNG;

import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;


import java.util.concurrent.TimeUnit;


import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class RepoterLog {
	
	WebDriver driver;
	//private static Logger log = Logger.getLogger(Log.class.getName());
	@Test
	  public void firstMethod() {
	//  DOMConfigurator.configure("log4j.xml");
	  System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	  driver = new FirefoxDriver();
	 // log.info("driver intiated");
	  driver.manage().window().maximize();
	 // log.info("window is maximized");
	  driver.get("https://www.amazon.com/");
	//  log.info("browser is intisted");
	  Reporter.log("Application launched suscessfully");
	 // driver.findElement(By.xpath(".//*[@id='nav-link-accountList']")).click();
	 // driver.findElement(By.className("nav-action-inner")).click();
	
  }

}
