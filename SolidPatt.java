import java.util.Scanner;
public class SolidPatt {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.close();

        //for outer loop for row
        for(int r  = 1;r<=row;r++){
            //for inner loop for coll
            for(int c = 1;c<=col ; c++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
