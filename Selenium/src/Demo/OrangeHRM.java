package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM 
{
	

	public static void main(String args[]) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dinshi-trials65.orangehrmlive.com/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		Properties AP=new Properties();
		FileInputStream obj=new FileInputStream("D://Dinshi//QA//Work Space//Selenium//src//Application.properties");
		AP.load(obj);
		
		driver.findElement(By.xpath(AP.getProperty("UserName"))).sendKeys("Admin");
		driver.findElement(By.xpath(AP.getProperty("Password"))).sendKeys("Dinshi@123");
		driver.findElement(By.xpath(AP.getProperty("LogInButton"))).click();
		
		driver.findElement(By.xpath("(//span[@class='left-menu-title'])[38]")).click();
		driver.findElement(By.xpath("(//span[@class='left-menu-title'])[46]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='emp_search_lst_employee_name_filter_value']")));
		
		driver.findElement(By.xpath("//input[@id='emp_search_lst_employee_name_filter_value']")).sendKeys("Nayankumar");
		driver.findElement(By.xpath("//input[@id='emp_search_lst_employee_id_filter']")).sendKeys("OHRM123");
		
		Select drp = new Select(driver.findElement(By.xpath("(//input[@class='select-dropdown'])[6]")));
		
		drp.selectByVisibleText("Past Employees Only");
		
	}
}
