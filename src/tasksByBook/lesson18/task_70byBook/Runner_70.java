package tasksByBook.lesson18.task_70byBook;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Runner_70 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        // Class clazz = Man.class;
        // ClassChecker.checkClass(clazz);

        toPlayWithMans();

    }

    private static void toPlayWithMans() throws NoSuchFieldException, IllegalAccessException {
        Set<Man> set = createSomaMans();

        //printAll(set);

        Field field = set.stream()
                .findFirst()
                .get()
                .getClass()
                .getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("The value of private fild: "+
                field.getType().getSimpleName() + " " +
                        field.getName() + "=" +
                        field.get(set.stream().findFirst().get()).toString());
        System.out.println();


        for (Man man : set) {
            System.out.println("Information about " + man.getSurName() + " with id=" + man.getId());
            Class exampleClass = man.getClass();
            Field[] fields = exampleClass.getFields();
            Field[] declFields = exampleClass.getDeclaredFields();
            Method[] methods = exampleClass.getMethods();
            Method[] declMethods = exampleClass.getDeclaredMethods();


            System.out.println("Class of inctance: " + exampleClass.getSimpleName());


            System.out.println("Filds: ");
            if (fields.length != 0) {
                for (int i = 0; i < fields.length; i++) {
                    Field f = fields[i];
                    System.out.println("\t" + (i + 1) + ") fild - " + f.getType().getSimpleName() + " " + f.getName() + ";");
                }
            } else {
                System.out.println("There is no filds.");
            }
            System.out.println();


            System.out.println("Methods: ");
            if (methods.length != 0) {
                for (int i = 0; i < methods.length; i++) {
                    Method m = methods[i];
                    System.out.println("\t" + (i + 1) + ") methd - " + m.getReturnType().getSimpleName() + " " + m.getName() +
                            "(" + parametersToStr(m.getParameterTypes()) + ");");

                }
            } else {
                System.out.println("There is no methods.");
            }
            System.out.println();


            System.out.println("Declared filds: ");
            if (declFields.length != 0) {
                for (int i = 0; i < declFields.length; i++) {
                    Field f = declFields[i];
                    System.out.println("\t" + (i + 1) + ") fild - " + f.getType().getSimpleName() + " " + f.getName() + ";");

                    if (i == 1) {
                        String fildName = f.getName();
                        Field field1 = man.getClass().getDeclaredField(fildName);
                        String simplName = field1.getType().getSimpleName();
                        if (simplName.equals(String.class.getSimpleName())) {
                            field1.setAccessible(true);
                            System.out.println("Current value: "+field1.get(man));
                            field1.set(man, "AAAAAAA");
                            System.out.println("SurName set in AAAAAA");
                            field1.setAccessible(false);
                        }
                    }


                }


            } else {
                System.out.println("There is no declared filds.");
            }
            System.out.println();


            System.out.println("Declared methods: ");
            if (declMethods.length != 0) {
                for (int i = 0; i < declMethods.length; i++) {
                    Method m = declMethods[i];
                    System.out.println("\t" + (i + 1) + ") methd - " + m.getReturnType().getSimpleName() + " " + m.getName() +
                            "(" + parametersToStr(m.getParameterTypes()) + ");");

                }
            } else {
                System.out.println("There is no declared methods.");
            }
            System.out.println();


            tryToInvokeMethod(man, "sayHello", new Class[]{String.class});

            System.out.println();
            System.out.println();

            printAll(set);
            return;
        }
    }

    private static void tryToInvokeMethod(Man man, String hell, Class[] parametrsClasses) {
        try {
            Method hello = man.getClass().getDeclaredMethod(hell, parametrsClasses);
            if (!hello.trySetAccessible()) {
                hello.setAccessible(true);
                hello.invoke(man, "I am here!");
                hello.setAccessible(false);
            } else {
                hello.invoke(man, "I am here!");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static Set<Man> createSomaMans() {
        int maxId = 9_999;
        String[] names = {"Ivan", "Gena", "Tom", "Roman"};
        String[] surNames = {"Groznii", "Vlasik", "Kruz", "Abramovich"};
        int minAge = 19;
        int maxAge = 65;
        String[] places = {"Moscow", "Minsk", "Vashington", "Piter"};
        String[] cities = {"Moscow", "Minsk", "HollyWood", "London"};

        Set<Man> set = new TreeSet<>();
        Random random = new Random();

        for (int i = 0; i < surNames.length; i++) {
            Man man = new Man(random.nextInt(maxId));
            set.add(man);
            man.setName(names[i]);
            man.setSurName(surNames[i]);
            man.setAge(random.nextInt(1 + maxAge - minAge) + minAge);
            man.setPlaceOfBirth(places[i]);
            man.setCity(cities[i]);
        }
        return set;
    }


    private static void printAll(Set<Man> set) {
        System.out.println("All created people: ");
        int i = 1;
        for (Man man : set) {
            System.out.println((i++) + ") " + man.toString());
        }
        System.out.println();
    }


    private static String parametersToStr(Class[] ar) {
        StringBuilder str = new StringBuilder();
        if (ar.length != 0) {
            for (int i = 0; i < ar.length; i++) {
                str.append(ar[i].getSimpleName());

                if (i != (ar.length - 1)) {
                    str.append(", ");
                }
            }
        }
        return str.toString();
    }
}
