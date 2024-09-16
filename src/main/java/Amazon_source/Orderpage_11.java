package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class Orderpage_11 
{
    public static WebDriver driver;
	  
	  @FindBy(id = "add-to-cart-button")
	  WebElement add_tocart;
	  
	  @FindBy(name="proceedToRetailCheckout")
	  WebElement Proceed_to_buy;
	  
	  @FindBy(name="submissionURL")
	  WebElement radio_button;
	  
	  @FindBy(xpath="(//input[@class='a-button-input'])[2]")
	  WebElement useaddress;
	  
	  @FindBy(name="ppw-instrumentRowSelection")
	  WebElement payment_radiobtn;
	  
	  @FindBy(xpath="(//span[@class='a-declarative']/span/span/span/input)[2]")
	  WebElement usepaymentmtd;
	 
	 
	  public DDT d1= new DDT();
	  public void addtocart()
	  {
		  add_tocart.click();
	  }
	  public void proceedtobuy()
	  {
		  Proceed_to_buy.click();
	  }
	  public void radiobutton()
	  {
		  radio_button.click();
	  }
	  public void usethisaddress()
	  {
		  useaddress.click();
	  }
	  public void paymentradiobutton()
	  {
		  payment_radiobtn.click();
	  }
	  public void usepaymentmethod()
	  {
		  usepaymentmtd.click();
	  }
	  
	  public Orderpage_11 (WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
