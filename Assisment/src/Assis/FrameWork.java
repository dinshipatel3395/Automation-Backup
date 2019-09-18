package Assis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FrameWork 
{
	static WebDriver driver;
	static Properties P;
	static WebDriverWait Wait;
	static DateFormat DF;
	static Date D;
	static File file;
	static ExtentReports Report;
	static ExtentTest Test;

	public static void URL(String Browser,String URL)
	{
		if(Browser=="Chrome")
		{
			System.setProperty("webdriver.chrome.driver","D://Dinshi//Assisment//Assisment//Driver//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
		}
		else if(Browser=="FireFox")
		{
			System.setProperty("webdriver.gecko.driver","D://Dinshi//Assisment//Assisment//Driver//geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(URL);
		}
	}
	
	public static void Pro() throws IOException
	{
		P=new Properties();
		FileInputStream File=new FileInputStream("D://Dinshi//Assisment//Assisment//src//Assis//Assis.properties");
		P.load(File);
	}
	
	public static void sendkey(String path,String value) throws IOException
	{
		Pro();
		driver.findElement(By.xpath(P.getProperty(path))).sendKeys(value);
	}
	
	public static void Click(String path) throws IOException
	{
		Pro();
		driver.findElement(By.xpath(P.getProperty(path))).click();
	}
	
	public static void DD(String path,String value)
	{
		Select S=new Select(driver.findElement(By.xpath(P.getProperty(path))));
		S.selectByVisibleText(value);
	}
	
	public static void ElementWait(String path)
	{
		Wait=new WebDriverWait(driver,10);
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(P.getProperty(path))));
	}
	
	public static void AlrtAcce(String value)
	{
		driver.switchTo().alert().accept();
	}
	
	public static void AlertDiss(String value)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void AlertDiss(String value)
	
	
	public static void SS() throws IOException
	{
		DateFormat DF=new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		Date D=new Date();
		String SD=DF.format(DF);
			
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir")+"//sc"+SD+".png"));
	}	
	
	public static void CheckBox(String path,String value)
	{
		List<WebElement> Li=driver.findElements(By.xpath(P.getProperty(path)));
		String Value=value;
		List <String> Lis=new ArrayList<String>(Arrays.asList(Value.split(",")));
		for(String A:Lis)
		{
			for(WebElement B:Li)
			{
				if(B.getAttribute("Value").equalsIgnoreCase(A))
				{
					B.click();
				}
			}
		}
	}
	
	public static void Report(String Title,String FileName,String TestName)
	{
		String ActualTitle=Title;
		Report=new ExtentReports(System.getProperty(System.getProperty("user.dir")+"//Result.html"));
		Report.loadConfig(new File(System.getProperty("user.dir")+FileName));
		Test=Report.startTest(TestName);
		if(driver.getTitle().equals(ActualTitle))
		{
			Test.log(LogStatus.PASS,"Pass");
		}
		else
		{
			Test.log(LogStatus.FAIL,"Fail");
		}
		Report.endTest(Test);
	}
	
	public static void ReportFlush()
	{
		Report.flush();
	}
	
	public static void ExeFile(String FileName) throws IOException
	{
		Runtime.getRuntime().exec(FileName);
	}
	
	public static void clos()
	{
		driver.close();
	}
	public static void Quit()
	{
		driver.quit();
	}
}


