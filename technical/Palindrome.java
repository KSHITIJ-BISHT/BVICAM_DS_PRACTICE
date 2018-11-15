//Program to check whether a string is palindrome or not.
import java.util.Scanner;

class Palindrome

{
 public static void main(String...args)
    {int flag=0;
     Scanner sc=new Scanner(System.in);
      String str=sc.next();
      for(int i=0;i<=(str.length()-1)/2;i++)                      
          { 
           if(str.charAt(i)!=str.charAt(str.length()-1-i))             //checking if first and last element is same
              { flag=1;
               break;
              }   
          }
       if(flag==0)
          System.out.println("palindrome");
       else
           System.out.println("not palindrome");
    }

}