package tasksFromLessons.lesson14$11_10_22$.task_1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task_1Runner {

    public static final int COUNT_OF_STUDENTS = 10;
    public static final int MAX_GRADE = 5;
    public static final int MIN_GRADE = 2;
    public static String[] names = {"Tom", "Peter", "Gleb", "Ivan", "Max", "Donald", "Nike", "Bill", "Jack", "Jerry"};
    public static String[] groups = {"123", "256", "854", "966", "322"};
    public static int[] courses = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        Random random = new Random();

        Set<Student> set = new TreeSet<Student>();
        Set<Student> set1 = new TreeSet<Student>(new StudentComporator());

        for (int i = 0; set.size() < COUNT_OF_STUDENTS; i++) {
            int courseAndGroupIndex = random.nextInt(groups.length);
            Student student = (new Student(names[random.nextInt(names.length)],
                    groups[courseAndGroupIndex],
                    courses[courseAndGroupIndex],
                    random.nextInt(MAX_GRADE + 1 - MIN_GRADE) + MIN_GRADE));
            set.add(student);
            set1.add(student);
        }


        System.out.println("Students sorted by implements comparable:");
        printAllStudents(set);

        System.out.println();
        System.out.println("Students sorted by Comparator:");

        printAllStudents(set1);
    }


    public static void printAllStudents(Set<Student> set) {
        set.forEach(System.out::println);
    }
}
