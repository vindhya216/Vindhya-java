import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int reverseNum = reverseNumber(num);
        int reverseSquare = reverseNumber(square);
        int squareOfReverse = reverseNum * reverseNum;

        if (reverseSquare == squareOfReverse) {
            System.out.println(num + " is an Adam number.");
        } else {
            System.out.println(num + " is not an Adam number.");
        }

        sc.close();
    }

    static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}