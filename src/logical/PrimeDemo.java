package logical;

public class PrimeDemo {

	public static void main(String[] args) {
		int num=19;
		int i;
		int count=0;
		
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" "+i);
				count++;
			}	
		}	
		if(count==2)
		{
			System.out.println("num is prime");
			
		}
		else
		{
			System.out.println("num is not prime");
		}	
		
		

	}

}
