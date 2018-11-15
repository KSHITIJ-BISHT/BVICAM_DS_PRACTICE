/*
n=9
1
 2
  3
 4
5
 6
  7
 8
9

complexity=n*n
*/


class A3Q5{

	public static void main(String[] args) {
		int c=1;    // counter for the value to be printed
		int n=9;    // number of rows
		
		int row=3;  // divide the nuber of rows in the sets of "rows" number  
		int control=0;  // controller for the type of pattern needed 

			for(int j=0;j<n/3-1;j++)
			{ 

              if(control==0)
              {
              	
               for(int i=0;i<row;i++)
               {
               	for(int t=0;t<row;t++)
               	{
               		if(i==t)
               		{   
               			if(j>0)
               			  System.out.print(" ");
               			
               			System.out.print(c);
               			c++;
               		}
               		else
               			System.out.print(" ");
               	}
               	System.out.println();
               }
               control++;
               
              }
            
             row=2;
            
            if(control==1)	
              {  
              	control--;
              
              	for(int i=0;i<row;i++)
               {
               	for(int t=0;t<row;t++)
               	{
               		if(i+t==row-1)
               		{
               			System.out.print(c);
               			c++;
               		}
               		else
               			System.out.print(" ");
               	}
               	System.out.println();
            }
             
        }

              
    }
	}
}
