package Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentpage_Coupon_13 
{
    public static WebDriver driver;
	  
	  //@FindBy(xpath="//input[@class='a-input-text a-width-medium']")
	  // @FindBy(id="spc-gcpromoinput")//check path
	  @FindBy(xpath="//input[@name='ppw-claimCode']")
	  WebElement apply_code;
	  
	  @FindBy(xpath="(//input[@class='a-button-input'])[6]")//check path
	  WebElement apply_button;
	  
	  public void applycode()
	  {
		  apply_code.sendKeys("abcde",Keys.ENTER);
	  }
	  public void applybutton()
	  {
		  apply_button.click();
	  }
	  public WebElement apply()
	  {
		  return apply_button;
	  }
	  public Paymentpage_Coupon_13 (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
