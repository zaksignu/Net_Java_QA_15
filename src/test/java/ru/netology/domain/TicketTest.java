package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    static Ticket tick1 = new Ticket(4, 1500, "CHI", "ZIA", 1000);
    static Ticket tick2 = new Ticket(1, 1200, "OTP", "VKO", 1500);
    static Ticket tick3 = new Ticket(1, 1500, "OTP", "VKO", 1500);

    @Test
    void getId() {
        int actual = tick1.getId();
        int excpected = 4;
        assertEquals(excpected, actual);
    }

    @Test
    void getPrice() {
        int actual = tick1.getPrice();
        int excpected = 1500;
        assertEquals(excpected, actual);
    }

    @Test
    void compareToPositive() {
        int expected = 300;
        assertEquals(expected, tick1.compareTo(tick2));
    }

    @Test
    void compareToNegative() {
        int expected = 0;
        assertEquals(expected, tick1.compareTo(tick3));
    }

    @Test
    void departureMatchPositive() {
        assertTrue(tick1.departureMatch("CHI"));
    }

    @Test
    void departureMatchNegative() {
        assertFalse(tick1.departureMatch("OTP"));
    }

    @Test
    void arrivalMatchPositive() {
        assertTrue(tick1.arrivalMatch("ZIA"));
    }

    @Test
    void arrivalMatchNegative() {
        assertFalse(tick1.arrivalMatch("CHE"));
    }
}