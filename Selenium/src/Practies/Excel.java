package Practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel 
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File(System.getProperty("user.dir")+"//Untitled spreadsheet (3).xls");
		FileInputStream FIS=new FileInputStream(file);
		
		HSSFWorkbook wb=new HSSFWorkbook(FIS);
		HSSFSheet ws=wb.getSheetAt(0);
		
		int RCount=ws.getLastRowNum()+1;
		int CCount=ws.getRow(0).getLastCellNum();
		
		for(int i=0;i<RCount;i++)
		{
			for(int j=0;j<CCount;j++)
			{
				String data=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				if(data.equals("Y"))
				{
					ws.getRow(i).getCell(j+1).setCellValue("PASS");
				}
				if(data.equals("N"))
				{
					ws.getRow(i).getCell(j+1).setCellValue("FAIL");
				}
				if(data.equals(" ") || data.equals("Skip"))
				{
					ws.getRow(i).getCell(j+1).setCellValue("SKIP");
				}
			}
		}
		FileOutputStream file1=new FileOutputStream(file);
		wb.write(file1);
		wb.close();
	}
}
	
	
	
	
	
	
	

/*public static void main(String[] args) throws IOException 
{
	File file=new File(System.getProperty("user.dir")+"////Untitled spreadsheet (2).xlsx");
	FileInputStream file1=new FileInputStream(file);

	XSSFWorkbook wb=new XSSFWorkbook(file1);
	XSSFSheet ws=wb.getSheetAt(0);

	int Rowcount=ws.getLastRowNum();
	int Colcount=ws.getRow(0).getLastCellNum();

	System.out.println("Total Row "+Rowcount);
	System.out.println("Total Column "+Colcount);

	for(int i=0;i<Rowcount;i++)
	{
		for(int j=0;j<Colcount;j++)
		{
			String data0=ws.getRow(i).getCell(j).getStringCellValue();
			//System.out.println(data0);
			if(data0.equals("Y"))
			{
				System.out.println(ws.getRow(i).getCell(j-2).getStringCellValue());
				System.out.println(ws.getRow(i).getCell(j-1).getStringCellValue());
			}
		}
	}

}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




