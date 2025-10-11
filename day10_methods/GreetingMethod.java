import java.util.Scanner;

public class GreetingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        showGreeting(name);

        scanner.close();
    }

    static void showGreeting(String name) {
        System.out.println(String.format("Hello, %s! Welcome to Java Methods.", name));
    }
}
