package array2d;

public class DiagonalMatrix {
    static int ar[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//    public static void diagonalSum(){
//        int sum=0;
//        for(int i=0;i<ar.length;i++){
//            for(int j=0;j<ar[0].length;j++){
//                if(i==j)
//                    sum+=ar[i][j];
//                else if(i+j==ar.length-1)
//                    sum+=ar[i][j];
//            }
//        }
//        System.out.println(sum);
//    }
    public static void diagonalSum(){
        int sum=0;

        for(int i=0;i<ar.length;i++){
            sum+=ar[i][i];

            int j=ar.length-1-i;
            if(i!=j)
               sum+=ar[i][j]; //i+j=length-1         j=length-1-i
        }
        System.out.println(sum);
    }
}
