package tasksByBook.lesson7;

public class Task_31byBook {

    public static void main(String[] args) {
        String text = "aaabbbccc";
        int k = 1000_000;

        String millionString = null;
        StringBuilder millionStringBuilder = new StringBuilder();


        System.out.println("Start StringBuilder ");
        long time = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            millionStringBuilder.append(text);
        }
        System.out.println("StringBuilder finished " + (System.currentTimeMillis() - time) + "msec.");


        System.out.println("Start String ");
        time = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            millionString += text;
        }
        System.out.println("String finished " + (System.currentTimeMillis() - time + "msec."));
    }
}
