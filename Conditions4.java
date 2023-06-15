import java.util.Scanner;

public class Conditions4 {
    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult.");
        }
        else {
            System.out.println("Not adult.");
        }
    }
}
