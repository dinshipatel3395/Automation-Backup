package ExcellRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestToRun
{
	public static void main(String[] args) throws IOException 
	{
		File file=new File(System.getProperty("user.dir")+"\\Untitled spreadsheet (2).xlsx");
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

	}
}
