import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        fibonacci(terms);

        System.out.println(
                "Fibonacci Series: " + fibonacci(terms).toString().replace("[", "").replace("]", "").replace(",", ""));

        scanner.close();
    }

    static List fibonacci(int terms) {
        int result = 0;
        int prev = 0;
        int next = 0;

        List<Integer> fibList = new ArrayList<>();

        for (int i = fibList.size(); fibList.size() < terms; i++) {

            // 0 1 1 2 3 5 8 13
            // i:0 prev:0 + next:1 = result:1 -> prev=next(1) next=result
            // i:1 prev:1 + next:1 = result:2
            // i:2 prev:1 + next:2 = result:3

            if (i == 0) {
                prev = i;
                fibList.add(prev);
                next = i + 1;
                fibList.add(next);
                result = prev + next;
                fibList.add(result);
            } else {
                prev = next;
                next = result;
                result = prev + next;
                fibList.add(result);
            }

        }
        return fibList;
    }
}
