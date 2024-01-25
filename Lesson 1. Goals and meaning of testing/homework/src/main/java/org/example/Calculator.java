package org.example;

import java.math.BigDecimal;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.

    public BigDecimal calculateDiscount (BigDecimal purchaseAmount, float discount) {
        if (discount < 100 && discount > 0) {
                return purchaseAmount.multiply(BigDecimal.valueOf((100-discount) / 100));
        }
        throw new ArithmeticException("Discount must be between 0 and 100");
    }
}