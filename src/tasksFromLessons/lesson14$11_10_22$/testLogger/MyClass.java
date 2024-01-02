package tasksFromLessons.lesson14$11_10_22$.testLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClass {
    public static final Logger logger = Logger.getLogger(TestException.class.getName());

    public static void main(String[] args) {


        try {
            method2();
            logger.log(Level.INFO, "Я изучаю Exception");
        } catch (MyException e) {
            logger.log(Level.SEVERE, "Error in method2", e);
        } finally {
            logger.log(Level.INFO, "Hello logging!");
        }
    }

    public static double method2() throws MyException {
        throw new MyException();
    }
}
