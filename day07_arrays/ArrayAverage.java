import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        String numString = scanner.nextLine();
        String[] numArray = numString.split(" ");

        double sumTotal = 0;

        for (String s : numArray) {
            double num = Double.parseDouble(s);
            sumTotal += num;
        }
        System.out.println("Average: " + (sumTotal / numArray.length));
        scanner.close();
    }
}
