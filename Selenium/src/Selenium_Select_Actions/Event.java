package Selenium_Select_Actions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Event 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
		Thread.sleep(3000);
		act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"))).perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		driver.navigate().to("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(10000);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='nav__link'])[22]"))).perform();
		
		Thread.sleep(5000);
		JavascriptExecutor jst=(JavascriptExecutor)driver;
		jst.executeScript("window.scrollBy(0,550)");
		
		driver.findElement(By.name("text")).sendKeys("Dinshi");
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.SHIFT).perform();
		driver.findElement(By.xpath("//textarea[@name='text2']")).sendKeys("Nayan Patel");
		act.keyUp(Keys.SHIFT).perform();
	}
}
