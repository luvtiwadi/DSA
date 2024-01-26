public class PrintingSubArrayUsingPrefixArray {
    public static void main(String[]args){
        int []ar=new int[]{1,-2,6,-1,3};
        largestNo(ar);
    }
    public static void  largestNo(int[]ar) {
        int prefix[] = new int[ar.length];
        prefix[0] = ar[0];
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + ar[i];
        }
        for(int i=0;i<ar.length;i++){
            int start=i;

            for(int j=i;j<ar.length;j++){
                int end=j;

                curr_sum=i==0?prefix[end]:prefix[end]-prefix[start-1];
                if (curr_sum>max_sum)
                    max_sum=curr_sum;
            }
        }

        System.out.println("maximum sum is :"+max_sum);
    }
}
