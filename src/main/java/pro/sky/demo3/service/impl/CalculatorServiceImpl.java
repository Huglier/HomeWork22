package pro.sky.demo3.service.impl;

import org.springframework.stereotype.Service;
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
        return value / value2;
    }
}
