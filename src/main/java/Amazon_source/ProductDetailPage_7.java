package Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage_7 
{
    public static WebDriver driver;
  
 
  
  @FindBy(xpath ="(//span[@class='a-size-base a-color-base'])[1]")
  WebElement custreview;
  
  @FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
  WebElement shoeprice;
  
  @FindBy(id = "productDescription")
  WebElement description;
 
  
  public void reviews()
  {
	  custreview.click();
  }
  public void price()
  {
	  shoeprice.getText();
  }
  
  public void productdescription()
  {
	  description.getText();
  }
  public WebElement shoe_price()
  {
	return  shoeprice;
  }
  public WebElement review()
  {
	return  custreview;
  }
  public WebElement product_description()
  {
	  return description;
  }
  
  
  public ProductDetailPage_7(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
}
