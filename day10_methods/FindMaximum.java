import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The greater number is: " + findMaximum(num1, num2));

        scanner.close();
    }

    static int findMaximum(int num1, int num2) {
        int result = num1 > num2 ? num1 : num2;
        return result;
    }
}
