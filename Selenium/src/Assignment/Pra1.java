package Assignment;

import java.io.IOException;

import org.openqa.selenium.By;

public class Pra1 extends Kapl
{
	public static void main(String args[]) throws InterruptedException, IOException
	{	
		OpenURL("CH","https://www.google.com");
		ObjectRepo();
		Thread.sleep(1000);
		//SendKey("Search","Selenium");
		SendKey("search", "Selenium");
	}
}
