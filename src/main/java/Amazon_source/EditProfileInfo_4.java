package Amazon_source;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utiliser.DDT;

public class EditProfileInfo_4 
{
    public static WebDriver driver;
 
  @FindBy(xpath="//span[.='Edit login, name, and mobile number']")
  WebElement login_security;
  
  @FindBy(linkText = "Edit")
  WebElement Edit;
  
  @FindBy(xpath="//input[@class='a-button-input']")
  WebElement save;
  
  public void login()
  {
	  login_security.click();
  }
  public void Editbutton()
  {
	  Edit.click();
  }
  public void Savechanges()
  {
	  save.click();
  }
  public EditProfileInfo_4 (WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }

}
