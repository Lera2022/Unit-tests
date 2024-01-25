package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    private int operand;

    @BeforeEach
    void testInit() {
        calculator = new Calculator();
        operand = 5;
    }

    @AfterEach
    void testAfterEach() {
        calculator = null;
    }


    @Test
    void testAddition() {
        int result = calculator.add(operand, 3);
        assertEquals(8, result); // Проверка сложения
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(operand, 4);
        assertEquals(1, result); // Проверка вычитания
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(operand, 4);
        assertEquals(20, result); // Проверка умножения
    }

    @Test
    void testDivision() {
        int result = calculator.divide(10, operand);
        assertEquals(2, result); // Проверка деления
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = calculator.divide(operand, 0); // Попытка деления на ноль, должно выбросить исключение
        });
    }
}
