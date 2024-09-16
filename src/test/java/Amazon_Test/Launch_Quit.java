package Amazon_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utiliser.Listener1;

public class Launch_Quit extends Listener1
{
	//ChromeDriver driver;
   @BeforeMethod
   public void launch_browser()
   {
	   /*ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		driver= new ChromeDriver(co);*/
	   driver= new ChromeDriver();
	   driver.get("https://www.amazon.in");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   }
   @AfterMethod
   public void launch_quit()
   {
//	   driver.quit();
   }
   
}
