public class ReverseInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{12,43,55,64,24,69,21};
        show(arr);
        swap(arr);
        show(arr);
    }
    public static void swap(int []a){
        int index=a.length/2;
        int end=a.length-1;
        for(int i=0;i<=index;i++){
            if( end>i) {
                int temp = a[i];
                a[i] = a[end];
                a[end] = temp;
                end -= 1;
            }

        }
    }
    public static void show(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
}
