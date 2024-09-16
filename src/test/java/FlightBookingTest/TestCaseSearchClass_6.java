package FlightBookingTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Test.Launch_Quit;
import Amazon_source.Login_Amazon;
import FlightBookingSource.HomepageOneWay_4;
import FlightBookingSource.HomepageRoundTrip_5;
import FlightBookingSource.SearchClassEconomyBuss_6;

public class TestCaseSearchClass_6 extends Launch_Quit
{
 @Test //(retryAnalyzer=Utiliser.Retry.class)
 public void searchclass() throws InterruptedException, EncryptedDocumentException, IOException
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
	  
	  SearchClassEconomyBuss_6 s1= new SearchClassEconomyBuss_6(driver);
	  h1.search_button();
	  s1.travellers();
	  s1.premiumeconomyclass();
	  boolean premium= s1.premiumeconomy_class().isSelected();
	  Assert.assertEquals(premium, true, "Premium is not enabled");
	  Thread.sleep(2000);
	  h1.search_button();
	  Thread.sleep(2000);
	  s1.travellers();
	  s1.business();
	  boolean business= s1.business_class().isSelected();
	  Assert.assertEquals(business, true, "Business is not enabled");
	  h1.search_button();
	  s1.travellers();
	  Thread.sleep(2000);
	  s1.economy();
	  boolean economy= s1.economy_class().isSelected();
	  Assert.assertEquals(economy, true, "Economy is not enabled");
	  h1.search_button();
	  
	  
	 
	 
 }
}
