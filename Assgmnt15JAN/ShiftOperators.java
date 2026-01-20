import java.util.Scanner;

public class ShiftOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded Numbers)");
        System.out.println("2. User Input (You enter the numbers)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");
            int number = 8;
            int shiftBy = 2;

            System.out.println("Original Number: " + number);
            System.out.println("Shifting by: " + shiftBy + " bits");

            int leftShift = number << shiftBy;
            int rightShift = number >> shiftBy;

            System.out.println("Left Shift (<<): " + leftShift);
            System.out.println("Right Shift (>>): " + rightShift);
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("Enter how many bits to shift: ");
            int shiftBy = scanner.nextInt();

            int leftShift = number << shiftBy;
            int rightShift = number >> shiftBy;

            System.out.println("Result of " + number + " << " + shiftBy + " is: " + leftShift);
            System.out.println("Result of " + number + " >> " + shiftBy + " is: " + rightShift);
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}