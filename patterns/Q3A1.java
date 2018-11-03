class Q3A1{

	public static void main(String[] args) {
		int n=9;
		for (int i=0;i<=n/2 ;i++ ) {
			for (int j=0;j<=i ;j++ ) {
                 if((i%2 !=0 && j%2!=0)) 
                 {
                 	System.out.print("*");

                 }
                 else
                 if(i%2 ==0 && j%2==0)
                 {
                   System.out.print("*");


                 }
                else
                	System.out.print(" ");

				
			}
			System.out.println();
		}
		for (int i=n/2+1;i<n ;i++ ) {
			for (int j=0;j<=n-1-i ;j++ ) {
                 if(i%2 !=0 && j%2!=0)
                 {
                 	System.out.print("*");

                 }
                 else
                 if(i%2 ==0 && j%2==0)
                 {
                   System.out.print("*");


                 }
                else
                	System.out.print(" ");

				
			}
			System.out.println();
		}
	}
}