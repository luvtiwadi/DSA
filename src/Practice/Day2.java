package Practice;

import sortings.BubbleSort;

public class Day2 {

     public static void main(String[]args){
            int arr[]=new int[]{4,2,0,6,3,2,5};
//                int arr[]=new int[]{3,2,1,4};
//            bubbleSort(arr);
//                selectionSort(arr);
         insertionSort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        // Insertion sort
    public static void insertionSort(int []ar){
        for(int i=1;i<ar.length;i++){
            int curr=ar[i];
            int j=i-1;
            while(j>=0&&ar[j]>curr){
                ar[j+1]=ar[j];
                j-=1;
            }
            ar[j+1]=curr;
        }
    }

        // Basic Sorting Algorithm
    // SelectionSort
    public static void selectionSort(int []ar){
         for(int i=0;i<ar.length-1;i++){
             int minpos=i;
             for(int j=i;j<ar.length;j++){
                 if(ar[minpos]>ar[j])
                     minpos=j;
             }
             int temp=ar[i];
             ar[i]=ar[minpos];
             ar[minpos]=temp;

         }




//         int min=Integer.MAX_VALUE;
//         int idx;
//         for(int i=0;i<ar.length-1;i++){
//             idx=i;
//             for(int j=i;j<ar.length;j++){
//                 if(ar[j]<min){
//                     min=ar[j];
//                     idx=j;
//                 }
//             }
//             int temp=ar[i];
//             ar[i]=ar[idx];
//             ar[idx]=temp;
//             min=Integer.MAX_VALUE;
//
//
//         }


    }
//    BubbleSort
    public static void bubbleSort(int []ar){
         for(int i=0;i<ar.length-1;i++){
             for(int j=0;j<ar.length-1-i;j++){
                 if(ar[j]>ar[j+1]){
                     int temp=ar[j];
                     ar[j]=ar[j+1];
                     ar[j+1]=temp;
                 }
             }
         }
    }

    // Trapped Rain water
    public  static int trappedWater(int ar[]){
        int totalTrappedWater=0;
        int []maxLeft=new int[ar.length];
        int []maxRight=new int[ar.length];
        // For maximum left
        maxLeft[0]=ar[0];
        maxRight[ar.length-1]=ar[ar.length-1];
        for(int i=1,j=(ar.length-2);i<ar.length;i++,j--){

//            if(ar[i]>maxLeft[i-1]){
//                maxLeft[i]=ar[i];
//            }
//            else{
//                maxLeft[i]=maxLeft[i-1];
//            }

            maxLeft[i]=maxLeft[i-1]<ar[i]?ar[i]:maxLeft[i-1];

//            if(ar[j]>maxRight[j+1])
//                maxRight[j]=ar[j];
//            else
//                maxRight[j]=maxRight[j+1];


            maxRight[j]=maxRight[j+1]<ar[j]?ar[j]:maxRight[j+1];

        }
        for(int i=0;i<ar.length;i++){
            int min=Integer.min(maxLeft[i],maxRight[i]);
            totalTrappedWater+=min-ar[i];
        }
        return totalTrappedWater;
    }


}
