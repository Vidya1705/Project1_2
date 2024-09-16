package FlightBookingSource;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class Registrationpage_1 
{
	public static WebDriver driver;
	   
	   @FindBy(name="email")
	   WebElement email;
	  
	   @FindBy(className = "a-button-input")
	   WebElement class_name;
	 
	   @FindBy(name="customerName")
	   WebElement name;
	  
	   @FindBy(id="ap_phone_number")
	   WebElement phone_number;
	    
	   @FindBy(name="password")
	   WebElement pw;
	   
	   @FindBy(id="continue")
	   WebElement verifynumber;
	   
	   public DDT d1= new DDT();
	   public void emailid() throws EncryptedDocumentException, IOException
	   { 
		   String emailid =d1.excelsheet("login4", 0, 0);
		   email.sendKeys(emailid);   
	   }
	   public void proceed()
	   {
		   class_name.click();
	   }
	   public void yourname() throws EncryptedDocumentException, IOException
	   {
		   String yourname =d1.excelsheet("login4", 0, 1);
		   name.sendKeys(yourname);
		  // name.sendKeys("Vidya");
	   }
	   public void ph_no() throws EncryptedDocumentException, IOException
	   {
		   
		  // String ph_no =d1.excelsheet("login4", 0, 2);
		   //phone_number.sendKeys(ph_no);
	     phone_number.sendKeys("9940454973");
	   }
	     public void pwd() throws EncryptedDocumentException, IOException
	   {
	    	 String pwd =d1.excelsheet("login4", 0, 2);
	    	 pw.sendKeys(pwd);
		// pw.sendKeys("Gogreen123",Keys.ENTER);
	   }
	   public void verify()
	   {
		   verifynumber.click();
	   }
	   public Registrationpage_1(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
}

