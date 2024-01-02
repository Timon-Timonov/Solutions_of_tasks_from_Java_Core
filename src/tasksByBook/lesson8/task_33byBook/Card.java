package tasksByBook.lesson8.task_33byBook;

import java.util.Date;
import java.util.Objects;

public abstract class Card {
    private String holderName;
    private Date validThrue;
    private long cardNumber;
    private int pinNumber;
    private int ccvCode;
    private String currency;
    private int balance;

    public Card(String holderName, Date validThrue, long cardNumber, int ccvCode, String currency) {
        this.holderName = holderName;
        this.validThrue = validThrue;
        this.cardNumber = cardNumber;
        this.ccvCode = ccvCode;
        this.currency = currency;
    }

    public String getHolderName() {
        return holderName;
    }

    public Date getValidThrue() {
        return validThrue;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getCcvCode() {
        return ccvCode;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNumber == card.cardNumber &&
                holderName.equals(card.holderName) &&
                Objects.equals(validThrue, card.validThrue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holderName, validThrue, cardNumber);
    }

    public boolean getMoney(int sumCash) {
        if (balance >= sumCash) {
            balance -= sumCash;
            return true;
        } else return false;
    }

    public void depositMoney(int sum){
        balance=+sum;
    }
}
