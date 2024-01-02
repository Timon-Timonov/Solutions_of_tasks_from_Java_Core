package tasksByBook.lesson5;

public class Task_20byBook {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }
        System.out.println();

        int max = array[0];
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println("Index of first max element: " + indexMax + ".");
    }
}
