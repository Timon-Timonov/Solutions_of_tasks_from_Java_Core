package tasksFromLessons.lesson6$08_09_22$.students.studentTypes;

import tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent;
import tasksFromLessons.lesson6$08_09_22$.students.TypeOfStudent;
import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_2;

public class StudentType_2 extends AbstractStudent {

    public StudentType_2(float talant) {
        super(talant);
        this.type = TypeOfStudent.Type_2;
        this.bihavior = new Bihavior_2();
        setLearningTimes();
    }
}
