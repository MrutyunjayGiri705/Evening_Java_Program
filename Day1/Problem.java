import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the marks in Odia:");
        int Odia=sc.nextInt();
         System.out.println("Enter the marks in English:");
         int English=sc.nextInt();
          System.out.println("Enter the marks in Science:");
          int Science=sc.nextInt();
           System.out.println("Enter the marks in Hindi:");
           int Hindi=sc.nextInt();
           int totalMarks=Odia+English+Science+Hindi;
            double totalPercentage = (totalMarks / 400.0) * 100;

            
           System.out.println("Total Percentage:"+totalPercentage);
    }
    
}
