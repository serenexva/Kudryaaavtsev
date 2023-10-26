public class User {

    private String username;
    private String accountID;
    private double balance;

    public User(String username, String accountID, double balance) {
        this.username = username;
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
