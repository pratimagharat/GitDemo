import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Day1 {

	FirefoxDriver driver=new FirefoxDriver();
	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
	
		Day1 d=new Day1();
		
		
		d.test();
		d.Search();
		
		}
/*action.moveToElement(moveonmenu);
action.perform();
		/*driver.findElement(By.linkText("Hello.Sign In")).click();
		  
		driver.findElement(By.name("email")).sendKeys("pratimagharat@gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("Pinfy@1992");
		driver.findElement(By.id("signInSubmit")).submit();
		String str=driver.getTitle();
		System.out.println(str);
		String st1=driver.getCurrentUrl();
		System.out.println(st1);
		WebDriverWait wait=new WebDriverWait(driver,15);*/
		
		

	
  public void test () throws BiffException, IOException, InterruptedException 

{
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http://www.amazon.com");
		/*Actions action =new Actions(driver);
		 		
		 */
	  driver.get("http://www.amazon.com");
	  FileInputStream fileinput = new FileInputStream("C:\\SeleniumSRC\\MyDataSheet.xls");
	  	  Workbook wbk = Workbook.getWorkbook(fileinput);
	  Sheet sheet = wbk.getSheet(0);
	  int z=sheet.getRows();
	  
	  for(int row=0;row<sheet.getRows();row++)
	  {
		  driver.findElement(By.linkText("Your Amazon.com")).click();
		  
		  /*Actions action = new Actions(driver);
		   action.moveToElement(e).build().perform();*/
		  
		  
		  
		  String username=  sheet.getCell(0, row).getContents();
		  System.out.println("Username "+username);
		  driver.manage().window().maximize();
		  driver.findElement(By.name("email")).sendKeys(username);
		 // driver.findElement(By.id("next")).submit();
		  String password=  sheet.getCell(1, row).getContents();
		  System.out.println("Password "+password);
		  driver.findElement(By.name("password")).sendKeys(password);
		     driver.findElement(By.id("signInSubmit")).submit();
		
	   
	   /*driver.findElement(By.xpath("//input[@name='email']")).clear();
	   driver.findElement(By.xpath("//input[@name='password']")).clear();*/
	  }
	  
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Electronics");
	  driver.findElement(By.className("nav-input")).submit();
	  //selenium.click("//a[contains(@href,'onOrder')]/img");
	  driver.findElement(By.linkText("Monitors")).click();
		 /* Actions action=new Actions(driver);
		  WebElement main=driver.findElement(By.linkText("Departments"));
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  action.moveToElement(main).moveToElement(driver.findElement(By.className("nav-text"))).click().build().perform();*/
		  
	  //WebElement temp = driver.findElement(By.xpath("//img[@src='web/L001/images/IMAGENAME.jpg']"));
	  
	  
}
  
  
public void Search()
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//driver.findElement(By.className("a-section a-spacing-mini")).click();
			
			//driver.findElement(By.xpath(//*[@id='contentGrid_178317']/div/div/div[1]/div/div/a/img")).click();
	//driver.findElement(By.linkText("18 to 19.9 Inches")).click();
	
}}


