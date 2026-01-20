import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded values)");
        System.out.println("2. User Input (You type the numbers)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");

            int[] fixedNumbers = { 10, 20, 30, 40, 50 };
            int sum = 0;

            System.out.print("Calculating sum of: ");
            for (int num : fixedNumbers) {
                System.out.print(num + " ");
                sum += num;
            }

            System.out.println("\nTotal Sum: " + sum);
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");

            System.out.print("How many numbers do you want to add? ");
            int count = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= count; i++) {
                System.out.print("Enter number " + i + ": ");
                int number = scanner.nextInt();
                sum += number;
            }

            System.out.println("Total Sum: " + sum);
        }

        else {
            System.out.println("Invalid choice! Please restart and enter 1 or 2.");
        }

        scanner.close();
    }
}