//binary to decimal
public class ABC{
    public static void main(String[] arr){
        String st = "101010";  //binary number

        //convert binary to decimal
        int decimalNumber = Integer.parseInt(st,2);

        System.out.println("Decimal: "+ decimalNumber);
    }
}