package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.FlightDetailsBaggageCancellation_10;
import FlightBookingSource.Flightdetailspage_8;
import FlightBookingSource.HomepageOneWay_4;

public class TestCaseFlightDetailsBaggage_10 extends Launch_Quit
{
   @Test //(retryAnalyzer=Utiliser.Retry.class)
   public void Baggagecancellation() throws InterruptedException, EncryptedDocumentException, IOException
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
		  FlightDetailsBaggageCancellation_10 f3= new FlightDetailsBaggageCancellation_10(driver);
		  f3.viewbaggage();
		  f3.baggage();
		  Thread.sleep(2000);
		  f3.cancellation();
		  
		  boolean b7=	driver.getCurrentUrl().contains("flights");
		  Assert.assertEquals(b7,true,"failed");
   }
}
