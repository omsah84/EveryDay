import java.util.concurrent.CountDownLatch;

public class javaPro1 {

    public static char getCharacter(String str,int idx){
        if(idx<0 || idx>str.length()){
            return '\0';
        }else{
            return str.charAt(idx);
        }
    }
    public static void main(String[] args) {
        String str = "omsah";
        int idx = 9;

        char character = getCharacter(str,idx);

        if(character !='\0'){
            System.out.println("The character of index "+idx + " is "+character);
        }else{
            System.out.println("Invalid idx.");
        }

        
    }


}
