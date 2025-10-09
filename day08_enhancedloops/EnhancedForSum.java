import java.util.Scanner;

public class EnhancedForSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        String nums = scanner.nextLine();
        String[] numsArray = nums.split(" ");
        int total = 0;

        for (int i = 0; i < numsArray.length; i++) {
            int num = Integer.parseInt(numsArray[i]);
            total += num;
        }

        System.out.println("Sum of array elements: " + total);

        scanner.close();
    }
}
