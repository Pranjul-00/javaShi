import java.util.Scanner;

public class Factorial {
    
    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
            return -1;
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    // Method 1: Using standard input (Scanner)
    public static void factorialUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Factorial Calculator (Scanner Method) ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        long result = calculateFactorial(n);
        if (result != -1) {
            System.out.println("Factorial of " + n + " = " + result);
        }
    }
    
    // Method 2: Using command line arguments
    public static void factorialUsingArgs(String[] args) {
        System.out.println("=== Factorial Calculator (Command Line Arguments) ===");
        if (args.length == 0) {
            System.out.println("No argument provided!");
            return;
        }
        
        int n = Integer.parseInt(args[0]);
        long result = calculateFactorial(n);
        if (result != -1) {
            System.out.println("Factorial of " + n + " = " + result);
        }
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            factorialUsingArgs(args);
        } else {
            factorialUsingScanner();
        }
    }
}
