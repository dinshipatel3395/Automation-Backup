/*1.Create program with following functionality:
a) Launch web browser.
b) Hit URL http://demo.guru99.com/test/delete_customer.php
c) Maximize browser window
d) Enter your name in ‘customer id’ text box
e) Click on submit
f) Put implicit wait
g) Capture screen shot with dynamic name
h) Close browser.*/

package Wait_and_Capture;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D://Dinshi//QA//Work Space//Selenium//Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yy_hh_mm_ss");
		Date date = new Date();
		String dateFormatted= dateFormat.format(date);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		File screenshotFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(                               ));
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Dinshi123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("Alert text is " + alertText);
		confirmationAlert.accept();
		Thread.sleep(15000);
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertText1 = simpleAlert.getText();
		System.out.println("Alert text is " + alertText1);
		simpleAlert.accept();
		
		
		FileUtils.copyFile(screenshotFile2, new File("D:\\Dinshi\\4565_"+dateFormatted+".png"));
		Thread.sleep(5000);
		
		/*File screenshotFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullimg=ImageIO.read(screenshotFile2);
		org.openqa.selenium.Point  Point=Name.getLocation();
		
		Window name;
		int nameWidth=name.getSize().getWidth();
		int nameHeight=name.getSize().getHeight();*/
		
		
		
		
		
		
	
	}
	
}
