package calculator;

import exception.DivisionByZeroException;
import exception.IncorrectInputException;

import java.util.List;

public interface Calculator {
    double calculator(List<String> postfixList) throws DivisionByZeroException, IncorrectInputException;
}
