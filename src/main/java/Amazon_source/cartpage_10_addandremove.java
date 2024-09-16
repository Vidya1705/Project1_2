package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage_10_addandremove 
{
    public static WebDriver driver;
   @FindBy(id="sw-gtc")
   WebElement go_to_cart;
   
   @FindBy(xpath = "(//input[@class='a-color-link'])[1]")
   WebElement deletebutton;
   
   public void gotocart()
   {
	   go_to_cart.click();
   }
   public void delete()
   {
	   deletebutton.click();
   }
	  
	  public cartpage_10_addandremove (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
