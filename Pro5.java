import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Pro5 {
    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Average(a, b));

    }
    
    public static int Average(int a, int b) {
        return (a + b) / 2;
    }
}
