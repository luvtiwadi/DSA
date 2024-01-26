public class TrappingRainWaterProblem {
    public static void main(String []args){
        int []height=new int[]{4,2,0,6,3,2,5};
        calculateRain(height);
    }
    public static void calculateRain(int[]arr){
        // Calculating left maximum values
        int []max_left=new int[arr.length];
        max_left[0]=arr[0];
        for(int i=1;i< max_left.length;i++){
            max_left[i]=max_left[i-1]<arr[i]?arr[i]:max_left[i-1];
        }
        // Calculating the right maximum values
        int []max_right=new int[arr.length];
        max_right[arr.length-1]=arr[arr.length-1];
        for(int i=max_right.length-2;i>=0;i--){
            max_right[i]=max_right[i+1]>arr[i]?max_right[i+1]:arr[i];

        }

        int total_trapped_water=0;
        for(int i=0;i<arr.length;i++){
            int water_height=Math.min(max_left[i],max_right[i]);
            int bar_level=arr[i];
            total_trapped_water+=water_height-bar_level;
        }

        System.out.println("Total trapped water is :"+total_trapped_water);

//        just to see the array for checking purpose only
//        for(int i=0;i<max_right.length;i++){
//            System.out.print(max_right[i]+" ");
//        }
    }
}
