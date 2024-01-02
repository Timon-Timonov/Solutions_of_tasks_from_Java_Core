package tasksByBook.lesson15.task_62byBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Runner_62 {

    public static final int MIN_AGE_OF_PERSON = 15;
    public static final int MAX_AGE_OF_PERSON = 30;
    public static final int COUNT_OF_PERSON = 100;
    public static final String[] NAMES = {"Bill",
            "Jhon",
            "Bob",
            "Mike",
            "Enricke",
            "Kalvin",
            "Maks",
            "Edvard",
            "Nikola",
            "Boris",};
    public static final String[] SURNAMES = {"Brown",
            "Gold",
            "Petrov",
            "Sidorov",
            "Pushkin",
            "Klinton",
            "Trump",
            "Franklin",
            "Ivanov",
            "Bublikov",};


    public static void main(String[] args) {
        Random random = new Random();

        List<Person> list = new ArrayList<>();
        PersonFactory<Person> factory = Person::new;

        for (int i = 0; i < COUNT_OF_PERSON; i++) {
            list.add(factory.create(
                    NAMES[random.nextInt(NAMES.length)],
                    SURNAMES[random.nextInt(NAMES.length)],
                    random.nextInt(MAX_AGE_OF_PERSON
                            - MIN_AGE_OF_PERSON + 1)
                            + MIN_AGE_OF_PERSON));
        }

        int i = 1;
        for (Person p : list) {
            System.out.println(i++ + ") \t" + p.toString());
        }


        List<String> surnamesList =
                list.stream()
                        .filter((p) -> (p.getAge() < 21))
                        .peek(System.out::println)
                        .sorted(Comparator
                                .comparing(Person::getSurName)
                                .thenComparing(Person::getName))
                        .limit(4)
                        .map(Person::getSurName)
                        .collect(Collectors.toList());

        int count = 1;
        for (String p : surnamesList) {
            System.out.println(count++ + ") \t" + p.toString());
        }
    }


}
