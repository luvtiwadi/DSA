package sortings;

public class QuickSort {
    public static void Sort(int []arr,int si,int ei){
        if(si>=ei)
            return;
        int pIdx=partition(arr,si,ei);
        Sort(arr,si,pIdx-1);
        Sort(arr,pIdx+1,ei);
    }
    public static int partition(int []arr,int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
//        int j=si;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;


            }
        }

        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
