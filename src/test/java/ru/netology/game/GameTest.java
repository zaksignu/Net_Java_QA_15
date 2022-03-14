package ru.netology.game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Player;
import ru.netology.exception.NotRegisteredException;
import ru.netology.repository.GameRepository;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    static Player pl1 = new Player(0, "First", 1000);
    static Player pl2 = new Player(1, "Second", 800);
    static Player pl3 = new Player(2, "Third", 1000);
    static Player pl4 = new Player(3, "Fourth", 900);
    static GameRepository playerRepository = new GameRepository();
    static Game mng = new Game(playerRepository);

    @BeforeAll
    static void setUp() {
        mng.register(pl1);
        mng.register(pl2);
        mng.register(pl3);
    }

    @Test
    void showAll() {
    }

    @Test
    void roundShouldWorkSecondWinner() {
        int actual = mng.round("Second", "First");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void roundShouldWorkFirstWinner() {
        int actual = mng.round("First", "Second");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void roundShouldWorkDraw() {
        int actual = mng.round("First", "Third");
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void roundShouldNotWork() {
        assertThrows(NotRegisteredException.class, () -> mng.round("Fifth", "Third"));
    }

    @Test
    void roundShouldNotWorkNullStraight() {
        assertThrows(NotRegisteredException.class, () -> mng.round(null, "Third"));
    }

    @Test
    void roundShouldNotWorkNullOdd() {
        assertThrows(NotRegisteredException.class, () -> mng.round("First", null));
    }

    @Test
    void roundShouldNotWorkFullNull() {
        assertThrows(NotRegisteredException.class, () -> mng.round(null, null));
    }

}