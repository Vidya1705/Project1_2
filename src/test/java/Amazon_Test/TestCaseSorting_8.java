package Amazon_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.Homepage;
import Amazon_source.SearchResultpage_8;

public class TestCaseSorting_8 extends Launch_Quit
{
   @Test //(retryAnalyzer=Utiliser.Retry.class)
   public void sortingprice_reviews() throws InterruptedException
   {
	   Homepage h1= new Homepage(driver);
	   h1.search("shoes"); 
	   
	   SearchResultpage_8 s1= new SearchResultpage_8(driver);
	   s1.dropdown("Featured");
	   String s2= s1.drpdwntextvisible().getText();
	   Assert.assertEquals(s2, "Featured","Sorry it did not match");
	   s1.dropdown("Price: Low to High");
	   String s3= s1.drpdwntextvisible().getText();
	   Assert.assertEquals(s3, "Price: Low to High","Sorry it did not match");
	   s1.dropdown("Avg. Customer Review");
	   String s4=s1.drpdwntextvisible().getText();
	   Assert.assertEquals(s4, "Avg. Customer Review","Sorry it did not match");

	   
	   
	   
	   
	  
			   
   }
}
