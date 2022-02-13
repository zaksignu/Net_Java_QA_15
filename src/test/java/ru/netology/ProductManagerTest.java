package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductRepository repository = new ProductRepository();
    ProductManager mng = new ProductManager(repository);
    Book uno = new Book(1, "Book", 1000, "Pinokkio", "Jiovan");
    Smartphone duo = new Smartphone(2, "smartphone", 1000, "Zaria", "China");
    Book tre = new Book(3, "Book", 1000, "HistoryO", "Jiovan");
    Smartphone cuatro = new Smartphone(4, "smartphone", 1000, "Vesna", "China");

    @Test
    void add() {
        mng.add(uno);
        mng.add(duo);
        mng.add(tre);
        mng.add(cuatro);
        Product[] actual = {uno, duo, tre, cuatro};
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }

    @Test
    void removeById() {
        mng.add(uno);
        mng.add(duo);
        mng.add(tre);
        mng.add(cuatro);
        Product[] actual = {uno, duo, cuatro};
        mng.removeById(3);
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchBy() {
        mng.add(uno);
        mng.add(duo);
        mng.add(tre);
        mng.add(cuatro);
        mng.searchBy("Book");
        Product[] actual = {uno, tre};
        Product[] excpected = mng.searchBy("Book");
        assertArrayEquals(excpected, actual);
    }

    @Test
    void matches() {
        assertTrue(mng.matches(uno, "Book"));
        assertFalse(mng.matches(duo, "Book"));

    }
}