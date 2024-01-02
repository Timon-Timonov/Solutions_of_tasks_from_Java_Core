package tasksFromLessons.lesson15$13_10_22$;

import java.util.Scanner;

public class Task_1Runner {
    public static final int PART_OF_ONE_TO_SAVE_COUNT = 1000;
    public static final int COUNT_OF_LINES_TO_ENTER = 10;
    public static final int COUNT_OF_FIELDS_IN_LINE = 4;

    public static void main(String[] args) {
        DataBase myBase = new DataBase("Buyer base");
        Scanner scanner = new Scanner(System.in);

/*
        example:
              1 Abuyer Aproduct 57.85
                2         Bbuyer    Bproduct   65,5565
                 3 Cbuyer cProduct 5
              4 Abuyer aproduct 507,1285
              5 Bbuyer  cproduct 6565
              6 Cbuyer dProduct 0.889
              7 Abuyer bproduct 0,52
              8 Bbuyer  Cproduct 0
              9 Cbuyer aProduct 951,12
              10 abuyer aProduct 0.588





  */
        for (int i = 0; i < COUNT_OF_LINES_TO_ENTER; i++) {
            String line = scanner.nextLine();
            String[] lineInArray = line.trim().toLowerCase().split("[[\\s]+[,.]?]+");
            if (lineInArray.length < COUNT_OF_FIELDS_IN_LINE || lineInArray.length > COUNT_OF_FIELDS_IN_LINE+1) {
                System.out.println("It is invalid Line!");
                continue;
            }

            String buyerName = lineInArray[1];
            String productName = lineInArray[2];
            double price;

            if (lineInArray.length == COUNT_OF_FIELDS_IN_LINE+1) {
                String priceStr = (lineInArray[3] + "." + lineInArray[4]);
                price = Double.valueOf(priceStr);
            } else {
                price = Double.valueOf(lineInArray[3]);
            }


            Buyer buyer = new Buyer(buyerName);
            Product product = new Product(productName, price);
            myBase.addLine(buyer, product);
        }


        System.out.println("All created database:");
        myBase.printDataBase();


    }
}
