package tasksByBook.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_63byBook {

    public static final int MIN_VALUE = 400;
    public static final int MAX_VALUE = 1500;
    public static final int N = 1000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
            list.add(i);
        }

        List<Integer> shortList = list.stream()
                .limit(N)
                .filter(s -> s % 3 == 0 && s % 5 == 0)
                .collect(Collectors.toList());


        /*for (Integer i : shortList) {
            System.out.println(i);

        }*/
        List<Integer> listAfterStream =
                IntStream.range(MIN_VALUE, MAX_VALUE)
                        .limit(N)
                        .filter(s -> s % 3 == 0)
                        .filter(s -> s % 5 == 0)
                        .peek(System.out::println)
                        .boxed()
                        .collect(Collectors.toList());


        System.out.println(listAfterStream.size());
    }
}
