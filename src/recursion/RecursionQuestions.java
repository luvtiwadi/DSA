package recursion;

public class RecursionQuestions {
    // Print all binary strings of size N without consecutive ones.
    public static void binaryString(int n,int lastpos,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        if(lastpos==0){
            binaryString(n-1,0,str+"0");
            binaryString(n-1,1,str+"1");
        }
        else{
            binaryString(n-1,0,str+"0");

        }
    }
    // Friends pairing problem
    public static int friendPairing(int n){
        if(n==1||n==2){
            return n;
        }

        // For single
        int singleWays=friendPairing(n-1);
        // For pairing
        int pairs=(n-1)*friendPairing(n-2);
        // Total ways
        int totalWays=singleWays+pairs;
        return totalWays;
    }
    // removing duplicate in string
    public static void removeDuplicate(String st,int idx,StringBuilder newstr,boolean a[]){
        if(idx==st.length()) {
            System.out.println(newstr);
            return;

        }
        if((a[st.charAt(idx)-'a'])==true){
            removeDuplicate(st,idx+1,newstr,a);

        }
        else{
            a[st.charAt(idx)-'a']=true;
            newstr.append(st.charAt(idx));
            removeDuplicate(st,idx+1,newstr,a);

        }


    }

    //tilling problem
    public static int tilling(int area) {
        if(area==0||area==1)
            return 1;
        if(area==2)
            return 2;
    // horizontal cals
        int totalWaysH=tilling(area-2);
        // vertical calls
        int totalWaysV=tilling(area-1);
        int total=totalWaysH+totalWaysV;
        return total;

    }
    public static int optimizedPower(int no,int pow){
        if(pow==0)
            return 1;
        int ans=optimizedPower(no,pow/2);
        ans*=ans;
        if(pow%2!=0)
            ans=ans*no;
        return ans;
    }

}
