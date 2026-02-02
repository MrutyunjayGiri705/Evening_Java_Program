import java.util.Scanner;

public class Else_If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();

        if (age>56) {
            System.out.println("Old");
            
        }
        else if (age<30) {
            System.out.println("Young");
            
        }
        else if (age<15) {
            System.out.println("Boy");
            
        }
        else{
            System.out.println("Child");
        }
    }
    
}
