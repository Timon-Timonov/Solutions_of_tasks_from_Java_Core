package tasksFromLessons.lesson14$11_10_22$.task_1;

import java.util.Objects;

public class Student implements Comparable<Student>  {
    private String name;
    private String group;
    private int course;
    private int grade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                name.equals(student.name) &&
                group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, String group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.group.equals(o.getGroup())) {
            return this.grade - o.getGrade();
        } else
            return group.compareTo(o.getGroup());
    }
}
