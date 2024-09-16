package Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchfilterpage_6 
{
    public static WebDriver driver;
	  
	  @FindBy(xpath="(//ul[@id='filter-n']/span/span/li)[7]")
	   WebElement category;
	     
	   public void categories()
	   {
		   category.click();
	   }   
	   public searchfilterpage_6(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}
