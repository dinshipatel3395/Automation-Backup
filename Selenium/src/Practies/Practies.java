package Practies;


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
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Practies 
{
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/");
			
		Properties P=new Properties();
		FileInputStream F=new FileInputStream("D://Dinshi//QA//Work Space//Selenium//src//Practies//P1.properties");
		P.load(F);
		
		driver.findElement(By.xpath(P.getProperty("username"))).sendKeys("D@gmail.com");
		driver.findElement(By.xpath(P.getProperty("enter"))).click();
		
		
		WebDriverWait Wait=new WebDriverWait(driver,10);
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(P.getProperty("firstname"))));
		
		driver.findElement(By.xpath(P.getProperty("firstname"))).sendKeys("Divya");
		
		//input[@type="checkbox"]
		List<WebElement> T=driver.findElements(By.xpath(P.getProperty("CheckBox")));
		String Value="Cricket,Movies,";
		List<String>  G=new ArrayList<String> (Arrays.asList(Value.split(",")));
		for(String a:G)
		{
			for(WebElement b:T)
			{
				if(b.getAttribute("Value").equalsIgnoreCase(a))
				{
					b.click();
				}
			}
		}
		System.out.println("hgdfvcyasgrfhjv");
		
		Select S=new Select(driver.findElement(By.xpath(P.getProperty("DD2"))));
		S.selectByVisibleText("APIs");
		
		
		DateFormat DF=new SimpleDateFormat("yy_MM_dd_hh_mm_ss");
		Date D=new Date();
		String SS=DF.format(D);
		
		File SE=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SE, new File(System.getProperty("user.dir")+"////SS"+SS+".png"));
		
		
		ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"////report.html");
		ExtentTest Test;
		report.loadConfig(new File (System.getProperty("user.dir"+"//config.xml")));
		Test=report.startTest("Demo");
		
		if(driver.getTitle().equals("actualtitle"))
		{
			Test.log(LogStatus.PASS, "details"+Test.addScreenCapture(System.getProperty("user.dir")+"////SS"+SS+".png"));
		}
		
		report.endTest(Test);
		 report.flush();	
		 
		 
		 
		
		 
		 
		 
		
	}
}