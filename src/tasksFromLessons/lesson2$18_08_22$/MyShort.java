package tasksFromLessons.lesson2$18_08_22$;

public class MyShort {

    public static final short MY_SHORT_MAX_VALUE = Short.MAX_VALUE;
    public static final short MY_SHORT_MIN_VALUE = Short.MIN_VALUE;
    private short myValue;

    public MyShort(short value){
        myValue=value;
    }

    public void incrementValue(){
        myValue++;
    }

    public void decrementValue(){
        myValue--;
    }

    public short getMyValue() {
        return myValue;
    }
}
