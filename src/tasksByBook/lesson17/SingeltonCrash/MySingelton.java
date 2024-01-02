package tasksByBook.lesson17.SingeltonCrash;

public class MySingelton {
    private static MySingelton instance;
    private static int count = 0;

    private MySingelton() {
    }

    public static MySingelton getInstance() {
        if (instance == null) {
            //synchronized (MySingelton.class) {
            //    if (count == 0) {
            instance = new MySingelton();
            //        count++;
            // }
            // }
        }
        return instance;
    }
}
