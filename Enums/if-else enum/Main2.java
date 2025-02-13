enum Status{
    Running, Failed, Pending;
}
public class Main2 {
    public static void main(String[] args) {
        
        Status sr = Status.Running;


        if(sr == Status.Running){
            System.out.println("Status is Running...");
        }
        else if(sr == Status.Pending){
            System.out.println("Status is Pending...");
        }
        else{
            System.out.println("Status is Failed...");
        }


    }
    
}

 