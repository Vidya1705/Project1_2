package Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//step 1
    public static WebDriver driver;

   @FindBy(id="nav-link-accountList")
   WebElement accountandlist;
   
   @FindBy(linkText ="Your Account")
   WebElement youraccount;
   
   @FindBy(xpath="//span[.='Sign in'][1]")
   WebElement signinbutton;
   
   @FindBy(id="twotabsearchtextbox")
   WebElement search_field;
   
   @FindBy(linkText = "Start here.")
   WebElement starthere;
   
   @FindBy(linkText = "Your Orders")
   WebElement yourorders;
   
   //step 2
   public void accountlist(WebDriver driver)
   {
	   Actions a1= new Actions(driver);
	   a1.moveToElement(accountandlist).perform();	   
   }
   public void signin()
   {
	   signinbutton.click();
   }
   public void your_account()
   {
	   youraccount.click();
   }
   public void search(String productname)
   {
	   search_field.sendKeys(productname+Keys.ENTER);
   }
   public void start()
   {
	   starthere.click();
   }
   public void yourorders()
   {
	   yourorders.click();
   }
   //step 3
   public Homepage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
}
