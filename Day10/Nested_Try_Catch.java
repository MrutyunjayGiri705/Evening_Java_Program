public class Nested_Try_Catch {
   
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            try {
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            try {
                int d = Integer.parseInt("xyz");
                System.out.println(d);
            } catch (NumberFormatException e) {
                System.out.println("Inner catch: " + e);
            }
        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }
    }
}


    

