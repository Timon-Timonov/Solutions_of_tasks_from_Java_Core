package tasksByBook.lesson17.task_68byBook;

import java.util.Scanner;

public class Director implements Runnable {

    public static final String ENTER_ARGUMENTS = "Enter \"name\", \"surname\", \"age\"  in one line throw the space.";
    AbstrBuilder builder = new PersonBuilder();

    Scanner scanner = new Scanner(System.in);
    boolean stopThread = false;

    @Override
    public void run() {
        while (!stopThread) {
            System.out.println(ENTER_ARGUMENTS);
            String line = scanner.nextLine();

            try {
                System.out.println("created instance: " + builder.buildInstance(line));
            } catch (LineException e) {
                System.out.println(e.getMessage());
                continue;
            }

            checkInterrapt();
        }
    }

    public void printList() {
        if (builder.getList().size() != 0) {
            System.out.println("All created instances:");
            System.out.println(builder.getList());
        } else {
            System.out.println("There is no created instance");
        }
    }

    private void checkInterrapt() {
        if (Thread.currentThread().isInterrupted()) {
            stopThread = true;
        }
        System.out.print("If you want to continue press \"Enter\". To stop enter \"N\".");
        if (scanner.nextLine().equalsIgnoreCase("N")) {
            stopThread = true;
        }
    }

}
