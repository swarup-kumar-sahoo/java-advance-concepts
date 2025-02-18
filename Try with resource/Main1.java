import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
         
        System.out.println("Enter Numarator : ");
       

         

        try( Scanner scanner1 = new Scanner(System.in);){ // Try with Resources
            int n = scanner1.nextInt();
            System.out.println("Your number : " + n);
        } 
        catch (Exception e) {
            System.out.println("Denominator Cannot Be Zero.");
        }
       

    }
}
