package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		//connecting to firefox driver
		WebDriver driver= new FirefoxDriver();
			driver.navigate().to("http://money.rediff.com/");
			/*WebElement searchField2 = driver.findElement(By.className("row_GL_col3"));
			System.out.println("Elemene Name By Class Name: "+searchField2.getText());
			List <WebElement> cls=driver.findElements(By.className("row_GL_col3"));
				for(int i=0;i<cls.size();i++)
				        System.out.println(cls.get(i).getText());*/

		driver.navigate().to("http://www.qascripts.com/");
		   List <WebElement> alllinks1 = driver.findElements(By.tagName("h3"));

		    for(int i=0;i<alllinks1.size();i++)
		        System.out.println(alllinks1.get(i).getText());

	}

}
