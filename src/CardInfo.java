public class CardInfo {
    private String owner;
    private String cardNumber;
    private String cardPassword;
    private double money;

    public CardInfo(String owner,String cardNumber, String cardPassword, double money) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
