package Utiliser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener1 implements ITestListener
{
	public static WebDriver driver;
	public void onTestStart(ITestResult result) 
	{
		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) 
	{
		String s1= result.getName();
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is pass");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\OneDrive\\Desktop\\Pass\\"+s1+Math.random()+".png");
		try 
		{
			FileHandler.copy(source, destination);
		} catch (IOException e) 
		{
			e.printStackTrace();
	    }
	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String s1= result.getName();
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase is fail");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\OneDrive\\Desktop\\Fail\\"+s1+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

