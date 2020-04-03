package structural.strategy;

public class InvalidQueryException extends Throwable {
    public InvalidQueryException() {

    }

    public InvalidQueryException(String s) {
        super(s);
    }
}
