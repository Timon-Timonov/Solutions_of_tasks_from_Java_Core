package tasksByBook.lesson11;

import java.io.File;

public class Task_46byBook {

    public static final String PATH_NAME = "src";

    public static void main(String[] args) {

        File file = new File(PATH_NAME);
        System.out.println("We are cheking file with pathname: " + PATH_NAME);

        if (!file.exists()) {
            System.out.println("Invalid pathname. File/directory is not exist!");
            return;
        }

        if (file.isFile()) {
            System.out.println("This is a file(not directory).");
        } else if (file.isDirectory()) {
            System.out.println("This file is a directory.");
            File[] list = file.listFiles();
            System.out.println("\t\tList of directories in the cheking directory:");
            for (File fl : list) {
                if (fl.isDirectory()) {
                    System.out.println(fl.getName());
                }
            }
            System.out.println();
            System.out.println("\t\tList of files in the cheking directory:");
            for (File fl : list) {
                if (fl.isFile()) {
                    System.out.println(fl.getName());
                }
            }
        }
    }
}
