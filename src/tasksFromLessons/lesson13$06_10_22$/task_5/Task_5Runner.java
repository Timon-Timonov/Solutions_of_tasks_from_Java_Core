package tasksFromLessons.lesson13$06_10_22$.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_5Runner {

    public static final int COUNT_OF_DIFFERENT_PETS = 3;
    public static final String[] NAMES = new String[]{"Vska", "Markiz", "Kesha", "Gosha", "Rex", "Sharik", "Barbos", "Matroskin", "Gylik"};

    public static void main(String[] args) {
        Map<String, Pet> zoo = new HashMap<String, Pet>();
        List<Pet> pets = new ArrayList<Pet>();

        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        Pet pet3 = new Parrot();

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);

        for (int i = 0; i < NAMES.length; i += COUNT_OF_DIFFERENT_PETS) {
            for (int j = 0; j < COUNT_OF_DIFFERENT_PETS; j++) {
                zoo.put(NAMES[i + j], pets.get(j));
            }
        }

        System.out.println("All content of Zoo:");
        printAllContentOfZoo(zoo);
        System.out.println();
        System.out.println("All keys from Zoo:");
        printAllKeysOfZoo(zoo);
    }


    public static void printAllContentOfZoo(Map<String, Pet> zoo) {
        int i = 1;
        for (Map.Entry entry : zoo.entrySet()) {
            System.out.println(i++ + ") " + entry.getKey().toString() + " - "
                    + entry.getValue().getClass().getSimpleName());
        }
    }


    public static void printAllKeysOfZoo(Map<String, Pet> zoo) {
        int i = 1;
        for (String s : zoo.keySet()) {
            System.out.println(i++ + ") " + s);
        }
    }
}

