import java.util.Scanner;

public class Expense {
    private String payer;
    private double amount;
    private String category;

    public Expense(String payer, double amount, String category) {
        this.payer = payer;
        this.amount = amount;
        this.category = category;
    }

    // getter
    public String getPayer() {
        return this.payer;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCategory() {
        return this.category;
    }

    // setter
    public void setPayer(String payer) {
        this.payer = payer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void displayExpense() {
        System.out.println(
                String.format("Payer: %s | Amount: %.2f | Category: %s", getPayer(), getAmount(), getCategory()));
    }

}
