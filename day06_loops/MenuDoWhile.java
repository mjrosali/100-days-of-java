import java.util.Random;
import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.println("3. Display a random number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consumer

            switch (choice) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.println("Goodbye");
                    break;
                case 3:
                    int randomNumber = (int) (Math.random() * 10) + 1;
                    System.out.println("Random Number: " + randomNumber);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    break;
            }

        } while (true);
    }
}
