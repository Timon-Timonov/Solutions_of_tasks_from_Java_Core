package tasksFromLessons.lesson6$08_09_22$.students.bihavior;

import tasksFromLessons.lesson6$08_09_22$.students.Bihavior;

import static tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent.ALL_LEARNING_TIME_FOR_TALANT_1;

public class Bihavior_1 implements Bihavior {
    @Override
    public int[] calculateTime(float talant) {
        int[] result = new int[4];
        result[0] = (int) (ALL_LEARNING_TIME_FOR_TALANT_1 / talant);
        result[1] = (result[0] / 3);
        result[2] = (result[0] / 3);
        result[3] = (result[0] / 3);


        return result;
    }
}
