package demo_exception;

public class NotFoundExceptions extends RuntimeException {

    public NotFoundExceptions(String message) {
        super(message);
    }
}
