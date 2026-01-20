import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded Number)");
        System.out.println("2. User Input (You enter the number)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");
            int number = 29;
            System.out.println("Checking if " + number + " is prime...");

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime number.");
            } else {
                System.out.println(number + " is NOT a Prime number.");
            }
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");
            System.out.print("Enter a number to check: ");
            int number = scanner.nextInt();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a Prime number.");
            } else {
                System.out.println(number + " is NOT a Prime number.");
            }
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}