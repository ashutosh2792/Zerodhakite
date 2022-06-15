package logical;

public class FibbonacciDemo {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int sum=0;
		int i=1;
		int num=5;
		
		//then we need loop for apply the condition
		
		while(i<=num)//till i  value is less than equal to num while loop should be executed
		{
			
			sum=num1+num2;
			System.out.println(num1+" "+num2+" "+sum);
			num1=num2; //then we use swapping here
			num2=sum;
			i++;
		}		
			
		
		
		
		

	}

}
