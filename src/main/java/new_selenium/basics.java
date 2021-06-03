package new_selenium;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basics {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.google.com");

	String title=driver.getTitle();
	if (title.equals("Google")) {
		System.out.println("printing crct");
		
		
	}else {
		System.out.println("getting in crct");
	}
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.quit();
	}

}
