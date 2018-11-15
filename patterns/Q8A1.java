class Q8A1{

	public static void main(String[] args) {
		int n=9;int c=n-2;
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<2*i+1;j++)
				System.out.print(j+1);
			System.out.println();

		}
		for(int i=n/2+1;i<n;i++)
		{
			for(int j=1;j<=c;j++)
				System.out.print(j);
			c=c-2;
			System.out.println();
		
		}
		System.out.println();
	}
}