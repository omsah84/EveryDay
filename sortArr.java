import java.util.Scanner;

public class sortArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the array data.");
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<5;i++){
            for(int j = i+1;j<5;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The sorted array.");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
