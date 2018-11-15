class Matrix

{public static void main(String...args){
  int[][] first={{1,2,3},{4,5,6},{1,2,3}};
   int[][] second={{2,3,4},{4,5,6},{7,8,9}};
   int[][] result=new int[3][3];
   int sum=0;

//Multiplication  

System.out.println("multiplication of two matrices");
   for(int i=0;i<=2;i++)
       {for(int j=0;j<=2;j++)
           {
            for(int k=0;k<3;k++)  
               sum=sum+first[i][k]*second[k][j];
           result[i][j]=sum;
           sum=0;  
           }
         
       }
    
    for(int i=0;i<=2;i++)
       {for(int j=0;j<=2;j++)
            {
             System.out.print(""+result[i][j]);
            }
         System.out.println();
        }
//Addition

     System.out.println("Sum of two matrices");
     for(int i=0;i<=2;i++)
       {for(int j=0;j<=2;j++)
            {sum=0;
             sum=first[i][j]+second[i][j];
             System.out.print(""+sum+ " ");
             
            }
         System.out.println();
        }

//transpose

  System.out.println("transpose of first");
   int temp=0;
   for(int i=0;i<=2;i++)
       {for(int j=i;j<=2;j++)
            {temp=first[i][j];
             first[i][j]=first[j][i];
             first[j][i]=temp;
             
             
            }
        
        }

 for(int i=0;i<=2;i++)
       {for(int j=0;j<=2;j++)
            {
              System.out.print(" "+first[i][j]);
             
            }
         System.out.println();
        
        }

}
}