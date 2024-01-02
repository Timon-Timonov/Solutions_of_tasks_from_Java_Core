package tasksByBook.lesson17.task_68byBook;

public class LineException extends Exception {
    public LineException(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }
}
