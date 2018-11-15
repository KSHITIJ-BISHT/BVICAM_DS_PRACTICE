/*
*****
** **
* * *
** **
*****
complexity=n*n
*/


class A3Q4
{
	public static void main(String[] args) {
	     int n=5;
	     int mid=n/2;
		for (int i=0;i<=n/2 ;i++ ) {
	     for(int j=0;j<n;j++)
   		{
			if(i!=0)
			{
               if (j==mid-(i-1) || j==mid+(i-1))
                   System.out.print(" ");
               else
               	System.out.print("*");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
}
       for (int i=n/2+1;i<n ;i++ ) {
	    for(int j=0;j<n;j++)
   		{
			if( i!=n-1)
			{
               if (j==mid-(n-2-i) || j==mid+(n-2-i))
                   System.out.print(" ");
               else
               	System.out.print("*");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
  }
}
