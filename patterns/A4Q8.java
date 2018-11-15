/*
333222111
332211
321
complexity =n*n
*/
class A4Q8
{
	public static void main(String[] args) {
		int n=3;
		int mul=0;
		for(int k=0;k<n;k++)
		{
			mul=mul*10+1;
		}
		for (int i=0;i<n ;i++ ) {
			for(int j=n;j>0;j--)
			{
				System.out.print(j*mul);

			}
			mul=mul/10;
		    System.out.println();	
		}

	}
}
 
