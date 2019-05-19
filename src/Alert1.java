import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
	
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		driver.findElement(By.id("timingAlert")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		Alert element=wait.until(ExpectedConditions.alertIsPresent());	
		element.accept();
		System.out.print("Alert");
		
	}
	
	

}	
