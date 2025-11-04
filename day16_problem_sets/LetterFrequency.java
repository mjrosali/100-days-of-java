import java.util.HashMap;

public class LetterFrequency {
    public static void main(String[] args) {
        String name = "Jenny Rosali";
        String[] nameArr = name.toLowerCase().split("");
        HashMap<String, Integer> letterStorage = new HashMap<>();

        for (int i = 0; i < nameArr.length; i++) {
            if (letterStorage.containsKey(nameArr[i])) {
                int count = letterStorage.get(nameArr[i]);
                count += 1;
                letterStorage.put(nameArr[i], count);
            } else {
                letterStorage.put(nameArr[i], 1);
            }
        }

        for (String letter : letterStorage.keySet()) {
            int count = letterStorage.get(letter);
            System.out.printf("letter: %s count: %d %n", letter, count);
        }

    }
}
