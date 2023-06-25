public class Arm {

    public static int cube(int num){
        return num* num * num;
    }

    public static int sum(int num){
        int sum = 0;
        while(num>0){

            int lastdig = num%10;
            int cundigi = cube(lastdig);
            sum = sum +  cundigi;
            num /=10;
        } 

        return sum;
    }
    public static void main(String[] args) {
        int num = 143;

        if(sum(num) == num){
            System.out.println("the give number is armstorng.");
        }else{
            System.out.println("not armstron");
        }
        

    }
}
