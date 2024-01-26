package Practice;

public class Day1 {
    public static void main(String[]args){
        int []arr=new int[]{-2,-3,4,-1,-2,1,5,-3};
//        printarr(arr);
        int si=0;
        int li=arr.length-1;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;

//        // Finding sum using prefix array
        int []prefixarr=new int[arr.length];
        prefixarr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixarr[i]=prefixarr[i-1]+arr[i];
        }
        for(int  i=0;i<arr.length;i++){
            int startidx=i;
            for(int j=i;j<arr.length;j++) {
                int endidx=j;
                    sum=startidx==0?prefixarr[endidx]:prefixarr[endidx]-prefixarr[startidx-1];
                    maxsum=Integer.max(maxsum,sum);
                sum=0;
            }
//            System.out.println();
        }
        System.out.println("Maximum sum is "+maxsum);



//      Printing sub arrays and the maximum sum
//        for(int  i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++) {
//                System.out.print("("+arr[i]);
//                sum=sum+arr[i];
//
//                for (int k = i+1; k <= j; k++) {
//                    System.out.print(","+arr[k]);
//                    sum=sum+arr[k];
//                }
//                System.out.println(") "+sum);
//                maxsum=Integer.max(maxsum,sum);
//                sum=0;
//            }
//            System.out.println();
//        }
//        System.out.println("Maximum sum is "+maxsum);




        // printing  subarrays
//        for(int  i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++) {
//                System.out.print("("+arr[i]);
//                for (int k = i+1; k <= j; k++) {
//                    System.out.print(","+arr[k]);
//                }
//                System.out.print(") ");
//            }
//            System.out.println();
//        }


        // Pairs in array
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                System.out.print("("+arr[i]+","+arr[j]+") ");
//            }
//            System.out.println();
//        }



        //  Reversing an array
//        while(si<=li){
//            int temp=arr[si];
//            arr[si]=arr[li];
//            arr[li]=temp;
//            si+=1;
//            li-=1;
//        }
//        System.out.println();
//        printarr(arr);
    }

    public static void printarr(int []ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
