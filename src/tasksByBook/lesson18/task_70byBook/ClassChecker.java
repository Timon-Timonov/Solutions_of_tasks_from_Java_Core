package tasksByBook.lesson18.task_70byBook;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassChecker {
    public static void checkClass(Class clazz) {


        Field[] fields = clazz.getDeclaredFields();//возвращает все поля в т. ч. приватные
        Method[] methods = clazz.getDeclaredMethods();//возвращает все методы объявленые в классе в т. ч. приватные


        System.out.println("Information about Class " + clazz.getSimpleName() + ":");

        System.out.println("\t\tMethods:");
        int count = 1;
        for (Method m : methods) {
            System.out.println("\t\t\t" + count++ + ")\t " + m.getReturnType().getSimpleName() + " " + m.getName() +
                    "(" +
                    getParameterTypesTostring(m.getParameterTypes())
                    + ");");
        }

        System.out.println();


        System.out.println("\t\tFilds:");
        count = 1;
        for (Field f : fields) {
            System.out.println("\t\t\t" + count++ + ")\t " + f.getType().getSimpleName() + " " + f.getName() + ";");
        }
    }

    private static String getParameterTypesTostring(Class[] classes) {
        StringBuilder str = new StringBuilder();
        for (Class clazz : classes) {
            str.append(clazz.getSimpleName());
            if (classes.length != 1) {
                str.append(", ");
            }
        }


        return str.toString();
    }
}
