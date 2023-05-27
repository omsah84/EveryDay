import java.util.*;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first starting number..");
            int start = sc.nextInt();
            System.out.println("Enter the ending  number..");
            int end = sc.nextInt();

            System.out.println("This is the all prime number: \n");

            for (int n = start; n <= end; n++) {

                int count = 0;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count += 1; // count = count + 1;
                    }
                }

                if (count == 2) {
                    System.out.print(n + " ");
                }

            }

            System.out.println("\n=========================================================================");
            System.out.println();

        }

    }
}
