package ArrayProgram;



public class FindDuplicateNum {

	public static void main(String[] args) {
		int a[]= {10,40,30,10,20};
		int i,j;
		
		int size=a.length;
		System.out.println("calculate size: "+size);
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}
}
