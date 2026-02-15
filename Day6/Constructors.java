public class Constructors {
    public static void main(String[] args) {
        A obj = new A(101, "Mrutyunjay"); 
        obj.display();  
    }
    
}
class A{
    int id;
    String name;
    A(int i, String n){ 
        id = i;
        name = n;
}
void display(){  // Method to display values
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);    
}}