package exception;

public class MultipleOperationException extends ParseExpressionException {
    public MultipleOperationException() {
        super("Too much operations error!");
    }
}
