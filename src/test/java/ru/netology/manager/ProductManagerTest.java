package ru.netology.manager;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import ru.netology.domain.Ticket;
import ru.netology.repository.ProductRepository;


class ProductManagerTest {
    static Ticket tick1 = new Ticket(0, 1500, "CHI", "ZIA",1000);
    static Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO",1500);
    static Ticket tick3 = new Ticket(2, 200, "ZIA", "DME",1060);
    static Ticket tick4 = new Ticket(3, 500, "DME", "CHI",4000);
    static Ticket tick5 = new Ticket(4, 2500, "VKO", "LHR",6000);
    static Ticket tick6 = new Ticket(5, 9500, "DME", "TYO",900);
    static  Ticket tick7 = new Ticket(6, 7500, "LHR", "CMB",3400);
    static  Ticket tick8 = new Ticket(7, 2500, "DME", "CHI",3000);
    static  Ticket tick9 = new Ticket(8, 100, "CHI", "HND",9000);
    static  Ticket tick10 = new Ticket(9, 900, "CHI", "HND",9000);
    static  Ticket tick11 = new Ticket(10, 1000, "CHI", "HND",9000);
    static  Ticket tick12 = new Ticket(11, 140, "DME", "CHI",9000);
    static  Ticket tick13 = new Ticket(12, 7000, "CHI", "HND",9000);
    static  Ticket tick14 = new Ticket(13, 1550, "DME", "CHI",9000);
    static  Ticket tick15 = new Ticket(14, 1660, "DME", "CHI",9000);
    static  Ticket tick16 = new Ticket(15, 15000, "DME", "CHI",9000);
    static  Ticket tick17 = new Ticket(16, 5700, "CHI", "HND",9000);
    static ProductRepository repository = new ProductRepository();
    static ProductManager mng = new ProductManager(repository);
//    Ticket tick1 = new Ticket(0, 1500, "CHI", "ZIA",1000);
//    Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO",1500);
//    Ticket tick3 = new Ticket(2, 200, "ZIA", "DME",1060);
//    Ticket tick4 = new Ticket(3, 500, "DME", "CHI",4000);
//    Ticket tick5 = new Ticket(4, 2500, "VKO", "LHR",6000);
//    Ticket tick6 = new Ticket(5, 9500, "DME", "TYO",900);
//    Ticket tick7 = new Ticket(6, 7500, "LHR", "CMB",3400);
//    Ticket tick8 = new Ticket(7, 2500, "DME", "CHI",3000);
//    Ticket tick9 = new Ticket(8, 100, "CHI", "HND",9000);
//   static ProductRepository repository = new ProductRepository();
  // static ProductManager mng = new ProductManager(repository);
//    static Book uno = new Book(1, "Book", 1000, "Jiovan");
//    static Smartphone duo = new Smartphone(2, "smartphone", 1000, "China");
//    static Book tre = new Book(3, "Book", 1000, "Jiovan");
//    static Smartphone cuatro = new Smartphone(4, "smartphone", 1000, "China");

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

    @Test
    void orderResult() {
    mng.findAll("DME","CHI");
    }
    @Test
    void add() {
//        Product[] actual = {uno, duo, tre, cuatro};
//        Product[] excpected = repository.showThings();
//        assertArrayEquals(excpected, actual);
    }

    @Test
    void removeById() {
//        Product[] actual = {uno, duo, cuatro};
//        mng.removeById(3);
//        Product[] excpected = repository.showThings();
//        assertArrayEquals(excpected, actual);
//        mng.add(tre);
    }

    @Test
    void searchForBook() {
//        Product[] actual = {uno, tre};
//        Product[] excpected = mng.searchBy("Book");
//        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchForSmartphone() {
//        Product[] actual = {duo, cuatro};
//        Product[] excpected = mng.searchBy("smartphone");
//        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchForNone() {
//        Product[] actual = {};
//        Product[] excpected = mng.searchBy("z");
//        assertArrayEquals(excpected, actual);
    }

    @Test  
      void searchForJiovan() {
//        Product[] actual = {uno, tre};
//        Product[] excpected = mng.searchBy("Jiovan");
//        assertArrayEquals(excpected, actual);
    }

    @Test
    void searchForChina() {
//        Product[] actual = {duo, cuatro};
//        Product[] excpected = mng.searchBy("China");
//        assertArrayEquals(excpected, actual);
    }

//
//    @Test
//    void matchesPositiveBook() {
//        assertTrue(mng.matches(uno, "Book"));
//    }
//
//    @Test
//    void matchesPositiveChina() {
//        assertTrue(mng.matches(duo, "China"));
//    }
//
//    @Test
//    void matchesPositiveJiovan() {
//        assertTrue(mng.matches(uno, "Jiovan"));
//    }
//
//    @Test
//    void matchesPositiveSmartphone() {
//        assertTrue(mng.matches(duo, "smartphone"));
//    }
//    @Test
//    void matchesNegativeBook() {
//        assertFalse(mng.matches(duo, "Book"));
//    }
//     @Test
//    void matchesNegativeJiovan() {
//        assertFalse(mng.matches(duo, "Jiovan"));
//    }
//
//    @Test
//    void matchesNegativeChina() {
//        assertFalse(mng.matches(uno, "China"));
//    }
//
//    @Test
//    void matchesNegativeSmartphone() {
//        assertFalse(mng.matches(uno, "smartphone"));
//    }

}
