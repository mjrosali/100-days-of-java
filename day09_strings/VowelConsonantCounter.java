import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        String[] wordArray = word.split("");
        int vowelCount = 0;
        int consonantCount = 0;

        for (String string : wordArray) {
            String s = string.toLowerCase();
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);

        scanner.close();
    }
}