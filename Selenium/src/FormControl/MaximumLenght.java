package FormControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximumLenght 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("text")).sendKeys("1234567890");
		driver.findElement(By.xpath("//textarea[@name='text2']")).sendKeys("12345678912345678912");
		
		WebElement input1=driver.findElement(By.name("text"));
		System.out.println(input1.getAttribute("maxlength"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@name='text2']"));
		System.out.println(input2.getAttribute("maxlength"));
	}
}
