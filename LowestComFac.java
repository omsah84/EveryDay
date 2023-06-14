import java.util.Scanner;

11
public class LowestComFac {

    //function of gcd
    public static int gcd(int num1,int num2){
        
        int cond;
        if(num1>=num2){
            cond = num2;
        }else{
            cond = num1;
        }

        int ans = 1;

        for(int i = 1;i<=cond;i++){
            if(num1 %i==0 && num2 %i==0){
                ans = i;
            }
        }

        return ans;
    }

    //function of lcm
    public static int lcm(int num1 , int num2) {

        int ans = (num1*num2)/gcd(num1, num2);
        return Math.abs(ans);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input
        System.out.println("Enter the first number.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number.");
        int num2 = sc.nextInt();

        sc.close();

        int lcmans = lcm(num1, num2);

        System.out.println("The LCM : " +lcmans);

    }
}
