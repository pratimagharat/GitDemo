import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();

	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
	    driver.switchTo().frame(0);
	    driver.findElement(By.name("firstname")).sendKeys("Pratima");;
	    driver.findElement(By.name("lastname")).sendKeys("Gharat");
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath(("//*[@id='post-9']/div/div[1]/div/p[1]/a/img"))).click();
	    //driver.findElement(By.xpath(""));
	    driver.close();

	}

}
