public class Method_Overloading {
    void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    void add (int x,int y,int z){
        int c=x+y+z;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Method_Overloading mm=new Method_Overloading();
        mm.add(10,20, 10);
        mm.add(10, 20);
    }
    
}
