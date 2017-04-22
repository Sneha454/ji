
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class VryTtl {

	
		public static void main(String[] args) {
			HtmlUnitDriver driver = new HtmlUnitDriver();
			//driver.setJavascriptEnabled(true);
			driver.get("http://google.com");
			
			System.out.println(driver.getTitle());
		}


	}