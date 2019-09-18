package Day4;

public class MD 
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{10,20,30}};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length;j++)
			{
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
	}	
}
