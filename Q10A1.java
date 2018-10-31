class Q10A1{
	public static void main(String[] args) {
		int c=1;int k;
		for(int i=0;i<5;i++)
		{   k=4;c=i+1;
			for(int j=0;j<i+1;j++)
			{System.out.print(c+" ");
			    c=c+k;
			    k--;
			}
			System.out.println();
		}
	}
}