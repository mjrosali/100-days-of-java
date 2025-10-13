import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(String.format("Factorial of %d is %d", num, factorial(num)));

        scanner.close();
    }

    static int factorial(int num) {
        int result = 0;
        for (int i = num; i > 0; i--) {
            int next = i - 1;

            if (next == 0) {
                break;
            } else if (i == num) {
                result = num * next;
            } else {
                result *= next;
            }
        }

        return result;
    }
}
