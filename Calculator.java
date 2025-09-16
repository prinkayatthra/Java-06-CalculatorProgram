import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (choice == 4) {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
