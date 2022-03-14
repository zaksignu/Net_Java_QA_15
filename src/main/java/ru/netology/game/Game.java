package ru.netology.game;

import ru.netology.domain.Player;
import ru.netology.exception.NotRegisteredException;
import ru.netology.repository.GameRepository;

public class Game {
    private GameRepository playerManager;

    public Game(GameRepository playerManager) {
        this.playerManager = playerManager;
    }

    public void register(Player player) {
        playerManager.addPlayer(player);
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = playerManager.findByName(playerName1);
        Player player2 = playerManager.findByName(playerName2);

        if ((player1 != null) && (player2 != null)) {
            int compare = player1.compareTo(player2);
            if (compare > 0) {
                return 1;  //Pl1 > Pl2
            } else if (compare < 0) {
                return 2; //Pl2 > Pl1
            } else {
                return 0; //Pl1 = Pl2
            }
        } else {
            throw new NotRegisteredException("Where is registred player/s?");
        }
    }

}

