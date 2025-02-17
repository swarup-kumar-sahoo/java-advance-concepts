class SwarupException extends Exception{  // New custom exception

    public SwarupException(){
        super("My custom exception");
    }

}


public class Main3{

    public static void main(String args[]){

        
        int i = 20;
        int j = 0;

        try{

            j = 18/i;
            if(j == 0)
                throw new SwarupException(); // throw to coustom exception

        }
        catch(SwarupException ae){

            j = 18;
            System.out.println("Thats default output..." + ae);

        }
        catch(Exception e){

            System.out.println("Somethong went wrong..." + e);

        }

        System.out.println(j);
    }
}