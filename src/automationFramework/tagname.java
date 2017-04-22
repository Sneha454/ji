package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int visblie=0;
		int hide=0;
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize();
		 List<WebElement> li=driver.findElements(By.tagName("a"));
		 System.out.println(li.size());
		 for(int i=0;i<li.size();i++)
		 {
			 if(li.get(i).isDisplayed())
			 {
				System.out.println(li.get(i).getText());
				li.get(i).click();
				System.out.println(driver.getCurrentUrl());
				driver.navigate().back();
				li=driver.findElements(By.tagName("a"));
				 
			 }
			
			 
			 
		 }
		 System.out.println("visbile ="+visblie);
		 System.out.println("hidden links ="+hide);
		 driver.close();

	}

}
