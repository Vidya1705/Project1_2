package Amazon_Test;

import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.searchfilterpage_6;

public class TestCaseSearchFilter_6 extends Launch_Quit
{
	@Test //(retryAnalyzer=Utiliser.Retry.class)
	   public void searchresults()
	   {
		   Homepage h1= new Homepage(driver);
		   h1.search("shoe"); 
		   
		   searchfilterpage_6 s1= new searchfilterpage_6(driver);
		   s1.categories();
		   
				                       
}
}
