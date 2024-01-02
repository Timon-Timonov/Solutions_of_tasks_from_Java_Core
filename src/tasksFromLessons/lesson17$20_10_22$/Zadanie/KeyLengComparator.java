package tasksFromLessons.lesson17$20_10_22$.Zadanie;

import java.util.Comparator;

public class KeyLengComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if ((o2.length() - o1.length()) == 0) {
            return o1.compareTo(o2);
        } else {
            return o2.length() - o1.length();
        }
    }
}
