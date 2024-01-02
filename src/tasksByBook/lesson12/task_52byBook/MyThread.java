package tasksByBook.lesson12.task_52byBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start.");
        List<Integer> list = new ArrayList<>();
        fullList(list);
        System.out.println(Thread.currentThread().getName() + " Contains list: " + list.toString());
        System.out.println(Thread.currentThread().getName()
                + ". Average value from list: "
                + getAverageOfList(list));
        System.out.println(Thread.currentThread().getName() + " finish.");
    }


    private double getAverageOfList(List<Integer> list) {
        int sum = 0;
        int count = 0;
        for (Integer i : list) {
            sum += i;
            count++;
        }
        if (list.size() != 0) {
            return sum * 1d / count;
        } else return 0;
    }

    private void fullList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < ConstantConteiner.COUNT_OF_RANDOM_VALUES; i++) {
            list.add(random.nextInt(ConstantConteiner.MAX_VALUE_OF_RANDOM_VALUES + 1));
        }
    }

}