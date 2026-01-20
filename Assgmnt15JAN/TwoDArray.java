import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Standard Input (Fixed 3x3 Grid)");
        System.out.println("2. User Input (You define the grid size)");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\n--- Standard Input Mode ---");

            int[][] grid = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };

            System.out.println("The hardcoded grid looks like this:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }

        else if (choice == 2) {
            System.out.println("\n--- User Input Mode ---");

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter number of columns: ");
            int cols = scanner.nextInt();

            int[][] grid = new int[rows][cols];

            System.out.println("Enter the numbers for your grid:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter value for Row " + i + " Column " + j + ": ");
                    grid[i][j] = scanner.nextInt();
                }
            }

            System.out.println("\nYour grid looks like this:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }

        else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}