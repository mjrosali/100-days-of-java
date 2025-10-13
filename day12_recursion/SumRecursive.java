import java.util.Scanner;

public class SumRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int startNum = 1;

        System.out.println(
                String.format("Sum of numbers from %d to %d is %d", startNum, num, sumFactorial(num, startNum)));

        scanner.close();
    }

    static int sumFactorial(int num, int startNum) {
        int result = 0;
        for (int i = startNum; i <= num; i++) {
            int next = i + 1;

            if (i == num) {
                break;
            } else if (i == startNum) {
                result = i + next;
            } else {
                result += next;
            }

        }

        return result;
    }
}
