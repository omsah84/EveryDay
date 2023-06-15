import java.util.Iterator;

public class String12 {
    public static void main(String[] args) {
        String  str = "OMSAH";
        
        int get = 3;
        System.out.println(str.length());

        // String neewStr = str.substring(0, get)+ "omsah" + str.substring(get+1);
        // System.out.println(str.substring(str.length()+1));
        System.out.println(str.substring(-1));
    }
}
