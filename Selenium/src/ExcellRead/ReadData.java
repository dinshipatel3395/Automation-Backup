package ExcellRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("D://Dinshi//QA//Untitled spreadsheet (1).xlsx");
		FileInputStream  FIS = new FileInputStream(file);
		
		XSSFWorkbook  HSF =  new XSSFWorkbook(FIS);
		//HSSFSheet XS = Sheet1.getSheetAt(0);
		XSSFSheet sheet1 = HSF.getSheet("Sheet1");
		
		int RCount=sheet1.getLastRowNum();
		int CCount=sheet1.getRow(0).getLastCellNum();
		
		System.out.println("Total Raw:"+RCount);
		System.out.println("Total Raw:"+CCount);
		
		for(int i=0;i<RCount;i++)
		{
			for(int j=0;j<CCount;j++)
			{
				String data0=sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Test Data="+data0);
			}
			System.out.println();
		}
	}
}
