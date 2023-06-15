import java.util.Scanner;

public class EvenOrOdd5 {
    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd.");
        }
    }
}
