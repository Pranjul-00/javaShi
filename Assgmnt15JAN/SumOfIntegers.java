import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to add?: ");
        int count = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of the numbers is: " + sum);

        scanner.close();
    }
}