package yatraurltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testyatraurl {

	public static newuser  user=null;
	public static travelexample  userr=null;
	public static travelhotelbook userrr=null;
	public static  homestays userrrr=null;
	public static Logoutyatra userrrrr=null;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Radar_Automation\\Drivers\\Gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.yatra.com/");
		user=new newuser(driver);
		userr=new travelexample(driver);
		userrr=new travelhotelbook(driver);
		userrrr=new homestays(driver);
		userrrrr=new Logoutyatra(driver);
		
		try {
			newuser.login();
			travelexample.travelbook();
			travelhotelbook.hotelbook();
			homestays.homebook();
			Logoutyatra.logout();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}