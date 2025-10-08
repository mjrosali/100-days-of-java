import java.util.Scanner;

public class ArrayPrintDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        String nums = scanner.nextLine();

        String[] numsArray = nums.split(" ");

        System.out.print("You entered: ");
        for (int i = 0; i < numsArray.length; i++) {
            if (i == numsArray.length - 1) {
                System.out.print(numsArray[i]);
            } else {
                System.out.print(numsArray[i] + " ");
            }
        }
        System.out.println(" ");

        scanner.close();
    }
}
