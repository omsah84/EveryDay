import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrA[][] = new int[2][2];
        int arrB[][] = new int[2][2];

        System.out.print("Enter the first matrix data:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                arrA[i][j] = sc.nextInt();
            }
        }


        System.out.print("Enter the second matrix data:");
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                arrB[i][j] = sc.nextInt();
            }
        }

        System.out.println("First arrary data.");
        for(int i = 0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(arrA[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Second array data.");
        for(int i =0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(arrB[i][j]+" ");
            }
            System.out.println();
        }

        int arrsum[][] = new int[2][2];
        System.out.println("The addition of two matrix.");
        for(int i = 0;i<2;i++){
            for(int j =0;j<2;j++){
                arrsum[i][j] =  arrA[i][j] + arrB[i][j];
                System.out.print(arrsum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
