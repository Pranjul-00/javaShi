import java.util.Scanner;

public class SumOfIntegers {
    
    // Method 1: Using standard input (Scanner)
    public static void sumUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sum of Integers (Scanner Method) ===");
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        
        int sum = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        
        System.out.println("Sum = " + sum);
    }
    
    // Method 2: Using command line arguments (user input)
    public static void sumUsingArgs(String[] args) {
        System.out.println("\n=== Sum of Integers (Command Line Arguments) ===");
        if (args.length == 0) {
            System.out.println("No arguments provided!");
            return;
        }
        
        int sum = 0;
        System.out.print("Numbers: ");
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println("\nSum = " + sum);
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            // If command line arguments are provided
            sumUsingArgs(args);
        } else {
            // Otherwise use Scanner
            sumUsingScanner();
        }
    }
}
