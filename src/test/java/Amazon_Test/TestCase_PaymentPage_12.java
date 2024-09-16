package Amazon_Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Amazon_source.Addtocartpage_9;
import Amazon_source.Homepage;
import Amazon_source.Login_Amazon;
import Amazon_source.Orderpage_11;
import Amazon_source.PaymentPage_12;
import Amazon_source.SearchResultpage_8;
//@Listeners(Utiliser.Listener1.class)
public class TestCase_PaymentPage_12 extends Launch_Quit
{
    @Test //(retryAnalyzer=Utiliser.Retry.class)
    public void selectallpayments() throws EncryptedDocumentException, IOException
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
 	    
 	    PaymentPage_12 p3= new PaymentPage_12(driver);
 	    p3.creditordebit();
 	    boolean cc= p3.creditdebit().isSelected();
	    Assert.assertEquals(cc, true, "CC radio button not enabled");
 	    p3.Netbanking();
 	    boolean netbanking=p3.Netbank().isSelected();
	    Assert.assertEquals(netbanking, true, "Netbanking button is not enabled");
 	    p3.OtherUPI();
 	    boolean upi=p3.UPI().isEnabled();
	    Assert.assertEquals(upi, true, "UPI is not enabled");
 	    p3.EMI();
 	    boolean emi= p3.EMI_option().isSelected();
 	    Assert.assertEquals(emi, true, "EMI is not enabled");
 	    
 	    
 	    
 	    
 	    
 	  
 		
 		 
 	    
    }
}
