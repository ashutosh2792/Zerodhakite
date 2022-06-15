package star;

public class Diamond {
	public static void top() 
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}		
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}		
			
			System.out.println(" ");
		}
		
		for(i=1;i<=4;i++)
		{
			for(int s=1;s<=i;s++)
			{
				System.out.print(" ");
			}		
			
			for(j=4;j>=i;j--)
			{
				System.out.print("*");
			}		
			
			System.out.println(" ");
		}

	}
	public static void bottom() 
	{
		
	}

	public static void main(String[] args) {
		
           Diamond.top();
	}

}
