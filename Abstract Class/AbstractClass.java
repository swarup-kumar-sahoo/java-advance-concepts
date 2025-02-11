abstract class car{

    public abstract void fly();

    public void drive(){
        System.out.println("Driving...");
    }
}

abstract class bmw extends car{

    public abstract void fly();

    public abstract void swim();
}

class bmwupgrade extends bmw{

    public void fly(){
        System.out.println("Flying...");
    }

    public void swim(){
        System.out.println("Swimming...");
    }

    
}

public class AbstractClass{
    public static void main(String[] args) {

        bmw c = new bmwupgrade(); // We cant create object of abstract class 
        // But we can make them as reference
        c.fly();
        c.swim();
        
    }
}