public class AreaTri {
    public static void main(String[] args) {
        //semiperimeter
        //area

        //se = a+b+c;
        //a = rootUnder(se*se-a*se-b* se-c)

        int a=8;
        int b = 12;
        int c = 16;

        int se = (a+b+c)/2;

        double ans = Math.sqrt(se*(se-a)*(se-b)*(se-c));
        System.out.println(ans);
    }
}
