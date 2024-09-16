package Amazon_Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import Amazon_source.Addtocartpage_9;
import Amazon_source.Homepage;
import Amazon_source.ProductDetailPage_7;
import Amazon_source.SearchResultpage_8;
import Amazon_source.cartpage_10_addandremove;
//@Listeners(Utiliser.Listener1.class)
public class TestCaseAddRemovecart_10 extends Launch_Quit
{
    @Test //(retryAnalyzer=Utiliser.Retry.class)
    public void addremovecart()
    {
    	Homepage h1= new Homepage(driver);
 	    h1.search("shoes"); 
 	   
 	   SearchResultpage_8 s1= new SearchResultpage_8(driver);
 	   s1.select_shoe();
	    
		Set<String> ids=driver.getWindowHandles();// both parent and child id
		Iterator<String> id= ids.iterator();
		String parentid= id.next();// parent id
		String childid= id.next();//1st child id
		//Thread.sleep(3000);
		driver.switchTo().window(childid);
	    Addtocartpage_9 a1= new Addtocartpage_9(driver);
 	    a1.addtocart();
 	   
 	    cartpage_10_addandremove c1= new cartpage_10_addandremove(driver);
 	    c1.gotocart();
 	    c1.delete();
 	    
    }
}
