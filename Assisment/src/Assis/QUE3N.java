package Assis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class QUE3N extends FrameWork
{
	public static void main(String args[]) throws IOException
	{
		URL("Chrome","http://automationpractice.com/index.php");
		Click("SignIN");
		
		File F=new File("D://Dinshi//Assisment//SignIN.xls");
		FileInputStream FIS=new FileInputStream(F);
		
		HSSFWorkbook wb=new HSSFWorkbook(FIS);
		HSSFSheet ws=wb.getSheetAt(0);
	
		String Email=ws.getRow(0).getCell(0).getStringCellValue();
		String Password=ws.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(Email);
		System.out.println(Password);

		sendkey("email",Email);
		sendkey("Password",Password);
		Click("Submit");
		Click("T-Shirt");
		
		
		
	}
}
