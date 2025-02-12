interface ABC{
    void eat();
}
interface XYZ extends ABC{

}
class Eat implements XYZ{
    public void eat(){
        System.out.println("Eating...");
    }
}

public class More {
    public static void main(String[] args) {
        
        XYZ obj;
        obj = new Eat();
        
        obj.eat();
        
    }
}
