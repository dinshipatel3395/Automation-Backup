package FormControl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program 
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
		
		WebElement Male = driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
		Thread.sleep(5000);
		WebElement FeMale = driver.findElement(By.xpath("//input[@value='Female']"));
		FeMale.click();
		Thread.sleep(5000);
		
		WebElement Year1 = driver.findElement(By.xpath("//input[@value='1']"));
		Year1.click();
		Thread.sleep(5000);
		WebElement Year2 = driver.findElement(By.xpath("//input[@value='2']"));
		Year2.click();
		Thread.sleep(5000);
		WebElement Year3 = driver.findElement(By.xpath("//input[@value='3']"));
		Year3.click();
		Thread.sleep(5000);
		WebElement Year4 = driver.findElement(By.xpath("//input[@value='4']"));
		Year4.click();
		Thread.sleep(5000);
		WebElement Year5 = driver.findElement(By.xpath("//input[@value='5']"));
		Year5.click();
		Thread.sleep(5000);
		WebElement Year6 = driver.findElement(By.xpath("//input[@value='6']"));
		Year6.click();
		Thread.sleep(5000);
		WebElement Year7 = driver.findElement(By.xpath("//input[@value='7']"));
		Year7.click();
		Thread.sleep(5000);
		
		WebElement Date = driver.findElement(By.xpath("	//input[@id='datepicker']"));
		Date.sendKeys("20/8/2019");
		Thread.sleep(5000);
		
		/*WebElement MT = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		MT.click();
		Thread.sleep(5000);
		WebElement AT = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		AT.click();
		Thread.sleep(5000);*/
		
		List <WebElement>profession = driver.findElements(By.xpath("//input[@name='profession']"));
		String value="Manual Tester,Automation Tester,";
		List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		for (String check : list)
		{
			for (WebElement chk : profession)
			{
				if(chk.getAttribute ("value").equalsIgnoreCase(check))
				{
					chk.click();
				}
			}
		}
		Thread.sleep(5000);
		
		try
		{
			WebElement ChooseFile = driver.findElement(By.xpath("//input[@id='photo']"));
			ChooseFile.sendKeys("C:/Users/Dinshi.Patel.1RIVET/Downloads/test.txt");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("File=="+e);
		}
		Thread.sleep(5000);
		
		List <WebElement>AutomationTool = driver.findElements(By.xpath("//input[@name='tool']"));
		String value1="QTP,Selenium IDE,Selenium Webdriver,";
		List<String> list1 = new ArrayList<String>(Arrays.asList(value1.split(",")));
		for (String check1 : list1)
		{
			for (WebElement chk1 : AutomationTool)
			{
				if(chk1.getAttribute ("value1").equalsIgnoreCase(check1))
				{
					chk1.click();
				}
			}
		}
		Thread.sleep(5000);
		
		/*WebElement QTP = driver.findElement(By.xpath("//input[@value='QTP']"));
		QTP.click();
		Thread.sleep(5000);
		WebElement SeleniumIDE = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		SeleniumIDE.click();
		Thread.sleep(5000);
		WebElement Selenium = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		Selenium.click();
		Thread.sleep(5000);*/
		
		
		}
	

	
}
