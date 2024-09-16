package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_source.EditProfileInfo_4;
import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;

public class TestCaseEditprofile_4 extends Launch_Quit
{
   @Test //(retryAnalyzer=Utiliser.Retry.class)
   public void Editprofile() throws EncryptedDocumentException, IOException
   {
	   
	   Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_Amazon l1= new Login_Amazon(driver);
		l1.un();
		l1.cont_button();
		l1.password();
		l1.signin_button();
		h1.accountlist(driver);
		h1.your_account();
			
		EditProfileInfo_4 e1= new EditProfileInfo_4 (driver);
	    e1.login();
	    e1.Editbutton();
	    e1.Savechanges();
		
	    
   }
   
}
