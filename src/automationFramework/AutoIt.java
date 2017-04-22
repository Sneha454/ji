package automationFramework;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class AutoIt {
 
	private static WebDriver driver = null;
 
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	    driver = new FirefoxDriver();
 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	    driver.get("http://toolsqa.wpengine.com/automation-practice-form");
 
	    driver.findElement(By.id("photo")).click();
 
	    Runtime.getRuntime().exec("C:/Users/User/Documents/selenum/Manual Testing\first1.exe");
 
	    Thread.sleep(5000);
 
	    driver.close();
	}

}
