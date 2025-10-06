import java.util.Scanner;

public class ComparisonLogicalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        scanner.nextLine(); // consumer

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        scanner.nextLine(); // consumer

        boolean result;

        result = num1 > num2 ? true : false;
        System.out.println("Is first greater than second? " + result);

        result = num1 < num2 ? true : false;
        System.out.println("Is first less than second? " + result);

        result = num1 == num2 ? true : false;
        System.out.println("Are they equal? " + result);

        result = num1 != num2 ? true : false;
        System.out.println("Are they not equal? " + result);

        result = (num1 > 0 && num2 > 0) ? true : false;
        System.out.println("Both greater than 0? " + result);

        result = (num1 > 10 || num2 > 10) ? true : false;
        System.out.println("At least one greater than 10? " + result);
    }
}
