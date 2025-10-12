import java.util.Scanner;

public class DisplayInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        displayInfo(name);
        displayInfo(name, age);

        scanner.close();
    }

    static void displayInfo(String name) {
        System.out.println("Displaying info (String): Name - " + name);
    }

    static void displayInfo(String name, int age) {
        System.out.println(String.format("Displaying info (String, int): Name - %s, Age - %d", name, age));
    }
}
