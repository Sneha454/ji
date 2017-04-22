package automationFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItPrompt {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.javascripter.net/faq/prompt.htm");
		
		WebElement element=driver.findElement(By.xpath("html/body/p[1]/table/tbody/tr/td[1]/form/input"));
		element.click();
		//Runtime.getRuntime().exec("C:/Users/User/Documents/selenum/Manual Testing/Second.exe");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.sendKeys("Sneha");
		alert.accept();
		Thread.sleep(2000);
		//alert.accept();
		Robot robot = new Robot();
		robot.delay(5000);
		for (int i = 0; i <= 6; i++) {
					Thread.sleep(1000);	 
		  robot.keyPress(KeyEvent.VK_TAB);
		  //System.out.println(i);
		}
		
		robot.keyPress(KeyEvent.VK_SPACE);
			
		
		Thread.sleep(5000);
		
		alert.accept();
	    
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
	}

}
