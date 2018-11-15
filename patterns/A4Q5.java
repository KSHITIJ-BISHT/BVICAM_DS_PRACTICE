/*
*
**
* *
*  *
*****

complexity=n*n
*/

class A4Q5{
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{      

				for (int j=0;j<n;j++ ) {
					 if(i==n-1)
					 {
					 	System.out.print("*");
					 }
					 
					if(i<n-1)
					{
						if(j==0 || i==j)
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
					}
					
				}
				System.out.println();
		}
	}
}