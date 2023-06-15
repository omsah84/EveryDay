
public class lcm {
    public static void main(String12[] args) {
        int a = 8;
        int b = 12;
        int ul = a * b;

        while (a <= ul) {
            if (a == b) {
                System.out.println(a);
                break;
            }

            else {
                b += b;
                return;
            }

            a += a;
        }
        // for (int i = a; i <= ul; i += a) {
        //     System.out.println(i);
        //     if (i == b) {
        //         System.out.println(i);
        //         break;
        //     }
            
        
    }
}
