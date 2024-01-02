package tasksFromLessons.lesson14$11_10_22$.task_1;

import java.util.Comparator;

public  class StudentComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if (o1.getGroup().equals(o2.getGroup())) {
            return o1.getGrade() - o2.getGrade();
        } else
            return o1.getGroup().compareTo(o2.getGroup());

    }
}
