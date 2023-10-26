public interface BankINT {

    void addUser(String username, String accountID, double balance);

    boolean userExists(String username);

    double getBalance(String username);

    void deposit(String username, double amount);

    void withdraw(String username, double amount);
}
