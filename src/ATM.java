public class ATM implements ATMINT{

    private Card card;
    private int attempts;

    public ATM() {
        this.attempts = 0;
    }

    @Override
    public void insertCard(Card card) {
        this.card = card;
        attempts = 0;
    }

    @Override
    public void ejectCard() {
        card = null;
    }

    @Override
    public boolean verifyPIN(int pin) {
        if (attempts < 2 && card != null && card.checkPIN(pin)){
            return true;
        }
        attempts++;
        return false;
    }

    @Override
    public void showUserInfo() {
        if (card != null){
            System.out.println("Owner name: " + card.getOwnerName());
            System.out.println("Account ID: " + card.getAccountID());
        }
    }

    @Override
    public double getCurrentBalance() {
        if (card != null){
            BankINT bank = new Bank();
            return bank.getBalance(card.getOwnerName());
        }
        return 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (card != null){
            BankINT bank = new Bank();
            bank.deposit(card.getOwnerName(), amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (card != null){
            BankINT bank = new Bank();
            bank.withdraw(card.getOwnerName(), amount);
        }
    }
}
