import java.util.Scanner; 
import java.util.HashMap; 
import java.util.Map; 

// check first non repaeating character from string

class Repeat
{
public static void main(String...args)
{

Scanner sc=new Scanner(System.in);
String str=sc.next();

HashMap<Character, Integer> map = new HashMap<>();

int i=0;
int count=1;

// inputing in hashmap...

while(i<str.length())
{
if (map.containsKey(str.charAt(i)))
  {
   int value=map.get(str.charAt(i));
    value=value+1;
    map.put(str.charAt(i),value);
    
  }
else
  map.put(str.charAt(i),count);

i++;  
}

// for finding value

loop:for (char name: map.keySet()){
           
            int value1 = map.get(name);
            if(value1==1)  
               {  System.out.println(name + " " + value1);  
                  break loop;
               }
} 

}
}