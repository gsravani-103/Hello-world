package new_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	//locators are used to identify webelements.
	//8 locators are available
	//id,name,classname,tagname,linktext,partial link,xpath,css

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://signup.ebay.in/pa/crte?rv4=1");
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sravani");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("gollapudi");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sravani24.g");
		driver.findElement(By.xpath("//input[@id='EMAIL_REG_FORM_SUBMIT']")).click();
		
		
	}

}
