package arraylist;
import java.util.ArrayList;
//import java.util.Collections;
public class MultiDimensionalArray {
    public static void main(String []args){
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);list2.add(4);list2.add(6);list2.add(8);list2.add(10);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(3);list3.add(6);list3.add(9);list3.add(12);list3.add(15);

        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);


    }

}
