package FlightBookingSource;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageRoundTrip_5 
{
	public static WebDriver driver;
	   @FindBy(xpath="//span[.='Round Trip']")
	   WebElement round_trip;
	   
	   @FindBy(xpath="(((//div[@class='_8bd51405'])[1]/ul)[5]/li)[6]")
	   WebElement clickdateto;
	  
	   public void roundtrip()
	   {
		   round_trip.click();
	   }
	   public void clickdate_to()
	   {
		   clickdateto.click();
	   }
	   public HomepageRoundTrip_5 (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
