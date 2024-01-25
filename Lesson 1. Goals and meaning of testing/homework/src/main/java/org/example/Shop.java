package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// *Задание 2. (необязательное) *
// Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
// Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
// Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.

public class Shop {

    public List<Product> sortProductsByPrice(List<Product> purchaseList) {
        List<Product> sortedList = new ArrayList<>(purchaseList);
        sortedList.sort(Comparator.comparing(Product::getPrice));
        return sortedList;
    }

    public Product getMostExpensiveProduct(List<Product> purchaseList) {
        List<Product> sortedList = sortProductsByPrice(purchaseList);
        return sortedList.get(sortedList.size() - 1);
    }
}
