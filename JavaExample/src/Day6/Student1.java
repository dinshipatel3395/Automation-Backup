package Day6;
/*3.Create program with following functionality:
a)Create class with name 'Student'
b)Create method with name 'total_marks' with 6 arguments.
c)Overload method 'total_marks' with 7 arguments
*/

public class Student1 
{
	double TM;
	void Total_Marks(int Sci,int Maths,int SS,int SK,int Comp,int Hindi)
	{
		TM=(double)Sci+Maths+SS+SK+Comp+Hindi;
		System.out.println("6 arguments =    "+TM);
	}
	void Total_Marks(int Sci,int Maths,int SS,int SK,int Comp,int Hindi,int PT)
	{
		TM=Sci+Maths+SS+SK+Comp+Hindi+PT;
		System.out.println("7 arguments =    "+TM);
	}
	public static void main(String args[])
	{
		Student1 S=new Student1();
		S.Total_Marks(75,85,95,65,55,80);
		S.Total_Marks(75,85,95,65,55,80,70);
	}
}
