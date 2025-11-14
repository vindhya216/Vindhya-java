import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5 only.");
        } else if (num % 11 == 0) {
            System.out.println(num + " is divisible by 11 only.");
        } else {
            System.out.println(num + " is not divisible by 5 or 11.");
        }

        sc.close();
    }
}