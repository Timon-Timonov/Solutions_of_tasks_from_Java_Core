package tasksByBook.lesson8.task_33byBook;

import java.util.Date;

public class CreditCard extends Card {
    private int maxCredit;

    public CreditCard(String holderName, Date validThrue, long cardNumber, int ccvCode, String currency, int maxCredit) {
        super(holderName, validThrue, cardNumber, ccvCode, currency);
        this.maxCredit = maxCredit;
    }

    public int getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(int maxCredit) {
        this.maxCredit = maxCredit;
    }

    @Override
    public boolean getMoney(int sumCash) {
        if ((super.getBalance() + this.maxCredit) >= sumCash) {
            super.setBalance(super.getBalance() - sumCash);
            return true;
        } else return false;
    }
}
