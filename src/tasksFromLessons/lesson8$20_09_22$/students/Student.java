package tasksFromLessons.lesson8$20_09_22$.students;

import tasksFromLessons.lesson8$20_09_22$.Man;
import tasksFromLessons.lesson8$20_09_22$.TimeCalculator;
import tasksFromLessons.lesson8$20_09_22$.bihaviors.Bihavior_1;
import tasksFromLessons.lesson8$20_09_22$.bihaviors.Bihavior_2;
import tasksFromLessons.lesson8$20_09_22$.bihaviors.Bihavior_3;

public class Student extends Man {
    private double talant;
    private TypesOfStudents typesOfStudents;
    private TimeCalculator timeCalculator;

    private int timeTotal;
    private int timePractic;
    private int timeRazbor;
    private int timePotok;


    private void setTimes() {
        int[] times = timeCalculator.setTimes(this.getTalant());
        timeTotal = times[0];
        timePractic = times[1];
        timeRazbor = times[2];
        timePotok = times[3];
    }

    private void setTimeCalculator() {
        switch (typesOfStudents) {
            case TYPE_1:
                this.timeCalculator = new Bihavior_1();
                break;
            case TYPE_2:
                this.timeCalculator = new Bihavior_2();
                break;
            case TYPE_3:
                this.timeCalculator = new Bihavior_3();
                break;

        }
    }

    public void setTalant(double talant) {
        this.talant = talant;
        setTimes();
    }

    public void setTypesOfStudents(TypesOfStudents typesOfStudents) {
        this.typesOfStudents = typesOfStudents;
        setTimeCalculator();
        setTimes();
    }

    public Student(double talant, TypesOfStudents typesOfStudents) {
        this.talant = talant;
        setTypesOfStudents(typesOfStudents);

    }

    public double getTalant() {
        return talant;
    }

    public TypesOfStudents getTypesOfStudents() {
        return typesOfStudents;
    }

    public TimeCalculator getTimeCalculator() {
        return timeCalculator;
    }

    public int getTimeTotal() {
        return timeTotal;
    }

    public int getTimePractic() {
        return timePractic;
    }

    public int getTimeRazbor() {
        return timeRazbor;
    }

    public int getTimePotok() {
        return timePotok;
    }

    @Override
    public String toString() {
        return "Student{" +
                typesOfStudents +
                ", talant=" + talant +
                ", timeTotal=" + timeTotal +
                ", timePractic=" + timePractic +
                ", timeRazbor=" + timeRazbor +
                ", timePotok=" + timePotok +
                '}';
    }

}
