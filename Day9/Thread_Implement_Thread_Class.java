public class Thread_Implement_Thread_Class {
    public static void main(String[] args) {
        A aa=new A();
        Thread tt=new  Thread(aa);
        B bb=new B();
        Thread tt1=new  Thread(bb);
        tt.start();
        tt1.start();

    }
    
}
class  A implements Runnable{
    public  void run(){
        while (true) {
            System.out.println("Giri"); 
            
        }
    }
}
class  B implements Runnable{
    public  void run(){
        while (true) {
            System.out.println("Mrutyunjay"); 
            
        }
    }
}
