/*
1     1
 2   2
  3 3
   4
  3 3
 2   2
1     1

complexity=n*n
*/

class A3Q7
{
public static void main(String[] args) {
		int n=7;
		for (int i=0;i<n/2+1 ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				if(j==i || j==n-1-i)
				{
					System.out.print((i+1));
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();


			
		}
		for (int i=n/2+1;i<n ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				if(j==i || j==n-1-i)
				{
					System.out.print((n-i));
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();

			
			
		}
	}	
}