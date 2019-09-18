/*1.Launch browser and hit any URL
-Verify the title of the application is correct or not (using assertion).
-Use various types of assertions in your script example equals, notequals, notnull.
-Try to compare String values in assertion.
-Use @BeforeSuite, @AfterSuite, @BeforeMethod, @Aftermethod and @Test annotation in your script*/

package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestNG
{
	WebDriver driver;	
	ExtentReports report;
	ExtentTest Test;
	String dateFormatted;
	  
	@BeforeSuite
	public void hitURL() throws InterruptedException
	{
		 System.out.println("Launch browser mathod called");
		 System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
	 }
	  
	 @BeforeTest
	 public void report()
	 {
		 report = new ExtentReports(System.getProperty("user.dir")+"/Demoresult1.html");
		 report.loadConfig(new File(System.getProperty("user.dir")+"//extnet-config.xml"));
		 Test= report.startTest("Test1");
	 }
	 
	 @BeforeMethod
	 public void print()
	 {
		 System.out.println("BeforeMethod is executed");
	 }
	 
	 @Test(priority=0)
	 public void verifyURL() throws IOException, InterruptedException
	 {
		 Thread.sleep(4000);
		 driver.get("https://www.youtube.com/");
	 	 String actualTitle = "YouTube"; 
	 	 Thread.sleep(2000);
	 	 String msg = "Titles are same";
	 	 //Assert.assertEquals(driver.getTitle(), actualTitle, msg);
	 	 Thread.sleep(4000);
	 	 screenshot();
		 if(driver.getTitle().equals(actualTitle))
	 	 {
	 	 	 Test.log(LogStatus.PASS,"Enter"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+dateFormatted+".png"));
	 	 }
	 	 else
	 	 {
	 		Test.log(LogStatus.FAIL,"Enter"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+dateFormatted+".png"));
	 	 }
	  }
	 
	 @Test(priority=1)
	 public void SearchSelenium() throws IOException, InterruptedException
	 {
		 driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Selenium");
		 driver.manage().window().setSize(new Dimension(1024, 768));
		 screenshot();
	 }
	   
	 @Test(priority=2)
	 public void Search() throws InterruptedException, IOException
	 {
		 driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
		 Thread.sleep(4000);
		
	 }
	 
	 @Test(priority=3)
	 public void notequals() throws InterruptedException, IOException
	 {
		 String actualTitle = "aedgaSRFhgafdhb"; 
		 Thread.sleep(2000);
		 String msg = "Titles are not same";
		// Assert.assertEquals(driver.getTitle(), actualTitle, msg);
		 Thread.sleep(4000);
		 driver.manage().window().setSize(new Dimension(1024, 768));
		 screenshot();
		if(driver.getTitle().equals(actualTitle))
		 {
		 	 Test.log(LogStatus.PASS,"Enter"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+dateFormatted+".png"));
		 }
		 else
		 {
		 	Test.log(LogStatus.FAIL,"Enter"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+dateFormatted+".png"));
		 }
	 }
	 
	 @AfterMethod
	 public void print1()
	 {
		 System.out.println("AfterMethod is executed");
	 }
	 
	 public void screenshot() throws IOException, InterruptedException
	 {
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yy_hh_mm_ss");
		Date date = new Date();
		 dateFormatted= dateFormat.format(date);
			
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"//sc"+dateFormatted+".png"));
		Thread.sleep(1000);
	 }
	 
	 @AfterSuite
	 public void terminate()
	 {
		 report.endTest(Test);
		 report.flush();	
		 driver.close();
	 }
}
