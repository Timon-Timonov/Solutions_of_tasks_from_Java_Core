package tasksByBook.lesson2;

public class Task_4byBook {
    public static void main(String[] args) {
        int a=5;
        int b=9;
        System.out.println(" a="+a+";");
        System.out.println(" b="+b+";");
        System.out.println(" c=(a+b)+a*b="+myMethod(a,b)+";");
    }

    public static int myMethod(int a, int b) {
        int z;
        z=(a+b)+a*b;
        return z;
    }
}
