package tasksByBook.lesson16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;


public class Task_64byBook {

    public static final String EXIT_VALUE = "exit";
    public static final String INVALID_VALUE = "Invalid value!";
    public static final String ENTER_NUMBER_OF_MONTH = "Enter number of month of this year.";
    public static final int MIN_MONTH_VALUE_INCLUDE = 1;
    public static final int MAX_MONTH_VALUE_INCLUDE = 12;
    public static final String PATTERN_OF_DATE_OUT = "d::MMM::uuuu";
    public static final String IF_YOU_WANT_TO_CONTINUE_ENTER_Y = "If you want to continue enter \"Y\" ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (checkExit(scanner)) return;

        System.out.println(ENTER_NUMBER_OF_MONTH);

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase(EXIT_VALUE)) {
                return;
            } else {
                Integer month;
                try {
                    month = Integer.valueOf(line);
                    if (month < MIN_MONTH_VALUE_INCLUDE || month > MAX_MONTH_VALUE_INCLUDE) {
                        throw new NumberFormatException();
                    }
                } catch (NumberFormatException e) {
                    System.out.println(INVALID_VALUE);
                    System.out.println(ENTER_NUMBER_OF_MONTH);
                    continue;
                }
                printAlldatesOfThisMounth(month);
            }
            if (checkExit(scanner)) return;
            System.out.println(ENTER_NUMBER_OF_MONTH);
        }
    }

    private static boolean checkExit(Scanner scanner) {
        System.out.println(IF_YOU_WANT_TO_CONTINUE_ENTER_Y);
        String line = scanner.nextLine();
        if (!line.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }

    private static void printAlldatesOfThisMounth(int month) {
        LocalDate firstDayOfMonth = LocalDate.now()
                .with(TemporalAdjusters.firstDayOfMonth())
                .withMonth(month);//получаем текущий год,1-ое число, и вводим нужный месяц
        LocalDate lastDayOfMonth = firstDayOfMonth.with(TemporalAdjusters.lastDayOfMonth());//последнее число нужного месяца
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_OF_DATE_OUT);//определяем формат вывода

        for (int i = firstDayOfMonth.getDayOfMonth(); i <= lastDayOfMonth.getDayOfMonth(); i++) {
            System.out.println(i + ") " + firstDayOfMonth.withDayOfMonth(i).format(formatter));
        }
    }
}
