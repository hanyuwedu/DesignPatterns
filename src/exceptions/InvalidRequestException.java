package exceptions;

public class InvalidRequestException extends Throwable {
    public InvalidRequestException() {

    }

    public InvalidRequestException(String s) {
        super(s);
    }
}
