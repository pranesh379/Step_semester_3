public class MessWallet {
    private double balance;

    public MessWallet(double balance) {
        if (balance < 0) {
            System.out.println("Warning: Negative balance not allowed. Starting with 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid top-up amount.");
        } else {
            balance += amount;
            System.out.println("Top-up successful. Balance: " + balance);
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Deduction successful. Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        wallet.deduct(100);
        wallet.deduct(700);
    }
}
