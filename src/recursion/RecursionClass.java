package recursion;

public class RecursionClass{
    // last occurence of an element in an array
    public static int lastOccurrence(int a[],int key,int i){
        if(a[i]==key)
            return i;
        if(i==0)
            return -1;
        int pos=lastOccurrence(a,key,i-1);
        return pos;
    }
    //first occurrence of an element in an array
    public static int firstOccurrence(int a[],int n,int i){
        if(a[i]==n)
            return i;
        if(i==(a.length-1))
            return -1;

        int pos=firstOccurrence(a,n,i+1);
        return pos;
    }
    //check wether given array is sorted or not
    public static boolean sortArray(int ar[],int i){
        if(i==ar.length-1)
            return true;
        if(ar[i]>ar[i+1])
            return false;
        boolean result=sortArray(ar,i+1);
        return result;

    }
    // fibonacci series
    public static int fib(int n){
        if(n==1||n==2)
            return (n-1);
        int fib=fib(n-1)+fib(n-2);
        return fib;
    }
    // sum of first n natural number
    public static int sumNatural(int n){
        if(n==1)
            return 1;

        int sum=sumNatural(n-1)+n;
        return  sum;
    }
    // print factorial of number n
    public static int fact(int n){
        if(n==0)
            return 1;
        int fact=fact(n-1)*n;
        return fact;
    }
//    printing n to 1 decreasing no
    public static void decreaseOrder(int n){
        if(n>0) {
            System.out.print(n + " ");
            decreaseOrder(n - 1);
        }

    }


}
