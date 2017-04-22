package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeandDate {
	 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		  FirefoxDriver driver;
		  
		  driver=new FirefoxDriver();
		  driver.get("http://www.timeanddate.com/worldclock/");
		  driver.manage().window().maximize();
		    
		  
		  String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		  String part2="]/td[";
		  String part3="]";
		  for(int i=1;i<=36;i++)
		  {
		  
		  for(int j=1;j<=8;j++){
		   String y=driver.findElement (By.xpath(part1+i+part2+j+part3)).getText();
		   System.out.print(y+"\t");
		  }
		  System.out.println();
		  }
		 } 
}
