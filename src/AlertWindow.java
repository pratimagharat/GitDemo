import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWindow {
	public static void mian(String args[])
	
	{
	WebDriver driver= new FirefoxDriver();
	driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String handle= driver.getWindowHandle();
	//System.out.print(handle);
	driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
	Set<String> handles=driver.getWindowHandles();
	
	System.out.println("Handles:"+ handles);
	for(String handle1:driver.getWindowHandles())
	{
		System.out.print(handle1);
	
	driver.switchTo().window(handle1);}
		
		
	}

}
