class A{
    public void show() throws ClassNotFoundException{

            Class.forName("Hello");
        
    }
}
public class Main4 {
    
    @SuppressWarnings("CallToPrintStackTrace") 
    public static void main(String[] args) {

        A obj = new A();
        try{
        obj.show();
        }catch(ClassNotFoundException e){
            System.out.println("not a class");
            e.printStackTrace();
        }
        
    }
}
