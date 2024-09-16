package FlightBookingSource;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageOneWay_4 
{
   public static WebDriver driver;
   
   @FindBy(id="twotabsearchtextbox")
   WebElement search_field;
   
   @FindBy(xpath="(//span[@class='a-button-inner'])[2]")
   WebElement bookflighttickets;
   
   //@FindBy(xpath="(//input[@name='tripTypeRadio'])[1]")
   @FindBy(xpath="//span[.='One Way']")
   WebElement one_way;
   @FindBy(xpath="(//div[@class='_82328473']/div/div/span)[2]")
   WebElement clicksearchfrom;//both Bengaluru and Mumbai
   
   @FindBy(xpath="//input[@name='searchText']")
   WebElement searchfrom; //both Bengaluru and Mumbai
   
   @FindBy(xpath = "//div[@class='_32608d65']/p")
   WebElement searchresultfrom; //both Bengaluru and Mumbai
   
   @FindBy(xpath="(((//div[@class='_8bd51405'])[1]/ul)[5]/li)[4]")
   WebElement clickdatefrom;
   
   @FindBy(xpath="//button[.='Search']")
   WebElement searchbutton;
   
   public void search(String productname)
   {
	   search_field.sendKeys(productname,Keys.ENTER);   
   }
   public void bookflight()
   {
	   bookflighttickets.click();
   }
   public void oneway()
   {
	   one_way.click(); 
   }
   public void clicksearch_from() 
   {
	   clicksearchfrom.click();
   }
   public void search_1(String cityname1)
   {
	   searchfrom.sendKeys(cityname1,Keys.ENTER);
   }
   public void searchresult_from()
   {
	   searchresultfrom.click();
   }
   public void clickdate_from()
   {
	   clickdatefrom.click();
   }
   public void search_button()
   {
	   searchbutton.click();
   }
   public HomepageOneWay_4 (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
    public WebElement searchbutton() 
    {
	return searchbutton;
   }
}