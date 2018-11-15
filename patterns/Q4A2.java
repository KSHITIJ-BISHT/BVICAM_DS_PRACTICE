/*

complexity=n*n
*/

class Q4A2{

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int t=0;t<5-i;t++)
				System.out.print("*");
			System.out.println();
		}
		int k=3 ,j=0;
		for(int i=0;i<5-1;i++)
		{   
			for(j=0;j<k;j++)
			{
				System.out.print(" ");
			}
			for(int t=j;t<5;t++)
				System.out.print("*");
           System.out.println();
           k--;

		}
	}
}