/*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
   1 5 10 10 5 1
  1 6 15 20 15 6 1
 1 7 21 35 35 21 7 1

 complexity=n*n

*/

class A3Q3{
    static int fact(int n)
    {   int p=1;
    	if(n==0)
    		return 1;
    	for(int i=1;i<=n;i++)
    		p=p*i;
    	return p;
    }
    
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++)
		{   int t=0;

			for(int k=0;k<n-i;k++)
				System.out.print(" ");
			for(int j=0;j<i+1;j++)
			{ 
              int res=fact(i)/(fact(t)*fact(i-t));
              System.out.print(+res+" ");
              if(t<i+1)
              	t++;
			}
			System.out.println();

		}
		System.out.println();
	}
}