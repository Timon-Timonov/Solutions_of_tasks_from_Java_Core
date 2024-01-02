package tasksByBook.lesson18.task_72byBook;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Runner_72 {
    public static void main(String[] args) {
        Clazz cl = new Clazz();

        Class clazz = cl.getClass();
        Method[] methods = clazz.getDeclaredMethods();


        for (Method m : methods) {
            if (m.isAnnotationPresent(AcademyInfo.class)) {
                System.out.println(m.getName() + " has annatation @" + AcademyInfo.class.getSimpleName());
            } else {
                System.out.println(m.getName() + " has no annatation @" + AcademyInfo.class.getSimpleName());
            }

        }
    }
}
