import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        switch (age) {
            case 0,1,2,3,4,5,6,7,8,9,70,11, 12:
                System.out.println("Child");
                
                break;
            case 18:
                System.out.println("Teenager");
            case 19:
                System.out.println("Adult");   
        
            default:
                System.out.println("Senior Citizen");
                break;
        }

        
    }
    
}
