package tasksFromLessons.lesson13$06_10_22$.task_4;

import java.util.Objects;

public class Student {
    private String name;
    private int course;
    private int group;
    private int averageGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                group == student.group &&
                averageGrade == student.averageGrade &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, group, averageGrade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(String name, int course, int group, int averageGrade) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.averageGrade = averageGrade;
    }
}
