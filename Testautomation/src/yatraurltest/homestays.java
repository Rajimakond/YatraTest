package yatraurltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homestays {

	public static WebDriver driver=null;
	public   homestays(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void homebook() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.xpath(".//*[@id='BE_homestay_destination_city']")).sendKeys("Bangalore, Karnataka, India");
		driver.findElement(By.xpath(".//*[@id='BE_homestay_form']/div[1]/div[1]/ul/li[2]/i")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[4]/td[4]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='BE_homestay_form']/div[1]/div[1]/ul/li[3]/i")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[5]/td[6]/a/span")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[2]/i")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[2]/div/div[1]/div[3]/div[2]/div[1]/span[2]")).click();
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[2]/div/div[3]/span")).click();
		driver.findElement(By.xpath(".//*[@id='BE_homestay_htsearch_btn']")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
	}
}

