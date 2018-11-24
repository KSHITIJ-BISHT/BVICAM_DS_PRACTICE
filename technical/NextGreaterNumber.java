// 	PROGRAM TO FIND THE NEXT GREATER NUMBER THAN THE GIVEN NUMBER USING THE SAME DIGITS
/*
INPUT=54831
OUTPUT=58134 
*/
import java.util.Arrays;
class NextGreaterNumber{

    static int num=0;
    static int length;
     static int[] arr;
    NextGreaterNumber(int value)
    {
    num=value;
    length = String.valueOf(num).length();
    arr=new int[length];
    nextGreatNum();

    } 
    static void print() {
    	for (int i=0;i<=arr.length-1 ;i++ ) {
         System.out.print(""+arr[i]);   		
   	    }
    }
    
    static void nextGreatNum() {  
         
         int temp=num;
    	 int i=length-1;              // number length
        // loop to convert number to integer array
    	while(temp!=0)
        {
    		arr[i]=temp%10;
    		temp=temp/10;
    		i--;
    	}
       //loop for finding next greater number

        loop:for(int j=arr.length-2;j>=0;j--)
    	{    int ele=arr[j+1];
    	    if(ele>arr[j])
    		 {
    		 	//swaping
    		 	int temp1 = arr[j+1];
                arr[j+1] =arr[j];
                arr[j]= temp1;
                //sorting the sub array
    		 	Arrays.sort(arr,j+1,arr.length);
    		 	
    		 	break loop;
    	    }
        }
    }	

  public static void main(String[] args) {
   NextGreaterNumber obj=new NextGreaterNumber(54831);
   	print();
   }

}