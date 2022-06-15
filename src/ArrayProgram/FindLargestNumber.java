package ArrayProgram;

public class FindLargestNumber {
   

	public static void main(String[] args) {
		int a[]= {10,200,5,30,50};
		int i,j;
		int temp;
		
		int size=a.length;
		System.out.println("calculate size: "+size);
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println(a[size-1]);

	}
}	
