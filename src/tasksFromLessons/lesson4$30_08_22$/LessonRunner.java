package tasksFromLessons.lesson4$30_08_22$;

public class LessonRunner {
    public static void main(String[] args) {
        //Solution of task_4:
        int a = 11;
        int b = 16;
        System.out.println("Task_4 with int a=" + a + " and int b=" + b + ": ");
        System.out.println("a+b+a*b=" + Task_4.turboMethod(a, b));
        System.out.println();


        //Solution of Task_5:
        long seconds = 8825718;
        System.out.println("Task_5 with long seconds=" + seconds);
        Task_5 time = new Task_5(seconds);
        System.out.println();

        //Solution of Task_6:
        System.out.println("Task_6 with two different numbers:");
        int isLastSeven1 = 458;
        int isLastSeven2 = 4587;
        System.out.println("isLastSeven1=" + isLastSeven1);
        System.out.println("isLastSeven2=" + isLastSeven2);
        Task_6 task_6 = new Task_6();
        System.out.println("isLastSeven1 - " + task_6.isLast_7(isLastSeven1));
        System.out.println("isLastSeven2 - " + task_6.isLast_7(isLastSeven2));
        System.out.println();

        //Solution of Task_7:
        System.out.println("Task_7 with a=" + Task_7.a + "; b=" + Task_7.b + "; r=" + Task_7.r + ";");
        Task_7.printSolution();
        System.out.println();


        //остальные задачи решены по учебнику

    }
}
