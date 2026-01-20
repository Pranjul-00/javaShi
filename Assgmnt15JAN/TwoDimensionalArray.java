import java.util.Scanner;

public class TwoDimensionalArray {

    // Method to display 2D array
    public static void displayArray(int[][] arr) {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method 1: Using standard input (Scanner)
    public static void arrayUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Two Dimensional Array (Scanner Method) ===");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Dynamically define 2D array
        int[][] arr = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        displayArray(arr);

        // Calculate sum of all elements
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // Method 2: Using predefined values (user input simulation)
    public static void arrayUsingPredefined() {
        System.out.println("=== Two Dimensional Array (Predefined Values) ===");

        // Example: 3x3 matrix
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        displayArray(arr);

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // Calculate row and column sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("predefined")) {
            arrayUsingPredefined();
        } else {
            arrayUsingScanner();
        }
    }
}
