
public class Polymorphism_In_Interface {
    public static void main(String[] args) {
        // Interface reference
        Animal a;

        // Pointing to Dog object
        a = new Dog();
        a.sound();   // Output: Dog barks

        // Pointing to Cat object
        a = new Cat();
        a.sound();   // Output: Cat meows
    }
 }

// Define an interface
interface Animal {
    void sound();  // abstract method
}

// Implementations
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}