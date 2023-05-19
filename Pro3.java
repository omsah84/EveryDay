import java.util.Scanner;

public class Pro3 {
    public static long mulNum(int a, int b) {
        return a * b;
    }

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        long mul = mulNum(a, b);

        System.out.println(mul);
    }
}
