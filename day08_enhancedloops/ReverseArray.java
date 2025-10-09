import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String nums = scanner.nextLine();
        String[] numsArray = nums.split(" ");

        System.out.print("Reversed order: ");
        for (int i = numsArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numsArray[i]);
            } else {
                System.out.print(numsArray[i] + " ");
            }
        }

        scanner.close();
    }
}
