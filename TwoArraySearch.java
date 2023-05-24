import java.net.SocketTimeoutException;
import java.util.Scanner;

public class TwoArraySearch {
    public static void SearchElement(int[][] arr, int row, int col, int element) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == element) {
                    System.out.printf("%d and %d is : %d", i, j, element);
                    System.out.println();
                }
            }
        }
    }

    public static void printArray(int[][] arr,int row ,int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j] + " ");
                

            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 4;
        int col = 3;
        int[][] arr = new int[row][col];
        System.out.println("Enter the array element:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("array element:");
        printArray(arr, row, col);
        System.out.println("Ente the element which we want to search:");
        int element = sc.nextInt();
        SearchElement(arr, row, col, element);
    }
    
}