package FormControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(5000);
		WebElement FirstName=driver.findElement(By.xpath( "//input[@name='firstname']"));
		FirstName.sendKeys("Dinshi");
		Thread.sleep(5000);
		WebElement LastName=driver.findElement(By.xpath( "//input[@id='lastname']"));
		LastName.sendKeys("Patel");
		Thread.sleep(5000);
	}
}
