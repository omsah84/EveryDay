import java.util.Scanner;
public class BasicArr {
    public static void main(String[] arr){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array.");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.println("Enter the arr value which size is "+size+" .");
        for(int i = 0;i<size;i++){
            ar[i] = sc.nextInt();
        }

        System.out.print("This is the array value: ");

        //printing arr element 
        for(int i = 0;i<size;i++){
            System.out.print(ar[i]+" ");
        }

    }
}
