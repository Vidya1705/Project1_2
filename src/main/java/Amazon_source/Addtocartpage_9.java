package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage_9 
{
    public static WebDriver driver;

	  
	  @FindBy(id = "add-to-cart-button")
	  WebElement add_tocart;
	  @FindBy(xpath= "//span[@id='sw-gtc']/span/a")
		WebElement go_to_cart;
	  @FindBy(xpath="(((//span[@class='a-list-item'])[9]/a/span)[1]/span/span)[1]")
	  WebElement title;
	 
	  public void addtocart()
	  {
		  add_tocart.click();
	  }
	  public void gotocart()
	  {
		  go_to_cart.click();
	  }
	  public WebElement addocart()
	  {
		  return add_tocart;
	  }
	  
	  
	  public Addtocartpage_9 (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
