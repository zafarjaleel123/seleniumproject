package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn-automation.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
