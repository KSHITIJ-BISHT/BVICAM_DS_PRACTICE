class Q7A2{
	public static void main(String[] args) {
		int k=1;
       System.out.println("1");
		for(int i=1;i<5;i++)
			{k=1;
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print(k);
				if(j<i)
					k++;
				if(j>=i)
					k--;
			}
			System.out.println();
	}
}

}