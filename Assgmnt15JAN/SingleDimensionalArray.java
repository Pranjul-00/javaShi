import java.util.Scanner;

public class SingleDimensionalArray {
    
    // Method 1: Using standard input (Scanner) - Dynamic array definition
    public static void arrayUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Single Dimensional Array (Scanner Method) ===");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        // Dynamically define array
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Display array
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Calculate and display sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + (double)sum / arr.length);
    }
    
    // Method 2: Using command line arguments
    public static void arrayUsingArgs(String[] args) {
        System.out.println("=== Single Dimensional Array (Command Line Arguments) ===");
        if (args.length == 0) {
            System.out.println("No arguments provided!");
            return;
        }
        
        // Dynamically define array based on arguments
        int[] arr = new int[args.length];
        
        System.out.print("Array elements: ");
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        
        System.out.println("\nArray size: " + arr.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / arr.length);
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            arrayUsingArgs(args);
        } else {
            arrayUsingScanner();
        }
    }
}
