package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		//connecting to firefox driver
			WebDriver driver= new FirefoxDriver();
			driver.get("http://demo.nopcommerce.com/");
			WebElement registerLink =driver.findElement(By.linkText("Register"));
			if(registerLink.isDisplayed())
			{
				System.out.println("link is present");
				registerLink.click();
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
				WebElement element=driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[1]/h1"));
				if(element.isDisplayed())
				{
					System.out.println("displayed");
				}
				WebElement element1=driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[2]/div[1]/div[2]/div[1]/div/span[2]/label"));
				element1.click();
				WebElement firstNameEdit=driver.findElement(By.id("FirstName"));
				if(firstNameEdit.isDisplayed())
				{
					firstNameEdit.sendKeys("sneha");
					System.out.println("is present");
				}
				else
				{
					System.out.println("not present");
				}
				WebElement lastNameEdit=driver.findElement(By.xpath(".//*[@id='LastName']"));
				lastNameEdit.sendKeys("janga");
			}					
			else
			{
				System.out.println("link is not present");
			}
			Select day= new Select(driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[2]/div[1]/div[2]/div[4]/select[1]"))); 
			day.selectByValue("2");
			Select month= new Select(driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[2]/div[1]/div[2]/div[4]/select[2]"))); 
			month.selectByVisibleText("February");
			Select year= new Select(driver.findElement(By.xpath("html/body/div[5]/div[3]/div/div/form/div/div[2]/div[1]/div[2]/div[4]/select[3]"))); 
			year.selectByIndex(5);
			
			}
			
			
			//driver.quit();
			/*Chrome driver
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1= new ChromeDriver();
			driver1.get("http://demo.nopcommerce.com/");
			driver1.quit();
			*/
		
		
	}



