/*2.Create program with following functionality:
a) Launch web browser.
b) Hit URL http://automationpractice.com/index.php
c) Use explicit wait
d) Click on ‘Sign in’ button
e) Enter Email id in ‘email address’ field
f) Click on create an account button
g) Close window
*/
package Wait_and_Capture;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignINExplicit 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Nayan");
		
		driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Patel");
	
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("PatelNayan");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Dirgh12344");
		WebDriverWait wait=new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@aria-label='Confirm']")));
		driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("Dirgh12344");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();


		driver.findElement(By.xpath("//input[@aria-label='Phone number']")).sendKeys("7874826582");
		
		driver.quit();
	}
}


