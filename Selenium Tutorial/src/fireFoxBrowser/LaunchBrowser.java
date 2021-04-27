package fireFoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\normal\\Desktop\\application\\newfirefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org/");

	}

}
