package tasksFromLessons.lesson6$08_09_22$.students;

import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_1;
import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_2;
import tasksFromLessons.lesson6$08_09_22$.students.bihavior.Bihavior_3;

public abstract class AbstractStudent {

    public static final int ALL_LEARNING_TIME_FOR_TALANT_1 = 198;

    protected Bihavior bihavior;
    protected Enum<TypeOfStudent> type;
    private float talant;

    private int allLearningTime;
    private int practicTime;
    private int razborTime;
    private int potokTime;

    public AbstractStudent(float talant) {
        this.talant = talant;

    }

    protected void setLearningTimes() {
        int[] times = bihavior.calculateTime(talant);
        allLearningTime = times[0];
        practicTime = times[1];
        razborTime = times[2];
        potokTime = times[3];
    }

    public void setTalant(float talant) {
        this.talant = talant;
        setLearningTimes();
    }


    public void setType(TypeOfStudent type) {
        this.type = type;
        switch (type) {
            case Type_1:
                this.bihavior = new Bihavior_1();
                break;
            case Type_2:
                this.bihavior = new Bihavior_2();
                break;
            case Type_3:
                this.bihavior = new Bihavior_3();
                break;

        }
        setLearningTimes();
    }

    public TypeOfStudent getType() {
        return (TypeOfStudent) type;
    }

    public float getTalant() {
        return talant;
    }

    public int getAllLearningTime() {
        return allLearningTime;
    }

    public int getPracticTime() {
        return practicTime;
    }

    public int getRazborTime() {
        return razborTime;
    }

    public int getPotokTime() {
        return potokTime;
    }

    @Override
    public String toString() {
        return "Student " + type + " {" +
                "talant=" + talant +
                ", allLearningTime=" + allLearningTime +
                ", practicTime=" + practicTime +
                ", razborTime=" + razborTime +
                ", potokTime=" + potokTime +
                '}';
    }
}