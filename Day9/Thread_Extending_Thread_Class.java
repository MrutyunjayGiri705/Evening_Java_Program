public class Thread_Extending_Thread_Class {
    public static void main(String[] args) {
        A aa=new A();
        B bb=new B();
        aa.start();
        bb.start();
    }
    
}
class A extends Thread{
    public  void  run(){
    
    while(true){
        System.out.println("Giri");
     }
}}
class B extends Thread{
    public  void  run(){
    while(true){
        System.out.println("Mrutyunjay");
    }
}}

