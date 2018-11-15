// finding all the prime numbers smaller than a given number 
import java.util.Scanner;

class Prime

{  

 static void  prime(int num){
    boolean[] prime=new boolean[num];
    for(int i=0;i<prime.length;i++)
    	 {
    	 	 prime[i]=true;
    	 }
    for(int j=2;j*j<=num;j++)                     // marking all the multiples of each number as the numbers left after this are the prime
       {                                          
       	if(prime[j]==true)                             
       	{
       		for(int k=j*2;k<num;k=k+j){
       			 prime[k]=false;
       		}
       	}
         
       }
       for(int t = 2; t < num; t++) 
        { 
            if(prime[t] == true) 
                System.out.print(t + " "); 
        }	 
       	

}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		prime(num);
	}
}