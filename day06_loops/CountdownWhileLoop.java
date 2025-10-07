import java.util.Scanner;

public class CountdownWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int num = scanner.nextInt();

        while (num > 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("Blast off!");

        scanner.close();
    }
}
