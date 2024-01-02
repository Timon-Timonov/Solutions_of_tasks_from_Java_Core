package tasksFromLessons.lesson6$08_09_22$.students.bihavior;

import tasksFromLessons.lesson6$08_09_22$.students.Bihavior;

import static tasksFromLessons.lesson6$08_09_22$.students.AbstractStudent.ALL_LEARNING_TIME_FOR_TALANT_1;

public class Bihavior_3 implements Bihavior {
    @Override
    public int[] calculateTime(float talant) {
        int[] result = new int[4];
        result[0] = (int) (ALL_LEARNING_TIME_FOR_TALANT_1 * 3 / talant);
        result[1] = (result[0]);
        result[2] = 0;
        result[3] = 0;


        return result;
    }
}
