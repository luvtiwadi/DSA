public class PassingByReference {
    public static void main(String[] args) {
        int[] marks = new int[]{87, 98, 23, 98};
        show(marks);
//        update(marks);
//        System.out.println("");
//        show(marks);
        System.out.println("Smallest no is "+getSmallest(marks));
        System.out.println("Largest no is :"+getLargest(marks));
    }
    public static int getLargest(int[]m){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<m.length;i++){
            if(m[i]>largest)
                largest=m[i];
        }
        return largest;
    }
    public static int getSmallest(int []m){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<m.length;i++){
            if(m[i]<smallest)
                smallest=m[i];

        }
        return smallest;
    }

    public static  void update(int[] m) {
        for (int i = 0; i < m.length; i++)
            m[i] = m[i] + 1;
    }
    public static void show(int []m){
        for(int i=0;i<m.length;i++)
            System.out.print(m[i]+" ");
    }
}