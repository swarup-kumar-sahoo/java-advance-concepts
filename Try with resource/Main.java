
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        System.out.println("Enter Numarator : ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt(); 

        System.out.println("Enter Denomenator : ");
        Scanner scanner2 = new Scanner(System.in);
        int d = scanner2.nextInt(); 

        try {
            double result = n/d;
            System.out.println(n + "/" + d + " Your result is: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Denominator Cannot Be Zero.");
        }
        finally{
            System.out.println("Bye");
        }


    }
}