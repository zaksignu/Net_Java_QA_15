package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    ProductRepository repository = new ProductRepository();
    Book uno = new Book(1, "Book", 1000, "Pinokkio", "Jiovan");
    Smartphone duo = new Smartphone(2, "smartphone", 1000, "Zaria", "China");
    Book tre = new Book(3, "Book", 1000, "HistoryO", "Jiovan");
    Smartphone cuatro = new Smartphone(4, "smartphone", 1000, "Vesna", "China");

    @Test
    void addProduct() {
        repository.addProduct(uno);
        repository.addProduct(duo);
        Product[] actual = {uno,duo};
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected,actual);
    }

    @Test
    void showThings() {
            repository.addProduct(uno);
            repository.addProduct(duo);
            repository.addProduct(tre);
            Product[] actual = {uno,duo,tre};
            Product[] excpected = repository.showThings();
            assertArrayEquals(excpected,actual);

    }

    @Test
    void removeThing() {
        repository.addProduct(uno);
        repository.addProduct(duo);
        repository.addProduct(tre);
        repository.removeThing(tre.getId());
        Product[] actual = {uno,duo};
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected,actual);
    }
}