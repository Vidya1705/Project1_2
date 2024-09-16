package FlightBookingSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyCoupon_13 
{
	public static WebDriver driver;
    public ApplyCoupon_13 (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
    @FindBy(xpath="//button[.='Apply']")
    WebElement apply_discount;
    
    public void applydiscount()
    {
    	apply_discount.click();    
    }
}
