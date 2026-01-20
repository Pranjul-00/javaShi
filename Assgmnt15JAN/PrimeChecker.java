import java.util.Scanner;

public class PrimeChecker {
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        
        // Check odd divisors up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method 1: Using standard input (Scanner)
    public static void checkPrimeUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Prime Number Checker (Scanner Method) ===");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (isPrime(n)) {
            System.out.println(n + " is a PRIME number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
        
        // Display factors if not prime
        if (!isPrime(n) && n > 1) {
            System.out.print("Factors: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    
    // Method 2: Using command line arguments
    public static void checkPrimeUsingArgs(String[] args) {
        System.out.println("=== Prime Number Checker (Command Line Arguments) ===");
        if (args.length == 0) {
            System.out.println("No argument provided!");
            return;
        }
        
        int n = Integer.parseInt(args[0]);
        
        if (isPrime(n)) {
            System.out.println(n + " is a PRIME number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
        
        // Display factors if not prime
        if (!isPrime(n) && n > 1) {
            System.out.print("Factors: ");
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        if (args.length > 0) {
            checkPrimeUsingArgs(args);
        } else {
            checkPrimeUsingScanner();
        }
    }
}
