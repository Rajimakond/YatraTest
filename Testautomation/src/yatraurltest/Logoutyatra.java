package yatraurltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutyatra {
	
	public static WebDriver driver=null;
	public   Logoutyatra(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='userLoginBlock']/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='logOut']")).click();
	}

}
