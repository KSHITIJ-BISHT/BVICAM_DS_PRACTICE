//find numbers are equal or not

import java.util.Scanner;

class Unique
{
public static void main(String...args)
{
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int res=a^b;                                   // for equal numbers XOR is 0
 System.out.println("" +res);
 if((int)a ^ (int)b)
   System.out.println(" Not equal");

 else
   System.out.println(" equal");   
 
sc.close();
}

}