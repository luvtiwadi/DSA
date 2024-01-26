public class KdaanesAlgorithmm {
    public static void main(String []args){
        int []ar=new int[]{1,-2,6,-1,3};
        int []ar1=new int[]{-2,-3,4,-1,-2,1,5,-3};
        maxSubArray(ar1);

    }
    public static void maxSubArray(int []a){

        int []cs=new int[a.length];// current sum
        int []ms=new int[a.length];// maximum sum
        cs[0]=a[0]<0?0:a[0];
        ms[0]=cs[0];
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            cs[i]=cs[i-1]+a[i]<0?0:cs[i-1]+a[i];
            if (ms[i-1]>cs[i])
                ms[i]=cs[i];
            else
                ms[i]=ms[i-1];
        }
        System.out.println("Maximum subarray sum:"+ms[ms.length-1]);

    }
}
