package FlightBookingSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsBaggageCancellation_10 
{
    	public FlightDetailsBaggageCancellation_10 (WebDriver driver)
        {
        	PageFactory.initElements(driver, this);
        }
    	public static WebDriver driver;
    	@FindBy(xpath="//div[@class='_7c598c35 ']/span")
    	WebElement view_baggage;
    	
    	@FindBy(xpath="(//div[@class='tabListInner'])[1]")
    	WebElement clickbaggage;
    	@FindBy(xpath="(//div[@class='tabListInner'])[2]")
    	WebElement cancellationrules;
    	
    	
    	public void viewbaggage()
    	{
    		view_baggage.click();
    	}
    	public void baggage()
    	{
    		clickbaggage.click();
    	}
    	public void cancellation()
    	{
    		cancellationrules.click();
    	}
    }
	


