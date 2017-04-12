package yatraurltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class travelexample {

	public static WebDriver driver=null;
	public travelexample(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  static void travelbook() throws InterruptedException
	{
		driver.findElement(By.xpath(".//*[@id='BE_flight_origin_city']")).sendKeys("New Delhi, India (DEL)");
		driver.findElement(By.xpath(".//*[@id='BE_flight_arrival_city']")).sendKeys("Bangalore, India (BLR)");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_form']/div/div[2]/ul/li[3]/i")).click();
		driver.findElement(By.xpath(".//*[@id='a_2017_4_28']/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_ret_cal']/i")).click();
		driver.findElement(By.xpath(".//*[@id='a_2017_4_30']/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_paxInfoBox']/i")).click();
		driver.findElement(By.xpath(".//*[@id='msdrpdd20_msdd']/div[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='msdrpdd21_msdd']/div[1]/span[2]")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_passengerBox']/div[2]/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='BE_flight_arrival_city']")).sendKeys("Bangalore, India (BLR)");
		driver.findElement(By.xpath(".//*[@id='BE_flight_flsearch_btn']")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		
	}
	
	

}
