package tasksByBook.lesson5;

public class Task_18byBook {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
       /* for (int element : array) {
            System.out.println(element);
        }*/

        System.out.println(array[array.length - 1]);
    }
}
