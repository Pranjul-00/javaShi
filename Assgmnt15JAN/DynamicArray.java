import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded Array)");
        System.out.println("2. User Input (Dynamic Array)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");

            int[] numbers = { 10, 20, 30, 40, 50 };

            System.out.print("Array Elements: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Enter " + size + " integers:");

            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            System.out.print("You entered: ");
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}