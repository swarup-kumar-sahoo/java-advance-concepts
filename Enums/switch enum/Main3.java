enum Status{
    Running, Failed, Pending;
}
public class Main3 {
    public static void main(String[] args) {
        
        Status sr = Status.Failed;


        switch (sr) {
            case Running:
                System.out.println("Status is Running...");
                break;
            case Pending:
                System.out.println("Status is Pending...");
                break;
            default:
                System.out.println("Status is Failed...");
                break;
        }


    }
    
}
