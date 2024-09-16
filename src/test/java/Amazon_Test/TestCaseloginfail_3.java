package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;
import Amazon_source.Loginfail_wrongUNorPW;

public class TestCaseloginfail_3 extends Launch_Quit
{
	@Test //(retryAnalyzer=Utiliser.Retry.class)
	public void login_to_amazon() throws EncryptedDocumentException, IOException
	{
		Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_Amazon l1= new Login_Amazon(driver);
		l1.un();
		l1.cont_button();
		Loginfail_wrongUNorPW l2= new Loginfail_wrongUNorPW(driver);
		l2.Password();
		l1.signin_button();
}
}
