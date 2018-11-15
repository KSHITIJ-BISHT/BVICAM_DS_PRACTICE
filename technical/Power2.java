
//Power of 2
import java.util.Scanner;
class Power2
{
public static void main(String...args)

{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();int count=0;

// count number of ones in binary reppresentation as all powers of 2 have only 1.

while(n>0)

{
count+= n & 1;
n>>=1;
} 


if(count==1)
  System.out.println("power of 2");
else
   System.out.println("not power of 2");
}

}