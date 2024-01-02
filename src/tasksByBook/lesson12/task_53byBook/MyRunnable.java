package tasksByBook.lesson12.task_53byBook;


import java.util.Arrays;
import java.util.Random;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start.");
        int[] values = new int[ConstantConteiner.COUNT_OF_RANDOM_VALUES];
        fullArray(values);
        System.out.println(Thread.currentThread().getName() + " Contains array: " + Arrays.toString(values));
        System.out.println(Thread.currentThread().getName()
                + ". Max value from list: "
                + getMaxValueFromArray(values));
        System.out.println(Thread.currentThread().getName() + " finish.");
    }


    private int getMaxValueFromArray(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    private void fullArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(ConstantConteiner.MAX_VALUE_OF_RANDOM_VALUES + 1));
        }
    }
}
