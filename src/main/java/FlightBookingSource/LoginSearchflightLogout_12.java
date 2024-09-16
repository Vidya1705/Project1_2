package FlightBookingSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSearchflightLogout_12 
{
	public LoginSearchflightLogout_12 (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	public static WebDriver driver;
	
	   @FindBy(id="nav-link-accountList")
	   WebElement accountlist;
	   @FindBy(xpath="//span[.='Sign in'][1]")
	   WebElement sign_in;
	   @FindBy(xpath="//span[.='Sign Out']")
	   WebElement sign_out;
	  
	   public void accountlist(WebDriver driver)
	   {
		   Actions a1= new Actions(driver);
		   a1.moveToElement(accountlist).perform();	   
	   }
	   public void signin()
	   {
		   sign_in.click();
	   }
	   public void signout()
	   {
		   sign_out.click();
	   }
}
