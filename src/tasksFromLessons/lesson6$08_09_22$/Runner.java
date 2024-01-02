package tasksFromLessons.lesson6$08_09_22$;

import tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent;
import tasksFromLessons.lesson6$08_09_22$.students.TypeOfStudent;
import tasksFromLessons.lesson6$08_09_22$.students.studentTypes.StudentType_1;
import tasksFromLessons.lesson6$08_09_22$.students.studentTypes.StudentType_2;
import tasksFromLessons.lesson6$08_09_22$.students.studentTypes.StudentType_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {

    //задания 20-23 решены по учебнику


    public static void main(String[] args) {
        System.out.println("Solution of task with different students:");
        List<AbstractStudent> klass = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            AbstractStudent student = new StudentType_1((random.nextInt(10) + 1) / 10f);
            klass.add(student);
        }

        for (int i = 0; i < 3; i++) {
            AbstractStudent student = new StudentType_2((random.nextInt(10) + 1) / 10f);
            klass.add(student);
        }

        for (int i = 0; i < 3; i++) {
            AbstractStudent student = new StudentType_3((random.nextInt(10) + 1) / 10f);
            klass.add(student);
        }


        for (AbstractStudent student : klass) {
            System.out.println(student);
        }



        System.out.println();
        System.out.println("set alltype=1");
        for (AbstractStudent student : klass) {
            student.setType(TypeOfStudent.Type_1);
            System.out.println(student);
        }



        System.out.println();
        System.out.println("set alltalant=1");
        for (AbstractStudent student : klass) {
            student.setTalant(1);
            System.out.println(student);
        }




    }
}
