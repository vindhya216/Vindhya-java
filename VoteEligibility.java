public class VoteEligibility {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int age = -1;
        while (age < 0) {
            System.out.print("Enter your age: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // consume invalid token
                continue;
            }
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("Invalid age. Please enter a non-negative number.");
            }
        }
        System.out.println(age >= 18 ? "You are eligible to vote." : "You are not eligible to vote.");
        sc.close();
    }
}