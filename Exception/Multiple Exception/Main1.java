public class Main1 {
public static void main(String args[]){

    int arr[] = new int[5];
    String str = null;
    int i = 7;
    int j = 14;

    try {
        
        System.out.println(j/i);
        System.out.println(arr[6]);
        System.out.println(str.length());

    }
    catch(ArithmeticException a){ // catching specific error

        System.out.println("Arithmatic exception...");

    }
    catch(ArrayIndexOutOfBoundsException o){  
        System.out.println("Out of index... ");

    }
     catch (Exception e) { // It will catch all error 
        System.out.println("Null point exeption...");
    }

}
}
