import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        String nums = scanner.nextLine();
        String[] numsArray = nums.split(" ");
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < numsArray.length; i++) {
            int num = Integer.parseInt(numsArray[i]);
            if (num % 2 == 0) {
                evenNums += num + " ";
            } else {
                oddNums += num + " ";
            }
        }
        System.out.println("Even numbers: " + evenNums.trim());
        System.out.println("Odd numbers: " + oddNums.trim());

        scanner.close();
    }
}
