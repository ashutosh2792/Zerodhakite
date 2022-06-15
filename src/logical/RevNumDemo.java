package logical;

public class RevNumDemo {

	public static void main(String[] args) {
		int num=145;
		int rem=0;
		int rev=0;
		while(num!=0)
		{
			rem=num%10;//5,4,1
			
	        rev=rev*10+rem;//541
			num=num/10;
			
		}
		System.out.println("reverse number is "+rev);

	}

}
