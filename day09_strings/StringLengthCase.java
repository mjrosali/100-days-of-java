import java.util.Scanner;

public class StringLengthCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Original: " + word);
        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowercase: " + word.toLowerCase());

        scanner.close();
    }
}
