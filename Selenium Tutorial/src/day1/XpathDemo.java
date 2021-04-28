package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://wordpress.com/log-in");
		driver.manage().window().maximize();
		// //input[@name='usernameOrEmail']
		// //input[@class='input'][@name='log']
		// //input[@class='input' or @name='log']
		// //input[@calss='input' and @name='log']
		// //a[contains(@href,'edit.php')][text()='Posts']
		// //*[text()='discussion']//following::a[contains(@name,'')]
		
		
	}

}
