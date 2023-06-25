

abstract class Animal{

    {
        System.out.println("Four legs");
    }
    public abstract void sound();
}

class Dog extends Animal{

        
    public void sound(){
        System.out.println("bhubhu");
    }
}

class Lion extends Animal{
    public void sound(){
        System.out.println("rear");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound();
        l.sound();
    }
}
