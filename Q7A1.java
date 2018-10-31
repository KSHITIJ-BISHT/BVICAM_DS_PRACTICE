class Q7A1{

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<5;i++)
		{
          
        if(i==0 || i==n-1)
        {
            for(int j=0;j<5;j++)
             {

          	System.out.print("1");
        }
        }
        else
        for(int j=0;j<5;j++)
        {
          	if(j==0 || j==n-1)
          		System.out.print("1");
          	else
          		System.out.print(" ");
        }
          	System.out.println();}
          

		}
	}
