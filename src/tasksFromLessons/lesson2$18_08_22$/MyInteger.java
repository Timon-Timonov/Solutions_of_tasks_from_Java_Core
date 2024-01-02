package tasksFromLessons.lesson2$18_08_22$;

public class MyInteger {



    public static final int MY_INTEGER_MAX_VALUE = Integer.MAX_VALUE;
    public static final int MY_INTEGER_MIN_VALUE = Integer.MIN_VALUE;
    private int myValue;

    public MyInteger(int value){
        myValue=value;
    }

    public void incrementValue(){
        myValue++;
    }

    public void decrementValue(){
        myValue--;
    }

    public int getMyValue() {
        return myValue;
    }
}
