class A{

    public void showThisMethod(){
        System.out.println("in the show");
    }

}
class B extends A{

    @Override
    public void showThisMethod(){
        System.out.println("in the show");
    }
    
}
public class Main{
    public static void main(String[] args) 
    {

        B obj = new B();
        obj.showThisMethod();

    }
}