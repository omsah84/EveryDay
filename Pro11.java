import java.util.Scanner;

public class Pro11 {
    public static int grat(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int st = grat(a, b);
        System.out.println(st);
    }
    
    

}
