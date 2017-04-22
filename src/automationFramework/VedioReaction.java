package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VedioReaction {
	public static void main(String[] args) throws ATUTestRecorderException, InterruptedException{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.get("http://www.google.com");
	  ATUTestRecorder recorder=new ATUTestRecorder("D:\\workspace\\Recordings","OrangeHrm.mov",false);
			recorder.start();
			//FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin"); 
			driver.findElement(By.id("btnLogin")).click(); 
			Thread.sleep(6);
			driver.findElement(By.linkText("Welcome Admin")).click();
			driver.findElement(By.linkText("Logout")).click(); 
			driver.close();
			recorder.stop();
	}
}
