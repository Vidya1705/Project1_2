package Amazon_Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_source.Homepage;
import Amazon_source.ProductDetailPage_7;
import Amazon_source.SearchResultpage_8;
//@Listeners(Utiliser.Listener1.class)
public class TestCaseProductDetailpage_7 extends Launch_Quit
{
    @Test //(retryAnalyzer=Utiliser.Retry.class)
    
    public void ProductDetailPage_7() throws InterruptedException
    {   
    	Homepage h1= new Homepage(driver);
 	    h1.search("shoes"); 
 	    
 	   SearchResultpage_8 s1= new SearchResultpage_8(driver);
 	   s1.select_shoe();
 	   
 	   ProductDetailPage_7 p1= new ProductDetailPage_7(driver); 
 	   p1.reviews();
 	   p1.price();
 	   p1.productdescription();
 	   
 	    Set<String> ids=driver.getWindowHandles();// both parent and child id
 		Iterator<String> id= ids.iterator();
 		String parentid= id.next();// parent id
 		String childid= id.next();//1st child id
 		driver.switchTo().window(childid);
 		
 		boolean price=p1.shoe_price().isDisplayed();
 		Assert.assertEquals(price, true, "Price not displayed");
 		boolean review= p1.review().isDisplayed();
 		Assert.assertEquals(review, true,"Review not displayed");
 		boolean description= p1.product_description().isDisplayed();
 		Assert.assertEquals(description, true,"Description not displayed");
 		
 		
 		
 	   
 			   
    }
}
