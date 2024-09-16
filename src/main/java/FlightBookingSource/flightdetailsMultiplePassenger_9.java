package FlightBookingSource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightdetailsMultiplePassenger_9 
{
	public flightdetailsMultiplePassenger_9 (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
    public static WebDriver driver;
    @FindBy(xpath="//input[@id='input-first_name']")
    WebElement first_name1;
    @FindBy(xpath="//input[@id='input-last_name']")
    WebElement last_name1;
    @FindBy(xpath="//input[@id='input-first_name']")
    WebElement first_name2;
    @FindBy(xpath="//input[@id='input-last_name']")
    WebElement last_name2;
    
    public void firstname1(String name1)
    {
    	first_name1.sendKeys(name1,Keys.ENTER);
    }
    public void lastname1(String name2)
    {
    	last_name1.sendKeys(name2,Keys.ENTER);
    }
    public void firstname2(String name3)
    {
    	first_name2.sendKeys(name3,Keys.ENTER);
    }
    public void lastname2(String name4)
    {
    	last_name2.sendKeys(name4,Keys.ENTER);
    }
    public WebElement fname()
    {
    	return first_name1;
    }
    public WebElement lname()
    {
    	return last_name1;
    }
    
}
