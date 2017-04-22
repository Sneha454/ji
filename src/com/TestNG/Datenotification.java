package com.TestNG;


	import java.util.List;

import org.eclipse.jetty.util.thread.Sweeper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.server.browserlaunchers.Sleeper;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Datenotification {
	 WebDriver driver;
	// FirefoxDriver driver=new FirefoxDriver();
	 @BeforeTest
	 public void setUp()
	 {
		 System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	//  
	  driver=new FirefoxDriver();
	  driver.get("http://cleartrip.com");
	  driver.manage().window().maximize();
	 }
	 
	 @Test
	 public void calanderTest()
	 {
	  driver.findElement(By.id("OneWay")).click();
	  driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	  driver.findElement(By.id("ToTag")).sendKeys("Islamabad, PK - Islamabad (ISB)");

	 //Xpath of Calender Icon
	  driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
	  
	  String doj="12/10/2017";
	  String[] a=doj.split("/");
	  String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
	  int x=Integer.parseInt(a[1]);
	  
	  String month=months[x-1];
	  String year=a[2];
	  String day=a[0];

	 //Class of year on the left calendar.

	  String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	  while(!calyear.equals(year))
	  {
	//Xpath of Arrow on the Right Calender   

	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
	//Class of year on the left calendar.
	   
	calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	  }
	//Class of month  on the left calendar.

	  String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	  while(!calmonth.equals(month))
	  {
	//Xpath of Arrow on the Right Calender
	   
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();

	//Class of month  on the left calendar.

	calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	  }

	//Xpath of the left calendar …. Dynamic Web Table
	  WebElement calander=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
	  List<WebElement> rows=calander.findElements(By.tagName("tr"));
	  for(int i=0;i<rows.size();i++)
	  {
	   List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	   for(int j=0;j<cols.size();j++)
	   {
	    if(cols.get(j).getText().equals(day))
	    {
	     cols.get(j).click();
	     break;
	    }
	   }
	  }
	  //Thread.sleep(5000);
	  //Sweeper.sleepTightInSeconds(7);
	  driver.findElement(By.id("SearchBtn")).click();
	 }
	}

