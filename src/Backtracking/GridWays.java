package Backtracking;

public class GridWays {
    public static void main(String[]args){
        int n=3;
        int m=3;
        char grid[][]=new char[n][m];
//        for(int i=0;i<grid.length;i++){
//            for(int j=0;j<grid[i].length;j++){
//                grid[i][j]='.';
//            }
//        }
        System.out.println(gridWays(grid,0,0));

    }
    public static int gridWays(char grid[][],int row,int col){
        // base condition
        if(row==(grid.length-1)||col==(grid[row].length-1)){
            return 1;
        }
//        else if(row==grid.length||col==grid[row].length) {
//            return 0;
//        }
           int w1= gridWays(grid, row, col + 1);
            int w2=gridWays(grid, row + 1, col);
            return w1+w2;

    }
    public static void printboard(char grid[][]){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
