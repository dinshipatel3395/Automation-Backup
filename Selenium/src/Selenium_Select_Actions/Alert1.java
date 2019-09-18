package Selenium_Select_Actions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 100);
	
	
		driver.findElement(By.xpath("//input[@name='B1']")).click();
		Thread.sleep(5000);
		
		Alert SimpleAlert= driver.switchTo().alert();
		String alertText1 = SimpleAlert.getText();
		System.out.println("Alert text is " + alertText1);
		SimpleAlert.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click();
		Thread.sleep(5000);
		
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);
		confirmationAlert.accept();
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@value='prompt box']")));
		driver.findElement(By.xpath("//input[@value='prompt box']")).click();

	
		Alert promptAlert = driver.switchTo().alert();
		String alertText2 = promptAlert.getText();
		System.out.println("Alert text is " + alertText2);
		wait.until(ExpectedConditions.alertIsPresent());
		promptAlert.sendKeys("Accepting the alert");
		Thread.sleep(5000);
		promptAlert.accept();
		
	}	
}
	
	/*	public static void main(String[] args) throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.gecko.driver","D://Dinshi//QA//Work Space//Selenium//GeckoDriver//geckodriver.exe");
			WebDriver driver1=new FirefoxDriver();
		
			driver1.get("http://www.echoecho.com/javascript4.htm");
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
			driver1.findElement(By.xpath("//input[@name='B1']")).click();
			Thread.sleep(5000);
			
			Alert SimpleAlert= driver1.switchTo().alert();
			SimpleAlert.accept();
			Thread.sleep(5000);
			
			driver1.findElement(By.xpath("//input[@value='confirm box']")).click();
			Thread.sleep(5000);
			
			Alert confirmationAlert = driver1.switchTo().alert();
			confirmationAlert.accept();
			Thread.sleep(5000);
			
			driver1.findElement(By.xpath("//input[@value='prompt box']")).click();
			Thread.sleep(5000);
			
			Alert promptAlert = driver1.switchTo().alert();
			promptAlert.sendKeys("Accepting the alert");
			Thread.sleep(5000);
			promptAlert.accept();
			Thread.sleep(5000);
	}
	
}*/
