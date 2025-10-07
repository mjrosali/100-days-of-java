import java.util.Scanner;

public class SumUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numStart = scanner.nextInt();
        int num = numStart;
        int iStart = 1;

        for (int i = iStart; i < 5; i++) {
            num += i;
        }

        System.out.println(String.format("Sum of numbers from %d to %d is %d\n" + //
                "", iStart, numStart, num));

        scanner.close();
    }
}
