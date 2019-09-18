package Day6;
/*4.Create program with following functionality:
a)Create abstract class with abstract method 'run'.
b)Inherit abstract class into non- abstract class named 'car'
c)Implement 'run' method in 'car' class
*/


abstract class Run
{
	abstract void running();
}
class Car extends Run
{
	void running()
	{
		System.out.println("Hello");
	}
}
public class CarRun 
{
	public static void main(String args[])
	{
		Car C=new Car();
		C.running();
	}
}