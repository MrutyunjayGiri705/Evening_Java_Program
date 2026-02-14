import java.util.Scanner;

public class Multidimensional_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];  // 3x3 matrix

        // Input loop
        for (int i = 0; i < 3; i++) {   // use < instead of <=
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the number:");
                a[i][j] = sc.nextInt();
            }
        }

        // Output loop
        System.out.println("Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}