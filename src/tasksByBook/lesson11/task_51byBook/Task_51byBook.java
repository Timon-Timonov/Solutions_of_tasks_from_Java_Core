package tasksByBook.lesson11.task_51byBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_51byBook {
    public static void main(String[] args) {
        Random random = new Random();
        List<Person> listWithPersons = new ArrayList<Person>();
        for (int i = 0; i < ConstantConteiner.COUNT_OF_PERSONS; i++) {
            listWithPersons.add(createPersonWithRandomFilds(random));
        }

        System.out.println("Created persons:");
        printListWithPersons(listWithPersons);
        System.out.println();

        writePersonsToFile(ConstantConteiner.PATH_NAME_FOR_FILE_WITH_PERSONS, listWithPersons);

        List<Person> personsFromFile = readPersonsFromFile(ConstantConteiner.PATH_NAME_FOR_FILE_WITH_PERSONS);

        System.out.println("Persons wich read from file:");
        printListWithPersons(listWithPersons);
        System.out.println();


    }

    private static Person createPersonWithRandomFilds(Random r) {
        Person person = new Person(
                ConstantConteiner.names[r.nextInt(ConstantConteiner.names.length)],
                ConstantConteiner.surnames[r.nextInt(ConstantConteiner.surnames.length)],
                r.nextInt(ConstantConteiner.MAX_AGE_OF_PERSON + 1)
        );

        return person;
    }

    private static void printListWithPersons(List<Person> list) {
        int count = 1;
        for (Person p : list) {
            System.out.println(count++ + ")\t" + p.toString());
        }
    }

    private static void writePersonsToFile(String path, List<Person> list) {
        File file = new File(path);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(file)))) {

            for (Person p : list) {
                oos.writeObject(p);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Person> readPersonsFromFile(String path) {
        List<Person> list = new ArrayList<>();

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(path)))) {

            while (true) {
                try {
                    Person readPerson = (Person) ois.readObject();
                } catch (EOFException e) {
                    break;
                }
                list.add((Person) ois.readObject());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


}
