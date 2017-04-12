package yatraurltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class travelhotelbook {
	
	public static WebDriver driver=null;
	public  travelhotelbook(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void hotelbook() throws InterruptedException
	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='HOTELS']")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@name='BE_hotel_destination_city']")).sendKeys("Bangalore");
		//driver.findElement(By.xpath("html/body/div[16]/ul/div[2]/div/li[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='BE_hotel_form']/div[1]/div[2]/ul/li[2]/i")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[5]/td[6]/a")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='BE_hotel_form']/div[1]/div[2]/ul/li[4]/i")).click();
		
		driver.findElement(By.xpath("html/body/div[14]/div[3]/div[2]/div/div/div[1]/div[2]/div/table/tbody/tr[6]/td")).click();    //date
		
		driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[3]/i")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='msdrpdd23_msdd']/div[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='msdrpdd24_msdd']/div[1]/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='BE_Hotel_pax_box']/div[3]/span")).click();
		driver.findElement(By.xpath(".//*[@id='BE_hotel_htsearch_btn']")).click();
		//driver.findElement(By.xpath("html/body/div[1]/section[1]/section[2]/div[2]/div[2]/form/div[1]/div[4]/input")).click();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}

}
