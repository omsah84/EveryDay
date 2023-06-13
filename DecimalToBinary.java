public class DecimalToBinary{
    public static void main(String[] arr){
        int decimal = 8;

        String binary = toBinary(decimal);

        System.out.println("the binary: "+binary);
    }

    public static String toBinary(int decimal){

        StringBuilder binary = new StringBuilder();
    

        while(decimal>0){
            int rem = decimal %8;

            binary.insert(0,rem);

            decimal = decimal/8;

        }

        return binary.toString();
    }
}