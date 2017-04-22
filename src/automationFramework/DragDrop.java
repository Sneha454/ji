package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/svg/path")).click();
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[3]/a/span")).click();
		 //Sleeper.sleepThightInSecond(10);
		 Thread.sleep(5000);
		 WebElement slide=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[4]"));
		 int x=slide.getLocation().x;
		 int y=slide.getLocation().y;
		 System.out.println(x);
		 System.out.println(y);
		 Actions action=new Actions(driver);
		 action.dragAndDropBy(slide, x,35).build().perform();
		 WebElement slide1=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[2]/div"));
		 System.out.println("slide position");
		 int x1= slide1.getLocation().x;
		 int y1= slide1.getLocation().y;
		 System.out.println(x1);
		 System.out.println(y1);
		 
	}
}
