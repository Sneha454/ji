package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	WebDriver driver;
	
  @Test
  public void main() throws InterruptedException 
  {
	  
	  WebElement element= driver.findElement(By.xpath(".//*[@id='searchInput']"));
	  element.sendKeys("Testing");
	  driver.findElement(By.xpath(".//*[@id='search-form']/fieldset/button")).click();
	  WebElement ele =driver.findElement(By.linkText("Contents"));
	  Thread.sleep(5000);
	  ele.click();
	  Thread.sleep(5000);
	  driver.navigate().to("https://en.wikipedia.org/wiki/Test");
	  Thread.sleep(5000);
	  WebElement ele1 =driver.findElement(By.partialLinkText("Current"));
	  Thread.sleep(5000);
	  ele1.click();
	  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	  System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://www.wikipedia.org/");
	 
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  //driver.quit();
  }

}
