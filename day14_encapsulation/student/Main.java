import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter name: ");
        s.setName(scanner.nextLine());

        System.out.print("Enter grade: ");
        s.setGrade(scanner.nextInt());

        System.out.printf("Student Name: %s%n", s.getName());
        System.out.printf("Student Grade: %d%n", s.getGrade());

        scanner.close();
    }
}
