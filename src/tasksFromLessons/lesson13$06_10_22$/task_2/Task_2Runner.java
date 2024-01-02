package tasksFromLessons.lesson13$06_10_22$.task_2;

import java.util.*;

public class Task_2Runner {

    public static final int COUNT_OF_BOXES = 10;
    public static final int MAX_WEIGHT_OF_BOX = 5;
    public static final int MAX_VOLUME_OF_BOX = 10;

    public static void main(String[] args) {
        List<HeavyBox> heavyBoxes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < COUNT_OF_BOXES; i++) {
            heavyBoxes.add(new HeavyBox(random.nextInt(MAX_WEIGHT_OF_BOX - 1) + 1,
                    random.nextInt(MAX_VOLUME_OF_BOX - 1) + 1));
        }
        System.out.println("Created list: ");
        printList(heavyBoxes);

        heavyBoxes.get(0)
                .setWeight(heavyBoxes.get(0).getWeight() + 1);
        heavyBoxes.remove(heavyBoxes.size() - 1);
        System.out.println("List after changes: ");
        printList(heavyBoxes);

        HeavyBox[] boxesArray_1 = new HeavyBox[heavyBoxes.size()];
        HeavyBox[] boxesArray_2 = new HeavyBox[heavyBoxes.size()];
        HeavyBox[] boxesArray_3 = new HeavyBox[heavyBoxes.size()];
        HeavyBox[] boxesArray_4 = new HeavyBox[heavyBoxes.size()];

        heavyBoxes.toArray(boxesArray_1);//1)

        int i = 0;
        for (HeavyBox box : heavyBoxes) {//2)
            boxesArray_2[i++] = box;
        }

        i = 0;
        Iterator<HeavyBox> iterator = heavyBoxes.iterator();
        while (iterator.hasNext()) {
            boxesArray_4[i++] = iterator.next();
        }


        for (int j = 0; j < boxesArray_3.length; j++) {//3)
            boxesArray_3[j] = heavyBoxes.get(j);
        }


        System.out.println("boxesArray_1: ");
        printArray(boxesArray_1);
        System.out.println("boxesArray_2: ");
        printArray(boxesArray_2);
        System.out.println("boxesArray_3: ");
        printArray(boxesArray_3);
        System.out.println("boxesArray_4: ");
        printArray(boxesArray_4);

        heavyBoxes.clear();
        System.out.println("Cleared list:");
        printList(heavyBoxes);


    }


    private static void printList(List<HeavyBox> list) {
        int count = 1;
        for (HeavyBox box : list) {
            System.out.println((count++) + ") " + box);
        }
        System.out.println();
    }


    private static void printArray(HeavyBox[] list) {
        int count = 1;
        for (HeavyBox box : list) {
            System.out.println((count++) + ") " + box);
        }
        System.out.println();
    }
}
