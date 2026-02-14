public class Method {
    public static void sum(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    public static void main(String[] args) {
        int a=10,b=20;
      

        
        sum(a, b);

        Method mm=new Method();
        mm.add(10,20);

    }
    
}
