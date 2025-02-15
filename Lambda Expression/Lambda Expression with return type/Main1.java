@FunctionalInterface
interface B{
    int container(int i,int j);
}
public class Main1 {
    public static void main(String[] args) {
        B obj = (i,j) -> i+j ; // Lambda expression only works with functional interface

        int contain = obj.container(5, 5);
        System.out.println(contain);
    }
}
