import java.util.*;

public class SumNat {

    public static int sumNat(int num, int sum) {
        if(num==0){
            return sum;
        }
        sum += num;
        return sumNat(num - 1, sum);
        
    }
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("The sum of Natural num: " +sumNat(num,0));
    }
}
