
import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = 2;
        Vector<Vector<Integer>> arr = new Vector<>(0);
        
        for(int i = 0;i<V;i++){
            Vector<Integer> list = new Vector<>();
            for(int j = 0;j<V;j++){
                System.out.println("Enter the edges.");
                Integer value = sc.nextInt();
                list.add(value);

            }

            arr.add(list);
        }


         for(int i = 0;i<V;i++){
            for(int j = 0;j<V;j++){
                System.out.print(arr.get(j)+" ");
                
            }

            
        }
        
    }

    private static Vector<Vector<Integer>> arr(int i) {
        return null;
    }
}
