package tasksByBook.lesson5;

public class Task_21byBook {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 8);
            System.out.println(array[i]);
        }


        int maxElement = array[0];
        int indexOfFirstMaxElement = 0;
        int indexOfLastMaxElement = 0;


        int minElement = array[0];
        int indexOfFirstMinElement = 0;
        int indexOfLastMinElement = 0;


        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
                indexOfFirstMaxElement = i;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == maxElement) {
                indexOfLastMaxElement = i;
                break;
            }
        }


        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
                indexOfFirstMinElement = i;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == minElement) {
                indexOfLastMinElement = i;
                break;
            }
        }

        int iStart = 0;
        int iFinish = 0;
        if ((indexOfFirstMaxElement != indexOfLastMaxElement) || (indexOfFirstMinElement != indexOfLastMinElement)) {
            if (Math.abs(indexOfLastMaxElement - indexOfFirstMinElement) > Math.abs(indexOfLastMinElement - indexOfFirstMaxElement)) {
                iStart = Math.min(indexOfLastMaxElement, indexOfFirstMinElement);
                iFinish = Math.max(indexOfLastMaxElement, indexOfFirstMinElement);
            } else {
                iStart = Math.min(indexOfLastMinElement, indexOfFirstMaxElement);
                iFinish = Math.max(indexOfLastMinElement, indexOfFirstMaxElement);
            }
        } else {
            iStart = Math.min(indexOfFirstMaxElement, indexOfFirstMinElement);
            iFinish = Math.max(indexOfFirstMaxElement, indexOfFirstMinElement);
        }

        int sum = 0;
        for (int i = iStart; i <= iFinish; i++) {
            sum += array[i];
        }

        System.out.println();
        /*System.out.println(iStart);
        System.out.println(iFinish);*/
        System.out.println(sum);
    }
}
