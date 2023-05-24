import java.util.Scanner;
import java.util.Vector;

public class Vect {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },
                { 4, 2, 5, 6, 7 },
                { 3, 4, 5, 7, 6 }
        };
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    System.out.print(arr[j][i] + " ");
                    // System.out.println();
                }
            } else {
                for (int j = row - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                    // System.out.println();

                }
            }
            System.out.println();
        }

    }
}
