package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.ApplyCoupon_13;
import FlightBookingSource.Flightdetailspage_8;
import FlightBookingSource.HomepageOneWay_4;

public class TestCaseApplyCoupon_13 extends Launch_Quit
{
	@Test //(retryAnalyzer=Utiliser.Retry.class)
	  public void search_flight() throws EncryptedDocumentException, IOException, InterruptedException
	  {
		  HomepageOneWay_4 h1= new HomepageOneWay_4(driver);
		  h1.search("Flight booking");
		  h1.bookflight();
		 
		  Login_Amazon l1= new Login_Amazon(driver);
		  l1.un();
	      l1.cont_button();
		  l1.password();
		  l1.signin_button();
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
		  Thread.sleep(2000);
		  Flightdetailspage_8 f1= new Flightdetailspage_8(driver);
		  f1.bookbutton();
		  ApplyCoupon_13 a1= new ApplyCoupon_13(driver);
		  a1.applydiscount();
}
}
