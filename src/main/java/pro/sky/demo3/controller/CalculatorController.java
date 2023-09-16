package pro.sky.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.demo3.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping
    public String printHello() {
        return "Добро пожаловать в калькулятор";
    }

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public Integer sum(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
