/*

complexity=n*n
*/


class Q2A1
{
   public static void main(String[] args) {
   	
    for (int i=0;i<3*8;i++) {
      System.out.print("*");    	
    }
   	for (int i=0;i<=9/2 ;i++ ) {
   		for (int j=0;j<9 ;j++ ) {
           if(j==i || j==9-i-1)
           	System.out.print("*");
           else
           	System.out.print(" ");
   			
   		}
   		System.out.println();
   		
   	}
   }

}