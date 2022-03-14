package ru.netology.repository;

import ru.netology.domain.Player;

import java.util.ArrayList;
import java.util.Collection;

public class GameRepository {
    private Collection<Player> playersList = new ArrayList<>();

    public void addPlayer(Player name) {
        playersList.add(name);
    }

    public Player[] showPlayers() {
        return playersList.toArray(new Player[0]);
    }

    public Player findByName(String Name) {
        for (Player player : playersList) {
            if (player.getName() == Name) {
                return player;
            }
        }
        return null;
    }

    public void removePlayer(int id) {
        playersList.removeIf(el -> el.getId() == id);
    }

}
