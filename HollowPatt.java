import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HollowPatt {
    public static void main(String[] arr) throws Exception{
        BufferedReader  bf = new BufferedReader(new InputStreamReader(System.in));
        
        int row = Integer.parseInt(bf.readLine());

        int col = Integer.parseInt(bf.readLine());


        for(int r =1;r<=row ;r++){
            for(int c = 1;c<=col ;c++){
                if(r == 1 || r == row || c == col || c==1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
