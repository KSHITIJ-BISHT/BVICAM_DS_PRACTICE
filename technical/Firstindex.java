
// find the first index of the element in an array.

import java.util.Scanner;
public class Firstindex {
    public static void main(String args[])
    {Scanner obj=new Scanner(System.in);
     int arr[],n,num,i=0;
     System.out.println("Enter the size of array: ");
     n=obj.nextInt();//input size of array
     arr=new int[n];
     System.out.println("Enter the elements: ");
     while(i<n)
     {
         arr[i]=obj.nextInt();//input elements of the array
         ++i;
     }
     System.out.println("Enter the element of which first index is to be find: ");
     num=obj.nextInt();//enter element of which first index is to be find
     firstIndex(arr,n,num);}
    
    public static void firstIndex(int arr[],int n,int num)
     {int beg,mid,last,flag;
      beg=0;
      flag=0;
      last=n-1;
      mid=beg+last/2;
      
      while(beg<=last)
      {
          if(num<arr[mid])
          {
              last=mid-1;
          }
          else if(num>arr[mid])
          { 
              beg=mid+1;
              
          }
          else
          {
            System.out.println("element at location: "+mid);//print first index of the element
            break;
          }
          mid=(beg+last)/2;
      }
            
     }
    
    
}