package sortings;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr=new int[]{5,4,5,3,2,1,1,1,1,1,1,5,5,5,5,5,5,5,5,1,3,2};
//        sort(arr);
//        selectionSort(arr);
//          insertionSort2(arr);
        countSort(arr);
        show(arr);


    }
    public static void show(int []a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
        // count sort
    public static void countSort(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
            if(a[i]>max)
                max=a[i];
        int array[]=new int[max+1];
        // counting frequency
        for(int i=0;i<a.length;i++)
            array[a[i]]+=1;
        for(int i=0,j=0;i<array.length;i++){
            if(array[i]==0)
                continue;
            else{
                while(array[i]!=0) {
                    a[j] = i;
                    j++;
                    array[i] -= 1;
                }
            }
        }

    }
    // good algorithm of insertion sort
    public static void insertionSort2(int []a){
        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int prev=i-1;
            while(prev>=0 && curr<a[prev]){
                a[prev+1]=a[prev];
                prev--;

            }
            a[prev+1]=curr;
        }
    }

    //  Selection sort
    public static void selectionSort(int []a){
        for(int i=0;i<a.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minpos]>a[j])
                    minpos=j;
            }
            int temp=a[i];
            a[i]=a[minpos];
            a[minpos]=temp;
        }
    }

    // Not a good algorithm
    public static void insertionSort(int []ar) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j - 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }

            }
        }
    }

    // Bubble Sort

    public static void bubbleSort(int []ar){
        for(int i=0;i<ar.length-1;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
//                    ar[j]=ar[j]+ar[j+1];
//                    ar[j+1]=ar[j]-ar[j+1];
//                    ar[j]-=ar[j+1];
                }
            }
        }
    }
//    public static void sort(int []a){
//        for(int i=a.length-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                if(a[j-1]>a[j]){
//                    int temp=a[j];
//                    a[j]=a[j-1];
//                    a[j-1]=temp;
//                }
//            }
//        }
//    }
}
