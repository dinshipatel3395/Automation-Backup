package Day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//1.Give one example related to Compile time Exception.


public class CompileTimeException 
{
	public static void main(String args[]) throws IOException
	{
	FileReader file = new FileReader("D://Dinshi//QA//Assignment//ODT//Assignment1_SDLC_Dinshi Patel");
	BufferedReader fileInput = new BufferedReader(file);
	System.out.println(fileInput.readLine());
	}
}
 