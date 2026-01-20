import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Hardcoded Number)");
        System.out.println("2. User Input (You enter the decimal number)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");
            int number = 10;
            System.out.println("Decimal number: " + number);

            System.out.print("Binary representation: ");
            int[] binaryNum = new int[32];
            int i = 0;

            if (number == 0) {
                System.out.print(0);
            } else {
                while (number > 0) {
                    binaryNum[i] = number % 2;
                    number = number / 2;
                    i++;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(binaryNum[j]);
                }
            }
            System.out.println();
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");
            System.out.print("Enter a decimal number: ");
            int number = scanner.nextInt();

            System.out.print("Binary representation: ");
            int[] binaryNum = new int[32];
            int i = 0;

            if (number == 0) {
                System.out.print(0);
            } else {
                while (number > 0) {
                    binaryNum[i] = number % 2;
                    number = number / 2;
                    i++;
                }
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(binaryNum[j]);
                }
            }
            System.out.println();
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}