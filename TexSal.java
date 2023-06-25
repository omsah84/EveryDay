public class TexSal {
    public static void main(String[] args) {
        int sal = 1000;
        double txt;

        if(sal<100){
            System.out.println(sal + " No tex");
        }
        else if(sal>100 && sal<200){
            txt = sal * 0.10;
            System.out.println(sal + txt);
        }else{
            txt = sal * 0.20;
            System.out.println(sal+ "  " +txt);
        }

    }
}
