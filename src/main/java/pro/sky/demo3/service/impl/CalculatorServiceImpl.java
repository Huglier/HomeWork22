package pro.sky.demo3.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.demo3.exception.ZeroDivideException;
import pro.sky.demo3.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer sum(Integer value, Integer value2) {
        return value + value2;
    }
    @Override
    public Integer minus(Integer value, Integer value2) {
        return value - value2;
    }
    @Override
    public Integer multiply(Integer value, Integer value2) {
        return value * value2;
    }
    @Override
    public Integer divide(Integer value, Integer value2) {
        if (value2 == 0||value == 0){
            throw new IllegalArgumentException("Дулить на ноль нельзя");
        }
        return value / value2;
    }
}
