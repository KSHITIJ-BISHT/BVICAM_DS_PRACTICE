/*

complexity=n*n
*/


class Q4A1{

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
			for (int j=7;j>=7-i;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}