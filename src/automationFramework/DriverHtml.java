package automationFramework;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class DriverHtml  {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		//driver.setJavascriptEnabled(true);
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
	}


}
