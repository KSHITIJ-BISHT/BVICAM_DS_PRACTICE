//find maximum sub array sum
class MaxSubArray
{

  static int maxArr(int arr[])
  {
  	int gmax=0,lmax=0;
   for(int j=0;j<arr.length;j++)
   {  lmax=lmax+arr[j];
     if(lmax>gmax)
     	gmax=lmax;
     if(lmax<0)
     	lmax=0;

   }

   return gmax;

  }

  public static void main(String[] args) {
  	int[] arr=new int[]{2,3,-4,6,-1,-2};
  	int gmax1,gmax2,sum=0;
    gmax1=maxArr(arr);
   
    for(int i=0;i<arr.length;i++)
       {  sum=sum+arr[i]; 
       	  arr[i]=(-arr[i]);
       }
    gmax2=maxArr(arr);
   
    if(gmax1>(sum+gmax2))                            
    	 System.out.println(""+gmax1);
    else
      System.out.println(""+(sum+gmax2));	

   }
}