import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bA = new BankAccount();

        System.out.print("Enter account number: ");
        bA.setAccountNumber(scanner.nextInt());

        System.out.print("Enter initial balance: ");
        bA.setBalance(scanner.nextDouble());

        bA.displayAccountSummary();

        scanner.close();
    }
}
