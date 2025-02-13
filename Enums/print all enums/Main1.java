enum Status{
    Running, Failed, Pending, Success;
}
public class Main1 {
    public static void main(String[] args) {
        
        Status[] se = Status.values();

        for(Status s : se){
            System.out.println(s);
        }

    }
    
}
