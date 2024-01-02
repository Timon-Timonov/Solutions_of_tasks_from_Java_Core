package tasksByBook.lesson15.task_62byBook;

@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String name, String surName, int age);
}
