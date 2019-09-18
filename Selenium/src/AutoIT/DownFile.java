package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownFile
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","D://Dinshi//QA//Work Space//Selenium//GeckoDriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
			
		driver.get("http://the-internet.herokuapp.com/download");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='download/some-file.txt']")).click();
		
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//DownFile.exe");
	}
}
	