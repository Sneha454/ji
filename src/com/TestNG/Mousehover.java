package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
	
		 WebDriver driver;
		 @Test
		 public void setUp()
		 {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://yssofindia.org");
			 WebElement website = driver.findElement(By.xpath(".//*[@id='topmenu']/div/ul/li[3]/a/img"));
			 WebElement website1 = driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[3]/ul/li[7]/a"));
			 Actions action=new Actions(driver);
			 action.moveToElement(website).moveToElement(website1).moveToElement(driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[3]/ul/li[7]/ul/li/a"))).click().build().perform();
		  
		 }

		}


