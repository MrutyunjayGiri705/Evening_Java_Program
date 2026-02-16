public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        A obj; 
        obj = new B();
        
        obj.show(); 
    }
    
}
class A {
    void show() {
        System.out.println("Show method in class A");
    }
}
class B extends A {
   
    void show() {
        System.out.println("Show method in class B");
    }
}
