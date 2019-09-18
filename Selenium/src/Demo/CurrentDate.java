package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDate 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(1000);
		By input=By.xpath("//input[@name='q']");
		WebElement searchElement=driver.findElement(input);
		searchElement.clear();
		Thread.sleep(1000);
		searchElement.sendKeys("current date");
		Thread.sleep(1000);
		By input1=By.xpath("//input[@name='btnK']");
		WebElement searchbutton=driver.findElement(input1);
		searchbutton.click();
	}
}
