/*
 In this program the value of i=10. It will first go inside the loop without checking the condition as it is exit 
 control loop. It will print the value of i till it becomes 15. Then it will exit the loop as its value become 15. 
 */

package Day3;


public class DoWhileLoop 
{
	public static void main(String[] args)
	{
		int i=10;
		do
		{
			System.out.println("Ans:-  "+i);
			i++;
		}while(i<=15);
	}
}
