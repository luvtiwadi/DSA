package Backtracking;

public class NQueensBasic {
    public static void printQueens(char chessboard[][]){
        System.out.println("---------Chess Board----------");
        for(int i=0;i< chessboard.length;i++){
            for(int j=0;j< chessboard.length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }
    }


    // without checking wether the queen is safe or not

    public static void nQueens(char chessboard[][],int row){
        if(row==chessboard.length){
            printQueens(chessboard);
            return;
        }
        for(int j=0;j< chessboard.length;j++){
            chessboard[row][j]='Q';
            nQueens(chessboard,row+1);
            chessboard[row][j]='.';

        }
    }

    // here we are printing the patterns in which queens are safe
    public static void nQueensSafe(char chessboard[][],int row){
        if(row==chessboard.length){
            printQueens(chessboard);
            return;
        }
        for(int j=0;j< chessboard.length;j++){
            if(isSafe(chessboard,row,j)) {
                chessboard[row][j] = 'Q';
                nQueensSafe(chessboard, row + 1);
                chessboard[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char chessboard[][],int row ,int col){
        // checking vertically up
        for (int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        // checking Diagonally left

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        // checking Diagonally right
        for(int i=row-1,j=col+1;i>=0&&j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        int n=4;
        char chessboard[][]=new char[n][n];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j< chessboard.length;j++){
                chessboard[i][j]='.';
            }
        }

//        nQueens(chessboard,0);
          nQueensSafe(chessboard,0);
    }


}
