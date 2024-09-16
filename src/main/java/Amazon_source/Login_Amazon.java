package Amazon_source;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class Login_Amazon 
{
   public static WebDriver driver;
   @FindBy(name="email")
   WebElement username;
   
   @FindBy(id="continue")
   WebElement cont;
   
   @FindBy(name="password")
   WebElement PW;
   
   @FindBy(id="signInSubmit")
   WebElement signin;
   
   public DDT d1= new DDT();
   public void un() throws EncryptedDocumentException, IOException
   {
	  String un=d1.excelsheetph_no("login4", 0, 0);
	   username.sendKeys(un);
   }
   public void cont_button()
   {
	   cont.click();
   }
   public void password() throws EncryptedDocumentException, IOException
   {  
	   String Password=d1.excelsheet("login4", 0, 2);
	   PW.sendKeys(Password);
   }
   public void signin_button()
   {
	   signin.click();
   }
   public WebElement un1()
   {
	   return username;
   }
   public WebElement contbutton()
   {
	   return cont;
   }
   public WebElement pw()
   {
	   return PW;
   }
   public WebElement sign_in()
   {
	   return signin;
   }
   
   public Login_Amazon(WebDriver driver ) 
   {
	   PageFactory.initElements(driver, this);
   }
   
   
}
