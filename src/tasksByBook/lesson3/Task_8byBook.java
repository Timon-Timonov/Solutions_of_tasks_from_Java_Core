package tasksByBook.lesson3;

public class Task_8byBook {
    public static void main(String[] args) {
        int sum = 98745211;
        System.out.print("Итоговая сумма: " + sum + " ");


        if (sum % 100 > 10 && sum % 100 < 20) {
            System.out.print("рублей.");
            return;
        }

        switch (sum % 10) {
            case (1):
                System.out.print("рубль.");
                break;
            case (2):
                System.out.print("рубля.");
                break;
            case (3):
                System.out.print("рубля.");
                break;
            case (4):
                System.out.print("рубля.");
                break;
            case (5):
                System.out.print("рублей.");
                break;
            case (6):
                System.out.print("рублей.");
                break;
            case (7):
                System.out.print("рублей.");
                break;
            case (8):
                System.out.print("рублей.");
                break;
            case (9):
                System.out.print("рублей.");
                break;
            case (0):
                System.out.print("рублей.");
                break;
            default:
                System.out.println(" hren' kakaya-to!");
        }
    }
}
