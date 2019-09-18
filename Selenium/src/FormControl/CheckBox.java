package FormControl;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form");
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
	}
}
