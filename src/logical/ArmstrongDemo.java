package logical;

public class ArmstrongDemo {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int rem=0;

		
		while(num!=0)
		{
		    rem=num%10;//3,5,1
		    sum=sum+(rem*rem*rem);//27+125+1
		    
		    num=num/10;//15,1,0
		  		    
		}	
		
		if(temp==sum)
		{
			System.out.println("num is armstrong");
		}	
		else
		{
			System.out.println("num is not armstrong");
		}		
		

	}

}
