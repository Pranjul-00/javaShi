import java.util.Scanner;

public class DecimalToBinary {

    // Method to convert decimal to binary
    public static String convertToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        int num = decimal;

        while (num > 0) {
            binary.insert(0, num % 2);
            num = num / 2;
        }

        return binary.toString();
    }

    // Alternative method using built-in function
    public static String convertToBinaryBuiltIn(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Method 1: Using standard input (Scanner)
    public static void convertUsingScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Decimal to Binary Converter (Scanner Method) ===");
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = convertToBinary(decimal);
        String binaryBuiltIn = convertToBinaryBuiltIn(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (Manual): " + binary);
        System.out.println("Binary (Built-in): " + binaryBuiltIn);
    }

    // Method 2: Using command line arguments
    public static void convertUsingArgs(String[] args) {
        System.out.println("=== Decimal to Binary Converter (Command Line Arguments) ===");
        if (args.length == 0) {
            System.out.println("No argument provided!");
            return;
        }

        int decimal = Integer.parseInt(args[0]);
        String binary = convertToBinary(decimal);
        String binaryBuiltIn = convertToBinaryBuiltIn(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary (Manual): " + binary);
        System.out.println("Binary (Built-in): " + binaryBuiltIn);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            convertUsingArgs(args);
        } else {
            convertUsingScanner();
        }
    }
}
