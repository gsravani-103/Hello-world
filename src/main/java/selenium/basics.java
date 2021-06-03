package selenium;
import java.io.FileInputStream;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.util.NumberToTextConverter;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basics {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		// selection class
		/*
		 * driver.get("https://www.spicejet.com/"); driver.manage().window().maximize();
		 * Select select=new Select(driver.findElement(By.xpath(
		 * "//select[@id='ctl00_mainContent_ddl_originStation1']")));
		 * select.selectByIndex(1);
		 */

//select.selectByVisibleText("Hyderabad(HYD)");

		/*
		 * //action class by sendkeys Actions action=new Actions(driver);
		 * 
		 * driver.get("https://www.softwaretestingmaterial.com"); //sleep for 3secs to
		 * load the page Thread.sleep(3000); //SCROLL DOWN
		 * action.sendKeys(Keys.PAGE_DOWN).build().perform(); Thread.sleep(3000);
		 * //SCROLL UP action.sendKeys(Keys.PAGE_UP).build().perform();
		 * //driver.close();
		 */
		// webtable
		/*
		 * driver.get("https://money.rediff.com/gainers");
		 * driver.manage().window().maximize(); List<WebElement>
		 * lists=driver.findElements(By.xpath(
		 * "//*[@id='leftcontainer']/table/tbody/tr/td[1]")); List<WebElement>
		 * prices=driver.findElements(By.xpath(
		 * "//*[@id='leftcontainer']/table/tbody/tr/td[4]")); for(int
		 * i=1;i<=lists.size();i++){
		 * System.out.println(lists.get(i).getText()+"-----------------"+prices.get(i).
		 * getText());
		 */

		// pop ups are df types alert is one type of popup...alert means show some kind
		// if data....
		// fileupload pop and windowpopup etc...

		// alert and popup
		/*
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@name='proceed']")).click();
		 * 
		 * //switch to alert Alert alert=driver.switchTo().alert();
		 */

		// get text from alert
		// String text=alert.getText();

		// click on ok botton
		// alert.accept();

		// click on cancle //alert.dismiss();

		// send data in information alert //alert.sendKeys("hai");

		/*
		 * if(text.equals("Please enter a valid user name")){
		 * System.out.println("it's correct"); }
		 */

		/*
		 * driver.get("https://html.com/input-type-file/");
		 * driver.switchTo().alert().dismiss();
		 * driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys(
		 * "C:\\Users\\user\\Downloads\\Resignation");
		 */

		// pop up on file uploading by sendkeys
		/*
		 * String baseUrl = "http://demo.guru99.com/test/upload/"; //WebDriver driver =
		 * new FirefoxDriver();
		 * 
		 * driver.get(baseUrl); JavascriptExecutor js = (JavascriptExecutor)driver;
		 * //Scrolling using JavascriptExecutor
		 * js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload
		 * button (+ve) Thread.sleep(3000); WebElement uploadElement =
		 * driver.findElement(By.id("uploadfile_0"));
		 * 
		 * 
		 * // enter the file path onto the file-selection input field
		 * uploadElement.sendKeys("C:\\newhtml.html");
		 * 
		 * // check the "I accept the terms of service" check box
		 * driver.findElement(By.id("terms")).click();
		 * 
		 * // click the "UploadFile" button
		 * //driver.findElement(By.name("send")).click();
		 */

		/*
		 * // windows handling driver.get("http://www.naukri.com/"); // It will return
		 * the parent window name as a String String mainWindow =
		 * driver.getWindowHandle(); // It returns no. of windows opened by WebDriver
		 * and will return Set of Strings Set<String> set = driver.getWindowHandles();
		 * System.out.println(set);
		 */ // Using Iterator to iterate with in windows
		/*
		 * Iterator<String> itr = set.iterator(); for (String string : set) {
		 * System.out.println(string);
		 * 
		 * }
		 */
		/*
		 * while(itr.hasNext()){ String childWindow=itr.next(); String
		 * childWindow1=itr.next(); driver.switchTo().window(childWindow1).getTitle();
		 * 
		 * // Compare whether the main windows is not equal to child window. If not
		 * equal, we will close.
		 * 
		 * if(!mainWindow.equals(childWindow)){ driver.switchTo().window(childWindow);
		 * System.out.println(driver.switchTo().window(childWindow).getTitle());
		 * driver.close(); }
		 * 
		 * }
		 */
		// This is to switch to the main window
		// driver.switchTo().window(mainWindow);

		// iframe

		/*
		 * driver.get("https://jqueryui.com/droppable/");
		 * driver.manage().window().maximize(); WebElement
		 * frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		 * driver.switchTo().frame(frame); WebElement
		 * srouce=driver.findElement(By.xpath("//div[@id='draggable']")); WebElement
		 * target=driver.findElement(By.xpath("//div[@id='droppable']")); Actions
		 * action=new Actions(driver); action.dragAndDrop(srouce,
		 * target).build().perform();
		 */

		// ajax

		/*
		 * String URL = "http://demo.guru99.com/test/ajax.html";
		 * 
		 * driver.navigate().to(URL);
		 * 
		 * By container = By.cssSelector(".container");
		 * 
		 * // Get the text before performing an ajax call WebElement noTextElement =
		 * driver.findElement(By.className("radiobutton")); String textBefore =
		 * noTextElement.getText().trim();
		 * 
		 * // Click on the radio button driver.findElement(By.id("yes")).click();
		 * 
		 * // Click on Check Button driver.findElement(By.id("buttoncheck")).click();
		 * 
		 * Get the text after ajax call WebElement TextElement =
		 * driver.findElement(By.className("radiobutton")); //
		 * wait.until(ExpectedConditions.visibilityOf(TextElement)); String textAfter =
		 * TextElement.getText().trim(); System.out.println(textBefore);
		 * System.out.println(textAfter);
		 */

		// filesystem
		
		/*
		 * File f=new File("C:\\Users\\user\\Desktop","sravani.txt"); //file writing
		 * FileWriter fw=new FileWriter(f);
		 * 
		 * 
		 * PrintWriter pw=new PrintWriter(fw);
		 * 
		 * pw.println("Welcome india");
		 * 
		 * pw.println(123456);
		 * 
		 * pw.flush(); pw.close();
		 * 
		 * 
		 * 
		 * fw.close();
		 * 
		 * //file reading FileReader fr=new FileReader(f);
		 * 
		 * BufferedReader bfr=new BufferedReader(fr);
		 * 
		 * 
		 * String data=bfr.readLine();
		 * 
		 * while(!(data==null)) { System.out.println(data); data=bfr.readLine();
		 * 
		 * 
		 * }
		 */
		
		
		//excel reading
		
		
		
		/*
		 * FileInputStream fis = new
		 * FileInputStream("C:\\Users\\user\\Desktop\\TestDataExcel.xlsx");
		 * 
		 * XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 * 
		 * int sheets = workbook.getNumberOfSheets(); System.out.println(sheets);
		 * 
		 * for(int i=0; i<sheets; i++) //iterate through each sheet
		 * 
		 * {
		 * 
		 * if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
		 * 
		 * {
		 * 
		 * XSSFSheet sheet = workbook.getSheetAt(i); //grab "TestData" sheet
		 * 
		 * Iterator<Row> rows = sheet.iterator(); //Iterate through each row
		 * 
		 * Row firstrow = rows.next(); //we are on first row now
		 * 
		 * Iterator<Cell> ce = firstrow.cellIterator(); //iterate through each cell of
		 * first row
		 * 
		 * int k =0;
		 * 
		 * int column = 0;
		 * 
		 * while(ce.hasNext()) //looping till the time cell is present
		 * 
		 * {
		 * 
		 * Cell value = ce.next(); //In 1st loop, we are on 1st cell of 1st row.
		 * 
		 * //In 2nd loop (if any), we will move to 2nd cell of 1st row
		 * 
		 * if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
		 * 
		 * {
		 * 
		 * //grab desired column
		 * 
		 * column = k;
		 * 
		 * }
		 * 
		 * k++;
		 * 
		 * }
		 * 
		 * //System.out.println(column);
		 * 
		 * while(rows.hasNext())
		 * 
		 * {
		 * 
		 * Row r = rows.next();
		 * 
		 * //if(r.getCell(column).getStringCellValue().equalsIgnoreCase("TC3"))
		 * 
		 * if(r.getCell(column).getStringCellValue().equalsIgnoreCase("testCaseName"))
		 * 
		 * {
		 * 
		 * //after grabbing "TC3" test case row, we will grab all the cell contents of
		 * that row
		 * 
		 * Iterator<Cell> cv = r.cellIterator(); //Iterate through each cell of TC3 row
		 * 
		 * while(cv.hasNext())
		 * 
		 * {
		 * 
		 * //System.out.println(cv.next().getStringCellValue());
		 * 
		 * //a.add(cv.next().getStringCellValue());
		 * 
		 * Cell c = cv.next();
		 * 
		 * if(c.getCellType()==XSSFCell.CELL_TYPE_STRING)
		 * 
		 * {
		 * 
		 * a.add(c.getStringCellValue());
		 * 
		 * }else
		 * 
		 * {
		 * 
		 * a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */ /* }}}}} */
		
		//propertie file
		//reading propertie
		//my file
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("E:\\MyWork\\new_project\\config.proper");
		prop.load(fis);
		System.out.println("hai");
System.setProperty("webdriver.chrome.driver","chromedriver.exe" );

		
		WebDriver driver=new ChromeDriver();
		String url=prop.getProperty("URL");
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(prop.getProperty("USERNAME"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(prop.getProperty("password"));
		
		
}}
		
		
		