package logical;

public class MultiTable {

	public static void main(String[] args) {
		//int num=2;
		int n=5;
		int mul=0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				mul=i*j;
			    System.out.println(i+" * "+j+" "+mul);
			}    
		}		
		

	}

}
