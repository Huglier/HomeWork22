package pro.sky.demo3.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.demo3.exception.ZeroDivideException;
import pro.sky.demo3.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideArgumentsTestSum")
    public void testSumResult(int num1,int num2, int expected) {
        int result = calculatorService.sum(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> provideArgumentsTestSum(){
        return Stream.of(
                Arguments.of(54,6,60),
                Arguments.of(92,8,100),
                Arguments.of(45,5,50));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsTestMinus")
    public void testMinusResult(int num1,int num2, int expected) {
        int result = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> provideArgumentsTestMinus(){
        return Stream.of(
                Arguments.of(54,6,48),
                Arguments.of(92,8,84),
                Arguments.of(45,5,40));
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
