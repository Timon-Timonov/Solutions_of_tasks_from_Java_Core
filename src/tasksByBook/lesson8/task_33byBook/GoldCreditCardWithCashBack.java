package tasksByBook.lesson8.task_33byBook;

import java.util.Date;

public class GoldCreditCardWithCashBack extends CreditCard {
    private int cashBackPerCent;

    public GoldCreditCardWithCashBack(String holderName, Date validThrue, long cardNumber, int ccvCode, String currency, int maxCredit, int cashBackPerCent) {
        super(holderName, validThrue, cardNumber, ccvCode, currency, maxCredit);
        this.cashBackPerCent = cashBackPerCent;
    }

    public int getCashBackPerCent() {
        return cashBackPerCent;
    }

    public void setCashBackPerCent(int cashBackPerCent) {
        this.cashBackPerCent = cashBackPerCent;
    }

    @Override
    public boolean getMoney(int sumCash) {
        if ((super.getBalance() + super.getMaxCredit()) >= sumCash) {
            super.setBalance(super.getBalance() - sumCash + sumCash * cashBackPerCent / 100);
            System.out.println("Your cash back: " + (sumCash * cashBackPerCent / 100));
            return true;
        } else return false;
    }
}
