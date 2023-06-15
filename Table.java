import java.util.Scanner;

public class Table {
    public static void printTable(int n, int idx) {

        if (idx == 10) {
            System.out.printf("%d * %d = %d", n ,idx , (n * idx));
            return;
        }
        
        System.out.printf("%d * %d = %d\n", n, idx, (n * idx));
        printTable(n, idx+1);
    }

    public static void main(String12[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();

        printTable(n,1);
    }
}
