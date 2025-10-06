import java.util.Scanner;

public class ComparisonLogicalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        boolean result;

        result = num1 > num2;
        System.out.println("Is first greater than second? " + result);

        result = num1 < num2;
        System.out.println("Is first less than second? " + result);

        result = num1 == num2;
        System.out.println("Are they equal? " + result);

        result = num1 != num2;
        System.out.println("Are they not equal? " + result);

        result = (num1 > 0 && num2 > 0);
        System.out.println("Both greater than 0? " + result);

        result = (num1 > 10 || num2 > 10);
        System.out.println("At least one greater than 10? " + result);

        scanner.close();
    }
}
