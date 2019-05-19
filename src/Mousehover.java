import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element=driver.findElement(By.linkText("Product Category"));
		Actions builder=new Actions(driver);
		builder.moveToElement(element).build().perform();
		driver.findElement(By.linkText("iPads")).click();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[1]/p[1]/span[2]"));
		String match=ele.getText();
		if(match.equals("$150.00"))
		{
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			driver.findElement(By.xpath(".//*[@id='default_products_page_container']/div[3]/div[2]/form/div[2]/div[1]/span")).click();
			driver.findElement(By.linkText("Go to Checkout")).click();
			
			//((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
		}
		
		else
		{
			System.out.print("not found");
			
		}
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("2");
		driver.findElement(By.name("submit")).submit();
		driver.findElement(By.linkText("Continue")).click();

	
		
		
	}

}
