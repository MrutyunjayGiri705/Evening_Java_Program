public class Operators {
    public static void main(Strings_Java[] args) {
        int a=10;
        int b=202;
        int sum=a+b;
        System.out.println("Sum: " + sum);
        int diff=a-b;
        System.out.println("Difference: " + diff);
        int prod=a*b;
        System.out.println("Product: " + prod);
        int quot=a/b;
        System.out.println("Quotient: " + quot);
        int mod=a%b;
        System.out.println("Modulus: " + mod);
        System.out.println("Increment a: " + (++a));
        System.out.println("Decrement b: " + (--b));
        System.out.println("Logical AND (a>5 && b<5): " + (a>5 && b<5));
        System.out.println("Logical OR (a>5 || b<5): " + (a>5 || b<5));
        System.out.println("Logical NOT (!(a>5)): " + (!(a>5)));
        System.out.println("Equal (a==b): " + (a==b));
        System.out.println("Not Equal (a!=b): " + (a!=b));
        System.out.println("Greater Than (a>b): " + (a>b));
        System.out.println(2&3);
        System.out.println(2|3);
        System.out.println(2^3);
        System.out.println(2<<3);
        System.out.println(2>>3);
        System.out.println(2>>>3);
        int c = (a>b) ? a : b;
        System.out.println("Ternary Operator (c = (a>b) ? a : b): " + c);
    }
}