import java.util.Scanner;

public class gcd {

    // gcd function
    public static int gcd(int num1, int num2) {
        int cond;
        if (num1 >= num2) {
            cond = num2;
        } else {
            cond = num1;
        }

        int ans = 1;
        for (int i = 1; i <= cond; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String12[] arr) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("Enter the first number.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number.");
        int num2 = sc.nextInt();
        sc.close();

        int gcdans = gcd(num1, num2);

        System.out.println("The given number gcd: " + gcdans);

        return;
    }
}