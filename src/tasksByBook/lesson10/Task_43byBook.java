package tasksByBook.lesson10;

public class Task_43byBook {
    public static void main(String[] args) {
        String string = null;
        int leng;

        try {
            leng = string.length();
            System.out.println("This text will have never been printed...");
        } catch (NullPointerException e) {

            e.printStackTrace();
            System.out.println("It is attempting to call a method on an object that does not exist.");
        } finally {
            System.out.println("This text will print always.");
        }
    }
}
