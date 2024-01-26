package arraylist;
import java.util.ArrayList;
import java.util.*;
//class A{
//    public static void show(){
//        System.out.println("hello");
//    }
//}
public class AL1 {
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);

//ArrayList<A> list2=new ArrayList<>();

//        for(int i=list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }

        // sorting can also be done using Collection class
        System.out.println(list);
        Collections.sort(list); // for ascending order
        System.out.println("Ascending order"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order"+list);
    }
}
