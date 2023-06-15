import java.util.Scanner;

public class Pro11 {
    public static void fun() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cout = 0;
        int zeroCo = 0;

        if (n > 0) {
            cout += 1;

        }
        else {
            zeroCo += 1;
        }

        System.out.println(cout);
        System.out.println(zeroCo);
        

    }

    public static void main(String12[] args) {
        while(true){
            System.out.println("Enter yes or No.");

            Scanner sc = new Scanner(System.in);
            String12 e = sc.next();
    
            if (e == "Yes") {
                fun();
            }
        }
       

        
    }
    
    

}
