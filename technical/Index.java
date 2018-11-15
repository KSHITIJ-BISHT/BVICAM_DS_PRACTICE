// index of element
import java.util.Scanner;
class Index{

    static int binary(int first,int last,int[] a,int num)
    {
    	int mid=(last+first)/2;

		while(first<=last)
		{
          if(a[mid]<num)
          {
            first=mid+1;
            return binary(first,last,a,num);
          }
          else if(a[mid]>num)
          {
           last=mid-1;
           return binary(first,last,a,num);
          }
          // checking if the element found is the first in its group or not
          else if(a[mid]==num) 
          {
           if(mid >0 && a[mid-1]==num )
           {
           	last=mid-1;
           	return binary(first,last,a,num);

           }
           else
           	return mid;
          }

		}
		return -1;
    }
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5, 6, 6, 7,8,8};
		Scanner sc=new Scanner(System.in);
		int first=0;
		int last=a.length-1;
		int num=sc.nextInt();
		int res=binary(first,last,a,num);
		System.out.println("index is: "+res);
	}
}