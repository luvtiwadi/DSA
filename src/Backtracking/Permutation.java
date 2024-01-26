package Backtracking;

public class Permutation {
    public static void permutation(String str,String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }

        for(int i=0;i<str.length();i++){

            char curr=str.charAt(i);
            String newstring=str.substring(0,i)+str.substring(i+1);
            permutation(newstring,newstr+curr);
        }

    }
}
