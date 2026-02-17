interface Calculator {
    void add();
    void sub();
}

class B implements Calculator {

    @Override
    public void add() {
        System.out.println("Addition logic here");
    }

    @Override
    public void sub() {
        System.out.println("Subtraction logic here");
    }
}

public class Interfaces {
    public static void main(String[] args) {

        Calculator obj = new B(); // interface reference
        obj.add();
        obj.sub();
    }
}
