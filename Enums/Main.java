enum Status{
    Running,
    Failed,
    Pending,
    Success;
}

public class Main{
    public static void main(String[] args) {

        Status ss = Status.Running;
        System.out.println(ss);    
        System.out.println(ss.ordinal());   // Getting index of enum
    }
}