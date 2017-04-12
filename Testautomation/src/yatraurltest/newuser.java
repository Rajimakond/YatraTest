package yatraurltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newuser {

	public static WebDriver driver=null;
	public newuser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public static  void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()=' My Account ']")).click();
		driver.findElement(By.xpath("//*[@id='signInBtn']")).click();
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='emailId']")).sendKeys("g.makond@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Rajeshwari123");
		driver.findElement(By.xpath("//*[@id='signInBtn']")).click();
		 
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath(".//*[@id='userLoginBlock']/a")).click();
		//driver.findElement(By.xpath(".//*[@id='logOut']")).click();
		
		
	}
	
	
	
}