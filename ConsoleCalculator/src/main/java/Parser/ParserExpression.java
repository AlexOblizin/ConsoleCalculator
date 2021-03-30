package Parser;

import exception.MultipleOperationException;
import exception.ParseExpressionException;

import java.util.List;

public interface ParserExpression {
    List<String> parsingOperation(String infix) throws ParseExpressionException;
    boolean validOperand(String obj);
}
