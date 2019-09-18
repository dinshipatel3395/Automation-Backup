package ExcellRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write1 
{
	public static void main(String[] args) throws IOException
	{
		File ax=new File("D://Dinshi//QA//Work Space//Selenium//Untitled spreadsheet (4).xlsx");
		FileInputStream fp=new FileInputStream(ax);
         
		XSSFWorkbook wb= new XSSFWorkbook(fp);
		XSSFSheet ws=wb.getSheetAt(0);
	

		int rwcount=ws.getLastRowNum()+1;
		int col=ws.getRow(0).getLastCellNum();
		System.out.println(col);
		
		for(int i=0;i<rwcount;i++)
		{
			for (int j=0;j<col;j++)
			{
				String data = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
				if(data.equals("Y"))
				{
					ws.getRow(i).getCell(j+1).setCellValue("PASS");
					System.out.println("WRITE DONE");
				}
				else if(data.equals("N"))
				{
					ws.getRow(i).getCell(j+1).setCellValue("FAIL");
					System.out.println("WRITE DONE");
				}
			}
		}
		FileOutputStream fip=new FileOutputStream(ax);
		wb.write(fip);
		wb.close();
	}
}
