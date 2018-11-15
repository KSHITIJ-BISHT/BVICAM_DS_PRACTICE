// wap to print the count of the characters.

/*
input: aaabbcccbcaaddddddddz

output: a3b2c3bca2d8z


*/


class CountChar
{

	public static void main(String[] args) {
		String str="aaabbcccbcaaddddddddz";
        int i=0;
        int j=0;
        int count=0;
		while(i<str.length())
		{   
			char ch=str.charAt(i);
			
	   loop:while(j<str.length())
			{   char chCom=str.charAt(j);
				if(ch==chCom)
				   count++;
				else
					break loop;
				j++;
			}
			if(count==1)
				 System.out.print(""+ch);
			else	
			System.out.print(""+ch+count);
			count=0;
            i=j;
		}
	}
}