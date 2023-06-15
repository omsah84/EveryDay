public class Swap {
    public static void main(String[] args) {
        String str = "omsah";
        int size = str.length();
        char arr[] = new char[size];

        for(int i =0,j=str.length()-1;i<str.length();i++,j--){
            char newchar= str.charAt(i);
            arr[j] = newchar;
        }

        for(char i: arr){
            System.out.println(i);
        }

        
       
    }
}
