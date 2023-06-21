public class ConvetIntToChar {
    public static void main(String[] args) {
        
    int charnum = 97;

        for(int i =0;i<26;i++){
            char chr = (char)(charnum+i);
            System.out.print(chr+" ");
        }
        
    }
}
