import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        System.out.println("Are the two words equal? " + (firstWord.equals(secondWord)));
        System.out.println("Are they equal ignoring case? " + firstWord.toLowerCase().equals(secondWord.toLowerCase()));

        scanner.close();
    }
}
