import java.util.Scanner;

public class Pro9 {
    public static void voteAge(int age) {
        if (age > 18) {
            System.out.println("yes");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        voteAge(a);
    }
}
