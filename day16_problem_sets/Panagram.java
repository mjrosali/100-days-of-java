import java.util.HashMap;
import java.util.Map;

public class Panagram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        System.out.println("isPanagram: " + isPanagram(input));
    }

    static boolean isPanagram(String input) {
        input = input.toLowerCase().replace(" ", "");

        String letters = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> letterStorage = new HashMap<>();

        for (Character c : letters.toCharArray()) {
            for (Character ch : input.toCharArray()) {
                if (ch.equals(c)) {
                    letterStorage.put(c, letterStorage.getOrDefault(c, 0) + 1);
                } else {
                    letterStorage.put(c, letterStorage.getOrDefault(c, 0));
                }
            }
        }

        boolean isPanagram = true;

        for (Character c : letterStorage.keySet()) {
            if (letterStorage.get(c) < 1) {
                isPanagram = false;
                break;
            }
        }

        return isPanagram;
    }
}
