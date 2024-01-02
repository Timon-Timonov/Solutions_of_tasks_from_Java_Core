package tasksFromLessons.lesson8$20_09_22$.bihaviors;

import tasksFromLessons.lesson8$20_09_22$.TimeCalculator;

import static tasksFromLessons.lesson8$20_09_22$.Runner.TOTAL_TIME_TO_GET_SKILL_WITH_TALANT_1_AND_TYPE_1;

public class Bihavior_3 implements TimeCalculator {
    private int[] times = new int[4];

    @Override
    public int[] setTimes(double talant) {
        times[0] = (int) (TOTAL_TIME_TO_GET_SKILL_WITH_TALANT_1_AND_TYPE_1*3 / talant);
        times[1] = times[0] ;
        times[2] = 0;
        times[3] = 0;

        return times;
    }
}
