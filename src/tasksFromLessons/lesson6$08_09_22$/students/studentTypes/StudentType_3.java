package tasksFromLessons.lesson6$08_09_22$.students.studentTypes;

import tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent;
import tasksFromLessons.lesson6$08_09_22$.students.TypeOfStudent;
import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_3;

public class StudentType_3 extends AbstractStudent {

    public StudentType_3(float talant) {
        super(talant);
        this.type = TypeOfStudent.Type_3;
        this.bihavior = new Bihavior_3();
        setLearningTimes();
    }
}
