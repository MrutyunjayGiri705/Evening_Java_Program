public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.display(); 
        // A a = new A();
        // a.display(); 
        
    }
    
}
class A{
    void display() {
        System.out.println("Display method in class A");
    }
}
class B extends A{
    @Override
    void display() {
        System.out.println("Display method in class B");
    }
}