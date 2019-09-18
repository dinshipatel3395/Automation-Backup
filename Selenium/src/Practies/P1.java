package Practies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class P1
{
	WebDriver driver;
	Properties P;
	WebDriverWait wait;
	ExtentReports report;
	ExtentTest Test;
	String SS;
		
	@BeforeSuite
	public void launchBrawser()
	{
		System.setProperty("webdriver.chrome.driver", "D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@BeforeTest
	public void URL() throws IOException
	{
		report=new ExtentReports(System.getProperty("user.dir")+"/Demoresult1.html");
		report.loadConfig(new File(System.getProperty("user.dir")+"//config.xml"));
		Test=report.startTest("test");	
		
		driver.get("http://demo.automationtesting.in/");
		Pro();
		driver.findElement(By.xpath(P.getProperty("username"))).sendKeys("divyapatel123@gmail.com");
		driver.findElement(By.xpath(P.getProperty("enter"))).click();
		
	}
		
	@Test
	public void a() throws InterruptedException, IOException
	{
		String Actual="Register";
		W(P.getProperty("firstname"));
		driver.findElement(By.xpath(P.getProperty("firstname"))).sendKeys("Divya");
		W(P.getProperty("Lastname"));
		driver.findElement(By.xpath(P.getProperty("Lastname"))).sendKeys("Patel");
		W(P.getProperty("Address"));
		driver.findElement(By.xpath(P.getProperty("Address"))).sendKeys("fxnbhvyuasdfgvjafsbnhjagfvjansfjbhafcxhnmvbfjhk");
		driver.findElement(By.xpath(P.getProperty("Email"))).sendKeys("divya@gmail.com");
		driver.findElement(By.xpath(P.getProperty("TelPhone"))).sendKeys("7874826582");
		driver.findElement(By.xpath(P.getProperty("radioM"))).click();	
		SS();
		if(driver.getTitle().equals(Actual))
		{
			Test.log(LogStatus.PASS, "details"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+SS+".png"));
		}
		else
		{
			Test.log(LogStatus.FAIL, "details"+Test.addScreenCapture(System.getProperty("user.dir")+"//sc"+SS+".png"));
		}
	}
	
	@Test
	public void b()
	{
		W(P.getProperty("CheckBox"));
		List <WebElement> CB=driver.findElements(By.xpath(P.getProperty("CheckBox")));
		String value = "Cricket,Movies,Hockey, ";
		List<String> list1=new ArrayList<String>(Arrays.asList(value.split(",")));
		for(String check:list1)
		{
			for(WebElement CKH:CB)
			{
				if(CKH.getAttribute("value").equalsIgnoreCase(check))
				{
					CKH.click();
				}
			}
		}	
	}
	
	@Test
	public void c()
	{
		try
		{
			driver.findElement(By.xpath(P.getProperty("DD1"))).click();
			driver.findElement(By.xpath(P.getProperty("DD"))).click();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void d()
	{
		Select dd2=new Select(driver.findElement(By.xpath(P.getProperty("DD2"))));
		dd2.selectByVisibleText("APIs");
	}

	@Test
	public void e()
	{
		Select dd3=new Select(driver.findElement(By.xpath(P.getProperty("DD3"))));
		dd3.selectByVisibleText("Åland Islands");
	}
	
	@Test
	public void f() throws IOException, InterruptedException
	{
			driver.findElement(By.xpath(P.getProperty("FUp"))).click();
			Thread.sleep(4000);
			Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//FU.exe");

	}
	
	public void SS() throws IOException
	{
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yy_hh_mm_ss");
		Date date = new Date();
		SS = dateFormat.format(date);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//sc"+SS+".png"));
	}
	
	public void Pro() throws IOException
	{
		P=new Properties();
		FileInputStream FIP=new FileInputStream("D://Dinshi//QA//Work Space//Selenium//src//Practies//P1.properties");
		P.load(FIP);
	}
	
	public void W(String path)
	{
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
	}
	
	@AfterTest
	public void xt()
	{
		report.endTest(Test);
		report.flush(); 
		//driver.quit();
	}
}

