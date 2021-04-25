package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleForm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Zafar");
		

	}

}
