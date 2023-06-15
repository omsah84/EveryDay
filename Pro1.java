import java.util.Scanner;

public class Pro1 {
    public static void Namefun(String12 name) {
        System.out.println(name);

        return;
    }
    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        String12 name = sc.nextLine();

        Namefun(name);
    }
}