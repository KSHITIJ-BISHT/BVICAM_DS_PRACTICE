class Q9A2
{
	public static void main(String[] args) {
		int n=6;

		for(int i=0;i<(2*n);i++)
		{    int k=1;  
			for(int j=n-1-i;j<=n-1+i;j++)
			{ 
              System.out.print(k+" ");
              k++;
			}
			System.out.println();
		}
	}
}