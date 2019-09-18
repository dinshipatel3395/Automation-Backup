package Assis;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class QUE4 extends FrameWork
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		URL("Chrome","http://demo.automationtesting.in/Register.html");
		
	/*	Properties P=new Properties();
		FileInputStream File=new FileInputStream("D://Dinshi//Assisment//Assisment//src//Assis//Assis.properties");
		P.load(File);
		Thread.sleep(8000);
		
		driver.findElement(By.xpath(P.getProperty("FName"))).sendKeys("Dinshi");
		driver.findElement(By.xpath(P.getProperty("LName"))).sendKeys("Patel");
		driver.findElement(By.xpath(P.getProperty("Address"))).sendKeys("Kumbhariya");
		driver.findElement(By.xpath(P.getProperty("Email"))).sendKeys("Dinshi@gmail.com");
		driver.findElement(By.xpath(P.getProperty("Tele"))).sendKeys("7874995689");*/
		ElementWait("FName");
		sendkey("FName","Dinshi");
		sendkey("LName","Patel");
		sendkey("Address","Kumbhariya");
		sendkey("Email","Dinshi@gmail.com");
		sendkey("Tele","7874995689");
		
		//driver.findElement(By.xpath(P.getProperty("RMale"))).click();
		Click("RMale");
		
		/*List<WebElement> Li=driver.findElements(By.xpath(P.getProperty("CBox")));
		String Value="Movies,Hockey, ";
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
		}*/
		CheckBox("CBox","Movies,Hockey, ");
		
		/*Select S=new Select(driver.findElement(By.xpath(P.getProperty("Skill"))));
		S.selectByVisibleText("SQL");
		
		Select S1=new Select(driver.findElement(By.xpath(P.getProperty("Country"))));
		S1.selectByVisibleText("India");
		
		Select S2=new Select(driver.findElement(By.xpath(P.getProperty("Year"))));
		S2.selectByVisibleText("1995");
		
		Select S3=new Select(driver.findElement(By.xpath(P.getProperty("Month"))));
		S3.selectByVisibleText("March");
		
		Select S4=new Select(driver.findElement(By.xpath(P.getProperty("Day"))));
		S4.selectByVisibleText("3");*/
		DD("Skill","SQL");
		DD("Country","India");
		DD("Year","1995");
		DD("Month","March");
		DD("Day","3");
		
		Thread.sleep(3000);
		try
		{
			/*driver.findElement(By.xpath(P.getProperty("Password"))).sendKeys("Dinshidinshi1234");
			driver.findElement(By.xpath(P.getProperty("ConPassword"))).sendKeys("Dinshidinshi1234");*/
			sendkey("Password","Divyapatel1234");
			sendkey("ConPassword","Divyapatel1234");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			Click("ChosseFile");
			//driver.findElement(By.xpath(P.getProperty("ChosseFile"))).click();
			Runtime.getRuntime().exec("D://Dinshi//Assisment//FileUpload.exe");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		driver.findElement(By.xpath(P.getProperty("SubmitButton"))).click();
		//Click("SubmitButton");
		Thread.sleep(5000);
		
		String Actual="http://demo.automationtesting.in/WebTable.html";
	
		if(driver.getCurrentUrl().equals(Actual))
		{
			System.out.println("Match URL");
		}
		else
		{
			System.out.println("UnMatch URL");
		}
		
		//driver.quit();
	}	
}
