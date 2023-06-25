public class Pow {
    public static void main(String[] args) {
        int n = 2;
        int pow = 3;

        // 2*2*2
        int res = n;
        for (int i = 1; i < pow; i++) {
            res = res * n;
        }
        System.out.println(res);
    }
}
