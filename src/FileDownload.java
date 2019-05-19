import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/yahoo.html");
		WebElement downloadbutton=driver.findElement(By.id("messenger-download"));
		String sLoction=downloadbutton.getAttribute("href");
		String wgetcmd= "cmd /c C:\\Wget\\wget64.exe -P F: --no-check-certificate " +sLoction;
		
		try
		{
			Process exe= Runtime.getRuntime().exec(wgetcmd);
			int exitVal=exe.waitFor();
			System.out.println("exit time" + exitVal);
		}
		catch(IOException|InterruptedException e)
		{
			System.out.println("exception:" +e);
		}
	
	driver.quit();}

}
