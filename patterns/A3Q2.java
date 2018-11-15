/*
n=7
   1
  2 2
 3   3
4     4
 3   3
  2 2
   1
*/

class A3Q2{

	public static void main(String[] args) {
		int n=7;
		for (int i=0;i<=n/2 ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				if(j==n/2-i || j==n/2+i)
				System.out.print(i+1);
			    else
			    	System.out.print(" ");
			}
			System.out.println();
			
		}
		for (int i=n/2+1;i<n ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				if(j==i-n/2 || j==n/2+(n-1-i))
				System.out.print(n-i);
			    else
			    	System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}