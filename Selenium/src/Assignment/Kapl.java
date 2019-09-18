package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.Authentication.User;

public class Kapl
{
	static WebDriver driver;

	static String SearchElement;
	static Properties obj = new Properties();
	static String dir = System.getProperty("user.dir");
	static FileInputStream objfile;
	static String abc;
	
	
	//Launch 
	public static void OpenURL(String BrowserName,String URL) throws InterruptedException
	{
		if(BrowserName.equals("CH"))
		{
			System.setProperty("webdriver.chrome.driver", "D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.get(URL);
		}
		else if(BrowserName.equals("FX"))
		{
			System.setProperty("webdriver.gecko.driver","D://Dinshi//QA//Work Space//Selenium//GeckoDriver//geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.get(URL);
		}
	}
	
	public static void ObjectRepo() throws IOException
	{
		objfile = new FileInputStream(dir+"\\src\\Assignment\\System.properties");
		obj.load(objfile);
	}
	
	public static void SendKey(String obje,String value)
	{
		driver.findElement(By.xpath(obj.getProperty(obje))).sendKeys(value);
	}
	
	public static void Click(String path)
	{
		driver.findElement(By.xpath(obj.getProperty(path))).click();
	}
	
	public static void checkbox(String path,String Value1)
	{
		List <WebElement> CB=driver.findElements(By.xpath(path));
		String value = Value1;
		List<String> list1=new ArrayList<String>(Arrays.asList(value.split(",")));
		for(String check:list1)
		{
			for(WebElement CKH:CB)
			{
				if(CKH.getAttribute(value).equalsIgnoreCase(check))
				{
					CKH.click();
				}
			}
		}	
	}
	
	public static void SS() throws IOException
	{
		DateFormat DF=new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		Date D=new Date();
		String SD=DF.format(DF);
			
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File(System.getProperty("user.dir")+"//sc"+SD+".png"));
	}	
	
	public static void report()
	{
		
	}
	
	
}
