package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleFileUpload 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://online2pdf.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//FileUpload1.exe");
	
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();

		Thread.sleep(3000);
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//FileUpload2.exe");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();

		Thread.sleep(3000);
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//FileUpload3.exe");	
	}
}
