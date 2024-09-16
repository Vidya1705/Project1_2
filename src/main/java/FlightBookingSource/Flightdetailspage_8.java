package FlightBookingSource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightdetailspage_8 
{
    public static WebDriver driver;
    public Flightdetailspage_8 (WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
    @FindBy(xpath="(//button[.='Book'])[1]")
    WebElement book_button;
    @FindBy(xpath="//a[.='Proceed to traveller details']")
    WebElement proceed;
    @FindBy(xpath="//div[@id='fl_tr_add']")
    WebElement addnewadultbutton;
    @FindBy(xpath="//div[@class='a95d62c9']/div/button")                  
    WebElement selectgender;
    @FindBy(xpath="//li[.='Female']")
    WebElement female;
    @FindBy(xpath="//input[@id='input-first_name']")
    WebElement first_name;
    @FindBy(xpath="//input[@id='input-last_name']")
    WebElement last_name;
    @FindBy(xpath="//button[.='Add adult']")
    WebElement add_adult;
    @FindBy(xpath="//div[@class='c172d511']/label/i")
    WebElement check_box;
    @FindBy(xpath="//input[@id='input-email']")
    WebElement email;
    @FindBy(xpath="//button[.='Proceed to seat selection']")
    WebElement proceedtoseatselection;
    @FindBy(xpath="((//div[@class='_93930998 '])[12]/div)[10]/div")
    WebElement selectseat;
    
    public void bookbutton()
    {
    	book_button.click();
    }
    public void proceedtotravellerdetails()
    {
    	proceed.click();
    }
    public void addnewadult()
    {
    	addnewadultbutton.click();
    }
    public void gender()
    {
    	selectgender.click();
    }
    public void selectfemale()
    {
    	female.click();
    }
    public void firstname(String firstname)
    {
    	first_name.sendKeys(firstname,Keys.ENTER);
    }
    public void lastname(String lastname)
    {
    	last_name.sendKeys(lastname,Keys.ENTER);
    }
    public void addadult()
    {
    	add_adult.click();
    }
    public void checkbox()
    {
    	check_box.click();
    }
    public void emailid(String email_id)
    {
    	email.sendKeys(email_id,Keys.ENTER);
    }
    public void proceedseatselection()
    {
    	proceedtoseatselection.click();
    }
    public void select_seat()
    {
    	selectseat.click();
    }
	
}
