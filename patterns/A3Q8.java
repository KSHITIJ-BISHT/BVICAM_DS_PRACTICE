/*
n=5

 0
 0 2
 0 3 6
 0 4 8 12
 0 5 10 15 

 complexity=n*n
*/

class A3Q8{

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
			{for (int j=0;j<=i ;j++ ) {
				System.out.print(" "+(i+1)*j);
		
				
			}
			System.out.println();
	}
}
}