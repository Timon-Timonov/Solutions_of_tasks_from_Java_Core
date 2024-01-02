package tasksByBook.lesson6;

import java.util.Scanner;

public class Task_25byBook {

    private int countOf_20;
    private int countOf_50;
    private int countOf_100;

    public Task_25byBook(int countOf_20, int countOf_50, int countOf_100) {
        this.countOf_20 = countOf_20;
        this.countOf_50 = countOf_50;
        this.countOf_100 = countOf_100;
    }

    public void addMoney(int countOf_20, int countOf_50, int countOf_100) {
        this.countOf_20 += countOf_20;
        this.countOf_50 += countOf_50;
        this.countOf_100 += countOf_100;
    }


    public int getTotalSum() {
        return countOf_20 * 20 + countOf_50 * 50 + countOf_100 * 100;
    }

    public int getCash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money you need?");
        int sum = scanner.nextInt();
        if (sum % 10 != 0) {
            System.out.println("false");
            System.out.println("Invalid sum");
            return -1;
        }
        if (sum < 20) {
            System.out.println("false");
            System.out.println("It is too little sum.");
            return -1;
        }
        if (sum > this.getTotalSum()) {
            System.out.println("false");
            System.out.println("It is huge amount of money.");
            return -1;
        }

        int x20 = 0;
        int x50 = 0;
        int x100 = 0;

        if (countOf_100 >= sum / 100) {
            x100 = sum / 100;
        } else {
            x100 = countOf_100;
        }
        sum = sum - 100 * x100;


        if (countOf_50 >= sum / 50) {
            x50 = sum / 50;
        } else {
            x50 = countOf_50;
        }
        sum = sum - 50 * x50;

        if (countOf_20 >= sum / 20) {
            x20 = sum / 20;
        } else {
            x20 = countOf_20;
        }
        sum = sum - 20 * x20;

        if (sum == 10) {
            if (x50 != 0 && ((countOf_20 - x20) >= 3)) {
                x50--;
                x20 += 3;
                sum = 0;
            } else if (x100 != 0 && (((countOf_50 - x50) > 0) & ((countOf_20 - x20) > 2))) {
                x100--;
                x50++;
                x20 += 3;
                sum = 0;
            } else {
                System.out.println("false");
                System.out.println("Choose another sum.");
                return -1;
            }
        }
        if (sum == 0) {
            System.out.println("true");
            System.out.println("Take your cash:" +
                    "banknote_20 - " + x20 +
                    ";  banknote_50 - " + x50 +
                    ";  banknote_100 - " + x100 + ".");
            countOf_20 -= x20;
            countOf_50 -= x50;
            countOf_100 -= x100;
            return 1;
        }
        return 1;
    }

}
