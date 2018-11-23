
class nQueen2{
    
    static boolean check(int[][] board,int  i,int j, int n)
    {
        int t = 0;
        while(t < i)
            if(board[t++][j] == 1) return false;
       
        //upper top left diagnol
        for(int x = i-1, y = j-1; x>=0 && y>=0; x--, y--)
        {
            if(board[x][y] ==1) return false;
        }
       
        //upper top right diagnol
        for(int x = i-1, y = j+1; x>=0&&y<n; x--, y++)
        {
            if(board[x][y] == 1) return false;
        }
        return true;
    }
    
    static int nQueen1(int[][] board, int row, int n)
    {
        boolean flag = false;
        if(row == n) {
           for(int i = 0; i<n; i++)
            {
                for(int j = 0; j<n; j++)
                    System.out.print(board[i][j]+" ");
                System.out.println(); 
            }
            System.out.println("-----------");
            return 1;
            }
        
        //part to input at a location
          int count = 0;
           for(int c = 0; c<n; c++)
            {
            board[row][c] = 1;
            if(check(board, row, c, n))
            {
                count += nQueen1(board, row+1, n);
            }  board[row][c]=0;
        return count;
        }

    
      public static void main(String[] args)
        {
        int board[][]  = new int[5][5];
        int res = nQueen1(board, 0, 5);    
        System.out.println(res);
    }
    
}