
import java.util.Scanner;
class NullRowCol
{
static void nullMatrix(int[][] arr ,int i,int j,int row,int col)
{
for(int k=0;k<col;k++)
    arr[i][k]=0;
for (int l=0;l<row ;l++ ) 
     arr[l][j]=0;

   print(arr,2,3);    


}
static void print(int[][] arr,int row,int col)
{

	for (int i=0;i<row ;i++ ) {
		for (int j=0;j<col;j++ ) {
			System.out.print(arr[i][j]+" ");
			
		}
		System.out.println();
		
	}

}
public static void main(String[] args) {
   int[][] arr={{1,2,3},{2,2,3}};
   print(arr,2,3);
   Scanner sc=new Scanner(System.in);
   System.out.println("enter row no and col no of the element");
   int i=sc.nextInt();
   int j=sc.nextInt();
   nullMatrix(arr,i,j,2,3);

}

}