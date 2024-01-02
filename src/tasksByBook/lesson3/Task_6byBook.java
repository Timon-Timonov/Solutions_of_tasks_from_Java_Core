package tasksByBook.lesson3;

public class Task_6byBook {
    public static void main(String[] args) {
        int param = 45698;
        System.out.println("The last sign of "+param+" is 7: "+method(param));
    }

    public static boolean method(int param) {
        return (param % 10) == 7;
    }
}
