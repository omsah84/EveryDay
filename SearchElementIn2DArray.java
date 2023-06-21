import java.util.*;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col = 5;

        int arr[][]  = new int[row][col];

        //input

        System.out.println("Enter the input.");
        for(int i = 0;i<row;i++){
            for(int j = 0 ;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.print("\nThe give data is: ");
         for(int i = 0;i<row;i++){
            for(int j = 0 ;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        //search elemtnt
        System.out.println("Enter the data.");
        int data = sc.nextInt();

        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(arr[i][j] == data){
                    System.out.priconntf("Thd given element index is: %d%d",i,j);
                    
                }
            }
        }


        
    }
}
