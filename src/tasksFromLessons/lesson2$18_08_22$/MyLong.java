package tasksFromLessons.lesson2$18_08_22$;

public class MyLong {
    public static final long MY_LONG_MAX_VALUE = Long.MAX_VALUE;
    public static final long MY_LONG_MIN_VALUE = Long.MIN_VALUE;
    private long myValue;

    public MyLong(long value){
        myValue=value;
    }

    public void incrementValue(){
        myValue++;
    }

    public void decrementValue(){
        myValue--;
    }

    public long getMyValue() {
        return myValue;
    }
}
