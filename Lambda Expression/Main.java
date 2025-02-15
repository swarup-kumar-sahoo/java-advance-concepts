@FunctionalInterface // Have only one method
interface A{
    void show(int i, int j);
}
public class Main{
    public static void main(String[] args) {

        A obj = (i,j) -> System.out.println("in the show " + i + " " + j); //Lambda Expression

        obj.show(5,7);
    }
}