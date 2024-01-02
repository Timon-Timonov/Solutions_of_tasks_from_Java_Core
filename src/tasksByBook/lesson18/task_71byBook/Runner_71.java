package tasksByBook.lesson18.task_71byBook;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner_71 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {


        Class clazz = Hello.class;
        Method method = clazz.getDeclaredMethod("printHelloWorld");

        if (!method.trySetAccessible()) {
            method.setAccessible(true);
        }

        Object my = clazz.getDeclaredConstructor().newInstance();

        method.invoke(my, null);

    }
}
