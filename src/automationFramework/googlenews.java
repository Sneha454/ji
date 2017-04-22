package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlenews {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in");
		driver.manage().window().maximize();
		List<WebElement>headlines= driver.findElements(By.tagName("h2"));
		//List<WebElement>headlines= driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		System.out.println(headlines.size());
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
		driver.close();
	}

}
