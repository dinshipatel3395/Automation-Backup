package Assis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class QUE3 extends FrameWork
{
	public static void main(String args[]) throws IOException
	{
		URL("Chrome","http://automationpractice.com/index.php");
		Click("SignIN");
		
		File F=new File("D://Dinshi//Assisment//SignIN.xls");
		FileInputStream FIS=new FileInputStream(F);
		
		HSSFWorkbook wb=new HSSFWorkbook(FIS);
		HSSFSheet ws=wb.getSheetAt(0);
		
		int RCount=ws.getLastRowNum();
		int CCount=ws.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<RCount;i++)
		{
			for(int j=0;j<CCount;j++)
			{
				String Data=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(Data);
			}
		}
		
		/*sendkey("email","test.1rivet@mailinator.com");
		sendkey("Password","1rivet");
		Click("Submit");
		Click("T-Shirt");*/
		
		
	}
}