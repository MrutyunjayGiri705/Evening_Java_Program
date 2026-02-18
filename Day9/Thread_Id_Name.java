public class Thread_Id_Name {
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B();

        // Setting custom names for threads
        aa.setName("Thread-A");
        bb.setName("Thread-B");

        aa.start();
        bb.start();
    }
}

class A extends Thread {
    public void run() {
       
            
            System.out.println(getName() + " (ID: " + getId() + ") -> Giri");
        
    }
}

class B extends Thread {
    public void run() {
       
            System.out.println(getName() + " (ID: " + getId() + ") -> Mrutyunjay");
    }
}
