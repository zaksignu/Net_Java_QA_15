package ru.netology.repository;

import ru.netology.domain.Player;

import java.util.ArrayList;
import java.util.Collection;

public class GameRepository {
    private Collection<Player> playersList = new ArrayList<>();

    public void addPlayer(Player name) {
        playersList.add(name);
    }

    public Collection<Player> showPlayers() {
   //     return playersList.toArray(new Player[0]);
        return playersList;
        //

    }

    public void removePlayer(int id) {
        playersList.removeIf(el->el.getId() == id);
    }

}
