package tasksByBook.lesson12.task_54byBook;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start.");
        int[] values = new int[ConstantConteiner.COUNT_OF_RANDOM_VALUES];
        fullArrayRandomValues(values);
        System.out.println(Thread.currentThread().getName() + " Contains array: " + Arrays.toString(values));

      //  synchronized (Integer.class) {
            try (
                    BufferedWriter br = new BufferedWriter(new FileWriter(ConstantConteiner.PATH_NAME, true)
                    )) {
                br.write("Array from " + Thread.currentThread().getName() + ": {");
                for (int i = 0; i < values.length; i++) {
                    if (i != values.length - 1) {
                        br.write(values[i] + ", ");
                    } else {
                        br.write(values[i]+"");
                    }
                }
                br.write("} \n");

            } catch (IOException e) {
                System.out.println("Array have not writen to file!");
                e.printStackTrace();
                return;
            }
            System.out.println(Thread.currentThread().getName() + " array have written to file successfully.");
       // }
        System.out.println(Thread.currentThread().getName() + " finish.");
    }


    private void fullArrayRandomValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(ConstantConteiner.MAX_VALUE_OF_RANDOM_VALUES + 1));
        }
    }
}
