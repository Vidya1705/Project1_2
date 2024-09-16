package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_source.Homepage;

//Search the product
public class TestCaseHome extends Launch_Quit
{
   @Test //(retryAnalyzer=Utiliser.Retry.class)
   public void search_product()
   {
	   Homepage h1= new Homepage(driver);
	   h1.search("shoes"); 
	   h1.accountlist(driver);
	   h1.start();
   }
}
