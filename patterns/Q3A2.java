class Q3A2{

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int t=0;t<5-i;t++)
				System.out.print("10");
			System.out.println();
		}
        int k1=1;
        int t1=0;
		while(t1<2){
	
		for (int i=0;i<4 ;i++ ) {
			System.out.print(" ");
		
		
        }
        System.out.println(" "+k1);
        k1=0;
        t1++;
		
    }
		int k=3 ,j=0;
		for(int i=0;i<5-1;i++)
		{   
			for(j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			for(int t=j;t<5;t++)
				System.out.print("10");
           System.out.println();
           k--;

		}
	}
}