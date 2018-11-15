import java.util.Scanner;
class Anagram
{
public static void main(String...args)

  {
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   String str1=sc.next();
   int[] arr=new int[26];
   int flag=0;
   int i=0;
   int index=0;
   while(i<=str.length()-1)
    {
      index=str.charAt(i)-'a';
     arr[index]=arr[index]+1;
     i++;  
    }
    i=0;
    while(i<=str1.length()-1){
    index=str1.charAt(i)-'a';
    arr[index]=arr[index]-1;
    i++;
    }
    for(int j=0;j<26;j++)
       {
        if(arr[j]!=0)
          flag=1;
         
       }
     if(flag==0)
        System.out.println("anagram");
     else
        System.out.println("not anagram");
   
    
  }
}