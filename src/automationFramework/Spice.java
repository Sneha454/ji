package automationFramework;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spice {

	
		public static void main(String[] args) throws IOException, InterruptedException, AWTException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://www.spicejet.com/");
		// TODO Auto-generated method stub
		    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Delhi");

	}

}
