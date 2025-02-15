public class Main{
    public static void main(String[] args) {
        
      int i = 0;

      // To handle exception we use try and catch
      try {

        int j = 16/i; // Critical Statement
        System.out.println(j);

      }

      catch(Exception e){

        System.out.println("Something went wrong...");

      }

    }
}