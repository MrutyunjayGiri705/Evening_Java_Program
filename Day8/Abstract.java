public class Abstract {
    public static void main(String[] args) {
      A obj;
      B obj1=new B();
      obj=obj1;
        obj.add();
        obj.sub();
    }
    
}
abstract class A{
    abstract public void add();
    abstract public void sub();

}
class B extends A{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("Addition: "+(a+b));

    }
    public void sub(){
        int a=20;
        int b=10;
        System.out.println("Subtraction: "+(a-b));
    }
}