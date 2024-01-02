package tasksFromLessons.lesson2$18_08_22$;

public class Runner {
    public static void main(String[] args) {

        MyByte minByte=new MyByte(MyByte.MY_BYTE_MIN_VALUE);
        MyByte maxByte=new MyByte(MyByte.MY_BYTE_MAX_VALUE);

        MyShort minShort=new MyShort(MyShort.MY_SHORT_MIN_VALUE);
        MyShort maxShort=new MyShort(MyShort.MY_SHORT_MAX_VALUE);

        MyInteger minInteger=new MyInteger(MyInteger.MY_INTEGER_MIN_VALUE);
        MyInteger maxInteger=new MyInteger(MyInteger.MY_INTEGER_MAX_VALUE);

        MyLong minLong=new MyLong(MyLong.MY_LONG_MIN_VALUE);
        MyLong maxLong=new MyLong(MyLong.MY_LONG_MAX_VALUE);

        System.out.println("All values:");
        System.out.println("minByte = "+minByte.getMyValue()+";");
        System.out.println("maxByte = "+maxByte.getMyValue()+";");

        System.out.println("minShort = "+minShort.getMyValue()+";");
        System.out.println("maxShort = "+maxShort.getMyValue()+";");

        System.out.println("minInteger = "+minInteger.getMyValue()+";");
        System.out.println("maxInteger = "+maxInteger.getMyValue()+";");

        System.out.println("minLong = "+minLong.getMyValue()+";");
        System.out.println("maxLong = "+maxLong.getMyValue()+";");
        System.out.println();

        minByte.decrementValue();
        minShort.decrementValue();
        minInteger.decrementValue();
        minLong.decrementValue();

        maxByte.incrementValue();
        maxShort.incrementValue();
        maxInteger.incrementValue();
        maxLong.incrementValue();

        System.out.println("All values after increment(or decrement):");
        System.out.println("minByte = "+minByte.getMyValue()+";");
        System.out.println("maxByte = "+maxByte.getMyValue()+";");

        System.out.println("minShort = "+minShort.getMyValue()+";");
        System.out.println("maxShort = "+maxShort.getMyValue()+";");

        System.out.println("minInteger = "+minInteger.getMyValue()+";");
        System.out.println("maxInteger = "+maxInteger.getMyValue()+";");

        System.out.println("minLong = "+minLong.getMyValue()+";");
        System.out.println("maxLong = "+maxLong.getMyValue()+";");
        System.out.println();

    }



}
