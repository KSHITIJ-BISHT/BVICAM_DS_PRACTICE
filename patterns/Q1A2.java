/*


complexity=n*n
*/

class Q1A2
{

	public static void main(String[] args) {
		int space=2;int star=2,i;
		for( i=0;i<=5/2;i++)
		{
			
			for(int j=0;j<space;j++)
			{
              System.out.print(" ");
              
			}
			space--;
			for(int k=0;k<i+1;k++)
				System.out.print("* ");
			System.out.println();
        }

			space=1;
			for(int t=i+1;t<=5;t++){
		    	for(int j=0;j<space;j++)
			    {
              System.out.print(" ");
             
			    }
			space++;
			for(int k=0;k<=5-t;k++)
				System.out.print("* ");
           	System.out.println();
			}
		}
		
		
		}
	