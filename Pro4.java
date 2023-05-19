import java.util.Scanner;

public class Pro4 {
    public static int factNum(int n) {
        int mul = 1;
        if (n > 0) {
            for (int i = n; i <= 1; i++) {
                mul = mul * n;
            }
        }
        return mul;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factNum(n));
    }
}
