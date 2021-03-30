package exception;

public class NotANumberException extends ParseExpressionException {

    public NotANumberException(String message) {
        super("This is not a number " + message);
    }
}
