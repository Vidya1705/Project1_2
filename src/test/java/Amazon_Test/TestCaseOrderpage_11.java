package Amazon_Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Amazon_source.Addtocartpage_9;
import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;
import Amazon_source.Orderpage_11;
import Amazon_source.ProductDetailPage_7;
import Amazon_source.SearchResultpage_8;
import Utiliser.DDT;

public class TestCaseOrderpage_11 extends Launch_Quit
{
@Test //(retryAnalyzer=Utiliser.Retry.class)
    
    public void addtocart() throws InterruptedException, EncryptedDocumentException, IOException
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
 	   
 	   Orderpage_11 o1= new Orderpage_11(driver);
 	   o1.proceedtobuy();
 	    Login_Amazon l1= new Login_Amazon (driver);
	   l1.un();
	   l1.cont_button();
	   l1.password();
	   l1.signin_button();
 	   o1.radiobutton();
 	   o1.usethisaddress();
 	   o1.paymentradiobutton();
 	   o1.usepaymentmethod();
 	  
 	  
 	  
 	   
}
}
