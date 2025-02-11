class A{
    public void show(){
        System.out.println("in a show");
    }
}
public class Main{
    public static void main(String[] args) {
        
        A obj = new A(){
            public void show(){
                System.out.println("in new show");  // Anonyomous inner class
            }
        };
        obj.show();
    }
}