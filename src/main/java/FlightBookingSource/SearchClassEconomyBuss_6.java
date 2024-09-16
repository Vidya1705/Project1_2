package FlightBookingSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchClassEconomyBuss_6 
{
   public static WebDriver driver;
   
   public  SearchClassEconomyBuss_6(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
   
     
       @FindBy(xpath="(//div[@class='dafe1197'])[1]/label/i")
	   WebElement economyclass;
   
       @FindBy(xpath="((//div[@class='_75c05602'])[5]/div/div/span)[1]")
       WebElement searchtraveller;
       @FindBy(xpath="(//div[@class='dafe1197'])[2]/label/i")
       WebElement premiumeconomy;
       @FindBy(xpath="(//div[@class='dafe1197'])[3]/label/i")
       WebElement businessclass;
     
       public void economy()
       {
    	   economyclass.click();
       }
       public void travellers()
       {
    	   searchtraveller.click();
       } 
      public void premiumeconomyclass()
       {
    	  premiumeconomy.click();
       }
       public void business()
       {
    	   businessclass.click();
       }
       public WebElement economy_class()
       {
    	   return economyclass;
       }
       public WebElement premiumeconomy_class()
       {
    	   return premiumeconomy;
       }
	  public WebElement business_class()
	  {
		  return businessclass;
	  }
	  
	  
   
}
