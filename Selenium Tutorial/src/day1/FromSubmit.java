package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FromSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("zafar");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Jaleel");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Jaleelmdzafar@gmail.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("996604473");
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='state']")));
		sel.selectByVisibleText("California");
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.quit();

	}

}
