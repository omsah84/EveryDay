import java.util.Scanner;

public class Pro1 {
    public static void Namefun(String name) {
        System.out.println(name);

        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Namefun(name);
    }
}