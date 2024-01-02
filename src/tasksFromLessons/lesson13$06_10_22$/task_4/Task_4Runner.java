package tasksFromLessons.lesson13$06_10_22$.task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Task_4Runner {

    public static final int MAX_COURSE = 5;
    public static final int COUNT_OF_GROUPS = 6;
    public static final int MAX_GRADE = 5;
    public static final int COUNT_OF_STUDENTS = 30;
    public static final int MIN_POSITIVE_GRADE = 3;
    public static final int COURSE_TO_METHOD = 3;

    public static void main(String[] args) {
        String[] names = {"Tom", "CAT", "maouse", "Jerry", "DOG", "Frog", "Bill", "Gena", "Chebyrashka", "Anton"};
        Random random = new Random();
        List<Student> groupOfStudents = new ArrayList<Student>();

        for (int i = 0; i < COUNT_OF_STUDENTS; i++) {
            groupOfStudents.add(new Student(names[random.nextInt(names.length)],
                    random.nextInt(MAX_COURSE - 1) + 1,
                    random.nextInt(COUNT_OF_GROUPS) + 1,
                    random.nextInt(MAX_GRADE) + 1));
        }
        System.out.println("List of all created students:");
        printGroup(groupOfStudents);

        System.out.println();

        goToNextCourseOrArmy(groupOfStudents);
        System.out.println("List of students after delete and nextCourse:");
        printGroup(groupOfStudents);

        System.out.println();

        System.out.println("List of students of " + COURSE_TO_METHOD + " corse:");
        printStudents(groupOfStudents, COURSE_TO_METHOD);


    }

    public static void printStudents(List<Student> students, int course) {
        List<Student> copy = new ArrayList<>();
        copy.addAll(students);
        Iterator<Student> iterator = copy.iterator();
        while (iterator.hasNext()) {
            Student st = iterator.next();
            if (st.getCourse() != COURSE_TO_METHOD) {
                iterator.remove();
            }
        }
        printGroup(copy);
    }

    public static void printGroup(List<Student> group) {
        int i = 1;
        for (Student s : group) {
            System.out.println(i + ") " + s.toString());
            i++;
        }
        System.out.println();
    }

    public static void goToNextCourseOrArmy(List<Student> group) {
        Iterator<Student> iterator = group.iterator();
        Student student = null;
        while (iterator.hasNext()) {
            student = iterator.next();
            if (student.getAverageGrade() >= MIN_POSITIVE_GRADE) {
                student.setCourse(student.getCourse() + 1);
            } else {
                iterator.remove();
            }
        }
    }

}
