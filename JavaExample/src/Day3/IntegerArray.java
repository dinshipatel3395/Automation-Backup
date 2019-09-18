package Day3;
//2.Write a program to calculate the sum of an integer array{3,4,5,-5,0,12}.(using for each loop)
/*
 In this program it will do some of an 'numberArray' using for each loop. The loop will continue
 till the length of an array. In loop it will do sum till the length of an array.
 */

public class IntegerArray
{
	int[] numberArray = {3,4,5,-5,0,12}; 
	int sum=0;
    void sum() 
    { 
    	for(int x:numberArray)
    	{
    		sum=sum+x;	
    	}
    	System.out.println("sum ="+sum);
    }
    public static void main(String args[])
	{
    	IntegerArray IA=new IntegerArray();
    	IA.sum();
	}  
}
