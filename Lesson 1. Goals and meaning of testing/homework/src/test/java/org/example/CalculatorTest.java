package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    @Test
    void testCalculateDiscountOver100ThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            BigDecimal result = calculator.calculateDiscount(BigDecimal.valueOf(150), 115);
        });
    }

    @Test
    void testCalculateDiscount15DiscountOutOf100Gives85() {
        BigDecimal result = calculator.calculateDiscount(BigDecimal.valueOf(100), 15);
        assertEquals(BigDecimal.valueOf(85).setScale(2, RoundingMode.HALF_UP),
                result.setScale(2, RoundingMode.HALF_UP));
    }
}
