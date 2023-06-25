import javax.swing.plaf.FontUIResource;

public class CharPatt{
    public static void main(String[] arr){
            int sum = 0;
        for(char i = 65 ;i<= 'Z';i++){
            
            sum = (sum * 26) + i;
            char ans = (char)sum;
            System.out.println(ans);
        }
    }
}