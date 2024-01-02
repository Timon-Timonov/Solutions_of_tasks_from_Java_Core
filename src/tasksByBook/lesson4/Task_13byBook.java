package tasksByBook.lesson4;

public class Task_13byBook {

    public static void main(String[] args) {
         int i=1;
         int stop=25;
         float productOfNumbers=1f;

         int start=i;
         do{
             productOfNumbers*=i++;

         }while(i<=(stop));
        System.out.println("Product of numbers from "+start+" to "+stop+" = "+productOfNumbers+".");
    }
}
