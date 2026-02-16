import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        B bb = new B();  
        bb.input();      
        bb.add();         
    }
}

class A {
    int a, b;  

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class B extends A {
    void add() {
        int z = a + b;
        System.out.println("Sum = " + z);
    }
}
