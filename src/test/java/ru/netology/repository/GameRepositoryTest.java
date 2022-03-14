package ru.netology.repository;

import org.junit.jupiter.api.*;
import ru.netology.domain.Player;
import ru.netology.game.Game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class GameRepositoryTest {
    static Player pl1 = new Player(0, "First",  1000);
    static Player pl2 = new Player(1, "Second",  800);
    static Player pl3 = new Player(2, "Third",  1400);
    static Player pl4 = new Player(3, "Fourth",  900);
    private Map<String,Player> playersListHash = new HashMap<>();
    static GameRepository playerRepository = new GameRepository();
    static Game mng = new Game(playerRepository);

    @BeforeAll
    static void setUp() {
        mng.register(pl1);
        mng.register(pl2);
        mng.register(pl3);
    }

    @Test
    @Order(2)
    void addPlayer() {
        mng.register(pl4);
       Player[] actual = playerRepository.showPlayers();
        Player[] excpected = {pl2, pl4 ,pl1,pl3};
        Arrays.sort(actual);
        assertArrayEquals(excpected,actual);
    }

    @Test
    @Order(3)
    void removePlayer() {
        playerRepository.removePlayer(pl4.getName());
        Player[] actual = playerRepository.showPlayers();
        Player[]  excpected = {pl2, pl1, pl3};
        Arrays.sort(actual);
        assertArrayEquals(excpected, actual);

    }
    @Test
    @Order(1)
    void findByName() {
        Player actual = playerRepository.findByName("Third");
        Player expected = pl3;
        assertEquals(expected, actual);

    }
}