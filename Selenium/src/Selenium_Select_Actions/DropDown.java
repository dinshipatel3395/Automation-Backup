package Selenium_Select_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
		Thread.sleep(5000);
		
		Select drp = new Select(driver.findElement(By.name("continents")));
		drp.selectByVisibleText("Antarctica");
	}
}
