
package Amazon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultpage_8
{
    public static WebDriver driver;
       
       @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]")
       WebElement selectshoe;
      
       @FindBy(name="s")
       WebElement dropdownsortby;
       
       @FindBy(className = "a-dropdown-prompt")
       WebElement dropdnvisibletext;
       
       @FindBy(id="s-result-sort-select_1")
       WebElement pricelowtohigh;
       
       @FindBy(id="a-autoid-0")
       WebElement dropdownsortby1;
       
       @FindBy(linkText = "Avg. Customer Review")
       WebElement AvgCustomerReview;
       
       public void select_shoe()
       {
     	  selectshoe.click();
       }
       public void dropdown(String dropdown)
       {
    	   Select s1= new Select(dropdownsortby);
    	   s1.selectByVisibleText(dropdown);
       }
       public WebElement drpdwntextvisible()
       {
    	   return dropdnvisibletext;
       }
       public void lowtohigh()
       {
    	   pricelowtohigh.click();
       }
       public void dropdown1(String value)
       {
    	   Select s1= new Select(dropdownsortby);
    	   s1.selectByVisibleText("Sort by:");
       }
       public void customerreview()
       {
    	   AvgCustomerReview.click(); 
       }
       
       
       public SearchResultpage_8 (WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
       
}
