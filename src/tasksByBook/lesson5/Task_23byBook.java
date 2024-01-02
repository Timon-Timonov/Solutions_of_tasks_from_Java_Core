package tasksByBook.lesson5;

public class Task_23byBook {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        for (int i = 0; i < array.length; i++) {
            if (i < (array[i].length - i)) {
                for (int j = i; j < array[i].length - i; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = array[i].length - i - 1; j < i + 1; j++) {
                    array[i][j] = 1;
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
