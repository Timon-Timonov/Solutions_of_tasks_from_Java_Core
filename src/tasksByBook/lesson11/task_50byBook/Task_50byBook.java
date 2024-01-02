package tasksByBook.lesson11.task_50byBook;

import java.io.*;
import java.util.Random;

public class Task_50byBook {
    public static void main(String[] args) {
        createDirs();
        creteAndWrite5Files();

        String pathDir = ConstantConteiner.PATH_NAME
                + ConstantConteiner.delimeter + ConstantConteiner.directory_1Name
                + ConstantConteiner.delimeter + ConstantConteiner.directory_2Name
                + ConstantConteiner.delimeter + ConstantConteiner.directory_3Name;

        readAllFilesInDIrAndWriteNewFile(pathDir);

        String pathCatalog = ConstantConteiner.PATH_NAME + ConstantConteiner.delimeter + ConstantConteiner.file_catalog;

        createCatalogOfFils(pathDir, pathCatalog);


    }

    private static void createDirs() {
        File file = new File(ConstantConteiner.PATH_NAME);
        File file3 = null;
        String path_1 = file.getAbsolutePath() + ConstantConteiner.delimeter + ConstantConteiner.directory_1Name;
        File file1 = new File(path_1);

        if (file.exists()) {
            if (file.isDirectory()) {
                if (file1.exists()) {
                    if (file1.isFile()) {
                        System.out.println(ConstantConteiner.directory_1Name + " alredy exist, but it is not a directory.");
                        System.out.println("This file will delete, and create directory.");
                        file1.delete();
                        file1.mkdir();
                        System.out.println(ConstantConteiner.directory_1Name + " created successfully.");
                    } else if (file1.isDirectory()) {
                        System.out.println("directory " + ConstantConteiner.directory_1Name + " alredy exist.");
                    }
                } else {
                    file1.mkdir();
                    System.out.println(ConstantConteiner.directory_1Name + " created successfully.");
                }
            } else {
                System.out.println("It is imposible create this directories.");
                System.out.println("The first file is not directory.");
                return;
            }
        }

        if (file1.exists() && file1.isDirectory()) {
            String path2_3 = ConstantConteiner.PATH_NAME
                    + ConstantConteiner.delimeter + ConstantConteiner.directory_1Name
                    + ConstantConteiner.delimeter + ConstantConteiner.directory_2Name
                    + ConstantConteiner.delimeter + ConstantConteiner.directory_3Name;

            file3 = new File(path2_3);
            if (file3.mkdirs()) {
                System.out.println(" All directories created.");
            }
        } else {
            System.out.println("It is imposible to create directories.");
            System.out.println("dir1 not exist or it is not a directory.");
            return;
        }
    }

    private static void creteAndWrite5Files() {
        String path0 = ConstantConteiner.PATH_NAME
                + ConstantConteiner.delimeter + ConstantConteiner.directory_1Name
                + ConstantConteiner.delimeter + ConstantConteiner.directory_2Name
                + ConstantConteiner.delimeter + ConstantConteiner.directory_3Name
                + ConstantConteiner.delimeter;

        File file1 = new File(path0 + ConstantConteiner.file_1Name);
        File file2 = new File(path0 + ConstantConteiner.file_2Name);
        File file3 = new File(path0 + ConstantConteiner.file_3Name);
        File file4 = new File(path0 + ConstantConteiner.file_4Name);
        File file5 = new File(path0 + ConstantConteiner.file_5Name);


        try {
            file1.createNewFile();
            writeNumbersInFile(file1);

            file2.createNewFile();
            writeNumbersInFile(file2);

            file3.createNewFile();
            writeNumbersInFile(file3);

            file4.createNewFile();
            writeNumbersInFile(file4);

            file5.createNewFile();
            writeNumbersInFile(file5);
        } catch (IOException e) {
            System.out.println("Ups");
            e.printStackTrace();
            return;
        }


    }

    private static void writeNumbersInFile(File file) {
        Random random = new Random();
        try (
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)
        ) {
            for (int i = 0; i < ConstantConteiner.countOfNumbersToEachFile; i++) {
                pw.println(random.nextInt(ConstantConteiner.MaxValueOfEachNumber + 1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAllFilesInDIrAndWriteNewFile(String path) {
        String pathToFIleWithAllValues = path + ConstantConteiner.delimeter + ConstantConteiner.file_total;
        File fileWithAllValues = new File(pathToFIleWithAllValues);
        fileWithAllValues.delete();
        File[] files = new File(path).listFiles();


        for (File f : files) {
            if (f.isFile()){
                try (
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr)
                ) {
                    try (
                            FileWriter fw = new FileWriter(fileWithAllValues, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw)
                    ) {
                        String line = br.readLine();
                        while (line != null) {
                            pw.println(line);
                            line = br.readLine();
                        }
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void createCatalogOfFils(String pathDirFrom, String pathDirTo) {
        File fileFrom = new File(pathDirFrom);
        File fileTo = new File(pathDirTo);

        try (FileWriter fw = new FileWriter(fileTo);
             BufferedWriter bw = new BufferedWriter(fw)) {
            int count = 1;
            for (File f : fileFrom.listFiles()) {
                bw.write(count++ + ") " + f.getName() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
