package bits;

public class BitManipulation {
    // calculating exponential
//    public static int exponential(int n,int b){
//        int ans=1;
//
//        while(b!=0){
//            if((b&1)==1){
//                ans*=ans;
//                b=b>>1;
//            }
//        }
//
//    }
    //count no of set bits
    public static int countSetBits(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1)
                count+=1;
            n=n>>1;

        }
        return count;
    }
    // checking if a number is 2 ki power or not
    public static boolean twoPower(int n){
        if((n&(n-1))==0)
            return true;
        else
            return false;

    }
    // clear range of bits
    public static int clearRangeOfBits(int n,int si,int ei){
        int a=(-1)<<ei+1;
        int b=(1<<si)-1;
        int bitmask=a|b;
        int no=n&bitmask;
        return no;
    }
    //clear the ith bits
    public static int clearIthBits(int n,int pos){
        int bitmask=(-1)<<pos;
        int no=n&bitmask;
        return no;

    }
    // update the ith bit set 0 to 1 || 1 to 0
    public static int updateTheIthBit(int n,int pos,int newBit){

        if(newBit==0) {
            int no = clearIthBit(n, pos);
            return no;
        }
        else if(newBit==1){
            int no=setIthBit(n,pos);
            return no;

        }
        System.out.println("Bit can be either 0 or 1");
        return -1;

    }

    // clear the ith bit
    public static int clearIthBit(int n,int pos){
        int bitmask=1<<pos;
        int no=n^bitmask;
        return no;
    }

    // set the ith bit
    public static int setIthBit(int n,int pos){
        int bitmask=1<<pos;
        int no=n|bitmask;
        return no;
    }
// get the ith bit

    public static int getIthBit(int n,int pos){

        int bitmask=1<<pos;
        int no=n&bitmask;
        if(no==0){
          return 0;
        }
        else
            return 1;
    }

}
