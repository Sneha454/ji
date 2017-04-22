package automationFramework;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;


	public class FireFoxTestcase {

		public static void main(String[] args) throws InterruptedException {
			
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:/Users/User/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			 
		       driver.get("http://www.google.com");
		 
		      // driver.quit();
		 
		}

		}