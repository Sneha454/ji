package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeDate {
	
	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		//	WebDriver driver = new FirefoxDriver();
		  FirefoxDriver driver;
		  
		  driver=new FirefoxDriver();
		  driver.get("http://www.timeanddate.com/worldclock/");
		  driver.manage().window().maximize();
		    
		  
		  String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		  String part2="]/td[1]";
		  
		  for(int i=1;i<=36;i++)
		  {
		  String x=driver.findElement (By.xpath(part1+i+part2)).getText();
		  System.out.println(x);
		  }
}
}
