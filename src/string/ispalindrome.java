package string;

public class ispalindrome {
    public static boolean ispalindrome(String s ){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;

        }
        return true;
    }
}
