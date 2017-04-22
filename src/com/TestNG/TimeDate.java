package com.TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeDate {
	
	FirefoxDriver driver;
	 @BeforeTest
	 public void setUp()
	 {
	  System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://www.timeanddate.com/worldclock/");
	  driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void webtableTest()
	 {
	  WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
	  List<WebElement> rows=table.findElements(By.tagName("tr"));
	  for(int i=0;i<rows.size();i++)
	  {
	   List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	   for(int j=0;j<cols.size();j++)
	   {
	    System.out.print(cols.get(j).getText()+"   ");
	   }
	   System.out.println();
	  }
	 }
}
