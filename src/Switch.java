//package practiceTestCases;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch{

		public static WebDriver driver;

		public static void main(String[] args) {

			// Create a new instance of the Firefox driver
			
			System.setProperty("webdriver.chrome.driver","C:/SeleniumSRC/chromedriver.exe");

	        driver = new ChromeDriver();

	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        // Launch the URL

	        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");

	        // Store and Print the name of the First window on the console

	        String handle= driver.getWindowHandle();

	        System.out.println(handle);

	        // Click on the Button "New Message Window"

	        driver.findElement(By.xpath("//*[@id='content']/p[6]/button")).click();

	        // Store and Print the name of all the windows open	   
	        
	        Alert alert=driver.switchTo().alert();
	        alert.accept();

	       // Set handles = driver.getWindowHandles();

	        

	}

}