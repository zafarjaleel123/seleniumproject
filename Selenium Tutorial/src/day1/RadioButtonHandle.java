package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\normal\\Desktop\\application\\newchrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement ele:radio) {
			String genderName=ele.getAttribute("value");
			
			if (genderName.equalsIgnoreCase("M")) {
				ele.click();
				break;
			}
		}
		driver.quit();
	}

}
