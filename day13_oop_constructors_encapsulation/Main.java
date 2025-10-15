import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter payer: ");
        String payer = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(payer, amount, category);

        expense.displayExpense();

        scanner.close();
    }
}
