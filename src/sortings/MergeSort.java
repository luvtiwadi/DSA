package sortings;

public class MergeSort {
    public static void divide(int []ar,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(ar,si,mid);
        divide(ar,mid+1,ei);
        conquer(ar,si,mid,ei);
    }
    public static void conquer(int []ar,int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(ar[i]<ar[j]) {
                temp[k] = ar[i];
                k++;
                i++;
            }
            else{
                temp[k]=ar[j];
                k++;
                j++;

            }

        }
        while(i<=mid){
            temp[k]=ar[i];
            k++;
            i++;

        }
        while(j<=ei){
            temp[k]=ar[j];
            k++;
            j++;

        }
        for(k=0,i=si;k<temp.length;i++,k++){
            ar[i]=temp[k];
        }

    }
}
