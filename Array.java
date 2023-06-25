import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //sortmethod
        //equalsmethod
        //copyof

        int arr[] =new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of array.");
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        
        int ar[] = Arrays.copyOf(arr,5);
        //  boolean b = Arrays.equals(a, b);
    }   
}
