//program to check a no is fibonnaci or not

import java.util.Scanner;
class Fibonnaci

{

static Boolean isPerfectSquare(int number)
{
  int sq=(int)Math.sqrt(number);
  return sq*sq == number;

} 
public static void main(String...args)

 {
  Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
  int num=sc.nextInt();
 
 if(isPerfectSquare(5*num*num +4) || isPerfectSquare(5*num*num -4))                        //property of fibonnaci series
         System.out.println("Fibonnaci number");
 else
         System.out.println("not a Fibonnaci number");

 }

}