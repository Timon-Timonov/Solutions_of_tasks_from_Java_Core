package tasksByBook.lesson17.task_68byBook;

public class PersonBuilder extends AbstrBuilder {

    @Override
    public Person buildInstance(String line) throws LineException {

        String[] args = line.trim().split(" +");
        if (args.length != 3) {
            System.out.println("Try to enter line again.");
            throw new LineException("Bad count of arguments!");
        }
        String name = args[0];
        String surName = args[1];
        int age = 0;
        try {
            age = Integer.valueOf(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Try to enter line again.");
            throw new LineException("Bad age!");
        }

        Person person = new Person().setName(name).setSurName(surName).setAge(age);
        list.add(person);
        return person;
    }
}
