import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(String.format("The square of %d is %d", num, calculateSquare(num)));
        scanner.close();
    }

    static int calculateSquare(int num) {
        return num * num;
    }
}
