public class FizzBuzz {
    public static void main(String[] args) {
        int num = 15;
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0)
                result += "Fizz";
            if (i % 5 == 0)
                result += "Buzz";
            if (i % 3 != 0 && i % 5 != 0)
                result += i;
            result += " ";
        }
        System.out.println(result);

    }
}
