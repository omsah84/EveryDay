
import java.util.*;

public class Pro6 {

    public static void sumOdd(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {

            } else {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumOdd(n);
    }
}
