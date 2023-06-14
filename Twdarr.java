import java.util.ArrayList;

public class Twdarr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        
        int i= 0;
        while(i<=9){
            ArrayList<Integer> ar = new ArrayList<>();

            int j =0;
            while(j<=3){
                ar.add(j);
                j++;
            }

            arr.add(ar);
            i++;
        }
        System.out.println(arr.toString());

    }
}
