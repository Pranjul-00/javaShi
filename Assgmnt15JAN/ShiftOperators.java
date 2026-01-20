import java.util.Scanner;

public class ShiftOperators {

    // Method to demonstrate shift operators
    public static void demonstrateShifts(int num, int positions) {
        System.out.println("\nOriginal number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));

        // Left shift
        int leftShift = num << positions;
        System.out.println("\nLeft Shift (" + num + " << " + positions + "):");
        System.out.println("Result: " + leftShift);
        System.out.println("Binary: " + Integer.toBinaryString(leftShift));
        System.out.println("Equivalent to: " + num + " * 2^" + positions + " = " + leftShift);

        // Right shift
        int rightShift = num >> positions;
        System.out.println("\nRight Shift (" + num + " >> " + positions + "):");
        System.out.println("Result: " + rightShift);
        System.out.println("Binary: " + Integer.toBinaryString(rightShift));
        System.out.println("Equivalent to: " + num + " / 2^" + positions + " = " + rightShift);

        // Unsigned right shift
        int unsignedRightShift = num >>> positions;
        System.out.println("\nUnsigned Right Shift (" + num + " >>> " + positions + "):");
        System.out.println("Result: " + unsignedRightShift);
        System.out.println("Binary: " + Integer.toBinaryString(unsignedRightShift));
    }

    // Method 1: Using standard input (Scanner)
    public static void shiftsUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Shift Operators Demo (Scanner Method) ===");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter number of positions to shift: ");
        int positions = sc.nextInt();

        demonstrateShifts(num, positions);
    }

    // Method 2: Using command line arguments
    public static void shiftsUsingArgs(String[] args) {
        System.out.println("=== Shift Operators Demo (Command Line Arguments) ===");
        if (args.length < 2) {
            System.out.println("Please provide two arguments: number and positions");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int positions = Integer.parseInt(args[1]);

        demonstrateShifts(num, positions);
    }

    public static void main(String[] args) {
        if (args.length >= 2) {
            shiftsUsingArgs(args);
        } else {
            shiftsUsingScanner();
        }

        // Additional examples
        String separator = "";
        for (int i = 0; i < 50; i++)
            separator += "=";
        System.out.println("\n" + separator);
        System.out.println("PRACTICAL EXAMPLES:");
        System.out.println(separator);

        // Example 1: Multiply by 2 using left shift
        int x = 5;
        System.out.println("\nMultiply " + x + " by 2: " + x + " << 1 = " + (x << 1));

        // Example 2: Divide by 4 using right shift
        int y = 20;
        System.out.println("Divide " + y + " by 4: " + y + " >> 2 = " + (y >> 2));

        // Example 3: Check if number is even or odd
        int z = 7;
        System.out.println("\nCheck if " + z + " is even: (" + z + " & 1) == 0 ? " + ((z & 1) == 0));
    }
}
