package Amazon_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage_12
{
    public static WebDriver driver;
     @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
     WebElement CC;
     @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
     WebElement Net_banking;
     @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
     WebElement Other_UPI;
     @FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
     WebElement EMIoption;
     
     public void creditordebit()
     {
    	 CC.click();
     }
     public void Netbanking()
     {
    	 Net_banking.click();
     }
     public void OtherUPI()
     {
    	 Other_UPI.click();
     }
     public void EMI()
     {
    	 EMIoption.click();
     }
     public WebElement creditdebit()
     {
    	return CC;
     }
     public WebElement Netbank()
     {
    	return Net_banking;
     }
     public WebElement UPI()
     {
    	 return Other_UPI;
     }
     public WebElement EMI_option()
     {
    	return EMIoption;
     }
     public PaymentPage_12 (WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     
}
