package tasksByBook.lesson3;

public class Task_9byBook {

    static int day = 29;
    static int mounth = 2;
    static int year =2020;


    public static void main(String[] args) {
        if (!isInvaliDate(day, mounth, year)) {
            System.out.println("The date " + day + "\\" + mounth + "\\" + year + " is invalid!");
            return;
        }
        System.out.println("The date is: " + day + "\\" + mounth + "\\" + year + ".");
        printNextDay(day, mounth, year);
    }

    public static boolean isInvaliDate(int day, int mounth, int year) {

        boolean isLeapYear = false;

        if (year < 0) {
            return false;
        }

        if (mounth < 1 || mounth > 12) {
            return false;
        }

        if (day < 1 || day > 31) {
            return false;
        } else {
            if (mounth == 4 || mounth == 6 || mounth == 9 || mounth == 11) {
                if (day == 31) {
                    return false;
                }
            } else if (mounth == 2) {

                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    isLeapYear = true;
                }
                if ((isLeapYear) && (day > 29)) {
                    return false;
                } else if (!isLeapYear && (day > 28)) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void printNextDay(int day, int mounth, int year) {
        day++;
        if (isInvaliDate(day, mounth, year)) {
            System.out.println("Next date will: " + day + "\\" + mounth + "\\" + year + ".");
        } else {
            if (mounth != 12) {
                day = 1;
                mounth++;
                System.out.println("Next date will: " + day + "\\" + mounth + "\\" + year + ".");
            } else {
                day = 1;
                mounth = 1;
                year++;
                if(year>0){
                System.out.println("Next date will: " + day + "\\" + mounth + "\\" + year + ".");
                }else {
                    System.out.println("It is too long time to this year...");
                }
            }
        }
    }
}

