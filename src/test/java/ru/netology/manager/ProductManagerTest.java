package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.*;
import ru.netology.domain.Ticket;
import ru.netology.repository.ProductRepository;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductManagerTest {
    static Ticket tick1 = new Ticket(0, 1500, "CHI", "ZIA", 1000);
    static Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO", 1500);
    static Ticket tick3 = new Ticket(2, 200, "ZIA", "DME", 1060);
    static Ticket tick4 = new Ticket(3, 500, "DME", "CHI", 4000);
    static Ticket tick5 = new Ticket(4, 2500, "VKO", "LHR", 6000);
    static Ticket tick6 = new Ticket(5, 9500, "DME", "TYO", 900);
    static Ticket tick7 = new Ticket(6, 7500, "LHR", "CMB", 3400);
    static Ticket tick8 = new Ticket(7, 2500, "DME", "CHI", 3000);
    static Ticket tick9 = new Ticket(8, 100, "CHI", "HND", 8000);
    static Ticket tick10 = new Ticket(9, 900, "CHI", "HND", 3000);
    static Ticket tick11 = new Ticket(10, 1000, "CHI", "HND", 4500);
    static Ticket tick12 = new Ticket(11, 140, "DME", "CHI", 700);
    static Ticket tick13 = new Ticket(12, 7000, "CHI", "HND", 2300);
    static Ticket tick14 = new Ticket(13, 1550, "DME", "CHI", 800);
    static Ticket tick15 = new Ticket(14, 1660, "DME", "CHI", 4000);
    static Ticket tick16 = new Ticket(15, 15000, "DME", "CHI", 7900);
    static Ticket tick17 = new Ticket(16, 5700, "CHI", "HND", 3200);
    static ProductRepository repository = new ProductRepository();
    static ProductManager mng = new ProductManager(repository);

    @BeforeAll
    static void setUp() {
        mng.add(tick1);
        mng.add(tick2);
        mng.add(tick3);
        mng.add(tick4);
        mng.add(tick5);
        mng.add(tick6);
        mng.add(tick7);
        mng.add(tick8);
        mng.add(tick9);
        mng.add(tick10);
        mng.add(tick11);
        mng.add(tick12);
        mng.add(tick13);
        mng.add(tick14);
        mng.add(tick15);
        mng.add(tick16);

    }
    @Order(1)
    @Test
    void findAllPositive() {
        Ticket[] actual = mng.findAll("DME", "CHI");
        Ticket[] excpected = {tick16, tick8, tick15, tick14, tick4, tick12};
        assertArrayEquals(excpected, actual);
    }

    @Order(7)
    @Test
    void findAllNegative() {
        Ticket[] actual = mng.findAll("ZIA", "CHI");
        Ticket[] excpected = {};
        assertArrayEquals(excpected, actual);
    }



    @Order(3)
    @Test
    void add() {
        mng.add(tick16);
        Ticket[] actual = {tick1, tick2, tick3, tick4, tick5, tick6, tick7, tick8, tick9, tick10,
                tick11, tick12, tick13, tick14, tick15, tick16};
        Ticket[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);
    }
    @Order(2)
    @Test
    void removeById() {
        Ticket[] actual = {tick1, tick2, tick3, tick4, tick5, tick6, tick7, tick8, tick9, tick10,
                tick11, tick12, tick13, tick14, tick15};
        mng.removeById(15);
        Ticket[] excpected = repository.showThings();
        assertArrayEquals(excpected, actual);

    }
    @Order(6)
    @Test
    void orderResult() {
        Ticket[] actual = {tick16, tick6, tick7, tick13, tick5, tick8, tick15, tick14, tick1, tick2,
                tick11, tick10, tick4, tick3, tick12, tick9};
        Ticket[] excpected = mng.orderResult(repository.showThings());
        assertArrayEquals(excpected, actual);
    }
    @Order(4)
    @Test
    void matcheArrival() {
        assertTrue(mng.matcheArrival(tick1, "ZIA"));
    }
    @Order(5)
    @Test
    void matcheDeparture() {
        assertTrue(mng.matcheDeparture(tick1, "CHI"));
    }
}
