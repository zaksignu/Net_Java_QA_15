package ru.netology;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;


class ProductManagerTest {
    static ProductRepository repository = new ProductRepository();
    static ProductManager mng = new ProductManager(repository);
    static Book uno = new Book(1, "Book", 1000, "Jiovan");
    static Smartphone duo = new Smartphone(2, "smartphone", 1000, "China");
    static Book tre = new Book(3, "Book", 1000, "Jiovan");
    static Smartphone cuatro = new Smartphone(4, "smartphone", 1000, "China");

    @BeforeAll
    static void setUp() {
        mng.add(uno);
        mng.add(duo);
        mng.add(tre);
        mng.add(cuatro);
    }

    @Test
    void add() {
        Product[] actual = {uno, duo, tre, cuatro};
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }

    @Test
    void removeById() {
        Product[] actual = {uno, duo, cuatro};
        mng.removeById(3);
        Product[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchforBook() {
        Product[] actual = {uno, tre};
        Product[] excpected = mng.searchBy("Book");
        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchforsmartphone() {
        Product[] actual = {duo, cuatro};
        Product[] excpected = mng.searchBy("smartphone");
        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchfornone() {
        Product[] actual = {};
        Product[] excpected = mng.searchBy("z");
        assertArrayEquals(excpected, actual);
    }

    @Test
    void matchesPositiveBook() {
        assertTrue(mng.matches(uno, "Book"));
    }

    @Test
    void atchesNegativeBook() {
        assertFalse(mng.matches(duo, "Book"));
    }

}
