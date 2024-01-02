package tasksByBook.lesson15.examples;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

import java.text.SimpleDateFormat;

public class CallableExample {
    public CallableExample() {
        // Определяем пул из трех потоков
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // Список ассоциированных с Callable задач Future
        List<Future<String>> futures = new ArrayList<>();

        // Создание экземпляра Callable класса
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++) {
            /*
             * Стартуем поток, возвращаюший результат исполнения
             * в виде объекта Future
             */
            Future<String> future = pool.submit(callable);
            /*
             * Добавляем объект Future в список для
             * отображения результат выполнения (получение
             * наименования потока)
             */
            futures.add(future);

          /*  try {
                System.out.println(new SimpleDateFormat("HH:mm:ss  ").format(new Date()) + future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }*/
        }


        for (Future<String> future : futures) {
            try {
                // Выводим в консоль полученное значение


                System.out.println(new SimpleDateFormat("HH:mm:ss  ").format(new Date()) + future.get());

            } catch (InterruptedException |
                    ExecutionException e) {
            }
        }
        // Останавливаем пул потоков
        pool.shutdown();
    }

    //-----------------------------------------------------
    // Класс, реализующий интерфейс Callable
    class CallableClass implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            // наименование потока, выполняющего
            // callable задачу
            return Thread.currentThread().getName();
        }
    }

    //-----------------------------------------------------
    public static void main(String args[]) {
        new CallableExample();
    }
}