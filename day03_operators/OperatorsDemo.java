import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine(); // consumer

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // consumer

        int result;

        // addition
        result = num1 + num2;
        System.out.println("Addition: " + result);

        // subtraction
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        // multiplication
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        // division
        result = num1 / num2;
        System.out.println("Division: " + result);

        // modulo
        result = num1 % num2;
        System.out.println("Division: " + result);

    }
}
