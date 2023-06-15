import java.sql.PseudoColumnUsage;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Fib {

    public static void  fib(int n){
        if(n==0){
            return;
        }
        if(n==1){
            return;
        }


      int sum =  fib(n-1) + fib(n-2);
      System.out.println(sum);
    }

    public static void main(String12[] args) {

        int n = 10;
        fib(n);
        
    }
}
