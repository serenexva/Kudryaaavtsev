import java.util.ArrayList;
import java.util.List;

public class Bank implements BankINT{
    private List<User> users;

    public Bank() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(String username, String accountID, double balance) {
        User user = new User(username, accountID, balance);
        users.add(user);
    }

    @Override
    public boolean userExists(String username) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    @Override
    public double getBalance(String username) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user.getBalance();
            }
        }
        return 0.0;
    }

    @Override
    public void deposit(String username, double amount) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                user.setBalance(user.getBalance() + amount);
                return;
            }
        }
    }

    @Override
    public void withdraw(String username, double amount) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                user.setBalance(user.getBalance() - amount);
                return;
            }
        }
    }
}
