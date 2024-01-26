public class PrintingSubArray {
    public static void main(String[] args) {
       int []arr=new int[]{2,4,6,8,10};
       subArray(arr);
    }

    public  static void subArray(int []arr1){
        int sum=0;
        int greatest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            for(int j=i;j<arr1.length;j++){
                System.out.print("("+arr1[i]);
                sum=arr1[i];
                for(int k=i+1;k<=j;k++){
                    System.out.print(","+arr1[k]);
                    sum+=arr1[k];
                }
                System.out.print(")"+"      Total:"+sum);

                System.out.println();
                if(sum>greatest)
                    greatest=sum;
                if(sum<smallest)
                    smallest=sum;
                sum=0;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("greatest sum value is:"+greatest);
        System.out.println("smallest sum value is :"+smallest);
    }

}
