package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Auto 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(5000);
		By input=By.xpath("//input[@name='q']");
		WebElement searchElement=driver.findElement(input);
		searchElement.clear();
		Thread.sleep(2000);
		searchElement.sendKeys("1Rivet");
		Thread.sleep(4000);
		By input1=By.xpath("//input[@name='btnK']");
		WebElement searchbutton=driver.findElement(input1);
		searchbutton.click();
		By input2=By.xpath("//div[contains(text(),'1Rivet Opens Second Office in Valsad, India to Boo')]");
		WebElement searchbutton1=driver.findElement(input2);
		searchbutton1.click();
		
		//driver.quit();
	}
}


