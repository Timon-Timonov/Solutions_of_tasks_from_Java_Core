package tasksByBook.lesson16;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ExampleFromBook {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("LocalDate:");
        System.out.println("стандартный формат даты для LocalDate:" + date);
        //свой формат
        System.out.println("свой формат "+date.format(DateTimeFormatter.ofPattern("d:MM:yy")));
        System.out.println("BASIC_ISO_DATE "+date.format(DateTimeFormatter.BASIC_ISO_DATE));
        LocalDate superDate=LocalDate.of(2023, Month.FEBRUARY,5);
        System.out.println(superDate);
        System.out.println();



        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime");
        //стандартный формат даты
        System.out.println("стандартный формат даты LocalDateTime: " + dateTime);

        //свой формат
        System.out.println("свой формат "+dateTime.format(DateTimeFormatter.ofPattern("dd::M::uu HH::m::s")));
        System.out.println("BASIC_ISO_DATE "+dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println();

        System.out.println("LocalTime");
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("h:m:s:")));
        System.out.println();

        Instant timestamp = Instant.now();
        System.out.println("Instant:");
        //стандартный формат даты
        System.out.println("Стандартный формат: " + timestamp);



    }
}
