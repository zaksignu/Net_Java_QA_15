package ru.netology.game;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Player;
import ru.netology.repository.GameRepository;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    static Player pl1 = new Player(0, "First",  1000);
    static Player pl2 = new Player(1, "Second",  800);
    static Player pl3 = new Player(2, "Third",  1400);
    static Player pl4 = new Player(3, "Fourth",  900);
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
    void round() {
        int actual = mng.round("Second","Third");
        int excpected = 0;
        assertEquals(actual,excpected);

    }

    @Test
    void register() {
    }


}