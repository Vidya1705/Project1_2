package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;

public class TestCaseLogin_2 extends Launch_Quit
{  @Test //(retryAnalyzer=Utiliser.Retry.class)
	public void login_to_amazon() throws EncryptedDocumentException, IOException
	{
		Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_Amazon l1= new Login_Amazon(driver);
		l1.un();
		l1.cont_button();
		l1.password();
		l1.signin_button();
		String username= l1.un1().getText();	
		
}
}
