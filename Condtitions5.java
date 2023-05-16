import java.util.Scanner;

public class Condtitions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.printf("%d is equal with %d", a, b);
        } else if (a > b) {
            System.out.printf("%d is greater than %d.", a, b);
        }
        else {
            System.out.printf("%d is less than %d\n", a, b);
        }
        

        if (3 % 2 == 0);
        System.out.println("Dead code.");
    }
}
