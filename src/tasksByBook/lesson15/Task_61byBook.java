package tasksByBook.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task_61byBook {

    public static final int INCH_MIN_INCLUSIVE = 1;
    public static final int INCH_MAX_EXCLUSIVE = 21;
    public static final double FROM_INCH_TO_CM = 2.54;

    public static void main(String[] args) {

        //Without of stream:
        List<Double> list = new ArrayList<>();
        for (int i = INCH_MIN_INCLUSIVE; i < INCH_MAX_EXCLUSIVE; i++) {
            if (i % 2 == 0) {
                list.add(i * 1.0);
                System.out.println(i);
            }
        }
        Double sum = 0.;
        for (Double d : list) {
            d *= FROM_INCH_TO_CM;
            sum += d;
        }
        System.out.println(sum);

        //With stream:
        System.out.println(IntStream
                .range(INCH_MIN_INCLUSIVE, INCH_MAX_EXCLUSIVE)
                .filter((s) -> s % 2 == 0)
                .peek(System.out::println)
                .mapToObj((s) -> (s * FROM_INCH_TO_CM))
                .reduce((s1, s2) -> s1 + s2)
                .get());
    }
}
