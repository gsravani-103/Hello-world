package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basics {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		  driver.get("https://www.spicejet.com/");
		  driver.manage().window().maximize();
		  Select select=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		  select.selectByIndex(1);
		 
//select.selectByVisibleText("Hyderabad(HYD)");
		
		
		//action class by sendkeys
		Actions action=new Actions(driver);
		
		driver.get("https://www.softwaretestingmaterial.com");
		//sleep for 3secs to load the page
		Thread.sleep(3000);
		//SCROLL DOWN
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		//SCROLL UP
		action.sendKeys(Keys.PAGE_UP).build().perform();
		//driver.close();

	}

}
