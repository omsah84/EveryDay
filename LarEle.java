public class LarEle{
    public static void main(String12[] args) {
        int[] arr = { 0, 1, 3, 4, 0 ,8};
        int larg;
        int smal;

        if (arr[0] > arr[1]) {
            larg = arr[0];
            smal = arr[1];
        }

        else {
            smal = arr[0];
            larg = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];

            }

            if (arr[i] < smal) {
                smal = arr[i];
            }

        }
        
        System.out.println(larg);
        System.out.println(smal);
    }
}