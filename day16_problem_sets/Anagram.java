import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "rat";
        String word2 = "car";

        System.out.println("isAnagram: " + isAnagram(word1, word2));
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        HashMap<String, Integer> count = new HashMap<>();

        String[] s1Arr = s1.toLowerCase().split("");
        String[] s2Arr = s2.toLowerCase().split("");

        for (String s : s1Arr) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }

        for (String s : s2Arr) {
            if (count.containsKey(s)) {
                count.put(s, count.get(s) - 1);
            } else {
                return false;
            }
        }

        for (String k : count.keySet()) {
            if (count.get(k) != 0) {
                return false;
            }
        }

        return true;
    }
}
