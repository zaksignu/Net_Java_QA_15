package ru.netology.game;

import ru.netology.domain.Player;
import ru.netology.repository.GameRepository;

import java.util.ArrayList;
import java.util.Collection;


//public ProductManager(ProductRepository ticketManager) {
//        this.ticketManager = ticketManager;
//        }

public class Game {
    private GameRepository playerManager;

    public Game(GameRepository playerManager) {
        this.playerManager = playerManager;
    }

    public void register(Player player) {
        playerManager.addPlayer(player);
    }

//    public Player[] showAll() {
//        return playerManager.showPlayers();
//    }

    public int round(String playerName1, String playerName2) {
        Collection<Player> registredPlayers = playerManager.showPlayers();
        for (Player player1 : registredPlayers) {
            if (player1.getName() == playerName1) {
                for (Player player2 : registredPlayers) {
                    if (player2.getName() == playerName2) {
                        if( player1.compareTo(player2) < 0){
                            return 1;
                          //  System.out.println(1);
                        }else {
                            if( player1.compareTo(player2) > 0){
                                System.out.println(2);
                                return 2;
                            } else {
                                System.out.println(0);
                                return 0;
                            }


                        }
                    }
                }
            }
        }

    }




}

