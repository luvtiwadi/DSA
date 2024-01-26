package array2d;

public class SpiralMatrix {
    private int ar[][] = new int[][]{{1, 2, 3, 4,5},
                                    { 6, 7, 8,9, 10},
                                    { 11, 12,13, 14,15},
                                    {16,17,18,19,20}  };

    public void spiral(){
        int startRow=0,startCol=0;
        int endRow=ar.length-1;
        int endCol=ar[0].length-1;

        while(startRow<=endRow && startCol<=endCol){

            //first row
            for(int i=startRow;i<=endCol;i++){
                System.out.print(ar[startRow][i]+" ");
            }
            //last column
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(ar[i][endCol]+" ");
            }
            // Bottom Row
            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(ar[endRow][i]+" ");
            }
            // first column
            for(int i=endRow-1;i> startRow;i--){
                System.out.print(ar[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }

    }
}