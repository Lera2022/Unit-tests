package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    List<Product> myPurchases;
    List<Product> sortedList;

    Shop shop;

    @BeforeEach
    void initBasket() {
        shop = new Shop();
        myPurchases = List.of(
                new Product("Perfume", BigDecimal.valueOf(45.12)),
                new Product("Water", BigDecimal.valueOf(2)),
                new Product("Towel", BigDecimal.valueOf(10)),
                new Product("Jacket", BigDecimal.valueOf(8))
        );
        sortedList = new ArrayList<>(myPurchases);
        sortedList.sort(Comparator.comparing(Product::getPrice));
    }

    @Test
    void sortProductsByPrice() {
        assertEquals(sortedList, shop.sortProductsByPrice(myPurchases));
    }

    @Test
    void getMostExpensiveProduct() {
        Product topProduct = sortedList.get(sortedList.size() - 1);
        assertEquals(topProduct, shop.getMostExpensiveProduct(myPurchases));
    }

    @Test
    void getWrongMostExpensiveProduct() {
        Product topProduct = sortedList.get(sortedList.size() - 2);
        assertNotEquals(topProduct, shop.getMostExpensiveProduct(myPurchases));
    }
}