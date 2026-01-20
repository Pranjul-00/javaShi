import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded value)");
        System.out.println("2. User Input (You type the number)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");
            int number = 5;
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}