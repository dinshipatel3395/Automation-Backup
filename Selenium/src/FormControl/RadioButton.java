package FormControl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(5000);
		
		WebElement Male = driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
		Thread.sleep(5000);
		
		WebElement FeMale = driver.findElement(By.xpath("//input[@value='Female']"));
		FeMale.click();
		Thread.sleep(5000);
		
	}
}
