package Selenium_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Dinshi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Patel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("PatelDinshiNayan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Dirgh12344!@#$12344");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("Dirgh12344!@#$12344");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("7874826582");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		
		driver.quit();
	}
}
