package Day3;
//1.Write a program to find the sum of natural numbers from 1 to 100.(using while loop)
/*
 In this program while loop is used. As it is entry control loop it will first check the condition
 that number i < 100 and it will do sum.
 */

public class SumOfNaturalNumber 
{
	int num =100;
	int i =1;
	int a=0;
	void sum()
	{
		while(i <= num)
        {
			a+=i;
            i++;
        }
        System.out.println("Ans= " + a);
        
	}
	public static void main(String[] args)
	{
		SumOfNaturalNumber SONN=new SumOfNaturalNumber();
		SONN.sum();
    }
}

