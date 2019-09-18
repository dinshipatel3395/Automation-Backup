package Demo;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.server.handler.FindElement;
	
	
	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	
	public class Online2PDF 
	{
		public static void main(String[] args) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://google.com");
			Thread.sleep(5000);
			By input=By.xpath("//input[@name='q']");
			WebElement searchElement=driver.findElement(input);
			searchElement.clear();
			Thread.sleep(2000);
			searchElement.sendKeys("online2pdf");
			Thread.sleep(4000);
			By input1=By.xpath("//input[@name='btnK']");
			WebElement searchbutton=driver.findElement(input1);
			searchbutton.click();
			By input2=By.xpath("//div[@class='g']//div//div//div[@class='rc']//div[@class='ellip'][contains(text(),'Online PDF Converter - Merge, compress & unlock PD')]");
			WebElement searchbutton1=driver.findElement(input2);
			searchbutton1.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='browse_button']")).sendKeys("C://Users//Dinshi.Patel.1RIVET//Downloads//test.txt");
			
			//driver.get("D://Dinshi//QA//Assignment//ODT//Automation Assinment");
		/*	By input3=By.xpath("//button[@class='browse_button']");
			WebElement searchbutton2=driver.findElement(input3);
			searchbutton2.click();
			*/
			//driver.get("D://Dinshi//QA//Assignment//ODT//Automation Assinment");
			//searchbutton2.sendKeys("D://Dinshi//QA//Assignment//ODT//Automation Assinment");
			
			//FileReader file = new FileReader("D://Dinshi//QA//Assignment//ODT//Automation Assinment");
			//BufferedReader fileInput = new BufferedReader(file);
			//System.out.println(fileInput.readLine());
			
			
			//driver.quit();
		}
	}
	
	



	

