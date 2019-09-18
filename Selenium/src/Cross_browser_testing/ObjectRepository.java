package Cross_browser_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(5000);
		
		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream("D://Dinshi//QA//Work Space//Selenium//src//Application.properties");
		obj.load(objfile);
		
		By input=By.xpath(obj.getProperty("Value"));
		WebElement searchElement=driver.findElement(input);
		searchElement.clear();
		Thread.sleep(2000);
		
		searchElement.sendKeys("online2pdf");
		Thread.sleep(4000);
		
		By input1=By.xpath(obj.getProperty("Button"));
		WebElement searchbutton=driver.findElement(input1);
		searchbutton.click();
		Thread.sleep(4000);
		
		By input2=By.xpath("//div[@class='g']//div//div//div[@class='rc']//div[@class='ellip'][contains(text(),'Online PDF Converter - Merge, compress & unlock PD')]");
		WebElement searchbutton1=driver.findElement(input2);
		searchbutton1.click();
		
		driver.findElement(By.xpath(obj.getProperty("Browse_Button"))).click();
	}
}
