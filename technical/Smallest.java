// smallest of three numbers.
class Smallest
{
	static int small(int a,int b,int c)
	{
     
    int count=0;
    while(a!=0 && b!=0 && c!=0)                   //reducing each number until one of them is 0
    {
    	a=a-1;
    	b=b-1;
    	c=c-1;
    	count=count+1;
    }
    return count;
}
   public static void main(String[] args) {
   	int a=14,b=13,c=24;
   	int res=small(a,b,c);
   	System.out.println(""+res);
   }
}