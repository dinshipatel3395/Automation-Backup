package Cross_browser_testing;





/*1.Open the application in different browsers and perform same action on every browser,IE,chrome and firefox?*/

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
		
public class EveryBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
		
		
		WebElement EnterEmail=driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		EnterEmail.sendKeys("dinshipatel1234@gmail.com");
		WebElement ClickOnNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		ClickOnNext.click();
		driver.quit();
	
		
		System.setProperty("webdriver.gecko.driver","D://Dinshi//QA//Work Space//Selenium//GeckoDriver//geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		WebElement EnterEmail1=driver1.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		EnterEmail1.sendKeys("dinshipatel1234@gmail.com");
		WebElement ClickOnNext1=driver1.findElement(By.xpath("//span[contains(text(),'Next')]"));
		ClickOnNext1.click();
		driver1.quit();

		
		System.setProperty("webdriver.ie.driver","D://Dinshi//QA//Work Space//Selenium//IEDriver//IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.manage().window().maximize();
		driver2.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement EnterEmail2=driver2.findElement(By.xpath("//input[@aria-label='Email or phone']"));
		EnterEmail2.sendKeys("dinshipatel1234@gmail.com");
		WebElement ClickOnNext2=driver2.findElement(By.xpath("//span[contains(text(),'Next')]"));
		ClickOnNext2.click();
		driver2.quit();
	}
}
