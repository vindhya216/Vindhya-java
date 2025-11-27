import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handle divide-by-zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally {
            // Close the scanner
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}