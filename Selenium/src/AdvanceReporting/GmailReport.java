package AdvanceReporting;

/*1.Create program with following functionality:
a) Create 1st method “Launch web browser” to launch browser and hit http://automationpractice.com/index.php
URL.
b) Create 2nd method to Enter Email id in ‘email address’ field and click on “create an account” button
c) Create 3rd method for login functionality
1) Enter email address
2) Enter password
3)Click on Sign in button
e) Create 4th method to verify URL contains “http://automationpractice.com/index.php” or not
f) Create extend report for all 4 methods and print logs
g) Close window*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GmailReport 
{
	
	ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"\\result.html");
	ExtentTest test;
	WebDriver driver=new ChromeDriver();
	Properties App=new Properties();
	static FileInputStream obj;
	DateFormat DF;
	
	Date D=new Date();

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		obj=new FileInputStream("D://Dinshi//QA//Work Space//Selenium//src//Application.properties");
		GmailReport GR=new GmailReport();
		
		GR.LaunchBrowser();
		GR.CreateAnAccount();
		GR.LogIn();
		GR.SS();
		GR.VerifyURL();
		//GR.SS();
		GR.Report();
	}
	public void LaunchBrowser()
	{
		test=report.startTest("Launch Browser Method");
		test.log(LogStatus.INFO, "Passsed");
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	}
	public void CreateAnAccount() throws InterruptedException, IOException
	{
		test=report.startTest("CreateAnAccount");
		test.log(LogStatus.INFO, "CreateAnAccount");
		
		App.load(obj);
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Dinshi");
		
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Patel");
	
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("Dinshipatel1234");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("7874826582");
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@aria-label='Confirm']")));
		driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("7874826582");
		
		/*driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("7874826582");
		
		driver.findElement(By.xpath(App.getProperty("NextButton"))).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath(App.getProperty("NextButton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[2]")).sendKeys("dinshipatel1234@gmail.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Day']")).sendKeys("1");
		Select monthlabel = new Select(driver.findElement(By.xpath("//select[@aria-labelledby='month-label']")));
		monthlabel.selectByVisibleText("November");
		driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("2017");

		Select genderlabel=new Select(driver.findElement(By.xpath("//select[@aria-labelledby='gender-label']")));
		genderlabel.selectByVisibleText("Male");
		
		driver.findElement(By.xpath(App.getProperty("NextButton"))).click();*/
		
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	public void LogIn() throws InterruptedException, IOException
	{
		test=report.startTest("LogIn");
		test.log(LogStatus.INFO, "LogIn");
		
		App.load(obj);
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dinshipatel1234@gmail.com");
		driver.findElement(By.xpath(App.getProperty("Button"))).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("7874826582");
		driver.findElement(By.xpath(App.getProperty("Button"))).click();
		Thread.sleep(1000);
		
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(1000);
	}
	public void VerifyURL() throws IOException
	{
		SS();
		
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		test=report.startTest("VerifyURL");
		//test.log(LogStatus.INFO, "VerifyURL");
		
		if(driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/"))
		{  
			test.log(LogStatus.PASS, "Entered"+test.addScreenCapture(System.getProperty("user.dir")+"//fg"+DF.format(D)+".png"));
			System.out.println("Matched URL");
		}
		else
		{
			test.log(LogStatus.FAIL, "fwjskfhas"+test.addScreenCapture(System.getProperty("user.dir")+"//fg"+DF.format(D)+".png"));
			System.out.println("Unmatched URL");
		}
	}
	public void SS() throws IOException
	{
		DF=new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		
		File F=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(F, new File(System.getProperty("user.dir")+"//fg"+DF.format(D)+".png"));
	
		///FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//sc"+SS+".png"));
	}
	public void Report() throws IOException
	{
		SS();
		report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		test= report.startTest("demo");   
		if(driver.getTitle().equals("Inbox (3) - dinshipatel1234@gmail.com - Gmail"))
		{
		   	test.log(LogStatus.PASS, "Entered"+test.addScreenCapture(System.getProperty("user.dir")+"//fg"+DF.format(D)+".png"));  
		  	System.out.println("test pass");
		}
		else 
		{
			test.log(LogStatus.FAIL, "details"+test.addScreenCapture(System.getProperty("user.dir")+"//fg"+DF.format(D)+".png"));
		    System.out.println("test fail");
		}
		report.endTest(test);
		report.flush();	
	}
}