enum Laptop{
    Asus(2000),
    HP(2500),
    MacBook(3000),
    Dell;

    private int price;

    private Laptop(){ // Default Constructor
        price = 1000;
    }

    private Laptop(int price){ // Parametrized constructor
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
public class Main4{
    public static void main(String[] args) {

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " - " + lap.getPrice());
        }
    }
}