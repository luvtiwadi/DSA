package Backtracking;

public class BTOnArrays {
    public static void onArray(int []ar,int n,int i){
        if(i==n) {
            for(int j=0;j<ar.length;j++){
                System.out.print(ar[j]+" ");

            }
            System.out.println();

            return;
        }
        ar[i]=++i;
        onArray(ar,n,i);
//        ar[i]-=2;
        i=i-1;
        ar[i]=ar[i]-2;



    }
}
