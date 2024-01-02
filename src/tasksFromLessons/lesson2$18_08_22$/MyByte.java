package tasksFromLessons.lesson2$18_08_22$;

public class MyByte {

    public static final byte MY_BYTE_MAX_VALUE = Byte.MAX_VALUE;
    public static final byte MY_BYTE_MIN_VALUE = Byte.MIN_VALUE;
    private byte myValue;

    public MyByte(byte value){
        myValue=value;
    }

    public void incrementValue(){
       myValue++;
    }

    public void decrementValue(){
        myValue--;
    }

    public byte getMyValue() {
        return myValue;
    }
}
