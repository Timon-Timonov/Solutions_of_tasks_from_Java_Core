package tasksByBook.lesson11.task_49byBook;

import java.io.*;
import java.util.Random;

public class Task_49byBook {
    public static void main(String[] args) {
        int[] myNymbers = getArrayWithNumbers();
        printArray(myNymbers);
        writeIntsToBinaryFile(myNymbers);

        System.out.println();
        System.out.println("Numbers from file: ");
        System.out.println("The average of all nymbers: " + readAndAverageIntsfromDataFile());
    }

    private static void printArray(int[] myNymbers) {
        System.out.println("All created numbers:");
        int count = 1;
        for (int i : myNymbers) {
            System.out.println(count++ + ") " + i);
        }
    }

    private static int[] getArrayWithNumbers() {
        Random random = new Random();
        int[] array = new int[ConstantConteiner.COUNT_OF_NUMBERS];
        for (int i = 0; i < ConstantConteiner.COUNT_OF_NUMBERS; i++) {
            array[i] = (random.nextInt(ConstantConteiner.MAX_VALUE_OF_NUMBERS + 1));
        }
        return array;
    }

    private static void writeIntsToBinaryFile(int[] numbers) {
        try (
                FileOutputStream fos = new FileOutputStream(ConstantConteiner.PATH_NAME);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos)
        ) {
            for (int i : numbers) {
                dos.writeInt(i);
            }
            dos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("Ups...");
            e.printStackTrace();
            return;
        }
    }

    private static int readAndAverageIntsfromDataFile() {
        int sum = 0;
        try (
                FileInputStream fis = new FileInputStream(ConstantConteiner.PATH_NAME);
                BufferedInputStream bis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bis)
        ) {
            int o = 0;
            int count = 1;
            while (dis.available() > 0) {
                o = dis.readInt();
                System.out.println(count++ + ") " + o);
                sum += o;
            }
            return sum / count;
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
            return 0;
        } catch (IOException e) {
            System.out.println("Ups...");
            e.printStackTrace();
            return 0;
        }

    }
}

