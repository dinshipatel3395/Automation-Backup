package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Gmail 
{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			Thread.sleep(1000);
			
			/*By input=By.xpath("//a[@data-pid='23']");
			WebElement searchElement=driver.findElement(input);
			searchElement.clear();
			Thread.sleep(1000);
			
			searchElement.sendKeys("https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Drm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			Thread.sleep(1000);
			
			By input1=By.xpath("//input[@name='btnK']");
			WebElement searchbutton=driver.findElement(input1);
			searchbutton.click();
			By input2=By.xpath("//div[contains(text(),'Google Login - Sign in - Google Accounts')]");
			WebElement click1=driver.findElement(input2);
			click1.click();
			Thread.sleep(1000);*/
			
			WebElement EnterEmail=driver.findElement(By.xpath("//input[@aria-label='Email or phone']"));
			EnterEmail.sendKeys("dinshipatel1234@gmail.com");
			WebElement ClickOnNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			ClickOnNext.click();
			Thread.sleep(1000);
			
			WebElement EnterPassword=driver.findElement(By.xpath("//input[@type='password']"));
			EnterPassword.sendKeys("7874826582");
			Thread.sleep(1000);
			
			WebElement ClickOnNext1=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			ClickOnNext1.click();
			Thread.sleep(5000);
			
			/*WebElement ClickOnNext2=driver.findElement(By.xpath("//a[@class='gb_z']"));
			ClickOnNext2.click();
			Thread.sleep(12000);
			
			WebElement GmailIcon=driver.findElement(By.xpath("//a[@id='gb23']//span[@class='gb_m']"));
			GmailIcon.click();
			Thread.sleep(12000);*/
			
			WebElement ClickCompose=driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
			ClickCompose.click();
			Thread.sleep(8000);
			
			WebElement EnterTo=driver.findElement(By.xpath("//textarea[@aria-label='To']"));
			EnterTo.sendKeys("axatapanwala11218@gmail.com");
			Thread.sleep(5000);
	
			WebElement Subject=driver.findElement(By.xpath("//input[@name='subjectbox']"));
			Subject.sendKeys("Letter");
			Thread.sleep(8000);
			
			WebElement EnterDetail=driver.findElement(By.xpath("//div[@id=':qb']"));
			EnterDetail.sendKeys("Hi Axata, I am fine. Regards, Dinshi Patel");
			Thread.sleep(8000);
		
			//driver.quit();
		}
	}


