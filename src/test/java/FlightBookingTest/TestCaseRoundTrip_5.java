package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.HomepageOneWay_4;
import FlightBookingSource.HomepageRoundTrip_5;

public class TestCaseRoundTrip_5 extends Launch_Quit
{    @Test //(retryAnalyzer=Utiliser.Retry.class)
	public void Roundtrip() throws EncryptedDocumentException, IOException, InterruptedException
	{
	  HomepageOneWay_4 h1= new HomepageOneWay_4(driver);
	  HomepageRoundTrip_5 h2= new HomepageRoundTrip_5(driver);
	  h1.search("Flight booking");
	  h1.bookflight();
	 
	  Login_Amazon l1= new Login_Amazon(driver);
	  l1.un();
      l1.cont_button();
	  l1.password();
	  l1.signin_button();
	  h2.roundtrip();
	  h1.clicksearch_from();
	  h1.search_1("Bengaluru");
	  Thread.sleep(1000);
	  h1.searchresult_from();
	  h1.search_1("Mumbai");
	  Thread.sleep(1000);
	  h1.searchresult_from();
	  h1.clickdate_from();
	 
	  
	  h2.clickdate_to();
	  h1.search_button();
	  
	}	  
}
