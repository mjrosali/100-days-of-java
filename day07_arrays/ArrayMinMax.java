import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");
        String nums = scanner.nextLine();
        String[] numsArray = nums.split(" ");

        int min = 0;
        int max = 0;

        for (int i = 0; i < numsArray.length; i++) {
            int num = Integer.parseInt(numsArray[i]);
            if (i == 0) {
                min = num;
                max = num;
            }
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}
