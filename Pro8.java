import java.util.Scanner;

public class Pro8 {
    public static float cirf(int r) {
        
        return 3.14f * r * r;
    }

    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(cirf(r));
    }
}
