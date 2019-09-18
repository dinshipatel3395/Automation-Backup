package Day6;
/*
 * 1.Create program with following functionality:
a)Create two classes with name 'Student' and 'marks'.
b)Create one method 'Total_Marks' in student
c)Inherit Student class methods into marks class
d)Create 'Percentage' method in 'Marks' Class with return value.

 */
class Student
{
	int ToM;
	void Total_Marks(int Sci,int Maths,int SS)
	{
		ToM=Sci+Maths+SS;
		System.out.println("Total_Marks="+ToM);
	}
}
class Marks extends Student
{
	float Per;
	Float Percentage()
	{
		Per=(float)(ToM*100)/300;
		return Per;
	}
}
public class StudentResult
{
	public static void main(String args[])
	{
		Marks M=new Marks();
		M.Total_Marks(75,85,96);
		float F =M.Percentage();
		System.out.println("Percentage="+F);
	}
}