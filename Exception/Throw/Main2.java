public class Main2{

    public static void main(String args[]){

        int i = 20;
        int j = 0;

        try{

            j = 18/i;
            if(j == 0)
                throw new ArithmeticException("Due to value is zero..."); // if value is zero it will throw Arithmatic exeption

        }catch(ArithmeticException a){

            j = 18;
            System.out.println("Thats default output..." + a);

        }catch(Exception e){

            System.out.println("Somethong went wrong..." + e);

        }

        System.out.println(j);
    }
}