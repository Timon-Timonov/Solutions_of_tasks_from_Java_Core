package tasksFromLessons.lesson8$20_09_22$;

import tasksFromLessons.lesson8$20_09_22$.students.Student;
import tasksFromLessons.lesson8$20_09_22$.students.TypesOfStudents;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static final int TOTAL_TIME_TO_GET_SKILL_WITH_TALANT_1_AND_TYPE_1 = 98;
    public static final int COUNT_TYPES_OF_STUDENTS = 3;
    private static final int COUNT_STYDENTS_OF_EACH_TYPE = 3;

    private static List<Student> studentsGroup = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < COUNT_TYPES_OF_STUDENTS; i++) {
            for (int j = 0; j < COUNT_STYDENTS_OF_EACH_TYPE; j++) {
                Student student = new Student(((double) (random.nextInt(10) + 1) / 10), TypesOfStudents.values()[i]);
                studentsGroup.add(student);
            }
        }

        printGroup("Created a group with students:");

        for (int i = 0; i < COUNT_STYDENTS_OF_EACH_TYPE * COUNT_TYPES_OF_STUDENTS; i += COUNT_STYDENTS_OF_EACH_TYPE) {
            studentsGroup.get(i).setTalant(1);
        }

        for (int i = 1; i < COUNT_STYDENTS_OF_EACH_TYPE * COUNT_TYPES_OF_STUDENTS; i += COUNT_STYDENTS_OF_EACH_TYPE) {
            studentsGroup.get(i).setTalant(0.5);
        }

        for (int i = 2; i < COUNT_STYDENTS_OF_EACH_TYPE * COUNT_TYPES_OF_STUDENTS; i += COUNT_STYDENTS_OF_EACH_TYPE) {
            studentsGroup.get(i).setTalant(0.1);
        }

        printGroup("Group with students after changing talant:");


        for (Student s : studentsGroup) {
            s.setTypesOfStudents(TypesOfStudents.TYPE_1);
        }

        printGroup("Group with students after changing types:");


        for (Student s : studentsGroup) {
            s.setTalant(1);
        }
        printGroup("Group with all students after changing talant to 1.0:");
    }

    private static void printGroup(String message) {
        System.out.println(message);
        for (Student s : studentsGroup) {
            System.out.println(s);
        }
        System.out.println();
    }
}
