package ru.netology.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;
import ru.netology.manager.ProductManager;

class ProductRepositoryTest {
    static Ticket tick1 = new Ticket(0, 1500, "CHI", "ZIA", 1000);
    static Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO", 1500);
    static Ticket tick3 = new Ticket(2, 200, "ZIA", "DME", 1060);
    static Ticket tick4 = new Ticket(3, 500, "DME", "CHI", 4000);
    static ProductRepository repository = new ProductRepository();
    static ProductManager mng = new ProductManager(repository);
//    static Book uno = new Book(1, "Book", 1000, "Jiovan");
//    static Smartphone duo = new Smartphone(2, "smartphone", 1000, "China");
//    static Book tre = new Book(3, "Book", 1000, "Jiovan");
//    static Smartphone cuatro = new Smartphone(4, "smartphone", 1000, "China");

    @BeforeAll

    static void setUp() {
        mng.add(tick1);
        mng.add(tick2);
        mng.add(tick3);

    }

    @Test
    void showThings() {
      Ticket[] actual = {tick1, tick2, tick3};
      Ticket[] excpected = repository.showThings();
      assertArrayEquals(excpected, actual);
    }

    @Test
    void removeThing() {
        repository.removeThing(2);
        Ticket[] actual = {tick1, tick2};
        Ticket[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }

    @Test
    void addProduct() {
      mng.add(tick4);
        Ticket[] actual = {tick1, tick2, tick3, tick4};
        Ticket[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);

    }

}