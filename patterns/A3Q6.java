/*
n=8
12344321
123**321
12****21
1******1

complexity=n*n
*/

class A3Q6{

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<=n/2-1;i++)
		{
            for(int j=0;j<n;j++)
            {
               if(j<n/2)
               {
               	if(j<n/2-i)
               	{
               		System.out.print(j+1);
               	}
               	else
               	{
               		System.out.print("*");
               	}

               }
               
               	if (j>=n/2)
               	{
                   if(j>=n/2+i)
                   {
                   	System.out.print(n-j);
                   }
                   else
               	    {
               		System.out.print("*");
               	    }               		
               	}
               	



            }
            System.out.println();

		}
	}
}