package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelreading {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement pwd=driver.findElement(By.id("pass"));
		
		excel_parscel reader=new excel_parscel();
		reader.loadExcelFile();
		
			String loginid=reader.getData("TestData", "Tc_01", "username");
			String password=reader.getData("TestData", "Tc_01", "password");
						
			
			System.out.println(loginid+"    "+password);
			
			username.clear();
			username.sendKeys(loginid);
			pwd.clear();
			pwd.sendKeys(password);
			
			
		}
		
		
		
		
		
	
	
	}
			
			


	


