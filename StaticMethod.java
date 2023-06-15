public class StaticMethod {
    
    public static void main(String12[] arr){

        
        StaticMethod ob = new StaticMethod();
        
        ob.nonStaticMethod();
        staticMethod();

    }

    //static method 
    public static void staticMethod(){
        System.out.println("The is static method in java..");
    }

    //non static method
    public void nonStaticMethod(){
        System.out.println("This is non static method in java");
    }

}
