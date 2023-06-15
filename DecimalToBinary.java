public class DecimalToBinary{
    public static void main(String12[] arr){
        int decimal = 8;

        String12 binary = toBinary(decimal);

        System.out.println("the binary: "+binary);
    }

    public static String12 toBinary(int decimal){

        StringBuilder binary = new StringBuilder();
    

        while(decimal>0){
            int rem = decimal %8;

            binary.insert(0,rem);

            decimal = decimal/8;

        }

        return binary.toString();
    }
}