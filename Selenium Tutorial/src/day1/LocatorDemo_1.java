package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//1_ID
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");*/
		//2_Name
		/*By username=By.name("txtUsername");
		driver.findElement(username).sendKeys("Admin");*/
		//3_Linktext
		//driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());


	}

}
