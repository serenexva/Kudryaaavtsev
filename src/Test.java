public class Test {
    public static void main(String[] args) {
        User user = new User("Boba", "391512", 1000.0);
        User user1 = new User("Biba", "284914", 10000.4);
        Card card = new Card("1234 5678 9012", 1234, "Boba", "391512");
        Card card1 = new Card("2109 8765 4321", 4321, "Biba", "284914");
        Bank bank = new Bank();
        ATM atm = new ATM();

        System.out.println(card.checkPIN(1111));
        bank.addUser(user.getUsername(), user.getAccountID(), user.getBalance());
        bank.addUser(user1.getUsername(), user1.getAccountID(), user1.getBalance());

        atm.insertCard(card);
        atm.showUserInfo();

        if (bank.userExists(user.getUsername()) && card.checkPIN(1234)) {
            System.out.println(user.getBalance());
            bank.deposit(user.getUsername(), 5000.5);
            user.setBalance(bank.getBalance(user.getUsername()));
            System.out.println(user.getBalance());
        }

        atm.ejectCard();
        System.out.println("------");

        atm.insertCard(card1);
        atm.showUserInfo();

        if (bank.userExists(user1.getUsername()) && card1.checkPIN(4321)) {
            System.out.println(user1.getBalance());
            bank.withdraw(user1.getUsername(), 1000.4);
            user1.setBalance(bank.getBalance(user1.getUsername()));
            System.out.println(user1.getBalance());
        }
    }
}