package pro.sky.demo3.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.demo3.exception.ZeroDivideException;
import pro.sky.demo3.service.impl.CalculatorServiceImpl;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testSum1Sum2Result3() {
        int result = calculatorService.sum(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testMinus2Sum1Result1() {
        int result = calculatorService.minus(2, 1);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testMultiply2Sum4Result8() {
        int result = calculatorService.multiply(2, 4);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testDivide6Sum2Result3() {
        int result = calculatorService.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testThrowExceptionWhenDivide0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(2, 0));
    }
}
