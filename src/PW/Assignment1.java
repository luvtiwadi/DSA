package PW;

import java.util.Collections;

public class Assignment1 {
    public static void main(String []args){
        /* Q1 implementation  */
        /*
        int arr[]=new int[]{2,7,11,15};
        int newar[]=sum(arr,9);
       for(int i=0;i< newar.length;i++){
           System.out.print(newar[i]+",");
       }

         */

        /* Q2 implementation */
        int nums[]=new int[]{3,2,2,3};
//        int s=removeTheValue(nums,3);
//        System.out.println(removeTheValue(nums,3));
//        for(int i=0;i<nums.length;i++){
//            System.out.print(nums[i]+" ");
//        }

//        int arr[]=new int[]{1,3,5,6};
//        System.out.println(posInteger(arr,7));
//            int []digits=plusOne(new int[]{1,2,9});
//
//            int nums1[]=new int[]{1,2,3,0,0,0};
//            int nums2[]=new int[]{2,5,6};
//            int m=3,n=3;
//            merge2Array(nums1,nums2,m,n);
//
//        for(int i=0;i<nums1.length;i++){
//            System.out.print(nums1[i]+" ");
//        }
        int nums11[]=new int[]{2,3,1};
        System.out.println(check2ValuesInArray(nums11));
    }
    //Q7
    public static void shiftingZeros(int []arr){

    }
    //Q6
    public static boolean check2ValuesInArray(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=max<arr[i]?arr[i]:max;
        }
        boolean []array1=new boolean[max+1];
        for(int i=0;i<arr.length;i++) {
            if(array1[arr[i]]==false)
            {
                array1[arr[i]]=true;
            }
            else{
                return true;
            }
        }
        return false;
    }
    //Q5
          public static void merge2Array(int []arr1,int []arr2,int m,int n){
        int temparr[]=new int[arr1.length];

              for(int i=0;i<arr1.length;i++){
//                  System.out.print(nums1[i]+" ");

                temparr[i]=arr1[i];
              }
        int idx1=0,idx2=0;
        int j=0;
        while(idx1<m&&idx2<n){
            if(temparr[idx1]<arr2[idx2])
                arr1[j++]=temparr[idx1++];
            else
                arr1[j++]=arr2[idx2++];
        }
        while(idx1<m){
            arr1[j++]=temparr[idx1++];
        }
              while(idx2<n){
                  arr1[j++]=arr2[idx2++];
              }
//




          }

    //Q4
     public static int[]  plusOne(int []nums){
        for(int i=nums.length-1;i>=0;i--){
            nums[i]+=1;
            if(nums[i]==10){
                nums[i]=0;
            }
            else
                return nums;
        }
        int []digits=new int[nums.length+1];
        digits[0]=1;
        for(int i=0;i<nums.length;i++){
            digits[i+1]=nums[i];

        }
        return digits;
     }
    // Q3
    public static int posInteger(int []nums,int target){
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target)
                return i;


        }
        return i;

    }



    //Q2
    public static int removeTheValue(int []nums,int val){
        int sum=0;
        int sumarr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                sum+=1;
                sumarr[j]=i;
                j+=1;
            }
        }

//        just for checking purpose
//        for(int i=0;i<sumarr.length;i++){
//            System.out.print(sumarr[i]+" ");
//        }


  // zo in my output _ will be represented by 95
        
        for(int i=0;i<sum;i++){
            // underscore
            nums[sumarr[i]-i]='_';

            for(int k=sumarr[i]-i;k<nums.length-1;k++){
                int temp=nums[k];
                nums[k]=nums[k+1];
                nums[k+1]=temp;
            }
        }

        return sum;
    }
    //Q1
    public static int[] sum(int nums[],int target){
        int []idx=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                idx[0]=i;
                idx[1]=j;
                    return idx;

                }
            }
        }
        return idx;
    }


}
