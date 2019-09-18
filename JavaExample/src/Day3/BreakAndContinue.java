package Day3;
/*
 A program for Break and continue.
 Method 1: BreakMethod() - The iteration of loop will be working till the value of 'i' will become 5. 
 							And when 'i=5' the loop will stop working and control of program will came out of the loop. 
 
 Method 2: ContinueMethod()-The iteration of loop will be working till the value of 'i' will become 5. 
 							And when 'i=5' the loop will skip the iteration only once and it will continue the iteration 
 							till the 'i=10'. So it will skip only iteration of 'i=5'. 
 						
  
 */
 

public class BreakAndContinue
{
	int i;
	//Method 1:
	void breakMethod()
	{
		for(i=0;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println("Ans="+i);	
		}
		System.out.println("\n");
	}
	
	//Method 2:
	void ContinueMethod()
	{
		for(i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("Ans="+i);
		}
	}
	public static void main(String[] args) 
	{
		BreakAndContinue BAC=new BreakAndContinue();
		BAC.breakMethod();
		BAC.ContinueMethod();
	}
	
}
