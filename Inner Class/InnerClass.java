class n1{
    public void show1(){
        System.out.println("Its Show 1");
    }

    class n2{
        public void show2(){
            System.out.println("Its Show 2");
        }
    }

    static class n3{ // Static class can only used by inner class
        public void show3(){
            System.out.println("Its Show 3");
        }
    }
}

public class InnerClass{
    public static void main(String args[]){

        n1 obj = new n1();
        n1.n2 obj2 = obj.new n2(); // We need object of outer class to create objectof inner class
        n1.n3 obj3 = new n1.n3();

        obj.show1();
        obj2.show2();
        obj3.show3();

    }
}