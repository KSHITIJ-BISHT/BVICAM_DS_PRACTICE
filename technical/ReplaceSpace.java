import java.util.Scanner;
import java.io.*;

class ReplaceSpace
{

public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   StringBuffer str=new StringBuffer("kshitij bisht");
   
   for(int i=0;i<=str.length()-1;i++)
     {
     if(str.charAt(i)==' ')
        { System.out.println(str);
         str.insert(i,"@123");
        }

     }
    System.out.println(" "+str);

 }

}