package FlightBookingSource;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class PaymentPage_15 
{
   public static WebDriver driver;
   public PaymentPage_15(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="((//div[@class='_0ba869e0     ']/div)[37]/div)[5]/div")
   WebElement clickonseat;
   @FindBy(xpath="//button[.='Next']")
   WebElement next_button;
   @FindBy(xpath="//div[@class='c172d511']/label/i")
   WebElement checkbox_payment;
   @FindBy(xpath="//button[.='Proceed to Payment']")
   WebElement proceed_payment;
   @FindBy(xpath="(//div[@class='a-fixed-left-grid-col a-col-left'])[1]/span/div/label/input")
   WebElement CC_radiobutton;
   @FindBy(xpath="//input[@name='addCreditCardNumber']")
   WebElement card_number;
   
   public DDT d1= new DDT();
   public void click_seat()
   {
	   clickonseat.click();
   }
   public void nextbutton()
   {
	   next_button.click();
   }
   public void checkboxpayment()
   {
	   checkbox_payment.click();
   }
   public void proceedtopayment()
   {
	   proceed_payment.click();
   }
   public void CCradiobutton()
   {
	   CC_radiobutton.click();
   }
   public void CC() throws EncryptedDocumentException, IOException
   {
	   String CC= d1.excelsheet("login3", 0, 2);
	   card_number.sendKeys(CC);
   }
}
