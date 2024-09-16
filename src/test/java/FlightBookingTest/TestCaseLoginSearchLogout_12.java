package FlightBookingTest;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.HomepageOneWay_4;
import FlightBookingSource.LoginSearchflightLogout_12;

public class TestCaseLoginSearchLogout_12 extends Launch_Quit
{
	 @Test //(retryAnalyzer=Utiliser.Retry.class)
	   public void loginsearchlogout() throws InterruptedException, EncryptedDocumentException, IOException
	   {
		 LoginSearchflightLogout_12 l2= new LoginSearchflightLogout_12(driver);
		  l2.accountlist(driver);
		  l2.signin();
		 Login_Amazon l1= new Login_Amazon(driver);
		  l1.un();
	      l1.cont_button();
		  l1.password();
		  l1.signin_button();
		  HomepageOneWay_4 h1= new HomepageOneWay_4(driver);
		  h1.search("Flight booking");
		  h1.bookflight();
		  h1.oneway();
		  h1.clicksearch_from();
		  h1.search_1("Bengaluru");
		  Thread.sleep(2000);
		  h1.searchresult_from();
		  h1.search_1("Mumbai");
		  Thread.sleep(2000);
		  h1.searchresult_from();
		  h1.clickdate_from();
		  h1.search_button();
		  
		  l2.accountlist(driver);
		  l2.signout();
		  
	   }
}
