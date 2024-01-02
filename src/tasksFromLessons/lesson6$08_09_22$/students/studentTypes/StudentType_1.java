package tasksFromLessons.lesson6$08_09_22$.students.studentTypes;

import tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent;
import tasksFromLessons.lesson6$08_09_22$.students.TypeOfStudent;
import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_1;

public class StudentType_1 extends AbstractStudent {

    public StudentType_1(float talant) {
        super(talant);
        this.type = TypeOfStudent.Type_1;
        this.bihavior = new Bihavior_1();
        setLearningTimes();
    }


}