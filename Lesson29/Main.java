package Lesson29;

public class Main{

    static boolean isSafe(int[][] board, int row, int col, int n){
        for (int i = 0; i<row; i++){
            if(board[i][col] == 1){
                return false;
            }
        }
        for(int i = row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row-1, j = col+1; i>=0 && j>=0; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }

        return true;
    }

    static boolean solveNQueen(int[][] board, int row, int n){
        if(row)
       
 //try placing the queen in each column of this row
        for(int col=0 ; col<n ; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                if(solveNQueen(board, row+1, n)){
                    return true;
                }
                board[row][col] = 0; //backtrack
            }    
            

        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];

        if(solveNQueen(board, 0 , n)){
            System.out.println("solveable");
        }
    }
}
    

