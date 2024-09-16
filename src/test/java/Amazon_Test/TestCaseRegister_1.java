package Amazon_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.Registrationpage;


public class TestCaseRegister_1 extends Launch_Quit
{
    @Test //(retryAnalyzer=Utiliser.Retry.class)
    public void Registration() throws EncryptedDocumentException, IOException
    {
    	Homepage h1= new Homepage(driver);
		h1.accountlist(driver);
		h1.start();
		
    	Registrationpage r1= new Registrationpage(driver);
    	r1.yourname(); 	
    	r1.ph_no();
    	//r1.emailid();
    	//r1.proceed();
    	r1.pwd();
    	r1.verify();
    	
    	
    }

}
