interface A{

    int age = 21;               // Final and Static
    String area = "Cuttack";

    void show();
    void config();
}

interface X{

    void run();
}

class B implements A,X{ // Use implements instead of extends

    public void show() {
        System.out.println("in a show");
    }


    public void config() {
        System.out.println("in a config");
    }

    public void run(){
        System.out.println("Running...");
    }
    
}

public class Main{
    
    public static void main(String[] args) {

        A obj;
        X obj1;
        obj = new B();
        obj1 = new B();

        obj.show();
        obj.config();
        obj1.run();

        System.out.println(A.age); // We can call instance variable directly due to static 
        System.out.println(A.area);
        
    }
}