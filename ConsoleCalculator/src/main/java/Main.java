import calculator.*;
import Parser.ExpressionParser;
import Parser.ParserExpression;
import exception.DivisionByZeroException;
import exception.MultipleOperationException;
import exception.ParseExpressionException;
import input_output.OutputResult;
import input_output.UserInput;

import java.util.List;


public class Main {


    public static void main(String[] args)  {

        OutputResult outputResult = new OutputResult();
        ParserExpression parser = new ExpressionParser();
        Calculator calculator = new CalculatorDouble();

        String input;

        while (true) {
            input = UserInput.userInput();
            if (UserInput.exit(input))
            {
                break;
            }
            else {
                double result;
                try {
                    List<String> inputList = parser.parsingOperation(input);
                    result = calculator.calculator(inputList);
                    outputResult.result(result);
                } catch (MultipleOperationException multipleOperationException) {
                    outputResult.result(multipleOperationException);
                } catch (ParseExpressionException e) {
                    outputResult.result(e);
                } catch (DivisionByZeroException divisionByZeroException) {
                    outputResult.result(divisionByZeroException);
                }
            }
        }
    }
}
