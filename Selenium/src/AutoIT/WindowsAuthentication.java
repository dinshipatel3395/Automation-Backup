package AutoIT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WindowsAuthentication
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","D://Dinshi//QA//Work Space//Selenium//GeckoDriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//WinAuth123.exe");
		Thread.sleep(3000);
		driver.quit();
		
		System.setProperty("webdriver.ie.driver","D://Dinshi//QA//Work Space//Selenium//IEDriver//IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		driver2.manage().window().maximize();
		
		driver2.get("http://the-internet.herokuapp.com/basic_auth");
		Runtime.getRuntime().exec("D://Dinshi//QA//AutoIT//WinAuthIE.exe");
		driver.quit();
		
	}
}
