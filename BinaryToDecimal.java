// public class BinaryToDecimal{
//     public static void main(String[] arr){
//         String binarynum = "101010";

//         int decimalNum = binarytodecimal(binarynum);
//         System.out.println("Decimal: "+decimalNum);
//     }

//     public static int binarytodecimal(String binary){
//         int decimal = 0;
//         int length = binary.length() -1;

//         for(int i = length ;i>=0;i--){

            
//             char digit = binary.charAt(i);
//             if(digit == '1'){
//                 decimal = decimal + Math.pow(2,length-i);
//             }
//         }

//         return decimal;
        
//     }
// }

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101011"; // Replace with your binary number

        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal: " + decimal);
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();
        
        for (int i = length - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            
            if (digit == '1') {
                decimal += Math.pow(2, length - i - 1);
            }
        }
        
        return decimal;
    }
}
