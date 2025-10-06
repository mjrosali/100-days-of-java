import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num > 0) ? "The number is positive"
                : (num == 0) ? "The number is zero" : "The number is negative";
        System.out.println(result);

        scanner.close();
    }
}
