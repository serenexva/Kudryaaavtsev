public class Card implements CardINT{

    private String cardNumber;
    private int pin;
    private String ownerName;
    private String accountID;

    public Card(String cardNumber, int pin, String ownerName, String accountID){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.ownerName = ownerName;
        this.accountID = accountID;
    }

    @Override
    public String getCardNumber(){
        return cardNumber;
    }

    @Override
    public boolean checkPIN(int pin){
        return this.pin == pin;
    }

    @Override
    public String getOwnerName(){
        return ownerName;
    }

    @Override
    public String getAccountID(){
        return accountID;
    }
}


