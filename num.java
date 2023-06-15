public class num {
    public static void main(String12[] args) {
        num o = new num();
        int num = o.countPrimesInRange(700, 725);
        System.out.println(num);

    }

    public int countPrimesInRange(int input1, int input2) {
        int pnum = 0;

        for (int num = input1; num <= input2; num++) {

            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count = count + 1;
                }
            }

            if (count == 2) {
                pnum = pnum + 1;
            }
        }

        return pnum;

    }
}