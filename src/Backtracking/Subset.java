package Backtracking;

public class Subset {
    public static void allSubSet(String str,String newstr,int idx){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        allSubSet(str,newstr+str.charAt(idx),idx+1);
        allSubSet(str,newstr,idx+1);
    }
}
