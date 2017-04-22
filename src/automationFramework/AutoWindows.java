package automationFramework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoWindows {
 
	private static WebDriver driver = null;
 
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	    driver = new FirefoxDriver();
 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	    driver.get("http://jpg2png.com/");
 
	    driver.findElement(By.xpath(".//*[@id='pick-files']/span[2]")).click();
 
	    System.out.println("aa");
	    //Runtime.getRuntime().exec("C:/Users/User/Documents/selenum/Manual Testing\first1.exe");
	    Robot robot = new Robot();
		robot.delay(5000);
		/*for (int i = 0; i <= 6; i++) {
			Thread.sleep(1000);	 
		  robot.keyPress(KeyEvent.VK_TAB);
		  //System.out.println(i);
		}*/
		/*Integer ic = (Integer)ht.get('v');
		Integer j= new Integer(3);*/
		robot.keyPress(KeyEvent.VK_A);
		System.out.println("ss");	
		
		//Thread.sleep(5000);
	    Thread.sleep(5000);
 
	   // driver.close();
	}

}

