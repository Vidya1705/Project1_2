package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnsOrderspage_14
{
     public static WebDriver driver;
     @FindBy(linkText="Write a product review")
     WebElement product_review;
     
     @FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
     WebElement five_star;
     
     public void productreview()
     {
    	 product_review.click();
     }
     public void fivestar()
     {
    	 five_star.click();
     }
     public ReturnsOrderspage_14(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     


}
