package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.Flightdetailspage_8;
import FlightBookingSource.HomepageOneWay_4;
import FlightBookingSource.flightdetailsMultiplePassenger_9;


public class TestCaseMultiplepassenger_9 extends Launch_Quit
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
		  f1.proceedtotravellerdetails();
		  f1.addnewadult();
		  Thread.sleep(2000);
		  f1.gender();
		  f1.selectfemale();
		  f1.firstname("Vidya");
		  f1.lastname("A");
		  Thread.sleep(2000);
		  f1.addadult();
		  Thread.sleep(2000);
		  f1.checkbox();
		  f1.emailid("vidya1985@gmail.com");
		  Thread.sleep(2000);
		  f1.proceedseatselection();
		  
		  flightdetailsMultiplePassenger_9 f2= new flightdetailsMultiplePassenger_9(driver);
		  f2.firstname1("Oreo");
		  boolean fname= f2.fname().isEnabled();
		  Assert.assertEquals(fname, true, "First name is disabled");
		  f2.lastname1("O");
		  boolean lname= f2.lname().isEnabled();
		  Assert.assertEquals(lname, true, "last name is not disabled");
		  f2.firstname2("Haasi");
		  f2.lastname2("P");
		  
		  
		  
		
		  
				  
	  }
}
