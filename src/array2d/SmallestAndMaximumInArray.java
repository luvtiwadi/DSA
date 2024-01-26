package array2d;
import java.util.Scanner;
public class SmallestAndMaximumInArray {
     int [][]ar;
     public SmallestAndMaximumInArray(){
         ar=new int[3][3];
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no for  2-d array of 3X3 matrix");
         for(int i=0;i<ar.length;i++){
             for(int j=0;j<ar[0].length;j++){
                 ar[i][j]=sc.nextInt();
             }
         }

     }
     public void greatest(){
         int max=Integer.MIN_VALUE;
         for(int i=0;i<ar.length;i++){
             for(int j=0;j<ar[0].length;j++){
                 if(ar[i][j]>max)
                     max=ar[i][j];


             }
         }
         System.out.println("Maximum no is "+max);
     }
     public void smallest(){
         int min=Integer.MAX_VALUE;
         for(int i=0;i<ar.length;i++){
             for(int j=0;j<ar[0].length;j++){
                 if(ar[i][j]<min)
                     min=ar[i][j];


             }
         }
         System.out.println("Minimum no is "+min);
     }

}
