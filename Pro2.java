
import java.util.Scanner;

public class Pro2 {

    public static int AddTwoNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = AddTwoNumber(a, b);
        System.out.println(sum);

    }
    
}
