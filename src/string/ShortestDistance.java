package string;
import java.lang.Math;
public class ShortestDistance {
    public static double shortestPath(String s){
        int endX=0;// starting of x and y will always remain 0,0 because from there onwards moving will start
        int endY=0;

        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='N')
                endY+=1;
            else if(s.charAt(i)=='S')
                endY-=1;
            else if(s.charAt(i)=='E')
                endX+=1;
            else if(s.charAt(i)=='W')
                endX-=1;

        }
        double result=Math.sqrt(Math.pow(endX,2)+Math.pow(endY,2));
        return result;

    }
}
