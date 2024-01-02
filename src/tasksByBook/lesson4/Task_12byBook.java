package tasksByBook.lesson4;

public class Task_12byBook {
    public static void main(String[] args) {
        int i=1;
        int stop=10;
        long factorial=1l;
        while(i<=stop){
            factorial*=i;
            i++;
        }
        System.out.println(stop+"!="+factorial);
    }
}
